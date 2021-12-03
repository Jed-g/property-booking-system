
package com2008.team.project;

import java.sql.*;

public class HostBookingList {
    
    private String propertyName;
    private String location;
    private Date startDate;
    private Date endDate;
    private String guestForename;
    private String guestSurname;
    
    private HostBookingList(String propertyName, String location, Date startDate, Date endDate,
                String guestForename, String guestSurname) {
        
        this.propertyName = propertyName;
        this.location = location;
        this.startDate = startDate;
        this.endDate = endDate;
        this.guestForename = guestForename;
        this.guestSurname = guestSurname;
        
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
    
    String getGuestName() {
        return (guestForename + " " + guestSurname.substring(0,1));
    }
    
    static HostBookingList[] getUpcomingList(String email, Date dateToday) {
        DriverManager.setLoginTimeout(3);
        
        HostBookingList[] upcomingList = null;
        
        try (Connection con = DriverManager.getConnection("jdbc:mysql://stusql.dcs.shef.ac.uk/team024", "team024", "c0857903")) {
           
            PreparedStatement pstmt = con.prepareStatement("SELECT startDate, endDate, propertyName, location, forename, surname,"
                    + "Users.email FROM Properties JOIN Bookings JOIN Users ON Properties.propertyId = Bookings.propertyId AND "
                    + "Bookings.email = Users.email WHERE provisional = 0 AND startDate > ? AND Properties.email = ?",
                    ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            pstmt.setDate(1, dateToday);
            pstmt.setString(2, email);
            ResultSet res = pstmt.executeQuery();
            
            int numberOfUpcoming = 0;
            if (res.last()){
              numberOfUpcoming = res.getRow();
              res.beforeFirst();
            }
            
            upcomingList = new HostBookingList[numberOfUpcoming];           
            
            for (int i = 0; i < numberOfUpcoming; i++){
                if (res.next()){  
                    
                    upcomingList[i] = new HostBookingList(res.getString("propertyName"), res.getString("location"),
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
        
        return upcomingList;
    }
    
    static HostBookingList[] getPreviousList(String email, Date dateToday) {
        DriverManager.setLoginTimeout(3);
        
        HostBookingList[] previousList = null;
        
        try (Connection con = DriverManager.getConnection("jdbc:mysql://stusql.dcs.shef.ac.uk/team024", "team024", "c0857903")) {
           
            PreparedStatement pstmt = con.prepareStatement("SELECT startDate, endDate, propertyName, location, forename, surname,"
                    + "Users.email FROM Properties JOIN Bookings JOIN Users ON Properties.propertyId = Bookings.propertyId AND "
                    + "Bookings.email = Users.email WHERE provisional = 0 AND startDate <= ? AND Properties.email = ?",
                    ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            pstmt.setDate(1, dateToday);
            pstmt.setString(2, email);
            ResultSet res = pstmt.executeQuery();
            
            int numberOfPrevious = 0;
            if (res.last()){
              numberOfPrevious = res.getRow();
              res.beforeFirst();
            }
            
            previousList = new HostBookingList[numberOfPrevious];           
            
            for (int i = 0; i < numberOfPrevious; i++){
                if (res.next()){  
                    
                    previousList[i] = new HostBookingList(res.getString("propertyName"), res.getString("location"),
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
        
        return previousList;
    }
    
}
