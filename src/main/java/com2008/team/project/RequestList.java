
package com2008.team.project;

import java.sql.*;

public class RequestList {
    
    private String propertyName;
    private String location;
    private Date startDate;
    private Date endDate;
    
    private RequestList(String propertyName, String location, Date startDate, Date endDate) {
        
        this.propertyName = propertyName;
        this.location = location;
        this.startDate = startDate;
        this.endDate = endDate;
        
    }
    
    String getPropertyName() {
        return propertyName;
    }
    
    String getLocation() {
        return location;
    }
    
    Date getStartDate() {
        return startDate;
    }
    
    Date getEndDate() {
        return endDate;
    }
    
    String getDateRange() {
        return (startDate + " until " + endDate);
    }
    
    static RequestList[] getRequestList(String email) {       
        DriverManager.setLoginTimeout(3);
        
        RequestList[] requestList = null;
        
        try (Connection con = DriverManager.getConnection("jdbc:mysql://stusql.dcs.shef.ac.uk/team024", "team024", "c0857903")) {
           
            PreparedStatement pstmt = con.prepareStatement("SELECT propertyId, propertyName, location, startDate, endDate "
                    + "FROM Bookings WHERE email = ? AND provisional = true",
                    ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            pstmt.setString(1, email);
            ResultSet res = pstmt.executeQuery();
            
            int numberOfRequests = 0;
            if (res.last()){
              numberOfRequests = res.getRow();
              res.beforeFirst();
            }
            
            requestList = new RequestList[numberOfRequests];            
            
            for (int i = 0; i < numberOfRequests; i++){
                if (res.next()){  
                    
                    requestList[i] = new RequestList(res.getString("propertyName"), res.getString("location"),
                            res.getDate("startDate"), res.getDate("endDate"));
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
        
        return requestList;
    }
    
    static void checkForOverlaps(String propertyId, Date startDate, Date endDate) {
        DriverManager.setLoginTimeout(3);
        
        Date newEndDate;
        long milliseconds;
        
        milliseconds = endDate.getTime() - (24*60*60*1000);
        
        newEndDate = new Date(milliseconds);
                
        try (Connection con = DriverManager.getConnection("jdbc:mysql://stusql.dcs.shef.ac.uk/team024", "team024", "c0857903")) {
           
            PreparedStatement pstmt = con.prepareStatement("DELETE FROM Bookings WHERE provisional=1 AND propertyId=? AND "
                    + "((?>=startDate AND ?<=endDate) OR (?>=startDate AND ?<=endDate) OR (?<startDate AND ?>endDate))",
                    ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            pstmt.setString(1, propertyId);
            pstmt.setDate(2, startDate);
            pstmt.setDate(3,startDate);
            pstmt.setDate(4, newEndDate);
            pstmt.setDate(5, newEndDate);
            pstmt.setDate(6, startDate);
            pstmt.setDate(7, newEndDate);
            int count = pstmt.executeUpdate();
        }
        catch (Exception ex) {
            ex.printStackTrace();            
            
            javax.swing.ImageIcon icon = new javax.swing.ImageIcon(javax.swing.ImageIcon.class.getResource("/images/warning_icon_resized.png"));
            String errorMessage = "Connection to database failed. University VPN is required.";
            javax.swing.JOptionPane.showMessageDialog(null, errorMessage, "Error", javax.swing.JOptionPane.INFORMATION_MESSAGE, icon);
        }
    }
    
}
