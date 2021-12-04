package com2008.team.project;

import java.sql.*;

public class ViewBookinglist {
    
    private String accomodationname;
    private String startdate;
    private String enddate;
    private String viewDesc;
    
    private ViewBookinglist(String accomodationname, String startdate, String enddate, String viewDesc){
        this.accomodationname = accomodationname;
        this.startdate = startdate;
        this.enddate = enddate;
        this.viewDesc = viewDesc;
    }
    
    String getAccomodationname(){
        return accomodationname;
    }
    
    String getDate(){
        return ("startdate "+ startdate +"enddate "+ enddate);
    }
    
   
    String getViewDesc(){
        return viewDesc;
    }
    
    static ViewBookinglist[] getList(String propertyId){
        DriverManager.setLoginTimeout(3);
        
        ViewBookinglist[] viewList = null;
        
        try (Connection con = DriverManager.getConnection("jdbc:mysql://stusql.dcs.shef.ac.uk/team024", "team024", "c0857903")) {
           
            PreparedStatement pstmt = con.prepareStatement("SELECT accomodationname,startdate,enddate,viewDescription FROM Bookings"
                    + " Bookings.bookingId AND Bookings.email = Users.email WHERE propertyId = ?;",
                    ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            pstmt.setString(1, propertyId);
            ResultSet res = pstmt.executeQuery();
                        
            int numberOfviews = 0;
            if (res.last()){
              numberOfviews = res.getRow();
              res.beforeFirst();
            }
            
            viewList = new ViewBookinglist[numberOfviews];
            
            for (int i = 0; i < numberOfviews; i++){
                if (res.next()){
                    viewList[i] = new ViewBookinglist(res.getString("accommodationname"), res.getString("startdate"),
                            res.getString("enddate"), res.getString("viewDescription"));
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
        return viewList;
    }
}