/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com2008.team.project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 *
 * @author 86182
 */
public class Mainsearch extends javax.swing.JPanel {
private Main jFrameInstance;
private String location;
private String people;



    /**
     * Creates new form NewJPanel
     */
    public Mainsearch(Main jFrameInstance, String location,String people) {
        initComponents();
        this.jFrameInstance = jFrameInstance;
        this.locationname.setText(location);
        this.numpeople.setText(people);
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        numpeople = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        locationname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();

        jButton4.setBackground(new java.awt.Color(255, 204, 153));
        jButton4.setText("Search");

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setText("CREATE AN ACCOUNT");

        jButton2.setBackground(new java.awt.Color(255, 204, 204));
        jButton2.setText("Login ");

        jButton5.setBackground(new java.awt.Color(255, 204, 153));
        jButton5.setText("Search");

        numpeople.setText("(type how many people)");

        jButton3.setText("Homepage");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton6.setText("Search");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("select time");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        locationname.setText("jTextField1");

        jLabel1.setText("Display the search information:");
        jLabel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jTextField1.setText("jTextField1");
        jTabbedPane1.addTab("Location ", jTextField1);

        jTextField2.setText("jTextField2");
        jTabbedPane1.addTab("Rating", jTextField2);

        jTextField3.setText("jTextField3");
        jTabbedPane1.addTab("Accomodation name", jTextField3);

        jTextField4.setText("jTextField4");
        jTabbedPane1.addTab("Descrition", jTextField4);

        jLabel2.setText("Recommmended accommodation");

        jButton8.setText("View more information");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(221, 221, 221)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(locationname, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton8)
                                .addGap(238, 238, 238)))
                        .addComponent(numpeople, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numpeople, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                                    .addComponent(locationname))))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8)
                        .addGap(149, 149, 149))))
        );
    }// </editor-fold>//GEN-END:initComponents
int month = java.util.Calendar.getInstance().get(java.util.Calendar.MONTH);
int year = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
JLabel l = new JLabel("", JLabel.CENTER);  
String day = "";
JDialog d;
JButton[] button = new JButton[49];

public Mainsearch(JFrame parent) {  
d = new JDialog();
d.setModal(true);
String[] header = { "Sun", "Mon", "Tue", "Wed", "Thur", "Fri", "Sat" };
JPanel p1 = new JPanel(new GridLayout(7, 7));
p1.setPreferredSize(new Dimension(430, 120));
for (int x = 0; x < button.length; x++) {
    final int selection = x;
    button[x] = new JButton();
    button[x].setFocusPainted(false);
    button[x].setBackground(Color.white);
    if (x > 6)
        button[x].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                day = button[selection].getActionCommand();
                d.dispose();
            }
        });
        if (x < 7) {
            button[x].setText(header[x]);
            button[x].setForeground(Color.red);
        }
        p1.add(button[x]);
}
JPanel p2 = new JPanel(new GridLayout(1, 3));
JButton previous = new JButton("<< Previous");
previous.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent ae) {
        month--;
        displayDate();
    }
});
p2.add(previous);
p2.add(l);
JButton next = new JButton("Next >>");
next.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent ae) {
        month++;
        displayDate();
    }
});
p2.add(next);
d.add(p1, BorderLayout.CENTER);
d.add(p2, BorderLayout.SOUTH);
d.pack();
d.setLocationRelativeTo(parent);
displayDate();
d.setVisible(true);

}

public void displayDate() {
for (int x = 7; x < button.length; x++)
    button[x].setText("");
java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("MMMM yyyy");
java.util.Calendar cal = java.util.Calendar.getInstance();
cal.set(year, month, 1);
int dayOfWeek = cal.get(java.util.Calendar.DAY_OF_WEEK);
int daysInMonth = cal.getActualMaximum(java.util.Calendar.DAY_OF_MONTH);
for (int x = 6 + dayOfWeek, day = 1; day <= daysInMonth; x++, day++)
    button[x].setText("" + day);
l.setText(sdf.format(cal.getTime()));
d.setTitle("Date Picker");

}
public void sum(){
 locationname.setText("");
 numpeople.setText("");
 
 
}
public String setPickedDate() {
if (day.equals(""))
    return day;
java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd-MM-yyyy");
java.util.Calendar cal = java.util.Calendar.getInstance();
cal.set(year, month, Integer.parseInt(day));
return sdf.format(cal.getTime());
}
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
   //select time      
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    displayDate(); 
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        //homepage
     Main main = new Main();
     main.setVisible(true);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1AncestorAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField locationname;
    private javax.swing.JTextField numpeople;
    // End of variables declaration//GEN-END:variables
}
