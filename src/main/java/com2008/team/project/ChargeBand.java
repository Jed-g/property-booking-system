package com2008.team.project;

import java.sql.*;

public class ChargeBand {
    
    private String propertyId;
    private Date startDate;
    private Date endDate;
    private float pricePerNight;
    private float serviceCharge;
    private float cleaningCharge;
    
    private ChargeBand(String propertyId, Date startDate, Date endDate, float pricePerNight
                            , float serviceCharge, float cleaningCharge ) {
        
        this.propertyId = propertyId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.pricePerNight = pricePerNight;
        this.serviceCharge = serviceCharge;
        this.cleaningCharge = cleaningCharge;
        
    }
    
    Float getPPNight(){
        return pricePerNight;
    }
    
    Float getServiceCharge() {
        return serviceCharge;
    }
    
    Float getCleaningCharge() {
        return cleaningCharge;
    }
  
    //isBetweenDates compares a given date to a start and end date and determines 
    //whether the date falls in this range, and will return a Boolean value as the output
    
    private Boolean isBetweenDates(Date startDate, Date endDate, Date givenDate) {
        
        //Variables
        boolean isBetween = false; //If the following conditions from if loop aren't true, isBetween will return false
        
        //Checks that value of given date is bigger than start date and smaller 
        //than end date
        //If both are true, then the given date falls in the range
        
        if (givenDate.getTime() >= startDate.getTime()) {
            if (givenDate.getTime() <= endDate.getTime()) {
                isBetween = true;
            }
        }
        
        return isBetween;
        
    }
    
    //getChargeBandList finds all chargebands for a property and generates a list of them
    
    static ChargeBand[] getChargeBandList(String propertyId) {
        DriverManager.setLoginTimeout(3);
        
        //Variables
        ChargeBand[] chargeBandList = null;
        
        //Contact database to access chargebands table
        try (Connection con = DriverManager.getConnection("jdbc:mysql://stusql.dcs.shef.ac.uk/team024", "team024", "c0857903")) {
           
            PreparedStatement pstmt = con.prepareStatement("SELECT propertyId, startDate, endDate, pricePerNight," 
                    + "serviceCharge, cleaningCharge FROM Chargebands WHERE propertyId = ?;",
                    ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            pstmt.setString(1, propertyId);
            ResultSet res = pstmt.executeQuery();
            
            //Calculate how many chargebands will be in the list
            int numberOfChargeBands = 0;
            if (res.last()){
              numberOfChargeBands = res.getRow();
              res.beforeFirst();
            }
            
            //Define new list with length given by calculation
            chargeBandList = new ChargeBand[numberOfChargeBands];
            
            //Populate list with chargeband information from the database
            for (int i = 0; i < numberOfChargeBands; i++){
                if (res.next()){
                    chargeBandList[i] = new ChargeBand(res.getString("propertyId"), res.getDate("startDate"), res.getDate("endDate"), 
                            res.getFloat("pricePerNight"), res.getFloat("serviceCharge"), res.getFloat("cleaningCharge"));
                }
            }

            res.close();
            pstmt.close();
        }
        catch (Exception ex) {
            ex.printStackTrace();            
            
            javax.swing.ImageIcon icon = new javax.swing.ImageIcon(javax.swing.ImageIcon.class.getResource("/images/warning_icon_resized.png"));
            String errorMessage = "Connection to database failed. University VPN is required.";
            javax.swing.JOptionPane.showMessageDialog(null, errorMessage, "Error", javax.swing.JOptionPane.INFORMATION_MESSAGE, icon);
        }
        
        //Return completed list of chargebands
        return chargeBandList;
    }
    
    //PriceInfo class is a nested class used when calculating  details about the cost of a booking
    class PriceInfo {
        
        private float averagePPN;
        private float totalPPN;
        private float serviceCharge;
        private float cleaningCharge;
        private float totalCost;
        
        private PriceInfo(float averagePPN, float totalPPN, float serviceCharge, 
                            float cleaningCharge, float totalCost) {
            
            this.averagePPN = averagePPN;
            this.totalPPN = totalPPN;
            this.serviceCharge = serviceCharge;
            this.cleaningCharge = cleaningCharge;
            this.totalCost = totalCost;
        }
        
        float getTotalCost() {
            return (totalPPN + serviceCharge + cleaningCharge);
        }
    }
    
    //priceInfo takes a start date and an end date for a property and calculates
    //the cost breakdown of the stay
    
    static PriceInfo[] priceInfo(String propertyId, Date startDate, Date endDate) {
         
        //Variables
        ChargeBand[] chargeBandList = null;
        
        //List of possible chargebands for the property
        chargeBandList = ChargeBand.getChargeBandList(propertyId);
        
        //Calculating total price per night
    }
    
    //Length of date range between start and end date (inclusive)
        //dateRangeLength = (endDate.getTime() - startDate.getTime()) / (24*60*60*1000) + 1;
        
    //Maximum Service Charge
    
    //Maximum Cleaning Charge
    
    //Total price per night
    static Float getTotalPPN(String propertyId, Date bkgStartDate, Date bkgEndDate) {
        
        try (Connection con = DriverManager.getConnection("jdbc:mysql://stusql.dcs.shef.ac.uk/team024", "team024", "c0857903")) {
           
            PreparedStatement pstmt = con.prepareStatement("SELECT propertyId, startDate, endDate, pricePerNight,"
                    + "serviceCharge, cleeaningCharge FROM Chargebands WHERE propertyId = ?",
                    ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            pstmt.setString(1, propertyId);
            ResultSet res = pstmt.executeQuery();
            
            //Variables
            long lengthOfStay = 0;
            
            //Calculate length of stay in days
            lengthOfStay = (bkgEndDate.getTime() - bkgStartDate.getTime()) / (24*60*60*1000);
            
            //Adds up the cost of price, day by day
            for (int i = 0; i < lengthOfStay; i++){
                if (res.next()){
                    reviewList[i] = new ReviewList(res.getString("forename"), res.getString("surname"),
                            res.getInt("rating"), res.getString("reviewDescription"));
                }
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();            
            
            javax.swing.ImageIcon icon = new javax.swing.ImageIcon(javax.swing.ImageIcon.class.getResource("/images/warning_icon_resized.png"));
            String errorMessage = "Connection to database failed. University VPN is required.";
            javax.swing.JOptionPane.showMessageDialog(null, errorMessage, "Error", javax.swing.JOptionPane.INFORMATION_MESSAGE, icon);
        }
        
    }
    
    //Total fee
           
           
}