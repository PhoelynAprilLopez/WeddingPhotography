/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataObjects;

import Database.MySql;
import ViewsAdmin.Payment;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author LopezLaps
 */
public class Users {

    private String tablename = "Users";
    private MySql mysql = null;

    private Integer login_id = null;
    private String username = null;
    private String password = null;
    private String roles = null;
    private Integer status = null;

    public Users() {
        this.mysql = new MySql();
    }

    public void setUserName(String username) {
        this.username = username;
    }

    public String getUserName() {
        return this.username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    public void setId(Integer login_id) {
        this.login_id = login_id;
    }

    public Integer getId() {
        return this.login_id;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getRoles() {
        return this.roles;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return this.status;
    }

    public Boolean login() {
        try {
            String sql = "SELECT * FROM "+this.tablename+" WHERE username = '" + this.getUserName() + "' AND password = '" + this.getPassword() + "'";
            System.out.println(sql);
            mysql.preparedStatement = mysql.connection.prepareStatement(sql);
            mysql.resultSet = mysql.preparedStatement.executeQuery();

            if (mysql.resultSet.next()) { //if success
                //check user status

                if (mysql.resultSet.getString("status").equals("1")) {
                    //active account
                    if (mysql.resultSet.getString("roles").equals("Admin")) {
                        return true;
                    }
                }
            }

        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public Map getLoginAttributes() {
        Map weddingHashMap = new HashMap();
        if (this.getId() != null) {
            weddingHashMap.put("login_id", this.getId());
        }
        return weddingHashMap;
    }

    public ResultSet getLoginId(String log_id) {
        String sql = "SELECT * FROM `" + this.tablename + "` WHERE login_id = '" + log_id + "' ";
        System.out.println(sql);
        return mysql.getDataBySql(sql);
    }

    public Boolean loginsave() {

        /**
         * If Wedding Details id is not null it means update using wedding
         * Details id
         */
        if (this.getId() != null) {
            return this.update();
        }
        try {
            Boolean inserted = this.mysql.insert(this.tablename, this.getLoginAttributes());
            this.mysql.close();
            return inserted;
        } catch (SQLException ex) {
            Logger.getLogger(WeddingDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }

    private Boolean update() {
        String id = this.getId().toString();
        try {
            Boolean updated = this.mysql.update(this.tablename, this.getLoginAttributes(), id);
            return updated;
        } catch (SQLException ex) {
            Logger.getLogger(WeddingDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void setStatus(Payment aThis, boolean selected) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
