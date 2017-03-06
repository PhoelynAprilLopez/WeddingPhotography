/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author LopezLaps
 */
public class MySql implements DatabaseConnect{

    public String driver = "com.mysql.jdbc.Driver";
    
    @Override
    public Connection connect() {
        try{
            Class.forName(this.driver);
            String connection = "jdbc:mysql://"+Configuration.Config.DB_SERVER+"/"+Configuration.Config.DB_NAME;
            Connection conn = DriverManager.getConnection(connection, Configuration.Config.DB_USERNAME, Configuration.Config.DB_PASSWORD);
            return conn;            
        }catch (ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "No Data Connection");
            return null;
        }
    }
    
}
