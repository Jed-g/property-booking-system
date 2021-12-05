package com2008.team.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class Main extends javax.swing.JFrame {

    private String email = "admin";
  
    private String location;
    private String people;
    private int propertyId;
    private PropertyList[] propertyList;
    private int currentPage = 1;
    private int numberOfPages;
    int indexFirstPropOnPage;
    private int num;
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        fetchPropertyData();
    }

    static String hashString(String stringToHash){
        try {
            java.security.MessageDigest md = java.security.MessageDigest.getInstance("SHA3-512");
            byte[] result = md.digest(stringToHash.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder(result.length * 2);

            for(byte b: result)
               sb.append(String.format("%02x", b));
            return sb.toString();
            
        } catch (Exception ex) {
            ex.printStackTrace();            
            
            javax.swing.ImageIcon icon = new javax.swing.ImageIcon(javax.swing.ImageIcon.class.getResource("/images/warning_icon_resized.png"));
            String errorMessage = "Error during hashing password";
            javax.swing.JOptionPane.showMessageDialog(null, errorMessage, "Error", javax.swing.JOptionPane.INFORMATION_MESSAGE, icon);
        }
        
        return "";
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        defaultPanel = new javax.swing.JPanel();
        accountButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        prolocation1 = new javax.swing.JTextField();
        prorating1 = new javax.swing.JTextField();
        proname1 = new javax.swing.JTextField();
        prodescription1 = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        prolocation2 = new javax.swing.JTextField();
        prorating2 = new javax.swing.JTextField();
        proname2 = new javax.swing.JTextField();
        prodescription2 = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jTabbedPane6 = new javax.swing.JTabbedPane();
        prolocation3 = new javax.swing.JTextField();
        prorating3 = new javax.swing.JTextField();
        proname3 = new javax.swing.JTextField();
        prodescription3 = new javax.swing.JTextField();
        jTabbedPane7 = new javax.swing.JTabbedPane();
        prolocation4 = new javax.swing.JTextField();
        prorating4 = new javax.swing.JTextField();
        proname4 = new javax.swing.JTextField();
        prodescription4 = new javax.swing.JTextField();
        previousPage = new javax.swing.JButton();
        pageNumber = new javax.swing.JLabel();
        nextPage = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Property Booking System");
        setIconImage((new javax.swing.ImageIcon(getClass().getResource("/images/Home_Icon_rasterized.png"))).getImage());
        setSize(new java.awt.Dimension(1024, 576));

        jScrollPane1.setViewportView(defaultPanel);

        defaultPanel.setPreferredSize(new java.awt.Dimension(1024, 576));

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

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("����", 0, 18)); // NOI18N
        jButton1.setText("Homepage");

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setFont(new java.awt.Font("����", 0, 18)); // NOI18N
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 204, 204));
        jButton3.setText("CREATE AN ACCOUNT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 204, 204));
        jButton4.setText("Login ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        prolocation1.setText("jTextField1");
        prolocation1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prolocation1ActionPerformed(evt);
            }
        });
        jTabbedPane2.addTab("Location ", prolocation1);

        prorating1.setText("jTextField2");
        jTabbedPane2.addTab("Rating", prorating1);

        proname1.setText("jTextField3");
        jTabbedPane2.addTab("Accomodation name", proname1);

        prodescription1.setText("jTextField4");
        jTabbedPane2.addTab("Description", prodescription1);

        jButton11.setBackground(new java.awt.Color(255, 153, 153));
        jButton11.setText("View more information");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        prolocation2.setText("jTextField1");
        jTabbedPane3.addTab("Location ", prolocation2);

        prorating2.setText("jTextField2");
        jTabbedPane3.addTab("Rating", prorating2);

        proname2.setText("jTextField3");
        jTabbedPane3.addTab("Accomodation name", proname2);

        prodescription2.setText("jTextField4");
        jTabbedPane3.addTab("Description", prodescription2);

        jButton12.setBackground(new java.awt.Color(255, 153, 153));
        jButton12.setText("View more information");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(255, 153, 153));
        jButton13.setText("View more information");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(255, 153, 153));
        jButton14.setText("View more information");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        prolocation3.setText("jTextField1");
        jTabbedPane6.addTab("Location ", prolocation3);

        prorating3.setText("jTextField2");
        jTabbedPane6.addTab("Rating", prorating3);

        proname3.setText("jTextField3");
        jTabbedPane6.addTab("Accomodation name", proname3);

        prodescription3.setText("jTextField4");
        jTabbedPane6.addTab("Description", prodescription3);

        prolocation4.setText("jTextField1");
        jTabbedPane7.addTab("Location ", prolocation4);

        prorating4.setText("jTextField2");
        jTabbedPane7.addTab("Rating", prorating4);

        proname4.setText("jTextField3");
        jTabbedPane7.addTab("Accomodation name", proname4);

        prodescription4.setText("jTextField4");
        jTabbedPane7.addTab("Description", prodescription4);

        previousPage.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        previousPage.setText("PREVIOUS");
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
        nextPage.setPreferredSize(new java.awt.Dimension(150, 40));
        nextPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextPageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout defaultPanelLayout = new javax.swing.GroupLayout(defaultPanel);
        defaultPanel.setLayout(defaultPanelLayout);
        defaultPanelLayout.setHorizontalGroup(
            defaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(defaultPanelLayout.createSequentialGroup()
                .addGroup(defaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(defaultPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(defaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(defaultPanelLayout.createSequentialGroup()
                                .addGroup(defaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton11)
                                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton12))
                                .addGap(215, 215, 215)
                                .addGroup(defaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton14)
                                    .addComponent(jTabbedPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTabbedPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(defaultPanelLayout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jButton13))))
                            .addGroup(defaultPanelLayout.createSequentialGroup()
                                .addComponent(previousPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(265, 265, 265)
                                .addComponent(pageNumber)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nextPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(defaultPanelLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 4, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addGroup(defaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(defaultPanelLayout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(accountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        defaultPanelLayout.setVerticalGroup(
            defaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(defaultPanelLayout.createSequentialGroup()
                .addGroup(defaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountButton, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
                .addGroup(defaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(defaultPanelLayout.createSequentialGroup()
                        .addGap(18, 29, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(defaultPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(defaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(defaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(defaultPanelLayout.createSequentialGroup()
                        .addGroup(defaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(defaultPanelLayout.createSequentialGroup()
                                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(defaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton11)
                                    .addComponent(jButton14)))
                            .addGroup(defaultPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jTabbedPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTabbedPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(defaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton12)
                    .addComponent(jButton13))
                .addGroup(defaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(defaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(previousPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pageNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(defaultPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(nextPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );

        jScrollPane1.setViewportView(defaultPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1036, Short.MAX_VALUE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
      
        //Guestmain search = new Guestmain(this, email);
        //Booking search = new Booking(this,email,propertyId);
       MainsearchA search = new MainsearchA(this,location);
        //Guestupcomingbooking search = new Guestupcomingbooking(this,location);
        jScrollPane1.setViewportView(search);

    }//GEN-LAST:event_jButton2ActionPerformed

   
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Register registrationPage = new Register(this);
        jScrollPane1.setViewportView(registrationPage);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Login login = new Login(this);
        jScrollPane1.setViewportView(login);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void prolocation1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prolocation1ActionPerformed
        // TODO add your handling code here:
    
    }//GEN-LAST:event_prolocation1ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here
    int propertyId =  propertyList[(currentPage-1)*4].getPropertyId();
    this.changePanelToSpecific(new viewProperty(this, propertyId));    
    }//GEN-LAST:event_jButton11ActionPerformed

   
    
    
    private void fetchPropertyData() {
        previousPage.setEnabled(false);
        nextPage.setEnabled(false);
        
        propertyList = PropertyList.getAllPropertyList();
        
        int n = propertyList.length;
        
        if (n <= 4){
            removePropertyBoxes(4-n);
        } else {
            nextPage.setEnabled(true);
        }
        
        if (n <= 4) {
            
            numberOfPages = 1;
            
        } else if (n%4 == 0) {
            
            numberOfPages = n/4;
            
        } else {
            numberOfPages = (n/4) + 1;
        }
        
        pageNumber.setText("1/" + numberOfPages);
        
        fillPropertyBoxes(0);

    }
    
    private void removePropertyBoxes(int numBoxesToBeRemoved) {

        if (numBoxesToBeRemoved >= 1){
            prolocation1.setVisible(false);
            prorating1.setVisible(false);
            proname1.setVisible(false);
            prodescription1.setVisible(false);
        }
        if (numBoxesToBeRemoved >= 2){
            prolocation2.setVisible(false);
            prorating2.setVisible(false);
            proname2.setVisible(false);
            prodescription2.setVisible(false);
        }
        if (numBoxesToBeRemoved >= 3){
           prolocation3.setVisible(false);
            prorating3.setVisible(false);
            proname3.setVisible(false);
            prodescription3.setVisible(false);
        }
        if (numBoxesToBeRemoved == 4){
           prolocation4.setVisible(false);
            prorating4.setVisible(false);
            proname4.setVisible(false);
            prodescription4.setVisible(false);
        }
        
    }
    
    
    
    private void fillPropertyBoxes(int numBoxesToBeRemoved) {

        int maxAmountBoxes = 4;
        
        if (indexFirstPropOnPage + 4 > propertyList.length){
            maxAmountBoxes = propertyList.length - indexFirstPropOnPage;
        }
        
        if (maxAmountBoxes >= 1){
            proname1.setText(propertyList[indexFirstPropOnPage].getPropertyName());
            prolocation1.setText(propertyList[indexFirstPropOnPage].getLocation());
            prorating1.setText(propertyList[indexFirstPropOnPage].getRating());
            prodescription1.setText(propertyList[indexFirstPropOnPage].getDescription());
        }
        if (maxAmountBoxes >= 2){
           proname2.setText(propertyList[indexFirstPropOnPage+1].getPropertyName());
            prolocation2.setText(propertyList[indexFirstPropOnPage+1].getLocation());
            prorating2.setText(propertyList[indexFirstPropOnPage+1].getRating());
            prodescription2.setText(propertyList[indexFirstPropOnPage+1].getDescription());
        }
        if (maxAmountBoxes >= 3){
            proname3.setText(propertyList[indexFirstPropOnPage+2].getPropertyName());
            prolocation3.setText(propertyList[indexFirstPropOnPage+2].getLocation());
            prorating3.setText(propertyList[indexFirstPropOnPage+2].getRating());
            prodescription3.setText(propertyList[indexFirstPropOnPage+2].getDescription());
        }
        if (maxAmountBoxes == 4){
            proname4.setText(propertyList[indexFirstPropOnPage+3].getPropertyName());
            prolocation4.setText(propertyList[indexFirstPropOnPage+3].getLocation());
            prorating4.setText(propertyList[indexFirstPropOnPage+3].getRating());
            prodescription4.setText(propertyList[indexFirstPropOnPage+3].getDescription());
        }
        
    }
    
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
        fillPropertyBoxes(indexFirstPropOnPage);
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
        fillPropertyBoxes(indexFirstPropOnPage);

        if (indexFirstPropOnPage + 4 > propertyList.length){
            removePropertyBoxes(indexFirstPropOnPage - propertyList.length + 4);
        }
    }//GEN-LAST:event_nextPageActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
       int propertyId =  propertyList[(currentPage-1)*4+1].getPropertyId();
       this.changePanelToSpecific(new viewProperty(this, propertyId));
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
     int propertyId =  propertyList[(currentPage-1)*4+2].getPropertyId();
     this.changePanelToSpecific(new viewProperty(this, propertyId));
    }//GEN-LAST:event_jButton14ActionPerformed

    private void accountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountButtonActionPerformed
        
    }//GEN-LAST:event_accountButtonActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
     int propertyId =  propertyList[(currentPage-1)*4+3].getPropertyId();
     this.changePanelToSpecific(new viewProperty(this, propertyId));
    }//GEN-LAST:event_jButton13ActionPerformed
    
    void changePanelToDefault() {
        jScrollPane1.setViewportView(defaultPanel);
    }
    
    void changePanelToSpecific(javax.swing.JPanel jPanel) {
        jScrollPane1.setViewportView(jPanel);
    }

    void setEmail(String email) {
        this.email = email;
    }

    String getEmail(){
        return email;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accountButton;
    private javax.swing.JPanel defaultPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JTabbedPane jTabbedPane7;
    private javax.swing.JButton nextPage;
    private javax.swing.JLabel pageNumber;
    private javax.swing.JButton previousPage;
    private javax.swing.JTextField prodescription1;
    private javax.swing.JTextField prodescription2;
    private javax.swing.JTextField prodescription3;
    private javax.swing.JTextField prodescription4;
    private javax.swing.JTextField prolocation1;
    private javax.swing.JTextField prolocation2;
    private javax.swing.JTextField prolocation3;
    private javax.swing.JTextField prolocation4;
    private javax.swing.JTextField proname1;
    private javax.swing.JTextField proname2;
    private javax.swing.JTextField proname3;
    private javax.swing.JTextField proname4;
    private javax.swing.JTextField prorating1;
    private javax.swing.JTextField prorating2;
    private javax.swing.JTextField prorating3;
    private javax.swing.JTextField prorating4;
    // End of variables declaration//GEN-END:variables
}
