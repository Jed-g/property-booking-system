
package com2008.team.project;

import java.sql.*;

public class BookingList {
    
    private String propertyName;
    private String location;
    private Date startDate;
    private Date endDate;
    private String guestName;
    
    private BookingList(String propertyName, String location, Date startDate, Date endDate,
                String guestName) {
        
        this.propertyName = propertyName;
        this.location = location;
        this.startDate = startDate;
        this.endDate = endDate;
        this.guestName = guestName;
        
    }
    
}
