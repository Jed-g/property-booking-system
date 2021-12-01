package com2008.team.project;

import java.sql.*;

public class ChargeBand {
    
    private int propertyId;
    private Date startDate;
    private Date endDate;
    private float pricePerNight;
    private float serviceCharge;
    private float cleaningCharge;
    
    private ChargeBand(int propertyId, Date startDate, Date endDate, float pricePerNight
                            , float serviceCharge, float cleaningCharge ) {
        
        this.propertyId = propertyId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.pricePerNight = pricePerNight;
        this.serviceCharge = serviceCharge;
        this.cleaningCharge = cleaningCharge;
        
    }
    
    //get... methods
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
    
    private static Boolean isBetweenDates(Date startDate, Date endDate, Date givenDate) {
        
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
    
    private static ChargeBand[] getChargeBandList(int propertyId) {
        DriverManager.setLoginTimeout(3);
        
        //Variables
        ChargeBand[] chargeBandList = null;
        
        //Contact database to access chargebands table
        try (Connection con = DriverManager.getConnection("jdbc:mysql://stusql.dcs.shef.ac.uk/team024", "team024", "c0857903")) {
           
            PreparedStatement pstmt = con.prepareStatement("SELECT propertyId, startDate, endDate, pricePerNight," 
                    + "serviceCharge, cleaningCharge FROM Chargebands WHERE propertyId = ?;",
                    ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            pstmt.setInt(1, propertyId);
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
                    chargeBandList[i] = new ChargeBand(res.getInt("propertyId"), res.getDate("startDate"), res.getDate("endDate"), 
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
    
    //PriceInfo class is a nested class used when calculating details about the cost of a booking
    static class PriceInfo {
        
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
        
        //get... methods
        float getAveragePPN() {
            return averagePPN;
        }
        
        float getTotalPPN() {
            return totalPPN;
        }
        
        float getServiceCharge() {
            return serviceCharge;
        }
        
        float getCleaningCharge() {
            return cleaningCharge;
        }
        
        float getTotalCost() {
            return totalCost;
        }
       
    }
    
    //priceInfo takes a start date and an end date for a property and calculates
    //the cost breakdown of the stay, the last day doesn't count because it is price
    //per night

    static PriceInfo getPriceInfo(int propertyId, Date startDate, Date endDate) {

        //Variables
        ChargeBand[] chargeBandList = null;
        float dateRangeLength = 0;
        float totalPPN = 0; //PPN = price per night
        float avgPPN = 0;
        float maxServiceCharge = -10;
        float maxCleaningCharge = -10;
        float totalCost = 0;

        //Constants
        final int milliseconds = 24*60*60*1000; //number of milliseconds in a day
        final long startDateMS = startDate.getTime(); //Convert start date to milliseconds for use in loop
        
        //List of possible chargebands for the property
        chargeBandList = getChargeBandList(propertyId);

        //Calculate number of days between start and end date (inclusive)
        dateRangeLength = ((endDate.getTime() - startDate.getTime()) / milliseconds);

        //for loop that cycles through all possible dates in the date range (start date inclusive, end date exclusive)
        for (int i = 0; i < dateRangeLength; i++) {

            //Calculates current date being used in milliseconds
            //e.g i = 0 means start date, i = 1 means day after start date, etc.
            long currentDate = startDateMS + (i * milliseconds);

            //Converts milliseconds into date ready for isBetweenDates
            Date dateInput = new Date(currentDate);

            //for loop that gets correct price info for a date range (start date inclusive, end date exclusive)
            for (ChargeBand j: chargeBandList) {
                if (isBetweenDates(j.startDate, j.endDate, dateInput)) {

                    //TOTAL PRICE PER NIGHT
                    totalPPN += j.pricePerNight;   

                    //MAXIMUM SERVICE CHARGE
                    if (j.serviceCharge >= maxServiceCharge) {
                        maxServiceCharge = j.serviceCharge;
                    }

                    //MAXIMUM CLEANING CHARGE
                    if (j.cleaningCharge >= maxCleaningCharge) {
                        maxCleaningCharge = j.cleaningCharge;
                    }
                }   
            }                  
        }

        //CALCULATE AVERAGE PRICE PER NIGHT
        avgPPN = totalPPN/dateRangeLength;

        //CALCULATE TOTAL COST FOR ENTIRE BOOKING
        totalCost = totalPPN + maxServiceCharge + maxCleaningCharge;

        PriceInfo priceInfo = new PriceInfo(avgPPN, totalPPN, maxServiceCharge, maxCleaningCharge, totalCost);

        return priceInfo;         
    }   
}