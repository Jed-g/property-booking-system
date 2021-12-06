package com2008.team.project;

import java.sql.*;

public class Guestpastbooking extends javax.swing.JPanel {
private Main jFrameInstance;
private String location;
private String location1;
private String location2;
private String location3;
private String startdate;
private String enddate;
private String email;
private Boolean hostView = false;
private GuestBookingList[] pastList;
private int currentPage = 1;
private int numberOfPages;
private int propertyId;


    /**
     * Creates new form NewJPanel
     */
    public Guestpastbooking(Main jFrameInstance, String email) {
        initComponents();
        this.jFrameInstance = jFrameInstance;
        fetchPastData();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        switchHostView = new javax.swing.JButton();
        guestSearch = new javax.swing.JButton();
        homePage = new javax.swing.JButton();
        leaveReview3 = new javax.swing.JButton();
        leaveReview1 = new javax.swing.JButton();
        leaveReview2 = new javax.swing.JButton();
        pastBooking = new javax.swing.JButton();
        upcomingBooking = new javax.swing.JButton();
        otherReviews1 = new javax.swing.JButton();
        otherReviews2 = new javax.swing.JButton();
        accountButton = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        proname1 = new javax.swing.JTextField();
        prolocation1 = new javax.swing.JTextField();
        prodates1 = new javax.swing.JTextField();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        proname4 = new javax.swing.JTextField();
        prolocation4 = new javax.swing.JTextField();
        prodates3 = new javax.swing.JTextField();
        leaveReview4 = new javax.swing.JButton();
        otherReviews3 = new javax.swing.JButton();
        otherReviews4 = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        proname2 = new javax.swing.JTextField();
        prolocation2 = new javax.swing.JTextField();
        prodates2 = new javax.swing.JTextField();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        prolocation3 = new javax.swing.JTextField();
        proname3 = new javax.swing.JTextField();
        prodates4 = new javax.swing.JTextField();
        previousPage = new javax.swing.JButton();
        pageNumber = new javax.swing.JLabel();
        nextPage = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();

        jButton4.setBackground(new java.awt.Color(255, 204, 153));
        jButton4.setText("Search");

        setPreferredSize(new java.awt.Dimension(1024, 576));

        switchHostView.setBackground(new java.awt.Color(255, 204, 204));
        switchHostView.setText("Switch to Host View");
        switchHostView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchHostViewActionPerformed(evt);
            }
        });

        guestSearch.setBackground(new java.awt.Color(255, 204, 153));
        guestSearch.setText("Search");
        guestSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guestSearchActionPerformed(evt);
            }
        });

        homePage.setBackground(new java.awt.Color(255, 204, 153));
        homePage.setText("Homepage");
        homePage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homePageActionPerformed(evt);
            }
        });

        leaveReview3.setBackground(new java.awt.Color(255, 153, 153));
        leaveReview3.setText("Leave a review");
        leaveReview3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leaveReview3ActionPerformed(evt);
            }
        });

        leaveReview1.setBackground(new java.awt.Color(255, 153, 153));
        leaveReview1.setText("Leave a review");
        leaveReview1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leaveReview1ActionPerformed(evt);
            }
        });

        leaveReview2.setBackground(new java.awt.Color(255, 153, 153));
        leaveReview2.setText("Leave a review");
        leaveReview2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leaveReview2ActionPerformed(evt);
            }
        });

        pastBooking.setBackground(new java.awt.Color(255, 204, 153));
        pastBooking.setText("Past Booking");
        pastBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pastBookingActionPerformed(evt);
            }
        });

        upcomingBooking.setBackground(new java.awt.Color(255, 204, 153));
        upcomingBooking.setText("Upcoming Booking");
        upcomingBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upcomingBookingActionPerformed(evt);
            }
        });

        otherReviews1.setBackground(new java.awt.Color(255, 153, 153));
        otherReviews1.setText("Reviews");
        otherReviews1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherReviews1ActionPerformed(evt);
            }
        });

        otherReviews2.setBackground(new java.awt.Color(255, 153, 153));
        otherReviews2.setText("Reviews");
        otherReviews2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherReviews2ActionPerformed(evt);
            }
        });

        accountButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        accountButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/User_Icon_Wikipedia_Resized.png"))); // NOI18N
        accountButton.setText("Account");
        accountButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        accountButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        accountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountButtonActionPerformed(evt);
            }
        });

        proname1.setText("jTextField3");
        jTabbedPane1.addTab("Accomodation name", proname1);

        prolocation1.setText("jTextField1");
        jTabbedPane1.addTab("Location ", prolocation1);

        prodates1.setText("jTextField4");
        jTabbedPane1.addTab("Dates", prodates1);

        proname4.setText("jTextField3");
        jTabbedPane5.addTab("Accomodation name", proname4);

        prolocation4.setText("jTextField1");
        jTabbedPane5.addTab("Location ", prolocation4);

        prodates3.setText("jTextField4");
        jTabbedPane5.addTab("Dates", prodates3);

        leaveReview4.setBackground(new java.awt.Color(255, 153, 153));
        leaveReview4.setText("Leave a review");
        leaveReview4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leaveReview4ActionPerformed(evt);
            }
        });

        otherReviews3.setBackground(new java.awt.Color(255, 153, 153));
        otherReviews3.setText("Reviews");
        otherReviews3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherReviews3ActionPerformed(evt);
            }
        });

        otherReviews4.setBackground(new java.awt.Color(255, 153, 153));
        otherReviews4.setText("Reviews");
        otherReviews4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherReviews4ActionPerformed(evt);
            }
        });

        proname2.setText("jTextField3");
        proname2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proname2ActionPerformed(evt);
            }
        });
        jTabbedPane2.addTab("Accomodation name", proname2);

        prolocation2.setText("jTextField1");
        jTabbedPane2.addTab("Location ", prolocation2);

        prodates2.setText("jTextField4");
        jTabbedPane2.addTab("Dates", prodates2);

        prolocation3.setText("jTextField1");
        jTabbedPane3.addTab("Location ", prolocation3);

        proname3.setText("jTextField3");
        jTabbedPane3.addTab("Accomodation name", proname3);

        prodates4.setText("jTextField4");
        jTabbedPane3.addTab("Dates", prodates4);

        previousPage.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        previousPage.setText("PREVIOUS");
        previousPage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        previousPage.setPreferredSize(new java.awt.Dimension(150, 40));
        previousPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousPageActionPerformed(evt);
            }
        });

        pageNumber.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pageNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pageNumber.setText("[page number]");

        nextPage.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        nextPage.setText("NEXT");
        nextPage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        nextPage.setPreferredSize(new java.awt.Dimension(150, 40));
        nextPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextPageActionPerformed(evt);
            }
        });

        logoutButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        logoutButton.setText("Log Out");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(switchHostView, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(accountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(homePage, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(234, 234, 234)
                                .addComponent(guestSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100)
                                .addComponent(pastBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                        .addComponent(upcomingBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(leaveReview1)
                                .addGap(457, 457, 457)
                                .addComponent(leaveReview3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(otherReviews3)
                                .addGap(6, 6, 6))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(leaveReview2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(otherReviews2))
                                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(leaveReview4)
                                        .addGap(190, 190, 190)
                                        .addComponent(otherReviews4))
                                    .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(otherReviews1)
                            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previousPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(281, 281, 281)
                .addComponent(pageNumber)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nextPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(switchHostView, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(accountButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pastBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(upcomingBooking, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nextPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(homePage, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(guestSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(previousPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pageNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(leaveReview1))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(otherReviews1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(otherReviews3)
                                .addComponent(leaveReview3)))))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTabbedPane3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(leaveReview2)
                    .addComponent(otherReviews2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(otherReviews4)
                        .addComponent(leaveReview4)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void fetchPastData() {
        
        previousPage.setEnabled(false);
        nextPage.setEnabled(false);
        
        Date dateToday = new Date(new java.util.Date().getTime());
        
        pastList = GuestBookingList.getPastList(email, dateToday);
        
        int n = pastList.length;
        
        if (n <= 4){
            removePastBoxes(4-n);
        } else {
            nextPage.setEnabled(true);
        }
        
        fillPastBoxes(0);
        numberOfPages = n == 0 ? 1 : (int)Math.ceil((float)n/3);
        pageNumber.setText("1/" + numberOfPages);

    }
    
    private void removePastBoxes(int numBoxesToBeRemoved) {

        if (numBoxesToBeRemoved >= 1){
            prolocation1.setVisible(false);
            proname1.setVisible(false);
            prodates1.setVisible(false);
        }
        if (numBoxesToBeRemoved >= 2){
            prolocation2.setVisible(false);
            proname2.setVisible(false);
            prodates2.setVisible(false);
        }
        if (numBoxesToBeRemoved >= 3){
            prolocation3.setVisible(false);
            proname3.setVisible(false);
            prodates4.setVisible(false);
        }
        if (numBoxesToBeRemoved == 4){
            prolocation4.setVisible(false);
            proname4.setVisible(false);
            prodates3.setVisible(false);
        }
        
    }
    
    
    
    private void fillPastBoxes(int indexFirstPropOnPage) {

        int maxAmountBoxes = 4;
        
        if (indexFirstPropOnPage + 4 > pastList.length){
            maxAmountBoxes = pastList.length - indexFirstPropOnPage;
        }
        if (maxAmountBoxes >= 1){
            proname1.setText(pastList[indexFirstPropOnPage].getPropertyName());
            prolocation1.setText(pastList[indexFirstPropOnPage].getLocation());
            prodates1.setText(pastList[indexFirstPropOnPage].getDateRange());
        }
        if (maxAmountBoxes >= 2){
            proname2.setText(pastList[indexFirstPropOnPage+1].getPropertyName());
            prolocation2.setText(pastList[indexFirstPropOnPage+1].getLocation());
            prodates2.setText(pastList[indexFirstPropOnPage+1].getDateRange());
        }
        if (maxAmountBoxes >= 3){
            proname3.setText(pastList[indexFirstPropOnPage+2].getPropertyName());
            prolocation3.setText(pastList[indexFirstPropOnPage+2].getLocation());
            prodates4.setText(pastList[indexFirstPropOnPage+2].getDateRange());
        }
        if (maxAmountBoxes == 4){
            proname4.setText(pastList[indexFirstPropOnPage+3].getPropertyName());
            prolocation4.setText(pastList[indexFirstPropOnPage+3].getLocation());
            prodates3.setText(pastList[indexFirstPropOnPage+3].getDateRange());
        }
        
    
        
    }
    
    private void resetUpcomingBoxes() {
        
        proname1.setVisible(true);
        prolocation1.setVisible(true);
        prodates1.setVisible(true);

        proname2.setVisible(true);
        prolocation2.setVisible(true);
        prodates2.setVisible(true);

        proname3.setVisible(true);
        prolocation3.setVisible(true);
        prodates4.setVisible(true);

        proname4.setVisible(true);
        prolocation4.setVisible(true);
        prodates3.setVisible(true);
        
    }
                                         

    private void homePageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homePageActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_homePageActionPerformed

    private void pastBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pastBookingActionPerformed
        // TODO add your handling code here:
        Guestpastbooking guestpastbooking =new Guestpastbooking(jFrameInstance,location2);
        jFrameInstance.changePanelToSpecific(guestpastbooking);
        
    }//GEN-LAST:event_pastBookingActionPerformed

    private void upcomingBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upcomingBookingActionPerformed
        // TODO add your handling code here:
        Guestupcomingbooking guestupcomingbooking =new Guestupcomingbooking(jFrameInstance,location3);
        jFrameInstance.changePanelToSpecific(guestupcomingbooking);
    }//GEN-LAST:event_upcomingBookingActionPerformed

    private void otherReviews1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherReviews1ActionPerformed
        Integer propertyId = pastList[(currentPage-1)*4].getPropertyId();
        String strPropId = propertyId.toString();
        Review reviews = new Review(jFrameInstance, strPropId, this);
        jFrameInstance.changePanelToSpecific(reviews);
    }//GEN-LAST:event_otherReviews1ActionPerformed

    private void leaveReview1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leaveReview1ActionPerformed
        int bookingId = pastList[(currentPage-1)*4].getBookingId();
        ReviewComment1 comment = new ReviewComment1(jFrameInstance, bookingId);
        jFrameInstance.changePanelToSpecific(comment);
    }//GEN-LAST:event_leaveReview1ActionPerformed

    private void accountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountButtonActionPerformed
        jFrameInstance.changePanelToSpecific(new User(jFrameInstance, jFrameInstance.getEmail(), false, this));
    }//GEN-LAST:event_accountButtonActionPerformed

    private void otherReviews3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherReviews3ActionPerformed
        Integer propertyId = pastList[(currentPage-1)*4 + 2].getPropertyId();
        String strPropId = propertyId.toString();
        Review reviews = new Review(jFrameInstance, strPropId, this);
        jFrameInstance.changePanelToSpecific(reviews);
    }//GEN-LAST:event_otherReviews3ActionPerformed

    private void otherReviews4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherReviews4ActionPerformed
        Integer propertyId = pastList[(currentPage-1)*4 + 3].getPropertyId();
        String strPropId = propertyId.toString();
        Review reviews = new Review(jFrameInstance, strPropId, this);
        jFrameInstance.changePanelToSpecific(reviews);
    }//GEN-LAST:event_otherReviews4ActionPerformed

    private void guestSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guestSearchActionPerformed
        // TODO add your handling code here:
         Guestsearch guestsearch = new Guestsearch(jFrameInstance,location1,email);
        jFrameInstance.changePanelToSpecific(guestsearch);
    }//GEN-LAST:event_guestSearchActionPerformed

    private void previousPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousPageActionPerformed
        if (currentPage == numberOfPages){
            nextPage.setEnabled(true);
        }
        --currentPage;
        if (currentPage == 1){
            previousPage.setEnabled(false);
        }

        int indexFirstPropOnPage = (currentPage-1)*4;

        pageNumber.setText(currentPage + "/" + numberOfPages);
        fillPastBoxes(indexFirstPropOnPage);
    }//GEN-LAST:event_previousPageActionPerformed

    private void nextPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextPageActionPerformed
        if (currentPage == 1){
            previousPage.setEnabled(true);
        }
        ++currentPage;
        if (currentPage == numberOfPages){
            nextPage.setEnabled(false);
        }

        int indexFirstPropOnPage = (currentPage-1)*4;

        pageNumber.setText(currentPage + "/" + numberOfPages);
        fillPastBoxes(indexFirstPropOnPage);

        if (indexFirstPropOnPage + 4 > pastList.length){
            removePastBoxes(indexFirstPropOnPage - pastList.length + 4);
        }
    }//GEN-LAST:event_nextPageActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        jFrameInstance.setEmail("");
        jFrameInstance.changePanelToDefault();
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void switchHostViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switchHostViewActionPerformed
        try (Connection con = DriverManager.getConnection("jdbc:mysql://stusql.dcs.shef.ac.uk/team024", "team024", "c0857903")) {

            PreparedStatement pstmt = con.prepareStatement("SELECT isHost FROM Users WHERE email=?");
            pstmt.setString(1, jFrameInstance.getEmail());
            ResultSet res = pstmt.executeQuery();

            if (res.next()){
                boolean isHost = res.getBoolean("isHost");
                
                if (isHost){
                    jFrameInstance.changePanelToSpecific(new HostViewAllProperties(jFrameInstance, jFrameInstance.getEmail()));
                } else {
                    javax.swing.ImageIcon icon = new javax.swing.ImageIcon(getClass().getResource("/images/warning_icon_resized.png"));
                    String errorMessage = "Access denied. You are not a Host. To become a host please go to the account page.";
                    javax.swing.JOptionPane.showMessageDialog(null, errorMessage, "Error", javax.swing.JOptionPane.INFORMATION_MESSAGE, icon);
                    
                    switchHostView.setEnabled(false);
                }
            }
            
            res.close();
            pstmt.close();
        }
        catch (Exception ex) {
            ex.printStackTrace();            
            
            javax.swing.ImageIcon icon = new javax.swing.ImageIcon(getClass().getResource("/images/warning_icon_resized.png"));
            String errorMessage = "Connection to database failed. University VPN is required.";
            javax.swing.JOptionPane.showMessageDialog(null, errorMessage, "Error", javax.swing.JOptionPane.INFORMATION_MESSAGE, icon);
        }
    }//GEN-LAST:event_switchHostViewActionPerformed

    private void proname2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proname2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proname2ActionPerformed

    private void leaveReview2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leaveReview2ActionPerformed
        int bookingId = pastList[(currentPage-1)*4 + 1].getBookingId();
        ReviewComment1 comment = new ReviewComment1(jFrameInstance, bookingId);
        jFrameInstance.changePanelToSpecific(comment);
    }//GEN-LAST:event_leaveReview2ActionPerformed

    private void leaveReview3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leaveReview3ActionPerformed
        int bookingId = pastList[(currentPage-1)*4 + 2].getBookingId();
        ReviewComment1 comment = new ReviewComment1(jFrameInstance, bookingId);
        jFrameInstance.changePanelToSpecific(comment);
    }//GEN-LAST:event_leaveReview3ActionPerformed

    private void leaveReview4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leaveReview4ActionPerformed
        int bookingId = pastList[(currentPage-1)*4 + 3].getBookingId();
        ReviewComment1 comment = new ReviewComment1(jFrameInstance, bookingId);
        jFrameInstance.changePanelToSpecific(comment);
    }//GEN-LAST:event_leaveReview4ActionPerformed

    private void otherReviews2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherReviews2ActionPerformed
        Integer propertyId = pastList[(currentPage-1)*4 + 1].getPropertyId();
        String strPropId = propertyId.toString();
        Review reviews = new Review(jFrameInstance, strPropId, this);
        jFrameInstance.changePanelToSpecific(reviews);
    }//GEN-LAST:event_otherReviews2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accountButton;
    private javax.swing.JButton guestSearch;
    private javax.swing.JButton homePage;
    private javax.swing.JButton jButton4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JButton leaveReview1;
    private javax.swing.JButton leaveReview2;
    private javax.swing.JButton leaveReview3;
    private javax.swing.JButton leaveReview4;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton nextPage;
    private javax.swing.JButton otherReviews1;
    private javax.swing.JButton otherReviews2;
    private javax.swing.JButton otherReviews3;
    private javax.swing.JButton otherReviews4;
    private javax.swing.JLabel pageNumber;
    private javax.swing.JButton pastBooking;
    private javax.swing.JButton previousPage;
    private javax.swing.JTextField prodates1;
    private javax.swing.JTextField prodates2;
    private javax.swing.JTextField prodates3;
    private javax.swing.JTextField prodates4;
    private javax.swing.JTextField prolocation1;
    private javax.swing.JTextField prolocation2;
    private javax.swing.JTextField prolocation3;
    private javax.swing.JTextField prolocation4;
    private javax.swing.JTextField proname1;
    private javax.swing.JTextField proname2;
    private javax.swing.JTextField proname3;
    private javax.swing.JTextField proname4;
    private javax.swing.JButton switchHostView;
    private javax.swing.JButton upcomingBooking;
    // End of variables declaration//GEN-END:variables
}
