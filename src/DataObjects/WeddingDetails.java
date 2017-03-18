/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataObjects;

import Database.MySql;
import static ViewsNonAdmin.WeddingDetails.weddingDetails;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author LopezLaps
 */
public class WeddingDetails {

    private String tableName = "weddingdetails";
    private MySql mysql = null;

    private Integer Id = null;
    private String bookername = null;
    private String dateofwedding = null;
    private String fullnameofthebride = null;
    private String fullnameofthegroom = null;
    private String address = null;
    private String city = null;
    private String contactno = null;
    private String gettingreadytime = null;
    private String gettingreadylocation = null;
    private String ceremonytime = null;
    private String ceremonylocation = null;
    private String photoshoottime = null;
    private String photoshootlocation = null;
    private String receptiontime = null;
    private String receptionlocation = null;
    private Integer numberofguest = null;
    private String special_request_notes = null;

    public WeddingDetails() {
        this.mysql = new MySql();
    }

    public ResultSet getAll() {
        return mysql.getAll(this.tableName);
    }

    public ResultSet getWeddingDetailsById(String id) {
        String sql = "SELECT * FROM `" + this.tableName + "` WHERE id = '" + id + "' ";
        System.out.println(sql);
        return mysql.getDataBySql(sql);
    }

    public ResultSet getBookerBrideAndGroom() {
        String sql = "SELECT "
                + "id AS 'ID', "
                + "bookername AS 'Booker Name', "
                + "fullnameofthebride AS 'Name of Bride', "
                + "fullnameofthegroom AS 'Name of Groom' FROM  " + this.tableName;

        System.out.println(sql);
        return mysql.getDataBySql(sql);
    }

    public ResultSet getBookerBrideAndGroom(String searchKeyWords) {
        String sql = "SELECT "
                + "id AS 'ID', "
                + "bookername AS 'Booker Name', "
                + "fullnameofthebride AS 'Name of Bride', "
                + "fullnameofthegroom AS 'Name of Groom' FROM  " + this.tableName;

        if (null != searchKeyWords) {
            sql += " WHERE bookername LIKE '%" + searchKeyWords + "%' OR "
                    + "fullnameofthebride LIKE '%" + searchKeyWords + "%' OR "
                    + "fullnameofthegroom LIKE '%" + searchKeyWords + "%'  ";
        }
        System.out.println(sql);
        return mysql.getDataBySql(sql);
    }

    public ResultSet getAllBookers() {
        return mysql.getDataBySql("SELECT bookername AS 'Booker Name' FROM  " + this.tableName);
    }

    /**
     * Sets booking information Id
     *
     * @param id
     */
    public void setId(Integer id) {
        this.Id = id;
    }

    /**
     * Gets booking information Id
     *
     * @return
     */
    public Integer getId() {
        return this.Id;
    }

    public void setBookerName(String bookername) {

        this.bookername = bookername;
    }

    public String getBookerName() {
        return this.bookername;
    }

    public void setDateOfWedding(String dateofwedding) {
        this.dateofwedding = dateofwedding;
    }

    public String getDateOfWedding() {
        return this.dateofwedding;
    }

    public void setFullnameOfTheGroom(String fullnameofthegroom) {
        this.fullnameofthegroom = fullnameofthegroom;
    }

    public String getFullnameOfTheGroom() {
        return this.fullnameofthegroom;
    }

    public void setFullnameOfTheBride(String fullnameofthebride) {
        this.fullnameofthebride = fullnameofthebride;
    }

    public String getFullnameOfTheBride() {
        return this.fullnameofthebride;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return this.city;
    }

    public void setContactNo(String contactno) {
        this.contactno = contactno;
    }

    public String getContactNo() {
        return this.contactno;
    }

    public void setGettingReadyTime(String gettingreadytime) {
        this.gettingreadytime = gettingreadytime;
    }

    public String getGettingReadyTime() {
        return this.gettingreadytime;
    }

    public void setGettingReadyLocation(String gettingreadylocation) {
        this.gettingreadylocation = gettingreadylocation;
    }

    public String getGettingReadyLocation() {
        return this.gettingreadylocation;
    }

    public void setCeremonyTime(String ceremonytime) {
        this.ceremonytime = ceremonytime;
    }

    public String getCeremonyTime() {
        return this.ceremonytime;
    }

    public void setCeremonyLocation(String ceremonylocation) {
        this.ceremonylocation = ceremonylocation;
    }

    public String getCeremonyLocation() {
        return this.ceremonylocation;
    }

    public void setPhotoshootTime(String photoshoottime) {
        this.photoshoottime = photoshoottime;
    }

    public String getPhotoshootTime() {
        return this.photoshoottime;
    }

    public void setPhotoshootLocation(String photoshootlocation) {
        this.photoshootlocation = photoshootlocation;
    }

    public String getPhotoshootLocation() {
        return this.photoshootlocation;
    }

    public void setReceptionTime(String receptiontime) {
        this.receptiontime = receptiontime;
    }

    public String getReceptionTime() {
        return this.receptiontime;
    }

