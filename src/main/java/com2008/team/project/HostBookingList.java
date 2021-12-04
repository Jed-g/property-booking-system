
package com2008.team.project;

import java.sql.*;

public class HostBookingList {
    
    private int bookingId;
    private String propertyName;
    private String location;
    private Date startDate;
    private Date endDate;
    private String guestForename;
    private String guestSurname;
    private String guestEmail;
    private String guestPhoneNum;
    
    private HostBookingList(int bookingId, String propertyName, String location, Date startDate, Date endDate,
                String guestForename, String guestSurname, String guestEmail, String guestPhoneNum) {
        
        this.bookingId = bookingId;
        this.propertyName = propertyName;
        this.location = location;
        this.startDate = startDate;
        this.endDate = endDate;
        this.guestForename = guestForename;
        this.guestSurname = guestSurname;
        this.guestEmail = guestEmail;
        this.guestPhoneNum = guestPhoneNum;
        
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
    
    String getGuestName() {
        return (guestForename + " " + guestSurname.substring(0,1));
    }
    
    String getGuestEmail() {
        return guestEmail;
    }
    
    String getGuestPhoneNum() {
        return guestPhoneNum;
    }
    
    static HostBookingList[] getUpcomingList(String email, Date dateToday) {
        DriverManager.setLoginTimeout(3);
        
        HostBookingList[] upcomingList = null;
        
        try (Connection con = DriverManager.getConnection("jdbc:mysql://stusql.dcs.shef.ac.uk/team024", "team024", "c0857903")) {
           
            PreparedStatement pstmt = con.prepareStatement("SELECT bookingId, startDate, endDate, propertyName, location, forename, surname,"
                    + "Users.email, Users.phoneNo FROM Properties JOIN Bookings JOIN Users ON Properties.propertyId = Bookings.propertyId AND "
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
                    
                    upcomingList[i] = new HostBookingList(res.getInt("bookingId"), res.getString("propertyName"), res.getString("location"),
                            res.getDate("startDate"), res.getDate("endDate"), res.getString("forename"), res.getString("surname"),
                            res.getString("Users.email"), res.getString("Users.phoneNo"));
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
    
    static HostBookingList[] getUpSearchResults(String email, Date dateToday, String propertyName) {
        DriverManager.setLoginTimeout(3);
        
        HostBookingList[] upSearchResults = null;
        
        try (Connection con = DriverManager.getConnection("jdbc:mysql://stusql.dcs.shef.ac.uk/team024", "team024", "c0857903")) {
           
            PreparedStatement pstmt = con.prepareStatement("SELECT bookingId, startDate, endDate, propertyName, location, forename, surname, "
                    + "Users.email, Users.phoneNo FROM Properties JOIN Bookings JOIN Users ON Properties.propertyId = Bookings.propertyId AND "
                    + "Bookings.email = Users.email WHERE provisional = 0 AND startDate > ? AND Properties.email = ? AND propertyName = ?",
                    ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            pstmt.setDate(1, dateToday);
            pstmt.setString(2, email);
            pstmt.setString(3, propertyName);
            ResultSet res = pstmt.executeQuery();
            
            int numberOfUpcoming = 0;
            if (res.last()){
              numberOfUpcoming = res.getRow();
              res.beforeFirst();
            }
            
            upSearchResults = new HostBookingList[numberOfUpcoming];           
            
            for (int i = 0; i < numberOfUpcoming; i++){
                if (res.next()){  
                    
                    upSearchResults[i] = new HostBookingList(res.getInt("bookingId"), res.getString("propertyName"), res.getString("location"),
                            res.getDate("startDate"), res.getDate("endDate"), res.getString("forename"), res.getString("surname"),
                            res.getString("Users.email"), res.getString("Users.phoneNo"));
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
        
        return upSearchResults;
    }
    
    static void cancelBooking(int bookingId){
        DriverManager.setLoginTimeout(3);

        try (Connection con = DriverManager.getConnection("jdbc:mysql://stusql.dcs.shef.ac.uk/team024", "team024", "c0857903")) {
           
            PreparedStatement pstmt = con.prepareStatement("DELETE FROM Bookings WHERE bookingId=?");
            pstmt.setInt(1, bookingId);
            pstmt.executeUpdate();
        }
        catch (Exception ex) {
            ex.printStackTrace();            
            
            javax.swing.ImageIcon icon = new javax.swing.ImageIcon(javax.swing.ImageIcon.class.getResource("/images/warning_icon_resized.png"));
            String errorMessage = "Connection to database failed. University VPN is required.";
            javax.swing.JOptionPane.showMessageDialog(null, errorMessage, "Error", javax.swing.JOptionPane.INFORMATION_MESSAGE, icon);
        }
    }
    
    static HostBookingList[] getPreviousList(String email, Date dateToday) {
        DriverManager.setLoginTimeout(3);
        
        HostBookingList[] previousList = null;
        
        try (Connection con = DriverManager.getConnection("jdbc:mysql://stusql.dcs.shef.ac.uk/team024", "team024", "c0857903")) {
           
            PreparedStatement pstmt = con.prepareStatement("SELECT bookingId, startDate, endDate, propertyName, location, forename, surname,"
                    + "Users.email, Users.phoneNo FROM Properties JOIN Bookings JOIN Users ON Properties.propertyId = Bookings.propertyId AND "
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
                    
                    previousList[i] = new HostBookingList(res.getInt("bookingId"), res.getString("propertyName"), res.getString("location"),
                            res.getDate("startDate"), res.getDate("endDate"), res.getString("forename"), res.getString("surname"),
                            res.getString("Users.email"), res.getString("Users.phoneNo"));
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
    
       static HostBookingList[] getPreSearchResults(String email, Date dateToday, String propertyName) {
        DriverManager.setLoginTimeout(3);
        
        HostBookingList[] preSearchResults = null;
        
        try (Connection con = DriverManager.getConnection("jdbc:mysql://stusql.dcs.shef.ac.uk/team024", "team024", "c0857903")) {
           
            PreparedStatement pstmt = con.prepareStatement("SELECT bookingId, startDate, endDate, propertyName, location, forename, surname,"
                    + "Users.email, Users.phoneNo FROM Properties JOIN Bookings JOIN Users ON Properties.propertyId = Bookings.propertyId AND "
                    + "Bookings.email = Users.email WHERE provisional = 0 AND startDate <= ? AND Properties.email = ? AND propertyName = ?",
                    ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            pstmt.setDate(1, dateToday);
            pstmt.setString(2, email);
            pstmt.setString(3, propertyName);
            ResultSet res = pstmt.executeQuery();
            
            int numberOfPrevious = 0;
            if (res.last()){
              numberOfPrevious = res.getRow();
              res.beforeFirst();
            }
            
            preSearchResults = new HostBookingList[numberOfPrevious];           
            
            for (int i = 0; i < numberOfPrevious; i++){
                if (res.next()){  
                    
                    preSearchResults[i] = new HostBookingList(res.getInt("bookingId"), res.getString("propertyName"), res.getString("location"),
                            res.getDate("startDate"), res.getDate("endDate"), res.getString("forename"), res.getString("surname"),
                            res.getString("Users.email"), res.getString("Users.phoneNo"));
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
        
        return preSearchResults;
    }
    
}
