package com2008.team.project;

import java.util.ArrayList;
import java.sql.*;

public class EditProperty2 extends javax.swing.JPanel {

    private class Chargeband{
        private Date startDate;
        private Date endDate;
        private float pricePerNight;
        private float serviceCharge;
        private float cleaningCharge;
        private Chargeband(){
        }
    }
    
    private Main jFrameInstance;
    private EditProperty editPropertyInstance;
    private ArrayList<Chargeband> chargebands = new ArrayList<>();
    private int propertyId;
    
    private int currentChargebandPage = 1;
    
    /**
     * Creates new form AddProperty
     */
    public EditProperty2(Main jFrameInstance, EditProperty editPropertyInstance, int propertyId) {
        initComponents();
        this.jFrameInstance = jFrameInstance;
        this.editPropertyInstance = editPropertyInstance;
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

        jSeparator1 = new javax.swing.JSeparator();
        returnButton = new javax.swing.JButton();
        panelTitle = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        chargebandText = new javax.swing.JLabel();
        nextChargebandButton = new javax.swing.JButton();
        prevChargebandButton = new javax.swing.JButton();
        newButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        java.text.DateFormat dateFormat = new java.text.SimpleDateFormat("dd/MM/yyyy");
        startDateFormatted = new javax.swing.JFormattedTextField(dateFormat);
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        endDateFormatted = new javax.swing.JFormattedTextField(dateFormat);
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pricePerNightFormatted = new javax.swing.JFormattedTextField();
        serviceChargeFormatted = new javax.swing.JFormattedTextField();
        cleaningChargeFormatted = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        editPropertyButton = new javax.swing.JButton();
        prevButton = new javax.swing.JButton();

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

        panelTitle.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        panelTitle.setText("Edit Property");

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

        newButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        newButton.setText("New Chargeband");
        newButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.setEnabled(false);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        try{
            javax.swing.text.MaskFormatter dateMask = new javax.swing.text.MaskFormatter("##/##/####");
            dateMask.install(startDateFormatted);
        } catch (Exception ex) {}
        startDateFormatted.setText("01/01/2022");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Start date:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("End date:");

        try{
            javax.swing.text.MaskFormatter dateMask = new javax.swing.text.MaskFormatter("##/##/####");
            dateMask.install(endDateFormatted);
        } catch (Exception ex) {}
        endDateFormatted.setText("01/01/2022");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Price per night:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Note! All prices are in GBP.");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Service charge:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Cleaning charge:");

