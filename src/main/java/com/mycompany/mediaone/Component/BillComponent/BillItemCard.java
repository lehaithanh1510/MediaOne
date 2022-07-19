package com.mycompany.mediaone.Component.BillComponent;

import com.mycompany.mediaone.Model.BillModel.BillItem;

public class BillItemCard extends javax.swing.JPanel {

    public BillItemCard(BillItem item) {
        initComponents();
        itemNameLabel.setText(item.getName());
        quantityItemLabel.setText(String.valueOf(item.getQuantity()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        itemCardPanel = new javax.swing.JPanel();
        quantityItemLabel = new javax.swing.JLabel();
        xLabel = new javax.swing.JLabel();
        itemNameLabel = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(345, 23));

        itemCardPanel.setPreferredSize(new java.awt.Dimension(395, 23));

        quantityItemLabel.setText("jLabel1");
        quantityItemLabel.setToolTipText("");
        quantityItemLabel.setFocusTraversalPolicyProvider(true);

        xLabel.setText("x");

        itemNameLabel.setText("jLabel1");

        javax.swing.GroupLayout itemCardPanelLayout = new javax.swing.GroupLayout(itemCardPanel);
        itemCardPanel.setLayout(itemCardPanelLayout);
        itemCardPanelLayout.setHorizontalGroup(
            itemCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemCardPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(quantityItemLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(itemNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                .addContainerGap())
        );
        itemCardPanelLayout.setVerticalGroup(
            itemCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(quantityItemLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(xLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(itemNameLabel))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(itemCardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(itemCardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel itemCardPanel;
    private javax.swing.JLabel itemNameLabel;
    private javax.swing.JLabel quantityItemLabel;
    private javax.swing.JLabel xLabel;
    // End of variables declaration//GEN-END:variables
}
