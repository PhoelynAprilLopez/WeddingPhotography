/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataObjects;

import Database.MySql;
import Views.SplashScreen;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LopezLaps
 */
public class WeddingDetails {
    private String tableName = "weddingdetails";
    
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
    
    /**
     * Sets booking information Id
     * @param id 
     */
    public void setId(Integer id){
        
        this.Id = id;
    }
    
    /**
     * Gets booking information Id
     * @return 
     */
    public Integer getId(){
        return this.Id;
    }
    
    public void setBookerName(String bookername){
       
        this.bookername = bookername;
    }
    
    public String getBookerName(){
        return this.bookername;
    }
    
     public void setDateOfWedding(String dateofwedding){
        this.dateofwedding = dateofwedding;
    }
    
    public String getDateOfWedding(){
        return this.dateofwedding;
    }
    
     public void setFullnameOfTheGroom(String fullnameofthegroom){
        this.fullnameofthegroom = fullnameofthegroom;
    }
    
    public String getFullnameOfTheGroom(){
        return this.fullnameofthegroom;
    }
    
    public void setFullnameOfTheBride(String fullnameofthebride){
        this.fullnameofthebride = fullnameofthebride;
    }
    
    public String getFullnameOfTheBride(){
        return this.fullnameofthebride;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public String getAddress(){
        return this.address;
    }
    
      public void setCity(String city){
        this.city = city;
    }
    
    public String getCity(){
        return this.city;
    }
    
       public void setContactNo(String contactno){
        this.contactno = contactno;
    }
    
    public String getContactNo(){
        return this.contactno;
    }
    
    public void setGettingReadyTime(String gettingreadytime){
        this.gettingreadytime = gettingreadytime;
    }
    
    public String getGettingReadyTime(){
        return this.gettingreadytime;
    }
    
    public void setGettingReadyLocation(String gettingreadylocation){
        this.gettingreadylocation = gettingreadylocation;
    }
    
    public String getGettingReadyLocation(){
        return this.gettingreadylocation;
    }
    
    public void setCeremonyTime(String ceremonytime){
        this.ceremonytime = ceremonytime;
    }
    
    public String getCeremonyTime(){
        return this.ceremonytime;
    }
    
    public void setCeremonyLocation(String ceremonylocation){
        this.ceremonylocation = ceremonylocation;
    }
    
    public String getCeremonyLocation(){
        return this.ceremonylocation;
    }
    
    public void setPhotoshootTime(String photoshoottime){
        this.photoshoottime = photoshoottime;
    }
    
    public String getPhotoshootTime(){
        return this.photoshoottime;
    }
    
    public void setPhotoshootLocation(String photoshootlocation){
        this.photoshootlocation = photoshootlocation;
    }
    
    public String getPhotoshootLocation(){
        return this.photoshootlocation;
    }
    
    public void setReceptionTime(String receptiontime){
        this.receptiontime = receptiontime;
    }
    
    public String getReceptionTime(){
        return this.receptiontime;
    }
    
     public void setReceptionLocation(String receptionlocation){
        this.receptionlocation = receptionlocation;
    }
    
    public String getReceptionLocation(){
        return this.receptionlocation;
    }
    
     public void setNumberOfGuest(Integer numberofguest){
        this.numberofguest = numberofguest;
    }
    
    public Integer getNumberOfGuest(){
        return this.numberofguest;
    }
    
     public void setSpecialRequestNotes(String special_request_notes){
        this.special_request_notes = special_request_notes;
    }
    
    public String getSpecialRequestNotes(){
        return this.special_request_notes;
    }
    
    public void logData(){
        System.out.println("bookername :> "+this.getBookerName());
        System.out.println("dateofwedding :> "+this.getDateOfWedding());
        System.out.println("fullnameofthebride :> "+this.getFullnameOfTheBride());
        System.out.println("fullnameofthegroom :> "+this.getFullnameOfTheGroom());
        System.out.println("address :> "+this.getAddress());
        System.out.println("city :> "+this.getCity());
        System.out.println("contactno :> "+this.getContactNo());
        System.out.println("gettingreadytime :> "+this.getGettingReadyTime());
        System.out.println("gettingreadylocation :> "+this.getGettingReadyLocation());
        System.out.println("ceremonytime :> "+this.getCeremonyTime());
        System.out.println("ceremonylocation :> "+this.getCeremonyLocation());
        System.out.println("photoshoottime :> "+this.getPhotoshootTime());
        System.out.println("photoshootlocation :> "+this.getPhotoshootLocation());
        System.out.println("receptiontime :> "+this.getReceptionTime());
        System.out.println("receptionlocation :> "+this.getReceptionLocation());
        System.out.println("numberofguest :> "+this.getNumberOfGuest());
        System.out.println("special_request_notes :> "+this.getSpecialRequestNotes());
        
    }
    public static WeddingDetails getWeddingDetails(Integer Id){
        //Todo get database details from BookingInformation base on bookInfoId 
        return new WeddingDetails();
    }
    
    /**
     * Method to create or save wedding book information or details
     * @param weddingDetails
     * @return 
     */
    public static Boolean save(WeddingDetails weddingDetails){
        
        /**
         * If Wedding Details id is not null it means update using wedding Details id
         */
        if(weddingDetails.getId() != null){
            return WeddingDetails.update(weddingDetails);
        }
        
        Map weddingHashMap = new HashMap();
        if(weddingDetails.getBookerName() != null){
            weddingHashMap.put("bookername", weddingDetails.getBookerName());
        }
        
        if(weddingDetails.getDateOfWedding() != null){
            weddingHashMap.put("dateofwedding", weddingDetails.getDateOfWedding());
        }
        
        if(weddingDetails.getFullnameOfTheBride()!= null){
            weddingHashMap.put("fullnameofthebride", weddingDetails.getFullnameOfTheBride());
        }
        if(weddingDetails.getFullnameOfTheGroom()!= null){
            weddingHashMap.put("fullnameofthegroom", weddingDetails.getFullnameOfTheGroom());
        }
        if(weddingDetails.getAddress()!= null){
            weddingHashMap.put("address", weddingDetails.getAddress());
        }
        if(weddingDetails.getCity()!= null){
            weddingHashMap.put("city", weddingDetails.getCity());
        }
        if(weddingDetails.getContactNo()!= null){
            weddingHashMap.put("contactno", weddingDetails.getContactNo());
        }
        
        if(weddingDetails.getGettingReadyTime()!= null){
            weddingHashMap.put("gettingreadytime", weddingDetails.getGettingReadyTime());
        }
        if(weddingDetails.getGettingReadyLocation()!= null){
            weddingHashMap.put("gettingreadylocation", weddingDetails.getGettingReadyLocation());
        }
        if(weddingDetails.getCeremonyTime()!= null){
            weddingHashMap.put("ceremonytime", weddingDetails.getCeremonyTime());
        }
        if(weddingDetails.getCeremonyLocation()!= null){
            weddingHashMap.put("ceremonylocation", weddingDetails.getCeremonyLocation());
        }
        if(weddingDetails.getPhotoshootTime()!= null){
            weddingHashMap.put("photoshoottime", weddingDetails.getPhotoshootTime());
        }
        if(weddingDetails.getPhotoshootLocation()!= null){
            weddingHashMap.put("photoshootlocation", weddingDetails.getPhotoshootLocation());
        }
        if(weddingDetails.getReceptionTime()!= null){
            weddingHashMap.put("receptiontime", weddingDetails.getReceptionTime());
        }
        if(weddingDetails.getReceptionLocation()!= null){
            weddingHashMap.put("receptionlocation", weddingDetails.getReceptionLocation());
        }
        if(weddingDetails.getNumberOfGuest()!= null){
            weddingHashMap.put("numberofguest", weddingDetails.getNumberOfGuest());
        }
        if(weddingDetails.getSpecialRequestNotes()!= null){
            weddingHashMap.put("special_request_notes", weddingDetails.getSpecialRequestNotes());
        }
        
        MySql mysql = new MySql();
        try {
            Boolean inserted = mysql.insert("weddingdetails", weddingHashMap);
            mysql.close();
            return inserted;
        } catch (SQLException ex) {
            Logger.getLogger(WeddingDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false; 
        
    }
    
    /**
     * Method to update wedding book information or details
     * @param weddingDetails 
     */
    public static Boolean update(WeddingDetails weddingDetails){
        
        
        return false;
    }
    
}
