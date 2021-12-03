package com2008.team.project;

import java.sql.*;

public class ReviewList {
    
    private String forename;
    private String lastname;
    private float rating;
    private String reviewDesc;
    
    private ReviewList(String forename, String lastname, float rating, String reviewDesc){
        this.forename = forename;
        this.lastname = lastname;
        this.rating = rating;
        this.reviewDesc = reviewDesc;
    }
    
    String getForename(){
        return forename;
    }
    
    String getLastname(){
        return lastname;
    }
    
    float getRating(){
        return rating;
    }
    
    String getReviewDesc(){
        return reviewDesc;
    }
    
    static ReviewList[] getList(String propertyId){
        DriverManager.setLoginTimeout(3);
        
        ReviewList[] reviewList = null;
        
        try (Connection con = DriverManager.getConnection("jdbc:mysql://stusql.dcs.shef.ac.uk/team024", "team024", "c0857903")) {
           
            PreparedStatement pstmt = con.prepareStatement("SELECT forename, surname, avgRating, reviewDescription FROM Reviews JOIN Bookings"
                    + " JOIN Users ON Reviews.bookingId = Bookings.bookingId AND Bookings.email = Users.email WHERE propertyId = ?;",
                    ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            pstmt.setString(1, propertyId);
            ResultSet res = pstmt.executeQuery();
                        
            int numberOfReviews = 0;
            if (res.last()){
              numberOfReviews = res.getRow();
              res.beforeFirst();
            }
            
            reviewList = new ReviewList[numberOfReviews];
            
            for (int i = 0; i < numberOfReviews; i++){
                if (res.next()){
                    reviewList[i] = new ReviewList(res.getString("forename"), res.getString("surname"),
                            res.getFloat("avgRating"), res.getString("reviewDescription"));
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
        return reviewList;
    }
}