        pricePerNightFormatted.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        pricePerNightFormatted.setText("0.00");
        pricePerNightFormatted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pricePerNightFormattedActionPerformed(evt);
            }
        });

        serviceChargeFormatted.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        serviceChargeFormatted.setText("0.00");

        cleaningChargeFormatted.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        cleaningChargeFormatted.setText("0.00");

        jLabel7.setText("Date format: dd/mm/yyyy");

        jLabel9.setText("Ensure continuous coverage:");

        jLabel10.setText("between 01/01/2022 - 31/12/2022");

        jLabel11.setText("End dates and Start dates of ");

        jLabel12.setText("consecutive chargebands have");

        jLabel13.setText("to differ by exactly 1 day");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(prevChargebandButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(startDateFormatted)
                                            .addComponent(endDateFormatted, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(pricePerNightFormatted)
                                            .addComponent(serviceChargeFormatted)
                                            .addComponent(cleaningChargeFormatted, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel4))
                                .addGap(35, 35, 35)))))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chargebandText)
                    .addComponent(newButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(startDateFormatted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(pricePerNightFormatted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(endDateFormatted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(serviceChargeFormatted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(cleaningChargeFormatted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel10)))
                .addGap(9, 9, 9)
                .addComponent(jLabel11)
                .addGap(0, 0, 0)
                .addComponent(jLabel12)
                .addGap(0, 0, 0)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextChargebandButton)
                    .addComponent(prevChargebandButton)
                    .addComponent(deleteButton))
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
        jLabel8.setText("Edit Chargebands");

        editPropertyButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        editPropertyButton.setText("Save Changes");
        editPropertyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPropertyButtonActionPerformed(evt);
            }
        });

        prevButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        prevButton.setText("Previous");
        prevButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(prevButton, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(editPropertyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editPropertyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prevButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(panelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(245, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(245, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        jFrameInstance.changePanelToDefault();
    }//GEN-LAST:event_returnButtonActionPerformed

    private void prevButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevButtonActionPerformed
        updateCurrentChargebandInArray();
        
        jFrameInstance.changePanelToSpecific(editPropertyInstance);
    }//GEN-LAST:event_prevButtonActionPerformed

    private void editPropertyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editPropertyButtonActionPerformed
        updateCurrentChargebandInArray();
        
        String errorMessage1 = editPropertyInstance.validateData();
        String errorMessage2 = validateData();
        
        if (errorMessage1 != null || errorMessage2 != null){
            javax.swing.ImageIcon icon = new javax.swing.ImageIcon(getClass().getResource("/images/warning_icon_resized.png"));
            String errorMessage = null;
            
            if (errorMessage1 == null){
                errorMessage = errorMessage2;
            } else if (errorMessage2 == null){
                errorMessage = errorMessage1;
            } else {
                errorMessage = errorMessage1 + "\n" + errorMessage2;
            }
            
            javax.swing.JOptionPane.showMessageDialog(null, errorMessage, "Error", javax.swing.JOptionPane.INFORMATION_MESSAGE, icon);
        } else {
            
            if (editPropertyInstance.updateProperty() == 0){
                if (editPropertyInstance.updateBedrooms() == 0){
                    if (editPropertyInstance.updateBathrooms() == 0){
                        if (updateChargebands() == 0){
                            jFrameInstance.changePanelToDefault();
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_editPropertyButtonActionPerformed

    private void prevChargebandButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevChargebandButtonActionPerformed
        if (currentChargebandPage == chargebands.size()){
            nextChargebandButton.setEnabled(true);
        }

        updateCurrentChargebandInArray();
        currentChargebandPage--;
        updateChargebandGUIComponents();
        updateChargebandPageInfo();
        
        if (currentChargebandPage == 1){
            prevChargebandButton.setEnabled(false);
        }
    }//GEN-LAST:event_prevChargebandButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        if (chargebands.size() == 2){
            prevChargebandButton.setEnabled(false);
            nextChargebandButton.setEnabled(false);
            deleteButton.setEnabled(false);
        }
        
        chargebands.remove(currentChargebandPage-1);
        
        if (currentChargebandPage > 1){
            currentChargebandPage--;
        }
        updateChargebandGUIComponents();
        updateChargebandPageInfo();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void nextChargebandButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextChargebandButtonActionPerformed
        if (currentChargebandPage == 1){
            prevChargebandButton.setEnabled(true);
        }
        
        updateCurrentChargebandInArray();
        currentChargebandPage++;
        updateChargebandGUIComponents();
        updateChargebandPageInfo();
        
        if (currentChargebandPage == chargebands.size()){
            nextChargebandButton.setEnabled(false);
        }
    }//GEN-LAST:event_nextChargebandButtonActionPerformed

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        if (currentChargebandPage == 1){
            prevChargebandButton.setEnabled(true);
            deleteButton.setEnabled(true);
        }
        
        updateCurrentChargebandInArray();
        
        if (currentChargebandPage == chargebands.size()){
            chargebands.add(new Chargeband());
        } else {
            chargebands.add(currentChargebandPage, new Chargeband());
        }
        
        currentChargebandPage++;
        resetChargebandGUIComponents();
        updateChargebandPageInfo();
    }//GEN-LAST:event_newButtonActionPerformed

    private void pricePerNightFormattedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pricePerNightFormattedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pricePerNightFormattedActionPerformed

    private void updateCurrentChargebandInArray(){
        try {
            chargebands.get(currentChargebandPage-1).pricePerNight = Float.parseFloat(pricePerNightFormatted.getText());
        } catch (Exception ex){
            chargebands.get(currentChargebandPage-1).pricePerNight = 0;
        }
        try {
            chargebands.get(currentChargebandPage-1).serviceCharge = Float.parseFloat(serviceChargeFormatted.getText());
        } catch (Exception ex){
            chargebands.get(currentChargebandPage-1).serviceCharge = 0;
        }
        try {
            chargebands.get(currentChargebandPage-1).cleaningCharge = Float.parseFloat(cleaningChargeFormatted.getText());
        } catch (Exception ex){
            chargebands.get(currentChargebandPage-1).cleaningCharge = 0;
        }
        try {
            chargebands.get(currentChargebandPage-1).startDate = new Date(new java.text.SimpleDateFormat("dd/MM/yyyy").parse(startDateFormatted.getText()).getTime());
            chargebands.get(currentChargebandPage-1).endDate = new Date(new java.text.SimpleDateFormat("dd/MM/yyyy").parse(endDateFormatted.getText()).getTime());
        } catch (Exception ex){
            ex.printStackTrace();
            
            javax.swing.ImageIcon icon = new javax.swing.ImageIcon(getClass().getResource("/images/warning_icon_resized.png"));
            String errorMessage = "Error during parsing dates.";
            javax.swing.JOptionPane.showMessageDialog(null, errorMessage, "Error", javax.swing.JOptionPane.INFORMATION_MESSAGE, icon);
        }
    }
    
    private void updateChargebandGUIComponents(){
        pricePerNightFormatted.setText(String.format("%.2f", chargebands.get(currentChargebandPage-1).pricePerNight));
        serviceChargeFormatted.setText(String.format("%.2f", chargebands.get(currentChargebandPage-1).serviceCharge));
        cleaningChargeFormatted.setText(String.format("%.2f", chargebands.get(currentChargebandPage-1).cleaningCharge));
        
        java.time.LocalDate startDateLocalDate = chargebands.get(currentChargebandPage-1).startDate.toLocalDate();
        java.time.LocalDate endDateLocalDate = chargebands.get(currentChargebandPage-1).endDate.toLocalDate();
        
        String startDayAndMonthString = (startDateLocalDate.getDayOfMonth() < 10 ? "0" + startDateLocalDate.getDayOfMonth() : startDateLocalDate.getDayOfMonth())
                + "/" + (startDateLocalDate.getMonthValue() < 10 ? "0" + startDateLocalDate.getMonthValue() : startDateLocalDate.getMonthValue());
        
        String endDayAndMonthString = (endDateLocalDate.getDayOfMonth() < 10 ? "0" + endDateLocalDate.getDayOfMonth() : endDateLocalDate.getDayOfMonth())
                + "/" + (endDateLocalDate.getMonthValue() < 10 ? "0" + endDateLocalDate.getMonthValue() : endDateLocalDate.getMonthValue());
        
        startDateFormatted.setText(startDayAndMonthString + "/" + startDateLocalDate.getYear());
        endDateFormatted.setText(endDayAndMonthString + "/" + endDateLocalDate.getYear());
    }
    
    private void resetChargebandGUIComponents(){
        java.text.DateFormat dateFormat = new java.text.SimpleDateFormat("dd/MM/yyyy");
        startDateFormatted.setText("01/01/2022");
        endDateFormatted.setText("01/01/2022");
        
        pricePerNightFormatted.setText("0.00");
        serviceChargeFormatted.setText("0.00");
        cleaningChargeFormatted.setText("0.00");
    }

    private void updateChargebandPageInfo(){
        chargebandText.setText("Chargeband " + currentChargebandPage + "/" + chargebands.size());
    }
    
    // Returns errorMessage or null if everything is ok
    String validateData(){
        String errorMessage = "";
        
        for (Chargeband i : chargebands){
            if (i.pricePerNight < 0 || i.serviceCharge < 0 || i.cleaningCharge < 0){
                errorMessage += "\nPrice/Cost can't be negative.";
                break;
            }
        }
                
        if (!(chargebands.get(0).startDate.getTime() <= new Date(2022 - 1900, 0, 1).getTime()) ||
                !(chargebands.get(chargebands.size() - 1).endDate.getTime() >= new Date(2022 - 1900, 11, 31).getTime())){
            errorMessage += "\nStart and end dates of chargebands don't cover the whole of 01/01/2022 - 31/12/2022";
        }
        
        for (int i = 0; i < chargebands.size(); i++){
            // 24*60*60*1000 = number of miliseconds in a day
            if (chargebands.get(i).startDate.getTime() > chargebands.get(i).endDate.getTime()){
                errorMessage += "\nStart date cannot be later than the End date";
                break;
            }
        }
        
        for (int i = 1; i < chargebands.size(); i++){
            // 24*60*60*1000 = number of miliseconds in a day
            if (chargebands.get(i).startDate.getTime() - chargebands.get(i-1).endDate.getTime() != 24*60*60*1000){
                errorMessage += "\nEnd dates and Start dates of consecutive chargebands have to differ by exactly 1 day\n"
                        + "e.g. End dates and Start dates of consecutive chargebands\ncould be 30/06/2022 and 01/07/2022";
                break;
            }
        }
        
        return errorMessage.length() > 0 ? errorMessage.substring(1) : null;
    }
    
    // Return 1 if error, 0 otherwise
    private int updateChargebands(){
        try (Connection con = DriverManager.getConnection("jdbc:mysql://stusql.dcs.shef.ac.uk/team024", "team024", "c0857903")) {
            PreparedStatement pstmt = con.prepareStatement("DELETE FROM Chargebands WHERE propertyId=?");
            pstmt.setInt(1, propertyId);
            pstmt.executeUpdate();
            
            for (Chargeband i : chargebands){
                pstmt = con.prepareStatement("INSERT INTO Chargebands VALUES(?, ?, ?, ?, ?, ?)");
                pstmt.setInt(1, propertyId);
                pstmt.setDate(2, i.startDate);
                pstmt.setDate(3, i.endDate);
                pstmt.setDouble(4, i.pricePerNight);
                pstmt.setDouble(5, i.serviceCharge);
                pstmt.setDouble(6, i.cleaningCharge);
                
                pstmt.executeUpdate();
            }
            return 0;
        }
        catch (Exception ex) {
            ex.printStackTrace();
            
            javax.swing.ImageIcon icon = new javax.swing.ImageIcon(getClass().getResource("/images/warning_icon_resized.png"));
            String errorMessage = "Connection to database failed. University VPN is required.";
            javax.swing.JOptionPane.showMessageDialog(null, errorMessage, "Error", javax.swing.JOptionPane.INFORMATION_MESSAGE, icon);
        }
        return 1;
    }
    
    private void fetchData(){
        try (Connection con = DriverManager.getConnection("jdbc:mysql://stusql.dcs.shef.ac.uk/team024", "team024", "c0857903")) {
            PreparedStatement pstmt = con.prepareStatement("SELECT startDate, endDate, pricePerNight, serviceCharge, cleaningCharge "
                    + "FROM Chargebands WHERE propertyId=?");
            pstmt.setInt(1, propertyId);
            ResultSet res = pstmt.executeQuery();
            
            while (res.next()){
                Chargeband chargeband = new Chargeband();
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
                deleteButton.setEnabled(true);
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
    private javax.swing.JFormattedTextField cleaningChargeFormatted;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editPropertyButton;
    private javax.swing.JFormattedTextField endDateFormatted;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton newButton;
    private javax.swing.JButton nextChargebandButton;
    private javax.swing.JLabel panelTitle;
    private javax.swing.JButton prevButton;
    private javax.swing.JButton prevChargebandButton;
    private javax.swing.JFormattedTextField pricePerNightFormatted;
    private javax.swing.JButton returnButton;
    private javax.swing.JFormattedTextField serviceChargeFormatted;
    private javax.swing.JFormattedTextField startDateFormatted;
    // End of variables declaration//GEN-END:variables
}
