package com2008.team.project;

public class Main extends javax.swing.JFrame {

    // For testing DB. Normally email should not be initialized.
    private String email = "admin";
    private Boolean hostView = false;
    
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        changePanelToSpecific(new AddProperty(this, "admin"));
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
        gotoLoginButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Property Booking System");
        setIconImage((new javax.swing.ImageIcon(getClass().getResource("/images/Home_Icon_rasterized.png"))).getImage());
        setSize(new java.awt.Dimension(1024, 576));

        jScrollPane1.setBorder(null);
        jScrollPane1.setMinimumSize(new java.awt.Dimension(0, 0));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1024, 576));
        jScrollPane1.setViewportView(defaultPanel);

        defaultPanel.setPreferredSize(new java.awt.Dimension(1024, 576));

        gotoLoginButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        gotoLoginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/User_Icon_Wikipedia_Resized.png"))); // NOI18N
        gotoLoginButton.setText("Log in");
        gotoLoginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gotoLoginButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        gotoLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gotoLoginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout defaultPanelLayout = new javax.swing.GroupLayout(defaultPanel);
        defaultPanel.setLayout(defaultPanelLayout);
        defaultPanelLayout.setHorizontalGroup(
            defaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(defaultPanelLayout.createSequentialGroup()
                .addContainerGap(846, Short.MAX_VALUE)
                .addComponent(gotoLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jSeparator1)
        );
        defaultPanelLayout.setVerticalGroup(
            defaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(defaultPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gotoLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(defaultPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gotoLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gotoLoginButtonActionPerformed
        Login loginPanel = new Login(this);
        jScrollPane1.setViewportView(loginPanel);
    }//GEN-LAST:event_gotoLoginButtonActionPerformed
    
    void changePanelToDefault() {
        jScrollPane1.setViewportView(defaultPanel);
    }
    
    void changePanelToSpecific(javax.swing.JPanel jPanel) {
        jScrollPane1.setViewportView(jPanel);
    }
    
    void createNewUserPanelInstance() {
        User userPanel = new User(this, email, hostView);
        jScrollPane1.setViewportView(userPanel);
    }
    
    void setHostView(Boolean newValue) {
        hostView = newValue;
    }
    
    void setEmail(String email) {
        this.email = email;
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
    private javax.swing.JPanel defaultPanel;
    private javax.swing.JButton gotoLoginButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}