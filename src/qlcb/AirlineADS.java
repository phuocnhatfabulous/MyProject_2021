/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlcb;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Vector;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Connection;
import java.text.MessageFormat;
import java.util.regex.PatternSyntaxException;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author phuocnhat
 */
public class AirlineADS extends javax.swing.JFrame {

    /**
     * Creates new form AirlineADS
     */
    public AirlineADS() {
        initComponents();
    }
class jPanelGradient1 extends JPanel{
        protected void paintComponent(Graphics g){
            Graphics2D g2d = (Graphics2D) g;
            int width = getWidth();
            int height = getHeight();
          
            Color color1 = new Color(103, 230, 215);
            Color color2 = new Color(255,255,255);
            GradientPaint gp = new GradientPaint(0, 0, color1, 45, height, color2);
            g2d.setPaint(gp);
            g2d.fillRect(0, 0, width, height);
        }
    }
class jPanelGradient extends JPanel{
        protected void paintComponent(Graphics g){
            Graphics2D g2d = (Graphics2D) g;
            int width = getWidth();
            int height = getHeight();
          
            Color color1 = new Color(41, 241, 195);
            Color color2 = new Color(27, 163, 156);
            GradientPaint gp = new GradientPaint(0, 0, color1, 45, height, color2);
            g2d.setPaint(gp);
            g2d.fillRect(0, 0, width, height);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new jPanelGradient();
        BtnAir = new javax.swing.JButton();
        BtnBill = new javax.swing.JButton();
        BtnLogOut = new javax.swing.JButton();
        BtnCustomer1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(210, 400));

        BtnAir.setBackground(new java.awt.Color(255, 255, 255));
        BtnAir.setFont(new java.awt.Font("Luminari", 2, 18)); // NOI18N
        BtnAir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/airline.jpg"))); // NOI18N
        BtnAir.setText("Airline");
        BtnAir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnAir.setSize(new java.awt.Dimension(105, 29));
        BtnAir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnAirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnAirMouseExited(evt);
            }
        });
        BtnAir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAirActionPerformed(evt);
            }
        });

        BtnBill.setBackground(new java.awt.Color(255, 255, 255));
        BtnBill.setFont(new java.awt.Font("Luminari", 0, 18)); // NOI18N
        BtnBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bill.jpg"))); // NOI18N
        BtnBill.setText("Revenue");
        BtnBill.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnBill.setPreferredSize(new java.awt.Dimension(105, 29));
        BtnBill.setSize(new java.awt.Dimension(105, 29));
        BtnBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnBillMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnBillMouseExited(evt);
            }
        });
        BtnBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBillActionPerformed(evt);
            }
        });

        BtnLogOut.setBackground(new java.awt.Color(255, 255, 255));
        BtnLogOut.setFont(new java.awt.Font("Luminari", 0, 18)); // NOI18N
        BtnLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logout.jpg"))); // NOI18N
        BtnLogOut.setText("Log out");
        BtnLogOut.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnLogOut.setPreferredSize(new java.awt.Dimension(105, 29));
        BtnLogOut.setSize(new java.awt.Dimension(105, 29));
        BtnLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnLogOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnLogOutMouseExited(evt);
            }
        });
        BtnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLogOutActionPerformed(evt);
            }
        });

        BtnCustomer1.setBackground(new java.awt.Color(255, 255, 255));
        BtnCustomer1.setFont(new java.awt.Font("Luminari", 0, 18)); // NOI18N
        BtnCustomer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Ctm.jpg"))); // NOI18N
        BtnCustomer1.setText("Customer");
        BtnCustomer1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnCustomer1.setSize(new java.awt.Dimension(105, 29));
        BtnCustomer1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnCustomer1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnCustomer1MouseExited(evt);
            }
        });
        BtnCustomer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCustomer1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/1airplane-11-128.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(BtnBill, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnCustomer1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                .addComponent(BtnAir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(BtnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnAir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnCustomer1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnBill, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/HN2.jpg"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel3.setText("TP.HCM - HA NOI");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/BT2.jpg"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel5.setText("HA NOI - BEN TRE");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/BTHua2.jpg"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel7.setText("CAN THO - BINH THUAN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel3))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(59, 59, 59))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(311, 311, 311)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel5)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAirMouseEntered
        // TODO add your handling code here:
        BtnAir.setBackground(new Color(148,239,236));
    }//GEN-LAST:event_BtnAirMouseEntered

    private void BtnAirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAirMouseExited
        // TODO add your handling code here:
        BtnAir.setBackground(new Color(238,238,238));
    }//GEN-LAST:event_BtnAirMouseExited

    private void BtnAirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAirActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_BtnAirActionPerformed

    private void BtnBillMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnBillMouseEntered
        // TODO add your handling code here:
        BtnBill.setBackground(new Color(148,239,236));
    }//GEN-LAST:event_BtnBillMouseEntered

    private void BtnBillMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnBillMouseExited
        // TODO add your handling code here:
        BtnBill.setBackground(new Color(238,238,238));
    }//GEN-LAST:event_BtnBillMouseExited

    private void BtnBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBillActionPerformed
        // TODO add your handling code here:
        Revenue menu = new Revenue();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnBillActionPerformed

    private void BtnLogOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnLogOutMouseEntered
        // TODO add your handling code here:
        BtnLogOut.setBackground(new Color(148,239,236));
    }//GEN-LAST:event_BtnLogOutMouseEntered

    private void BtnLogOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnLogOutMouseExited
        // TODO add your handling code here:
        BtnLogOut.setBackground(new Color(238,238,238));
    }//GEN-LAST:event_BtnLogOutMouseExited

    private void BtnCustomer1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCustomer1MouseEntered
        // TODO add your handling code here:
        BtnCustomer1.setBackground(new Color(148,239,236));
    }//GEN-LAST:event_BtnCustomer1MouseEntered

    private void BtnCustomer1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCustomer1MouseExited
        // TODO add your handling code here:
        BtnCustomer1.setBackground(new Color(238,238,238));
    }//GEN-LAST:event_BtnCustomer1MouseExited

    private void BtnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLogOutActionPerformed
        // TODO add your handling code here:
        Login menu = new Login();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnLogOutActionPerformed

    private void BtnCustomer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCustomer1ActionPerformed
        // TODO add your handling code here
        Customer1 menu = new Customer1();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnCustomer1ActionPerformed

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
            java.util.logging.Logger.getLogger(AirlineADS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AirlineADS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AirlineADS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AirlineADS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AirlineADS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAir;
    private javax.swing.JButton BtnBill;
    private javax.swing.JButton BtnCustomer1;
    private javax.swing.JButton BtnLogOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
