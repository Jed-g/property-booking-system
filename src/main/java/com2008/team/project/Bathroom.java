package com2008.team.project;

import java.sql.*;

public class Bathroom {
    
    private Boolean toilet;
    private Boolean bath;
    private Boolean shower;
    private Boolean isShared;
    
    private Bathroom(Boolean toilet, Boolean bath, Boolean shower, Boolean isShared){
        this.toilet = toilet;
        this.bath = bath;
        this.shower = shower;
        this.isShared = isShared;
    }
    
    Boolean getToilet(){
        return toilet;
    }
    
    Boolean getBath(){
        return bath;
    }
    
    Boolean getShower(){
        return shower;
    }
    
    Boolean getIsShared(){
        return isShared;
    }
    
    static Bathroom[] getList(String propertyId){
        DriverManager.setLoginTimeout(3);
        
        Bathroom[] bathrooms = null;
        
        try (Connection con = DriverManager.getConnection("jdbc:mysql://stusql.dcs.shef.ac.uk/team024", "team024", "c0857903")) {
           
            PreparedStatement pstmt = con.prepareStatement("SELECT toilet, bath, shower, isShared FROM Bathrooms JOIN Properties WHERE Bathrooms.propertyId=?",
                    ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            pstmt.setString(1, propertyId);
            ResultSet res = pstmt.executeQuery();
                        
            int numberOfBathrooms = 0;
            if (res.last()){
              numberOfBathrooms = res.getRow();
              res.beforeFirst();
            }
            
            bathrooms = new Bathroom[numberOfBathrooms];
            
            for (int i = 0; i < numberOfBathrooms; i++){
                if (res.next()){
                    bathrooms[i] = new Bathroom(res.getBoolean("toilet"), res.getBoolean("bath"),
                    res.getBoolean("shower"), res.getBoolean("isShared"));
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
        return bathrooms;
    }
}
