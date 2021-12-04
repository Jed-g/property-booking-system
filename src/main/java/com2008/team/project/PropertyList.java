
package com2008.team.project;

import java.sql.*;

public class PropertyList {

    private int propertyId;
    private String propertyName;
    private String location;
    private String rating;
    private String description; 
    private String startdate;
    private String enddate;

    
    private static ReviewList[] reviewList;
    
    private PropertyList(String propertyName, String location, String rating, String description) {
        
        this.propertyName = propertyName;
        this.location = location;
        this.rating = rating;
        this.description = description;
        
    }
    
    int getPropertyId(){
        return propertyId;
    }

    String getPropertyName() {
        return propertyName;
    }
    
    String getLocation() {
        return location;
    }
    
    String getRating() {
        return rating;
    }
    
    String getDescription() {
        return description;
    }
    
    private static String getRating(String propertyId) {
        
        float avgRating;
        String strRating;
        
        reviewList = ReviewList.getList(propertyId);
        
        int n = reviewList.length;
            
            if (n == 0){
                avgRating = 0;
            } else {
                int sum = 0;
                for (ReviewList i : reviewList){
                    sum += i.getRating();
                }
                
                avgRating = sum/n;
            }
            
            if (avgRating == 0) {
                strRating = "No reviews";
            } else {
                strRating = String.format(("%.1f"), avgRating);
            }
            
            return strRating;
    }
    
    static PropertyList[] getPropertyList(String email) {
        DriverManager.setLoginTimeout(3);
        
        PropertyList[] propertyList = null;
        
        try (Connection con = DriverManager.getConnection("jdbc:mysql://stusql.dcs.shef.ac.uk/team024", "team024", "c0857903")) {
           
            PreparedStatement pstmt = con.prepareStatement("SELECT propertyId, propertyName, location, description FROM Properties "
                    + "WHERE email = ?;",
                    ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            pstmt.setString(1, email);

            ResultSet res = pstmt.executeQuery();
            
            int numberOfProperties = 0;
            if (res.last()){
              numberOfProperties = res.getRow();
              res.beforeFirst();
            }
            
            propertyList = new PropertyList[numberOfProperties];
            String rating;            
            
            for (int i = 0; i <= numberOfProperties; i++){
                if (res.next()){  
                    
                    rating = getRating(res.getString("propertyId"));
                    
                    propertyList[i] = new PropertyList(res.getString("propertyName"), res.getString("location"),
                            rating, res.getString("description"));
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
        
        return propertyList;
    }
    
    static PropertyList[] getAllPropertyList() {
        DriverManager.setLoginTimeout(3);
        
        PropertyList[] allPropertyList = null;
        
        try (Connection con = DriverManager.getConnection("jdbc:mysql://stusql.dcs.shef.ac.uk/team024", "team024", "c0857903")) {
           
            PreparedStatement pstmt = con.prepareStatement("SELECT propertyId, propertyName, location, description FROM Properties ",
                    ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet res = pstmt.executeQuery();
            
            int numberOfProperties = 0;
            if (res.last()){
              numberOfProperties = res.getRow();
              res.beforeFirst();
            }
            
            allPropertyList = new PropertyList[numberOfProperties];
            String rating;            
            
            for (int i = 0; i < numberOfProperties; i++){
                if (res.next()){  
                    
                    rating = getRating(res.getString("propertyId"));
                    
                    allPropertyList[i] = new PropertyList(res.getString("propertyName"), res.getString("location"),
                            rating, res.getString("description"));
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
        
        return allPropertyList;
    }
    
    static PropertyList[] searchByLocation(String email, String location) {
        DriverManager.setLoginTimeout(3);
        
        PropertyList[] searchPropList = null;
        
        try (Connection con = DriverManager.getConnection("jdbc:mysql://stusql.dcs.shef.ac.uk/team024", "team024", "c0857903")) {
           
            PreparedStatement pstmt = con.prepareStatement("SELECT propertyId, propertyName, location, description FROM Properties "
                    + "WHERE email = ? AND location = ?",
                    ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            pstmt.setString(1, email);
            pstmt.setString(2, location);
            ResultSet res = pstmt.executeQuery();
            
            int numberOfProperties = 0;
            if (res.last()){
              numberOfProperties = res.getRow();
              res.beforeFirst();
            }
            
            searchPropList = new PropertyList[numberOfProperties];
            String rating;            
            
            for (int i = 0; i < numberOfProperties; i++){
                if (res.next()){  
                    
                    rating = getRating(res.getString("propertyId"));
                    
                    searchPropList[i] = new PropertyList(res.getString("propertyName"), res.getString("location"),
                            rating, res.getString("description"));
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
        
        return searchPropList;
               
    }
}
