package com2008.team.project;

public class Booking extends javax.swing.JPanel {

    /**
     * Creates new form Booking
     */
    public Booking() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name = new javax.swing.JLabel();
        emailText = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        titleText = new javax.swing.JLabel();
        titleTextField = new javax.swing.JTextField();
        firstNameText = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();

        name.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        name.setText("awaiting DB fetch");

        emailText.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        emailText.setText("Email");

        emailTextField.setEditable(false);
        emailTextField.setBackground(new java.awt.Color(204, 204, 204));
        emailTextField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        emailTextField.setText("awaiting DB fetch");
        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });

        titleText.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        titleText.setText("Title");

        titleTextField.setEditable(false);
        titleTextField.setBackground(new java.awt.Color(204, 204, 204));
        titleTextField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        titleTextField.setText("awaiting DB fetch");
        titleTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleTextFieldActionPerformed(evt);
            }
        });

        firstNameText.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        firstNameText.setText("First Name");

        firstNameTextField.setEditable(false);
        firstNameTextField.setBackground(new java.awt.Color(204, 204, 204));
        firstNameTextField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        firstNameTextField.setText("awaiting DB fetch");
        firstNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(titleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(titleText, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(262, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(emailText)
                .addGap(29, 29, 29)
                .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(firstNameText)
                .addGap(35, 35, 35)
                .addComponent(titleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(titleText)
                .addGap(31, 31, 31)
                .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 106, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextFieldActionPerformed

    private void titleTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titleTextFieldActionPerformed

    private void firstNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel emailText;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel firstNameText;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JLabel name;
    private javax.swing.JLabel titleText;
    private javax.swing.JTextField titleTextField;
    // End of variables declaration//GEN-END:variables
}
