package com.mycompany.mediaone.Component.BillComponent;

import com.mycompany.mediaone.Model.BillModel.Bill;
import com.mycompany.mediaone.View.HomePage;

public class BillCard extends javax.swing.JPanel {
    
    private HomePage homePage;
    private Bill bill;
    
    public BillCard(Bill bill, HomePage homePage) {
        bill = bill;
        homePage = homePage;
        initComponents();
        totalAmountLabel.setText("" + bill.getTotal());
    }

    public BillCard() {
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        productCard = new javax.swing.JPanel();
        itemPartPanel = new javax.swing.JPanel();
        itemQuantityPanel = new javax.swing.JPanel();
        itemQuantityLabel = new javax.swing.JLabel();
        itemsLabel = new javax.swing.JLabel();
        itemListPanel = new javax.swing.JPanel();
        itemListScrollPanel = new javax.swing.JScrollPane();
        totalAndTypePanel = new javax.swing.JPanel();
        billTypePanel = new javax.swing.JPanel();
        billTypeLabel = new javax.swing.JLabel();
        billTypeText = new javax.swing.JTextField();
        billTotalPanel = new javax.swing.JPanel();
        billTotalLabel = new javax.swing.JLabel();
        totalAmountLabel = new javax.swing.JLabel();
        curencyLabel = new javax.swing.JLabel();

        productCard.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        itemPartPanel.setPreferredSize(new java.awt.Dimension(400, 100));

        itemQuantityPanel.setPreferredSize(new java.awt.Dimension(398, 20));

        itemsLabel.setText("items");

        javax.swing.GroupLayout itemQuantityPanelLayout = new javax.swing.GroupLayout(itemQuantityPanel);
        itemQuantityPanel.setLayout(itemQuantityPanelLayout);
        itemQuantityPanelLayout.setHorizontalGroup(
            itemQuantityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemQuantityPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(itemQuantityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(itemsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(266, Short.MAX_VALUE))
        );
        itemQuantityPanelLayout.setVerticalGroup(
            itemQuantityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemQuantityPanelLayout.createSequentialGroup()
                .addGroup(itemQuantityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(itemsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(itemQuantityPanelLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(itemQuantityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        itemPartPanel.add(itemQuantityPanel);

        itemListPanel.setPreferredSize(new java.awt.Dimension(398, 70));

        javax.swing.GroupLayout itemListPanelLayout = new javax.swing.GroupLayout(itemListPanel);
        itemListPanel.setLayout(itemListPanelLayout);
        itemListPanelLayout.setHorizontalGroup(
            itemListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(itemListScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
        );
        itemListPanelLayout.setVerticalGroup(
            itemListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(itemListScrollPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        itemPartPanel.add(itemListPanel);

        productCard.add(itemPartPanel);

        totalAndTypePanel.setPreferredSize(new java.awt.Dimension(200, 100));
        totalAndTypePanel.setLayout(new java.awt.GridLayout(2, 1));

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
                .addComponent(billTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(billTypeText, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
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

        billTotalLabel.setText("Total:");

        curencyLabel.setText("VND");

        javax.swing.GroupLayout billTotalPanelLayout = new javax.swing.GroupLayout(billTotalPanel);
        billTotalPanel.setLayout(billTotalPanelLayout);
        billTotalPanelLayout.setHorizontalGroup(
            billTotalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billTotalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(billTotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(totalAmountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(curencyLabel)
                .addContainerGap())
        );
        billTotalPanelLayout.setVerticalGroup(
            billTotalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billTotalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(billTotalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalAmountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(billTotalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(curencyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                        .addComponent(billTotalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        totalAndTypePanel.add(billTotalPanel);

        productCard.add(totalAndTypePanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(productCard, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void billTypeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billTypeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_billTypeTextActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel billTotalLabel;
    private javax.swing.JPanel billTotalPanel;
    private javax.swing.JLabel billTypeLabel;
    private javax.swing.JPanel billTypePanel;
    private javax.swing.JTextField billTypeText;
    private javax.swing.JLabel curencyLabel;
    private javax.swing.JPanel itemListPanel;
    private javax.swing.JScrollPane itemListScrollPanel;
    private javax.swing.JPanel itemPartPanel;
    private javax.swing.JLabel itemQuantityLabel;
    private javax.swing.JPanel itemQuantityPanel;
    private javax.swing.JLabel itemsLabel;
    private javax.swing.JPanel productCard;
    private javax.swing.JLabel totalAmountLabel;
    private javax.swing.JPanel totalAndTypePanel;
    // End of variables declaration//GEN-END:variables
}
