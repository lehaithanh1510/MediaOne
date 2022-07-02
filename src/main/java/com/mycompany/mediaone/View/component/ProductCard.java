package com.mycompany.mediaone.View.component;

import com.mycompany.Model.Product;
import com.mycompany.mediaone.View.HomePage;

public class ProductCard extends javax.swing.JPanel {

    private HomePage homePage;
    private Product product;

    public ProductCard(Product product, HomePage homePage) {
        initComponents();
        this.productName.setText(product.getName());
        this.productPrice.setText(String.valueOf(product.getSellPrice()));
        this.productType.setText(product.getType());
        this.homePage = homePage;
        this.product = product;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        productName = new javax.swing.JLabel();
        productType = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        editBtn = new javax.swing.JButton();
        productPrice = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setAlignmentX(0.1F);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 114, Short.MAX_VALUE)
        );

        add(jPanel1);

        jPanel6.setLayout(new java.awt.GridLayout(2, 1));

        productName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productName.setText("jLabel5");
        jPanel6.add(productName);

        productType.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productType.setText("jLabel6");
        jPanel6.add(productType);

        add(jPanel6);

        jPanel2.setAlignmentX(0.1F);
        jPanel2.setLayout(new java.awt.GridLayout(2, 1, 0, 1));

        editBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\MY LAPTOP\\OneDrive\\Documents\\NetBeansProjects\\MediaOne\\lib\\unknown\\binary\\image\\pencil.png")); // NOI18N
        editBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 75, Short.MAX_VALUE)
                .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(editBtn)
                .addGap(0, 26, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3);

        productPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productPrice.setText("jLabel2");
        jPanel2.add(productPrice);

        add(jPanel2);
    }// </editor-fold>//GEN-END:initComponents

    private void editBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editBtnMouseClicked
        // TODO add your handling code here:
        System.out.println(this.homePage);
        this.homePage.productDetail.setProductInfo(product);
        this.homePage.menuClicked(homePage.productDetail);
    }//GEN-LAST:event_editBtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel productName;
    private javax.swing.JLabel productPrice;
    private javax.swing.JLabel productType;
    // End of variables declaration//GEN-END:variables
}
