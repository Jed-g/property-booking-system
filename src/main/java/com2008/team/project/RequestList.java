
package com2008.team.project;

import java.sql.*;

public class RequestList {
    
    private String propertyName;
    private int bookingId;
    private Date startDate;
    private Date endDate;
    private String firstName;
    private String lastName;
    
    private RequestList(String propertyName, int bookingId, Date startDate, Date endDate, String firstName, String lastName) {
        
        this.propertyName = propertyName;
        this.bookingId = bookingId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.firstName = firstName;
        this.lastName = lastName;
        
    }
    
    String getPropertyName() {
        return propertyName;
    }
    
    int getBookingId() {
        return bookingId;
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
    
    String getFirstName() {
        return firstName;
    }
    
    String getLastName() {
        return lastName;
    }
    
    static RequestList[] getRequestList(String email) {       
        DriverManager.setLoginTimeout(3);
        
        RequestList[] requestList = null;
        
        try (Connection con = DriverManager.getConnection("jdbc:mysql://stusql.dcs.shef.ac.uk/team024", "team024", "c0857903")) {
           
            PreparedStatement pstmt = con.prepareStatement("SELECT propertyId, propertyName, bookingId, startDate, endDate, forename, surname "
                    + "FROM Properties JOIN Bookings JOIN Users ON Properties.propertyId = Bookings.propertyId AND"
                    + "Bookings.email = Users.email WHERE Properties.email = ? AND provisional = true",
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
                    
                    requestList[i] = new RequestList(res.getString("propertyName"), res.getInt("bookingId"),
                            res.getDate("startDate"), res.getDate("endDate"), res.getString("forename"), res.getString("surname"));
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
