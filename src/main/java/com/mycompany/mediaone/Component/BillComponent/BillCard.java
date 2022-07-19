package com.mycompany.mediaone.Component.BillComponent;

import com.mycompany.SharedType.WrapLayout;
import com.mycompany.mediaone.Model.BillModel.Bill;
import com.mycompany.mediaone.Model.BillModel.BillItem;
import com.mycompany.mediaone.View.HomePage;
import com.mycompany.mediaone.View.Product.AddProduct;
import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class BillCard extends javax.swing.JPanel {

    private HomePage homePage;
    private Bill billInfo;

    public BillCard(Bill bill, HomePage homePage) {
        billInfo = bill;
        this.homePage = homePage;
        initComponents();
<<<<<<< HEAD
        totalAmountLabel.setText("" + bill.getTotal());
    }

    public BillCard() {
        
    }

    
=======
        totalAmountLabel.setText(String.valueOf(bill.getTotal()));
        itemQuantityLabel.setText(String.valueOf(bill.getTotalItemQuantityInBill()));
        billTypeText.setText("sold".equals(bill.getType()) ? "Sold" : "Buy");
        billTypeText.setBackground("sold".equals(bill.getType()) ? Color.GREEN : Color.RED);
        this.itemListPanel.setLayout(new WrapLayout());
        for (BillItem item : bill.getItems()) {
            this.itemListPanel.add(new BillItemCard(item));
        }
    }

