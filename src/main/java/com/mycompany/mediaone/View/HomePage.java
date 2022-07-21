package com.mycompany.mediaone.View;

import com.mycompany.mediaone.View.Bill.BillBuyDetail;
import com.mycompany.mediaone.View.Bill.BillInterface;
import com.mycompany.mediaone.View.Bill.BillSoldDetail;
import com.mycompany.mediaone.View.Product.AddProduct;
import com.mycompany.mediaone.View.Product.ProductInterface;
import com.mycompany.mediaone.View.Product.ProductDetail;
import com.mycompany.mediaone.View.Profit.ProfitInterface;
import java.awt.Color;
import javax.swing.JPanel;

public class HomePage extends javax.swing.JFrame {

    public com.mycompany.mediaone.View.HomeInterface homeInterface = new HomeInterface();
    public com.mycompany.mediaone.View.Product.ProductInterface productInterface = new ProductInterface(this);
    public com.mycompany.mediaone.View.Product.AddProduct addProduct = new AddProduct(this);
    public com.mycompany.mediaone.View.Product.ProductDetail productDetail = new ProductDetail(this);
    public com.mycompany.mediaone.View.Bill.BillInterface billInterface = new BillInterface(this);
    public com.mycompany.mediaone.View.Bill.BillBuyDetail addBillBuy = new BillBuyDetail(this, "add");
    public com.mycompany.mediaone.View.Bill.BillSoldDetail addBillSold = new BillSoldDetail(this, "add");
    public com.mycompany.mediaone.View.Bill.BillBuyDetail editBillBuy = new BillBuyDetail(this, "edit");
    public com.mycompany.mediaone.View.Profit.ProfitInterface profitInterface = new ProfitInterface(this);
    public com.mycompany.mediaone.View.Bill.BillSoldDetail editBillSold = new BillSoldDetail(this, "edit");
    public HomePage() {
        initComponents();

        this.contentPanel.add(homeInterface);
        this.contentPanel.add(productInterface);
        this.contentPanel.add(addProduct);
        this.contentPanel.add(productDetail);
        this.contentPanel.add(profitInterface);
        this.contentPanel.add(billInterface);
        this.contentPanel.add(addBillBuy);
        this.contentPanel.add(addBillSold);
        this.contentPanel.add(editBillBuy);
        this.contentPanel.add(editBillSold);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        homePanel = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        homeChoosePanel = new javax.swing.JPanel();
        homeIcon = new javax.swing.JLabel();
        homeLabel = new javax.swing.JLabel();
        productChoosePanel = new javax.swing.JPanel();
        productIcon = new javax.swing.JLabel();
        productLabel = new javax.swing.JLabel();
        billChoosePanel = new javax.swing.JPanel();
        billIcon = new javax.swing.JLabel();
        billLabel = new javax.swing.JLabel();
        profitChoosePanel = new javax.swing.JPanel();
        profitIcon = new javax.swing.JLabel();
        profitLabel = new javax.swing.JLabel();
        javax.swing.JLabel logoIcon = new javax.swing.JLabel();
        contentPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        homePanel.setBackground(new java.awt.Color(240, 240, 240));
        homePanel.setPreferredSize(new java.awt.Dimension(195, 471));
        homePanel.setLayout(new javax.swing.BoxLayout(homePanel, javax.swing.BoxLayout.LINE_AXIS));

        menuPanel.setBackground(new java.awt.Color(0, 128, 128));
        menuPanel.setPreferredSize(new java.awt.Dimension(280, 589));

        homeChoosePanel.setBackground(new java.awt.Color(0, 153, 153));
        homeChoosePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeChoosePanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeChoosePanelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                homeChoosePanelMousePressed(evt);
            }
        });
        homeChoosePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        homeIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\MY LAPTOP\\OneDrive\\Documents\\NetBeansProjects\\MediaOne\\lib\\unknown\\binary\\image\\home_1.png")); // NOI18N
        homeChoosePanel.add(homeIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 40, 50));

        homeLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        homeLabel.setForeground(new java.awt.Color(255, 255, 255));
        homeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeLabel.setText("HOME");
        homeLabel.setToolTipText("");
        homeLabel.setFocusTraversalPolicyProvider(true);
        homeLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        homeChoosePanel.add(homeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 60, 30));

        productChoosePanel.setBackground(new java.awt.Color(0, 153, 153));
        productChoosePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                productChoosePanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                productChoosePanelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                productChoosePanelMousePressed(evt);
            }
        });
        productChoosePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        productIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\MY LAPTOP\\OneDrive\\Documents\\NetBeansProjects\\MediaOne\\lib\\unknown\\binary\\image\\packaging.png")); // NOI18N
        productChoosePanel.add(productIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 40, 50));

        productLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        productLabel.setForeground(new java.awt.Color(255, 255, 255));
        productLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productLabel.setText("PRODUCT");
        productLabel.setToolTipText("");
        productLabel.setFocusTraversalPolicyProvider(true);
        productLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        productChoosePanel.add(productLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 80, 30));

        billChoosePanel.setBackground(new java.awt.Color(0, 153, 153));
        billChoosePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                billChoosePanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                billChoosePanelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                billChoosePanelMousePressed(evt);
            }
        });
        billChoosePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        billIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\MY LAPTOP\\OneDrive\\Documents\\NetBeansProjects\\MediaOne\\lib\\unknown\\binary\\image\\order.png")); // NOI18N
        billChoosePanel.add(billIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 40, 50));

        billLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        billLabel.setForeground(new java.awt.Color(255, 255, 255));
        billLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        billLabel.setText("BILL");
        billLabel.setToolTipText("");
        billLabel.setFocusTraversalPolicyProvider(true);
        billLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        billChoosePanel.add(billLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 80, 30));

        profitChoosePanel.setBackground(new java.awt.Color(0, 153, 153));
        profitChoosePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profitChoosePanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                profitChoosePanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                profitChoosePanelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                profitChoosePanelMousePressed(evt);
            }
        });
        profitChoosePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        profitIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\MY LAPTOP\\OneDrive\\Documents\\NetBeansProjects\\MediaOne\\lib\\unknown\\binary\\image\\financial-profit.png")); // NOI18N
        profitChoosePanel.add(profitIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 40, 50));

        profitLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        profitLabel.setForeground(new java.awt.Color(255, 255, 255));
        profitLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profitLabel.setText("PROFIT");
        profitLabel.setToolTipText("");
        profitLabel.setFocusTraversalPolicyProvider(true);
        profitLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        profitChoosePanel.add(profitLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 80, 30));

        logoIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\MY LAPTOP\\OneDrive\\Documents\\NetBeansProjects\\MediaOne\\lib\\unknown\\binary\\image\\bookstore.png")); // NOI18N

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productChoosePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(billChoosePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(profitChoosePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(homeChoosePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logoIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(logoIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(homeChoosePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(productChoosePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(billChoosePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(profitChoosePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        homePanel.add(menuPanel);

        contentPanel.setBackground(new java.awt.Color(49, 79, 79));
        contentPanel.setLayout(new java.awt.CardLayout());
        homePanel.add(contentPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 998, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeChoosePanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeChoosePanelMousePressed
        homeChoosePanel.setBackground(new Color(60, 179, 113));
        menuClicked(this.homeInterface);
    }//GEN-LAST:event_homeChoosePanelMousePressed

    private void homeChoosePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeChoosePanelMouseEntered
        homeChoosePanel.setBackground(new Color(112, 128, 144));
    }//GEN-LAST:event_homeChoosePanelMouseEntered

    private void homeChoosePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeChoosePanelMouseExited
        homeChoosePanel.setBackground(new Color(0, 153, 153));
    }//GEN-LAST:event_homeChoosePanelMouseExited

    private void productChoosePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productChoosePanelMouseEntered
        productChoosePanel.setBackground(new Color(112, 128, 144));
    }//GEN-LAST:event_productChoosePanelMouseEntered

    private void productChoosePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productChoosePanelMouseExited
        productChoosePanel.setBackground(new Color(0, 153, 153));
    }//GEN-LAST:event_productChoosePanelMouseExited

    private void productChoosePanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productChoosePanelMousePressed
        productChoosePanel.setBackground(new Color(60, 179, 113));
        menuClicked(this.productInterface);
    }//GEN-LAST:event_productChoosePanelMousePressed

    private void billChoosePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billChoosePanelMouseExited
        billChoosePanel.setBackground(new Color(0, 153, 153));
    }//GEN-LAST:event_billChoosePanelMouseExited

    private void billChoosePanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billChoosePanelMousePressed
        billChoosePanel.setBackground(new Color(60, 179, 113));
        menuClicked(this.billInterface);
    }//GEN-LAST:event_billChoosePanelMousePressed

    private void billChoosePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billChoosePanelMouseEntered
        billChoosePanel.setBackground(new Color(112, 128, 144));
    }//GEN-LAST:event_billChoosePanelMouseEntered

    private void profitChoosePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profitChoosePanelMouseExited
        profitChoosePanel.setBackground(new Color(0, 153, 153));
    }//GEN-LAST:event_profitChoosePanelMouseExited

    private void profitChoosePanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profitChoosePanelMousePressed
        profitChoosePanel.setBackground(new Color(60, 179, 113));
        menuClicked(this.profitInterface);
    }//GEN-LAST:event_profitChoosePanelMousePressed

    private void profitChoosePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profitChoosePanelMouseEntered
        profitChoosePanel.setBackground(new Color(112, 128, 144));
    }//GEN-LAST:event_profitChoosePanelMouseEntered

    private void profitChoosePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profitChoosePanelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_profitChoosePanelMouseClicked

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
                System.out.println("Line1\nLine2\nLine3");

            }
        });
    }

    // switch interface
    public void menuClicked(JPanel panel) {
        this.homeInterface.setVisible((false));
        this.productInterface.setVisible((false));
        this.addProduct.setVisible((false));
        this.productDetail.setVisible(false);
        this.profitInterface.setVisible(false);
        this.billInterface.setVisible(false);
        this.addBillBuy.setVisible(false);
        this.addBillSold.setVisible(false);
        this.editBillBuy.setVisible(false);

        panel.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel billChoosePanel;
    private javax.swing.JLabel billIcon;
    private javax.swing.JLabel billLabel;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JPanel homeChoosePanel;
    private javax.swing.JLabel homeIcon;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JPanel homePanel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JPanel productChoosePanel;
    private javax.swing.JLabel productIcon;
    private javax.swing.JLabel productLabel;
    private javax.swing.JPanel profitChoosePanel;
    private javax.swing.JLabel profitIcon;
    private javax.swing.JLabel profitLabel;
    // End of variables declaration//GEN-END:variables
}
