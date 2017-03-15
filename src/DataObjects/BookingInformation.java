/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataObjects;

/**
 *
 * @author LopezLaps
 */
public class BookingInformation {
    private Integer Id = null;
    
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
    
    public static BookingInformation getBookingInformation(Integer bookInfoId){
        //Todo get database details from BookingInformation base on bookInfoId 
        return new BookingInformation();
    }
    
    /**
     * Method to create or save wedding book information or details
     * @param bookingInfo 
     */
    public static void save(BookingInformation bookingInfo){
        //Todo save details to BookingInformation table
    }
    
    /**
     * Method to update wedding book information or details
     * 
     * @param bookingInfo 
     */
    public static void update(BookingInformation bookingInfo){
        //Todo update details to BookingInformation details
    }
    
}
