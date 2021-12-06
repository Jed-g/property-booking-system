
package com2008.team.project;

import java.sql.*;

public class GuestBookingList {
    
    private int bookingId;
    private String propertyName;
    private String location;
    private Date startDate;
    private Date endDate;
    private int propertyId;
    
    private GuestBookingList(int bookingId, String propertyName, String location, Date startDate,
                                Date endDate, int propertyId) {
        
        this.bookingId = bookingId;
        this.propertyName = propertyName;
        this.location = location;
        this.startDate = startDate;
        this.endDate = endDate;
        this.propertyId = propertyId;
        
    }
    
    int getBookingId() {
        return bookingId;
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
        return (startDate + " - " + endDate);
    }
    
    int getPropertyId() {
        return propertyId;
    }
    
    static GuestBookingList[] getUpcomingList(String email, Date dateToday) {
        DriverManager.setLoginTimeout(3);
        
        GuestBookingList[] upcomingList = null;
        
        try (Connection con = DriverManager.getConnection("jdbc:mysql://stusql.dcs.shef.ac.uk/team024", "team024", "c0857903")) {
           
            PreparedStatement pstmt = con.prepareStatement("SELECT Properties.propertyId, bookingId, startDate, endDate, propertyName, location "
                    + "FROM Properties JOIN Bookings ON Properties.propertyId = Bookings.propertyId "
                    + "WHERE startDate > ? AND Bookings.email = ?",
                    ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            pstmt.setDate(1, dateToday);
            pstmt.setString(2, email);
            ResultSet res = pstmt.executeQuery();
            
            int numberOfUpcoming = 0;
            if (res.last()){
              numberOfUpcoming = res.getRow();
              res.beforeFirst();
            }
            
            upcomingList = new GuestBookingList[numberOfUpcoming];           
            
            for (int i = 0; i < numberOfUpcoming; i++){
                if (res.next()){  
                    
                    upcomingList[i] = new GuestBookingList(res.getInt("bookingId"), res.getString("propertyName"), res.getString("location"),
                            res.getDate("startDate"), res.getDate("endDate"), res.getInt("Properties.propertyId"));
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
        
        return upcomingList;
    }


static GuestBookingList[] getPastList(String email, Date dateToday) {
        DriverManager.setLoginTimeout(3);
        
        GuestBookingList[] pastList = null;
        
        try (Connection con = DriverManager.getConnection("jdbc:mysql://stusql.dcs.shef.ac.uk/team024", "team024", "c0857903")) {
           
            PreparedStatement pstmt = con.prepareStatement("SELECT Properties.propertyId, bookingId, startDate, endDate, propertyName, location "
                    + "FROM Properties JOIN Bookings ON Properties.propertyId = Bookings.propertyId "
                    + "WHERE startDate <= ? AND Bookings.email = ?",
                    ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            pstmt.setDate(1, dateToday);
            pstmt.setString(2, email);
            ResultSet res = pstmt.executeQuery();
            
            int numberOfUpcoming = 0;
            if (res.last()){
              numberOfUpcoming = res.getRow();
              res.beforeFirst();
            }
            
            pastList = new GuestBookingList[numberOfUpcoming];           
            
            for (int i = 0; i < numberOfUpcoming; i++){
                if (res.next()){  
                    
                    pastList[i] = new GuestBookingList(res.getInt("bookingId"), res.getString("propertyName"), res.getString("location"),
                            res.getDate("startDate"), res.getDate("endDate"), res.getInt("Properties.propertyId"));
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
        
        return pastList;
    }

}
