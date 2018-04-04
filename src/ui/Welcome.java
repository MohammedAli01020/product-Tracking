package ui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mohamed
 */
public class Welcome extends javax.swing.JFrame {

    /**
     * Creates new form Welcome
     */
    public Welcome() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        statPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLStat = new javax.swing.JLabel();
        CashCustomerPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLCash = new javax.swing.JLabel();
        instCustomerPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLInst = new javax.swing.JLabel();
        productsPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLProducts = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("الصفحة الرئيسية");
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(39, 34, 90));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("نظام ادارة المخازن والعملاء");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(417, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap(453, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel11)
                .addContainerGap(149, Short.MAX_VALUE))
        );

        statPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                statPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                statPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                statPanelMouseExited(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_stat.png"))); // NOI18N

        jLStat.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLStat.setForeground(new java.awt.Color(39, 34, 90));
        jLStat.setText("اخر الاحصائيات");

        javax.swing.GroupLayout statPanelLayout = new javax.swing.GroupLayout(statPanel);
        statPanel.setLayout(statPanelLayout);
        statPanelLayout.setHorizontalGroup(
            statPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, statPanelLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(46, 46, 46))
            .addGroup(statPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLStat)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        statPanelLayout.setVerticalGroup(
            statPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLStat)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CashCustomerPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CashCustomerPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CashCustomerPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CashCustomerPanelMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                CashCustomerPanelMouseReleased(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_cash_customer.png"))); // NOI18N

        jLCash.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLCash.setForeground(new java.awt.Color(39, 34, 90));
        jLCash.setText("عملاء الكاش");

        javax.swing.GroupLayout CashCustomerPanelLayout = new javax.swing.GroupLayout(CashCustomerPanel);
        CashCustomerPanel.setLayout(CashCustomerPanelLayout);
        CashCustomerPanelLayout.setHorizontalGroup(
            CashCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CashCustomerPanelLayout.createSequentialGroup()
                .addGroup(CashCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CashCustomerPanelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLCash))
                    .addGroup(CashCustomerPanelLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CashCustomerPanelLayout.setVerticalGroup(
            CashCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CashCustomerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLCash)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        instCustomerPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                instCustomerPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                instCustomerPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                instCustomerPanelMouseExited(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_cash_customer.png"))); // NOI18N

        jLInst.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLInst.setForeground(new java.awt.Color(39, 34, 90));
        jLInst.setText("عملاء القسط");

        javax.swing.GroupLayout instCustomerPanelLayout = new javax.swing.GroupLayout(instCustomerPanel);
        instCustomerPanel.setLayout(instCustomerPanelLayout);
        instCustomerPanelLayout.setHorizontalGroup(
            instCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(instCustomerPanelLayout.createSequentialGroup()
                .addGroup(instCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(instCustomerPanelLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel5))
                    .addGroup(instCustomerPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLInst)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        instCustomerPanelLayout.setVerticalGroup(
            instCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(instCustomerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLInst)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        productsPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productsPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                productsPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                productsPanelMouseExited(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_products.png"))); // NOI18N

        jLProducts.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLProducts.setForeground(new java.awt.Color(39, 34, 90));
        jLProducts.setText("المنتجات");

        javax.swing.GroupLayout productsPanelLayout = new javax.swing.GroupLayout(productsPanel);
        productsPanel.setLayout(productsPanelLayout);
        productsPanelLayout.setHorizontalGroup(
            productsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(productsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLProducts)
                    .addComponent(jLabel9))
                .addGap(40, 40, 40))
        );
        productsPanelLayout.setVerticalGroup(
            productsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLProducts)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(500, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CashCustomerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(instCustomerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(productsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(statPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(500, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CashCustomerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(productsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(instCustomerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(statPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void statPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statPanelMouseClicked
        // TODO add your handling code here:

        this.setVisible(false);
        this.dispose();

        DashBoard frame = new DashBoard();
        frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);

    }//GEN-LAST:event_statPanelMouseClicked

    private void CashCustomerPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CashCustomerPanelMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        CashCusomers frame = new CashCusomers();

        //frame.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
    }//GEN-LAST:event_CashCustomerPanelMouseClicked

    private void instCustomerPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_instCustomerPanelMouseClicked
        // TODO add your handling code here:

        this.setVisible(false);
        this.dispose();

        InstallmentCusomers frame = new InstallmentCusomers();
        frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
    }//GEN-LAST:event_instCustomerPanelMouseClicked

    private void productsPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productsPanelMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();

        Products frame = new Products();
        frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
    }//GEN-LAST:event_productsPanelMouseClicked

    private void CashCustomerPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CashCustomerPanelMouseEntered
        // TODO add your handling code here:
        setColor(CashCustomerPanel);
        jLCash.setForeground(Color.WHITE);
    }//GEN-LAST:event_CashCustomerPanelMouseEntered

    private void CashCustomerPanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CashCustomerPanelMouseReleased
        // TODO add your handling code here:


    }//GEN-LAST:event_CashCustomerPanelMouseReleased

    private void CashCustomerPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CashCustomerPanelMouseExited
        // TODO add your handling code here:
        resetColer(CashCustomerPanel);
        jLCash.setForeground(new Color(39, 34, 90));
    }//GEN-LAST:event_CashCustomerPanelMouseExited

    private void productsPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productsPanelMouseEntered
        // TODO add your handling code here:
        setColor(productsPanel);
        jLProducts.setForeground(Color.WHITE);

    }//GEN-LAST:event_productsPanelMouseEntered

    private void productsPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productsPanelMouseExited
        // TODO add your handling code here:
        resetColer(productsPanel);
        jLProducts.setForeground(new Color(39, 34, 90));

    }//GEN-LAST:event_productsPanelMouseExited

    private void statPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statPanelMouseEntered
        // TODO add your handling code here:
        setColor(statPanel);
        jLStat.setForeground(Color.WHITE);

    }//GEN-LAST:event_statPanelMouseEntered

    private void statPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statPanelMouseExited
        // TODO add your handling code here
        resetColer(statPanel);
        jLStat.setForeground(new Color(39, 34, 90));

    }//GEN-LAST:event_statPanelMouseExited

    private void instCustomerPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_instCustomerPanelMouseEntered
        // TODO add your handling code here:
        setColor(instCustomerPanel);
        jLInst.setForeground(Color.WHITE);

    }//GEN-LAST:event_instCustomerPanelMouseEntered

    private void instCustomerPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_instCustomerPanelMouseExited
        // TODO add your handling code here:
        resetColer(instCustomerPanel);
        jLInst.setForeground(new Color(39, 34, 90));

    }//GEN-LAST:event_instCustomerPanelMouseExited

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
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CashCustomerPanel;
    private javax.swing.JPanel instCustomerPanel;
    private javax.swing.JLabel jLCash;
    private javax.swing.JLabel jLInst;
    private javax.swing.JLabel jLProducts;
    private javax.swing.JLabel jLStat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel productsPanel;
    private javax.swing.JPanel statPanel;
    // End of variables declaration//GEN-END:variables

    private void setColor(JPanel panel) {
        // panel.setBackground(new Color(115, 163, 239));

        panel.setBackground(new Color(39, 34, 90));

    }

    private void resetColer(JPanel panel) {
        panel.setBackground(new Color(240, 240, 240));
    }
}
