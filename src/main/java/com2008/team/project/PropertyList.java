
package com2008.team.project;

import java.sql.*;

public class PropertyList {
    
    private String propertyName;
    private String location;
    private String description;
    
    private PropertyList(String propertyName, String location, String description) {
        
        this.propertyName = propertyName;
        this.location = location;
        this.description = description;
        
    }
    
    String getPropertyName() {
        return propertyName;
    }
    
    String getLocation() {
        return location;
    }
    
    String getDescription() {
        return description;
    }
    
    static PropertyList[] getPropertyList(String email) {
        DriverManager.setLoginTimeout(3);
        
        PropertyList[] propertyList = null;
        
        try (Connection con = DriverManager.getConnection("jdbc:mysql://stusql.dcs.shef.ac.uk/team024", "team024", "c0857903")) {
           
            PreparedStatement pstmt = con.prepareStatement("SELECT propertyName, location, description FROM Properties "
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
            
            for (int i = 0; i < numberOfProperties; i++){
                if (res.next()){
                    propertyList[i] = new PropertyList(res.getString("propertyName"), res.getString("location"),
                            res.getString("description"));
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
    
}
