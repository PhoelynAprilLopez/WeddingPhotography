/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author LopezLaps
 */
public class MySql implements DatabaseConnect {

    public String driver = "com.mysql.jdbc.Driver";
    public Connection connection = null;
    public PreparedStatement preparedStatement = null;
    public ResultSet resultSet = null;

    public MySql() {
        this.connection = this.connect();
    }

    public Boolean insert(String tableName, Map hashMapStringAndValues) throws SQLException {
        //Todo Build insert query string
        int columnAndValueSize = hashMapStringAndValues.size();
        String columnNames = "";
        String positionalChars = "";

        for (Object key : hashMapStringAndValues.keySet()) {
            columnNames += key + ",";
            positionalChars += "?,";
            System.out.println(key + " - " + hashMapStringAndValues.get(key));
        }
        /**
         * Remove last comma (,) in the string column name
         */
        columnNames = columnNames.substring(0, columnNames.length() - 1);
        positionalChars = positionalChars.substring(0, positionalChars.length() - 1);

        String sql = "INSERT INTO " + tableName + " (" + columnNames + ") VALUES(" + positionalChars + ")";

        this.preparedStatement = this.connection.prepareStatement(sql);
        int psStringCounter = 1;
        for (Object key : hashMapStringAndValues.keySet()) {
            this.preparedStatement.setString(psStringCounter, hashMapStringAndValues.get(key).toString());
            psStringCounter += 1;
        }

        System.out.println("Column Name Size :> " + columnAndValueSize);
        System.out.println("Created Insert Sql Command :> " + sql);
        return this.preparedStatement.execute();
    }

    public Boolean update(String tableName, Map hassMapStringAndValues) {
        //Todo Build update query string

        return false;
    }

    public ResultSet getDataBySql(String sql) {

        try {
            this.preparedStatement = this.connection.prepareStatement(sql);
            this.resultSet = preparedStatement.executeQuery();
            return this.resultSet;
        } catch (SQLException ex) {
            Logger.getLogger(MySql.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public ResultSet getAll(String tableName, String columns) {
        String sql = "SELECT " + columns + " FROM " + tableName;
        return this.getDataBySql(sql);
    }

    public ResultSet getAll(String tableName) {
        String sql = "SELECT * FROM " + tableName;
        return this.getDataBySql(sql);
    }

    public void close() {
        try {
            this.resultSet.close();
            this.preparedStatement.close();
        } catch (Exception e) {

        }
    }

    @Override
    public Connection connect() {
        try {
            Class.forName(this.driver);
            String connection = "jdbc:mysql://" + Configuration.Config.DB_SERVER + "/" + Configuration.Config.DB_NAME;
            Connection conn = DriverManager.getConnection(connection, Configuration.Config.DB_USERNAME, Configuration.Config.DB_PASSWORD);
            return conn;
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Database connection error: " + e.toString());
            return null;
        }
    }

}
