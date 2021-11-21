package com2008.team.project;

import java.sql.*;

enum Bed {
    SINGLE, DOUBLE, KINGSIZE, BUNK;
}

public class Bedroom {
    
    private Bed bed1;
    private Bed bed2;
    
    private Bedroom(Bed bed1, Bed bed2){
        this.bed1 = bed1;
        this.bed2 = bed2;
    }
    
    String getBed1(){
        switch(bed1){
            case SINGLE:
                return "Single bed";
            case DOUBLE:
                return "Double bed";
            case KINGSIZE:
                return "Kingsize bed";
            case BUNK:
                return "Bunk bed";
            default:
                return null;
        }
    }
    
    String getBed2(){
        if (bed2 == null){
            return null;
        }
        
        switch(bed2){
            case SINGLE:
                return "Single bed";
            case DOUBLE:
                return "Double bed";
            case KINGSIZE:
                return "Kingsize bed";
            case BUNK:
                return "Bunk bed";
            default:
                return null;
        }
    }
    
    int getBedAmount(){
        return bed2 == null ? 1 : 2;
    }
    
    int getBedroomCapacity(){
        int bedroomCapacity = 0;
        
        switch(bed1){
            case SINGLE:
                bedroomCapacity++;
                break;
            default:
                bedroomCapacity += 2;
                break;
        }
        
        if (bed2 != null){
            switch(bed2){
                case SINGLE:
                    bedroomCapacity++;
                    break;
                default:
                    bedroomCapacity += 2;
                    break;
            }
        }
            
        return bedroomCapacity;
    }
    
    static Bedroom[] getList(String propertyId){
        DriverManager.setLoginTimeout(3);
        
        Bedroom[] bedrooms = null;
        
        try (Connection con = DriverManager.getConnection("jdbc:mysql://stusql.dcs.shef.ac.uk/team024", "team024", "c0857903")) {
           
            PreparedStatement pstmt = con.prepareStatement("SELECT bed1, bed2 FROM Bedrooms JOIN Properties WHERE Bedrooms.propertyId=?;",
                    ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            pstmt.setString(1, propertyId);
            ResultSet res = pstmt.executeQuery();
                        
            int numberOfBedrooms = 0;
            if (res.last()){
              numberOfBedrooms = res.getRow();
              res.beforeFirst();
            }
            
            bedrooms = new Bedroom[numberOfBedrooms];
            
            try {
                for (int i = 0; i < numberOfBedrooms; i++){
                    if (res.next()){
                        Bed bed1 = Bed.valueOf(res.getString("bed1"));
                        Bed bed2 = null;
                        if (res.getString("bed2") != null){
                            bed2 = Bed.valueOf(res.getString("bed2"));
                        }
                        bedrooms[i] = new Bedroom(bed1, bed2);
                    }
                }
            } catch (Exception ex) {
                ex.printStackTrace();
                
                javax.swing.ImageIcon icon = new javax.swing.ImageIcon(javax.swing.ImageIcon.class.getResource("/images/warning_icon_resized.png"));
                String errorMessage = "Invalid value in database.";
                javax.swing.JOptionPane.showMessageDialog(null, errorMessage, "Error", javax.swing.JOptionPane.INFORMATION_MESSAGE, icon);
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
        return bedrooms;
    }
}