>>>>>>> 7823851f68ae841016ef7aa837f30ba12266b5fc
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        billCard = new javax.swing.JPanel();
        itemPartPanel = new javax.swing.JPanel();
        itemQuantityPanel = new javax.swing.JPanel();
        itemQuantityLabel = new javax.swing.JLabel();
        itemsLabel = new javax.swing.JLabel();
        itemListContannerPanel = new javax.swing.JPanel();
        itemListScrollPanel = new javax.swing.JScrollPane();
        itemListPanel = new javax.swing.JPanel();
        totalAndTypePanel = new javax.swing.JPanel();
        billTypePanel = new javax.swing.JPanel();
        billTypeLabel = new javax.swing.JLabel();
        billTypeText = new javax.swing.JTextField();
        billTotalPanel = new javax.swing.JPanel();
        billTotalLabel = new javax.swing.JLabel();
        totalAmountLabel = new javax.swing.JLabel();
        curencyLabel = new javax.swing.JLabel();
        buttonFieldPanel = new javax.swing.JPanel();
        deleteBillCardBtn = new javax.swing.JButton();
        editBillCardBtn = new javax.swing.JButton();

        billCard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        billCard.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        itemPartPanel.setPreferredSize(new java.awt.Dimension(360, 100));

        itemQuantityPanel.setPreferredSize(new java.awt.Dimension(354, 20));

        itemQuantityLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemQuantityLabel.setText("1");

        itemsLabel.setText("items");

        javax.swing.GroupLayout itemQuantityPanelLayout = new javax.swing.GroupLayout(itemQuantityPanel);
        itemQuantityPanel.setLayout(itemQuantityPanelLayout);
        itemQuantityPanelLayout.setHorizontalGroup(
            itemQuantityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemQuantityPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(itemQuantityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(itemsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(248, Short.MAX_VALUE))
        );
        itemQuantityPanelLayout.setVerticalGroup(
            itemQuantityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemQuantityPanelLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(itemQuantityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemQuantityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(itemsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        itemPartPanel.add(itemQuantityPanel);

        itemListScrollPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        itemListScrollPanel.setHorizontalScrollBar(null);
        itemListScrollPanel.setPreferredSize(new java.awt.Dimension(354, 143));

        itemListPanel.setPreferredSize(new java.awt.Dimension(350, 141));

        javax.swing.GroupLayout itemListPanelLayout = new javax.swing.GroupLayout(itemListPanel);
        itemListPanel.setLayout(itemListPanelLayout);
        itemListPanelLayout.setHorizontalGroup(
            itemListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        itemListPanelLayout.setVerticalGroup(
            itemListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 141, Short.MAX_VALUE)
        );

        itemListScrollPanel.setViewportView(itemListPanel);

        javax.swing.GroupLayout itemListContannerPanelLayout = new javax.swing.GroupLayout(itemListContannerPanel);
        itemListContannerPanel.setLayout(itemListContannerPanelLayout);
        itemListContannerPanelLayout.setHorizontalGroup(
            itemListContannerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(itemListScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        itemListContannerPanelLayout.setVerticalGroup(
            itemListContannerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemListContannerPanelLayout.createSequentialGroup()
                .addComponent(itemListScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
        );

        itemPartPanel.add(itemListContannerPanel);

        billCard.add(itemPartPanel);

        totalAndTypePanel.setPreferredSize(new java.awt.Dimension(170, 100));
        totalAndTypePanel.setLayout(new java.awt.GridLayout(2, 1));

        billTypePanel.setPreferredSize(new java.awt.Dimension(170, 50));

        billTypeLabel.setText("Order type: ");

        billTypeText.setBackground(new java.awt.Color(51, 255, 51));
        billTypeText.setText("Sold");
        billTypeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billTypeTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout billTypePanelLayout = new javax.swing.GroupLayout(billTypePanel);
        billTypePanel.setLayout(billTypePanelLayout);
        billTypePanelLayout.setHorizontalGroup(
            billTypePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billTypePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(billTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(billTypeText, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );
        billTypePanelLayout.setVerticalGroup(
            billTypePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billTypePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(billTypePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(billTypeText, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(billTypeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        totalAndTypePanel.add(billTypePanel);

        billTotalPanel.setPreferredSize(new java.awt.Dimension(170, 50));

        billTotalLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        billTotalLabel.setText("Total:");
        billTotalLabel.setPreferredSize(new java.awt.Dimension(40, 40));
        billTotalPanel.add(billTotalLabel);

        totalAmountLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalAmountLabel.setText("100000");
        totalAmountLabel.setToolTipText("");
        totalAmountLabel.setPreferredSize(new java.awt.Dimension(70, 40));
        billTotalPanel.add(totalAmountLabel);

        curencyLabel.setText("VND");
        curencyLabel.setPreferredSize(new java.awt.Dimension(30, 40));
        billTotalPanel.add(curencyLabel);

        totalAndTypePanel.add(billTotalPanel);

        billCard.add(totalAndTypePanel);

        buttonFieldPanel.setPreferredSize(new java.awt.Dimension(70, 100));

        deleteBillCardBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\MY LAPTOP\\OneDrive\\Documents\\NetBeansProjects\\MediaOne\\lib\\unknown\\binary\\image\\delete.png")); // NOI18N
        deleteBillCardBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteBillCardBtnMouseClicked(evt);
            }
        });
        deleteBillCardBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBillCardBtnActionPerformed(evt);
            }
        });

        editBillCardBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\MY LAPTOP\\OneDrive\\Documents\\NetBeansProjects\\MediaOne\\lib\\unknown\\binary\\image\\pencil.png")); // NOI18N
        editBillCardBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editBillCardBtnMouseClicked(evt);
            }
        });
        editBillCardBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBillCardBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonFieldPanelLayout = new javax.swing.GroupLayout(buttonFieldPanel);
        buttonFieldPanel.setLayout(buttonFieldPanelLayout);
        buttonFieldPanelLayout.setHorizontalGroup(
            buttonFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonFieldPanelLayout.createSequentialGroup()
                .addGap(0, 13, Short.MAX_VALUE)
                .addGroup(buttonFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteBillCardBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editBillCardBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        buttonFieldPanelLayout.setVerticalGroup(
            buttonFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonFieldPanelLayout.createSequentialGroup()
                .addComponent(editBillCardBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteBillCardBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        billCard.add(buttonFieldPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(billCard, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(billCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void billTypeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billTypeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_billTypeTextActionPerformed

    private void editBillCardBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editBillCardBtnMouseClicked
        System.out.println(this.homePage);
        this.homePage.editBillBuy.setBillInfo(this.billInfo);
        this.homePage.menuClicked(homePage.editBillBuy);
    }//GEN-LAST:event_editBillCardBtnMouseClicked

    private void deleteBillCardBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBillCardBtnMouseClicked
        if (JOptionPane.showConfirmDialog(null, "Are you sure to delete this product", "Confirmation",
                JOptionPane.YES_NO_OPTION) == 0) {
            this.homePage.billInterface.listBills.remove(billInfo);
//            try {
//                this.productFileUtil.writeListToFile("product", this.homePage.productInterface.productListItems);
//            } catch (IOException ex) {
//                Logger.getLogger(AddProduct.class.getName()).log(Level.SEVERE, null, ex);
//            }
            this.homePage.billInterface.reRenderBilltListPanel(this.homePage.billInterface.listBills);
        }    }//GEN-LAST:event_deleteBillCardBtnMouseClicked

    private void deleteBillCardBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBillCardBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteBillCardBtnActionPerformed

    private void editBillCardBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBillCardBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editBillCardBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel billCard;
    private javax.swing.JLabel billTotalLabel;
    private javax.swing.JPanel billTotalPanel;
    private javax.swing.JLabel billTypeLabel;
    private javax.swing.JPanel billTypePanel;
    private javax.swing.JTextField billTypeText;
    private javax.swing.JPanel buttonFieldPanel;
    private javax.swing.JLabel curencyLabel;
    private javax.swing.JButton deleteBillCardBtn;
    private javax.swing.JButton editBillCardBtn;
    private javax.swing.JPanel itemListContannerPanel;
    private javax.swing.JPanel itemListPanel;
    private javax.swing.JScrollPane itemListScrollPanel;
    private javax.swing.JPanel itemPartPanel;
    private javax.swing.JLabel itemQuantityLabel;
    private javax.swing.JPanel itemQuantityPanel;
    private javax.swing.JLabel itemsLabel;
    private javax.swing.JLabel totalAmountLabel;
    private javax.swing.JPanel totalAndTypePanel;
    // End of variables declaration//GEN-END:variables
}
