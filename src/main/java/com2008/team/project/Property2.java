/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com2008.team.project;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author serio
 */
public class Property2 extends javax.swing.JPanel {
        private class Chargeband{
        private Date startDate;
        private Date endDate;
        private float pricePerNight;
        private float serviceCharge;
        private float cleaningCharge;
        private Chargeband(){
        }
    }
    
    Main jFrameInstance;
    Property propertyInstance;
    int propertyId;
    
    private ArrayList<Property2.Chargeband> chargebands = new ArrayList<>();
    private int currentChargebandPage = 1;
    /**
     * Creates new form Property2
     */
    public Property2(Main jFrameInstance, Property propertyInstance, int propertyId) {
        initComponents();
        this.jFrameInstance = jFrameInstance;
        this.propertyInstance = propertyInstance;
        this.propertyId = propertyId;
        
        DriverManager.setLoginTimeout(3);
        
        fetchData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        returnButton = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        chargebandText = new javax.swing.JLabel();
        nextChargebandButton = new javax.swing.JButton();
        prevChargebandButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pricePerNightLabel = new javax.swing.JLabel();
        serviceChargeLabel = new javax.swing.JLabel();
        cleaningChargeLabel = new javax.swing.JLabel();
        startDateLabel = new javax.swing.JLabel();
        endDateLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        prevButton = new javax.swing.JButton();
        editPropertyButton = new javax.swing.JButton();

        returnButton.setBackground(new java.awt.Color(194, 123, 160));
        returnButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        returnButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back_arrow_resized.png"))); // NOI18N
        returnButton.setText("Return");
        returnButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        returnButton.setIconTextGap(8);
        returnButton.setMaximumSize(new java.awt.Dimension(168, 54));
        returnButton.setMinimumSize(new java.awt.Dimension(168, 54));
        returnButton.setPreferredSize(new java.awt.Dimension(168, 54));
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        jPanel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 3, true));

        chargebandText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chargebandText.setText("Chargeband 1/1");

        nextChargebandButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nextChargebandButton.setText(">");
        nextChargebandButton.setEnabled(false);
        nextChargebandButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextChargebandButtonActionPerformed(evt);
            }
        });

        prevChargebandButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        prevChargebandButton.setText("<");
        prevChargebandButton.setEnabled(false);
        prevChargebandButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevChargebandButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Start date:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("End date:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Price per night:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Note! All prices are in GBP.");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Service charge:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Cleaning charge:");

        jLabel7.setText("Date format: dd/mm/yyyy");

        pricePerNightLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pricePerNightLabel.setText("0.00");

        serviceChargeLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        serviceChargeLabel.setText("0.00");

        cleaningChargeLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cleaningChargeLabel.setText("0.00");

        startDateLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        startDateLabel.setText("jLabel14");

        endDateLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        endDateLabel.setText("jLabel14");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(prevChargebandButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nextChargebandButton))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(chargebandText, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(startDateLabel)
                                            .addComponent(endDateLabel)))
                                    .addComponent(jLabel7))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pricePerNightLabel)
                                    .addComponent(serviceChargeLabel)
                                    .addComponent(cleaningChargeLabel)))
                            .addComponent(jLabel4))
                        .addGap(55, 55, 55)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chargebandText)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(pricePerNightLabel)
                    .addComponent(startDateLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(serviceChargeLabel)
                    .addComponent(endDateLabel))
                .addGap(8, 8, 8)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(cleaningChargeLabel))
                    .addComponent(jLabel7))
                .addGap(6, 6, 6)
                .addComponent(jLabel4)
                .addGap(69, 69, 69)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextChargebandButton)
                    .addComponent(prevChargebandButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Chargebands");

        prevButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        prevButton.setText("Previous");
        prevButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(prevButton, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(805, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(prevButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        editPropertyButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        editPropertyButton.setText("Edit Property");
        editPropertyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPropertyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(editPropertyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(245, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(245, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(editPropertyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 983, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 505, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updateChargebandGUIComponents(){
        pricePerNightLabel.setText(String.format("%.2f", chargebands.get(currentChargebandPage-1).pricePerNight));
        serviceChargeLabel.setText(String.format("%.2f", chargebands.get(currentChargebandPage-1).serviceCharge));
        cleaningChargeLabel.setText(String.format("%.2f", chargebands.get(currentChargebandPage-1).cleaningCharge));
        
        java.time.LocalDate startDateLocalDate = chargebands.get(currentChargebandPage-1).startDate.toLocalDate();
        java.time.LocalDate endDateLocalDate = chargebands.get(currentChargebandPage-1).endDate.toLocalDate();
        
        String startDayAndMonthString = (startDateLocalDate.getDayOfMonth() < 10 ? "0" + startDateLocalDate.getDayOfMonth() : startDateLocalDate.getDayOfMonth())
                + "/" + (startDateLocalDate.getMonthValue() < 10 ? "0" + startDateLocalDate.getMonthValue() : startDateLocalDate.getMonthValue());
        
        String endDayAndMonthString = (endDateLocalDate.getDayOfMonth() < 10 ? "0" + endDateLocalDate.getDayOfMonth() : endDateLocalDate.getDayOfMonth())
                + "/" + (endDateLocalDate.getMonthValue() < 10 ? "0" + endDateLocalDate.getMonthValue() : endDateLocalDate.getMonthValue());
        
        startDateLabel.setText(startDayAndMonthString + "/" + startDateLocalDate.getYear());
        endDateLabel.setText(endDayAndMonthString + "/" + endDateLocalDate.getYear());
    }
    
    private void updateChargebandPageInfo(){
        chargebandText.setText("Chargeband " + currentChargebandPage + "/" + chargebands.size());
    }
    
    
    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        jFrameInstance.changePanelToDefault();
    }//GEN-LAST:event_returnButtonActionPerformed

    private void nextChargebandButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextChargebandButtonActionPerformed
        if (currentChargebandPage == 1){
            prevChargebandButton.setEnabled(true);
        }

        currentChargebandPage++;
        updateChargebandGUIComponents();
        updateChargebandPageInfo();

        if (currentChargebandPage == chargebands.size()){
            nextChargebandButton.setEnabled(false);
        }
    }//GEN-LAST:event_nextChargebandButtonActionPerformed

    private void prevChargebandButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevChargebandButtonActionPerformed
        if (currentChargebandPage == chargebands.size()){
            nextChargebandButton.setEnabled(true);
        }

        currentChargebandPage--;
        updateChargebandGUIComponents();
        updateChargebandPageInfo();

        if (currentChargebandPage == 1){
            prevChargebandButton.setEnabled(false);
        }
    }//GEN-LAST:event_prevChargebandButtonActionPerformed

    private void prevButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevButtonActionPerformed
        jFrameInstance.changePanelToSpecific(propertyInstance);
    }//GEN-LAST:event_prevButtonActionPerformed

    private void editPropertyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editPropertyButtonActionPerformed
        //Host will never be able to access this panel        
        //EditProperty editProperty = new EditProperty(jFrameInstance, propertyInstance, propertyId);
        //jFrameInstance.changePanelToSpecific(editProperty);
    }//GEN-LAST:event_editPropertyButtonActionPerformed

    private void fetchData(){
        try (Connection con = DriverManager.getConnection("jdbc:mysql://stusql.dcs.shef.ac.uk/team024", "team024", "c0857903")) {
            PreparedStatement pstmt = con.prepareStatement("SELECT startDate, endDate, pricePerNight, serviceCharge, cleaningCharge "
                    + "FROM Chargebands WHERE propertyId=?");
            pstmt.setInt(1, propertyId);
            ResultSet res = pstmt.executeQuery();
            
            while (res.next()){
                Property2.Chargeband chargeband = new Property2.Chargeband();
                chargeband.pricePerNight = res.getFloat("pricePerNight");
                chargeband.cleaningCharge = res.getFloat("cleaningCharge");
                chargeband.serviceCharge = res.getFloat("serviceCharge");
                chargeband.startDate = res.getDate("startDate");
                chargeband.endDate = res.getDate("endDate");
                chargebands.add(chargeband);
            }
            
            updateChargebandPageInfo();
            updateChargebandGUIComponents();
            
            if (chargebands.size() > 1){
                nextChargebandButton.setEnabled(true);
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
            
            javax.swing.ImageIcon icon = new javax.swing.ImageIcon(getClass().getResource("/images/warning_icon_resized.png"));
            String errorMessage = "Connection to database failed. University VPN is required.";
            javax.swing.JOptionPane.showMessageDialog(null, errorMessage, "Error", javax.swing.JOptionPane.INFORMATION_MESSAGE, icon);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel chargebandText;
    private javax.swing.JLabel cleaningChargeLabel;
    private javax.swing.JButton editPropertyButton;
    private javax.swing.JLabel endDateLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton nextChargebandButton;
    private javax.swing.JButton prevButton;
    private javax.swing.JButton prevChargebandButton;
    private javax.swing.JLabel pricePerNightLabel;
    private javax.swing.JButton returnButton;
    private javax.swing.JLabel serviceChargeLabel;
    private javax.swing.JLabel startDateLabel;
    // End of variables declaration//GEN-END:variables
}