    public void setReceptionLocation(String receptionlocation) {
        this.receptionlocation = receptionlocation;
    }

    public String getReceptionLocation() {
        return this.receptionlocation;
    }

    public void setNumberOfGuest(Integer numberofguest) {
        this.numberofguest = numberofguest;
    }

    public Integer getNumberOfGuest() {
        return this.numberofguest;
    }

    public void setSpecialRequestNotes(String special_request_notes) {
        this.special_request_notes = special_request_notes;
    }

    public String getSpecialRequestNotes() {
        return this.special_request_notes;
    }

    public void logData() {
        System.out.println("bookername :> " + this.getBookerName());
        System.out.println("dateofwedding :> " + this.getDateOfWedding());
        System.out.println("fullnameofthebride :> " + this.getFullnameOfTheBride());
        System.out.println("fullnameofthegroom :> " + this.getFullnameOfTheGroom());
        System.out.println("address :> " + this.getAddress());
        System.out.println("city :> " + this.getCity());
        System.out.println("contactno :> " + this.getContactNo());
        System.out.println("gettingreadytime :> " + this.getGettingReadyTime());
        System.out.println("gettingreadylocation :> " + this.getGettingReadyLocation());
        System.out.println("ceremonytime :> " + this.getCeremonyTime());
        System.out.println("ceremonylocation :> " + this.getCeremonyLocation());
        System.out.println("photoshoottime :> " + this.getPhotoshootTime());
        System.out.println("photoshootlocation :> " + this.getPhotoshootLocation());
        System.out.println("receptiontime :> " + this.getReceptionTime());
        System.out.println("receptionlocation :> " + this.getReceptionLocation());
        System.out.println("numberofguest :> " + this.getNumberOfGuest());
        System.out.println("special_request_notes :> " + this.getSpecialRequestNotes());

    }

    public static WeddingDetails getWeddingDetails(Integer Id) {
        //Todo get database details from BookingInformation base on bookInfoId 
        return new WeddingDetails();
    }

    public Map getWeddingAttributes(){
        Map weddingHashMap = new HashMap();
        if (this.getBookerName() != null) {
            weddingHashMap.put("bookername", this.getBookerName());
        }

        if (this.getDateOfWedding() != null) {
            weddingHashMap.put("dateofwedding", this.getDateOfWedding());
        }

        if (this.getFullnameOfTheBride() != null) {
            weddingHashMap.put("fullnameofthebride", this.getFullnameOfTheBride());
        }
        if (this.getFullnameOfTheGroom() != null) {
            weddingHashMap.put("fullnameofthegroom", this.getFullnameOfTheGroom());
        }
        if (this.getAddress() != null) {
            weddingHashMap.put("address", this.getAddress());
        }
        if (this.getCity() != null) {
            weddingHashMap.put("city", this.getCity());
        }
        if (this.getContactNo() != null) {
            weddingHashMap.put("contactno", this.getContactNo());
        }

        if (this.getGettingReadyTime() != null) {
            weddingHashMap.put("gettingreadytime", this.getGettingReadyTime());
        }
        if (this.getGettingReadyLocation() != null) {
            weddingHashMap.put("gettingreadylocation", this.getGettingReadyLocation());
        }
        if (this.getCeremonyTime() != null) {
            weddingHashMap.put("ceremonytime", this.getCeremonyTime());
        }
        if (this.getCeremonyLocation() != null) {
            weddingHashMap.put("ceremonylocation", this.getCeremonyLocation());
        }
        if (this.getPhotoshootTime() != null) {
            weddingHashMap.put("photoshoottime", this.getPhotoshootTime());
        }
        if (this.getPhotoshootLocation() != null) {
            weddingHashMap.put("photoshootlocation", this.getPhotoshootLocation());
        }
        if (this.getReceptionTime() != null) {
            weddingHashMap.put("receptiontime", this.getReceptionTime());
        }
        if (this.getReceptionLocation() != null) {
            weddingHashMap.put("receptionlocation", this.getReceptionLocation());
        }
        if (this.getNumberOfGuest() != null) {
            weddingHashMap.put("numberofguest", this.getNumberOfGuest());
        }
        if (this.getSpecialRequestNotes() != null) {
            weddingHashMap.put("special_request_notes", this.getSpecialRequestNotes());
        }
        
        return weddingHashMap;
    }
    /**
     * Method to create or save wedding book information or details
     *
     * @return
     */
    public Boolean save() {

        /**
         * If Wedding Details id is not null it means update using wedding
         * Details id
         */
        if (this.getId() != null) {
            return this.update();
        }
        try {
            Boolean inserted = this.mysql.insert(this.tableName, this.getWeddingAttributes());
            this.mysql.close();
            return inserted;
        } catch (SQLException ex) {
            Logger.getLogger(WeddingDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }

    /**
     * Method to update wedding book information or details
     *
     * @return
     */
    public Boolean update() {
        String id = this.getId().toString();
        try {
            Boolean updated =  this.mysql.update(this.tableName, this.getWeddingAttributes(), id);
            return updated;
        } catch (SQLException ex) {
            Logger.getLogger(WeddingDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
