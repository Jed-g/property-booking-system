/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com2008.team.project;
import java.util.ArrayList;
import java.sql.*;
/**
 *
 * @author Matyas Szert
 */
public class Register extends javax.swing.JPanel {

    private Main jFrameInstance;
    
    /**
     * Creates new form Register
     */
    public Register(Main jFrameInstance) {
        initComponents();
        this.jFrameInstance = jFrameInstance;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        goToLoginButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        rEmailTextField = new javax.swing.JTextField();
        registerButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        titleTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        surnameTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        phoneTextField = new javax.swing.JTextField();
        regPasswordField = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        regConfirmPasswordField = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        houseNoField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        streetNameTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        townTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        postcodeTextField = new javax.swing.JTextField();
        hostRegisterBox = new javax.swing.JCheckBox();

        setPreferredSize(new java.awt.Dimension(1024, 576));

        goToLoginButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        goToLoginButton.setText("Log in");
        goToLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToLoginButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Email");

        rEmailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rEmailTextFieldActionPerformed(evt);
            }
        });

        registerButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Register as a Guest:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Title");

        titleTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleTextFieldActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("First Name");

        firstNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTextFieldActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Surname");

        surnameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                surnameTextFieldActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Phone number");

        phoneTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneTextFieldActionPerformed(evt);
            }
        });

        regPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regPasswordFieldActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Password");

        regConfirmPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regConfirmPasswordFieldActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Confirm password");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("House number");

        houseNoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                houseNoFieldActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Street name");

        streetNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                streetNameTextFieldActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Town/City");

        townTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                townTextFieldActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Post Code");

        postcodeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postcodeTextFieldActionPerformed(evt);
            }
        });

        hostRegisterBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hostRegisterBox.setText("I would also like to register as a host");
        hostRegisterBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hostRegisterBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(goToLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel8))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rEmailTextField)
                        .addComponent(titleTextField)
                        .addComponent(firstNameTextField)
                        .addComponent(surnameTextField)
                        .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(regPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel9))
                    .addComponent(regConfirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel5)))
                .addGap(235, 235, 235)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel10))
                    .addComponent(streetNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(houseNoField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(townTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel11))
                    .addComponent(postcodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel13))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(registerButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel12))
                    .addComponent(hostRegisterBox))
                .addContainerGap(256, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(goToLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(houseNoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(streetNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(townTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(postcodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(hostRegisterBox)
                .addGap(18, 18, 18)
                .addComponent(registerButton)
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addComponent(rEmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(surnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(regPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(regConfirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private boolean validateInput() {
        boolean valid = true;
        String errorMessage = "";
        
        // Remove whitespace
        String postCodeTruncated = postcodeTextField.getText().replaceAll("\\s","");

        String emailRegex = "^[\\w!#$%&�*+/=?`{|}~^-]+(?:\\.[\\w!#$%&�*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        
        String password = new String (regPasswordField.getPassword());
        String confirmPassword = new String (regConfirmPasswordField.getPassword());

        // Regex check for email
        if (!rEmailTextField.getText().matches(emailRegex)) {
            errorMessage += "\nEmail is not valid.";
        }            
        if (rEmailTextField.getText().length() < 1 || rEmailTextField.getText().length() > 50) {
            errorMessage += "\nEmail must be between 1 and 50 characters.";
        }
        if (titleTextField.getText().length() < 1 || titleTextField.getText().length() > 5) {
            errorMessage += "\ntitle must be between 1 and 5 characters";
        }
        if (firstNameTextField.getText().length() < 1 || firstNameTextField.getText().length() > 30) {
            errorMessage += "\nFirst name must be between 1 and 30 charracters.";
        }
        if (surnameTextField.getText().length() < 1 || surnameTextField.getText().length() > 30) {
            errorMessage += "\nSurname must be between 1 and 30 characters.";
        }
        if (phoneTextField.getText().length() < 1 || phoneTextField.getText().length() > 15) {
            errorMessage += "\nPhone number must be between 1 and 15 characters.";
        }
        if (password.length() < 1) {
            errorMessage += "\nPlease enter a password.";
        }
        if (!password.equals(confirmPassword)) {
            errorMessage += "\nPasswords do not match.";
        }
        if (houseNoField.getText().length() < 1 || houseNoField.getText().length() > 5) {
            errorMessage += "\nHouse number must be between 1 and 5 characters.";
        }
        if (streetNameTextField.getText().length() < 1 || streetNameTextField.getText().length() > 45) {
            errorMessage += "\nStreet name must be between 1 and 45 characters.";
        }
        if (townTextField.getText().length() < 1 || townTextField.getText().length() > 45) {
            errorMessage += "\nTown / City must be between 1 and 45 characters.";
        }
        if (postCodeTruncated.length() < 1 || postCodeTruncated.length() > 8) {
            errorMessage += "\nPostcode must be between 1 and 8 characters.";
        }

        if (errorMessage.length() > 0){
            valid = false;
            // Remove '\n' at the beginning
            errorMessage = errorMessage.substring(1);

            javax.swing.ImageIcon icon = new javax.swing.ImageIcon(getClass().getResource("/images/warning_icon_resized.png"));
            javax.swing.JOptionPane.showMessageDialog(null, errorMessage, "Error", javax.swing.JOptionPane.INFORMATION_MESSAGE, icon);
        }
        return valid;
    }
    
    private void detailsToDB(ArrayList<String> details, boolean isHost) {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://stusql.dcs.shef.ac.uk/team024", "team024", "c0857903")) {
            
            PreparedStatement checkEmailPstmt = con.prepareStatement("SELECT * from Users WHERE email=?");
            String email = details.get(0);
            String password = details.get(1);
            
            checkEmailPstmt.setString(1, email);
            ResultSet res = checkEmailPstmt.executeQuery();
            
            if (!res.next()) {
                PreparedStatement pstmt = con.prepareStatement("INSERT INTO Users VALUES(?, ?, ?, ?, ?, ? , ?, ?, ?, ?, ?)");
                pstmt.setString(1, email);
                pstmt.setString(2, Main.hashString(password));
                for (int i=2;i<10;i++){
                    pstmt.setString(i+1, details.get(i));
                }
                pstmt.setBoolean(11, isHost);

                pstmt.executeUpdate();
            }
            else {
                javax.swing.ImageIcon icon = new javax.swing.ImageIcon(getClass().getResource("/images/warning_icon_resized.png"));
                String errorMessage = "That email has already been used.";
                javax.swing.JOptionPane.showMessageDialog(null, errorMessage, "Error", javax.swing.JOptionPane.INFORMATION_MESSAGE, icon);
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
            
            javax.swing.ImageIcon icon = new javax.swing.ImageIcon(getClass().getResource("/images/warning_icon_resized.png"));
            String errorMessage = "Connection to database failed. University VPN is required.";
            javax.swing.JOptionPane.showMessageDialog(null, errorMessage, "Error", javax.swing.JOptionPane.INFORMATION_MESSAGE, icon);
        }
    }
    private void goToLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToLoginButtonActionPerformed
        Login loginPage = new Login(jFrameInstance);
        jFrameInstance.changePanelToSpecific(loginPage);
    }//GEN-LAST:event_goToLoginButtonActionPerformed

    private void rEmailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rEmailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rEmailTextFieldActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        
        if (validateInput()) {
            String password = new String (regPasswordField.getPassword());    
            boolean isHost = hostRegisterBox.isSelected();

            ArrayList<String> details = new ArrayList<String>();
            details.add(rEmailTextField.getText());
            details.add(password);
            details.add(titleTextField.getText());
            details.add(firstNameTextField.getText());
            details.add(surnameTextField.getText());
            details.add(phoneTextField.getText());
            details.add(houseNoField.getText());
            details.add(streetNameTextField.getText());
            details.add(townTextField.getText());
            details.add(postcodeTextField.getText());
            
            detailsToDB(details, isHost);
            
            Login loginPage = new Login(jFrameInstance);
            jFrameInstance.changePanelToSpecific(loginPage);
        }
    }//GEN-LAST:event_registerButtonActionPerformed

    private void titleTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titleTextFieldActionPerformed

    private void firstNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameTextFieldActionPerformed

    private void surnameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_surnameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_surnameTextFieldActionPerformed

    private void phoneTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneTextFieldActionPerformed

    private void regPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regPasswordFieldActionPerformed

    private void regConfirmPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regConfirmPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regConfirmPasswordFieldActionPerformed

    private void houseNoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_houseNoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_houseNoFieldActionPerformed

    private void streetNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_streetNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_streetNameTextFieldActionPerformed

    private void townTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_townTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_townTextFieldActionPerformed

    private void postcodeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postcodeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_postcodeTextFieldActionPerformed

    private void hostRegisterBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hostRegisterBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hostRegisterBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JButton goToLoginButton;
    private javax.swing.JCheckBox hostRegisterBox;
    private javax.swing.JTextField houseNoField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JTextField postcodeTextField;
    private javax.swing.JTextField rEmailTextField;
    private javax.swing.JPasswordField regConfirmPasswordField;
    private javax.swing.JPasswordField regPasswordField;
    private javax.swing.JButton registerButton;
    private javax.swing.JTextField streetNameTextField;
    private javax.swing.JTextField surnameTextField;
    private javax.swing.JTextField titleTextField;
    private javax.swing.JTextField townTextField;
    // End of variables declaration//GEN-END:variables
}
