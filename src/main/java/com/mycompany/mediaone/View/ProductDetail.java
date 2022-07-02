package com.mycompany.mediaone.View;

import com.mycompany.Model.Product;

public class ProductDetail extends javax.swing.JPanel {

    private HomePage homePage;
    private Product productInfo;

    public ProductDetail(HomePage homePage) {
        initComponents();
        this.homePage = homePage;
    }

    public void setProductInfo(Product product) {
        this.productInfo = product;
        this.productNameTextArea.setText(product.getName());
        this.productTypeTextArea.setText(product.getType());
        this.productIdTextArea.setText(product.getId());
        this.productSellPriceTextArea.setText(String.valueOf(product.getSellPrice()));
        this.productInputPriceTextArea.setText(String.valueOf(product.getInputPrice()));
        this.productNumInStockTextArea.setText(String.valueOf(product.getNumberInStock()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        InterfaceTitleLabel = new javax.swing.JLabel();
        formPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        productIdPanel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productIdTextArea = new javax.swing.JTextArea();
        productNamePanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        productNameTextArea = new javax.swing.JTextArea();
        productTypePanel = new javax.swing.JPanel();
        productTypeLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        productTypeTextArea = new javax.swing.JTextArea();
        productCategoryPanel = new javax.swing.JPanel();
        productCategoryLabel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        productCategoryTextArea = new javax.swing.JTextArea();
        productAuthorPanel = new javax.swing.JPanel();
        productAuthorLabel = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        productAuthorTextArea = new javax.swing.JTextArea();
        productListActorSinger = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        productActorTextArea = new javax.swing.JTextArea();
        productSellPricePanel = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        productSellPriceTextArea = new javax.swing.JTextArea();
        productNumInStockPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        productInputPriceTextArea = new javax.swing.JTextArea();
        productNumInStockPanel = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        productNumInStockTextArea = new javax.swing.JTextArea();
        dataRelease = new javax.swing.JPanel();
        productIdPanel1 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        productDatareleaseTextArea = new javax.swing.JTextArea();
        backBtnPanel = new javax.swing.JPanel();
        backBtn = new javax.swing.JButton();
        saveBtnPanel = new javax.swing.JPanel();
        saveBtn = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setPreferredSize(new java.awt.Dimension(689, 542));
        setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setPreferredSize(new java.awt.Dimension(692, 567));

        InterfaceTitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        InterfaceTitleLabel.setText("Product Detail");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(InterfaceTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(InterfaceTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        formPanel.setLayout(new java.awt.GridLayout(6, 2));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        productIdPanel.setText("Product ID");
        jPanel3.add(productIdPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        productIdTextArea.setEditable(false);
        productIdTextArea.setColumns(20);
        productIdTextArea.setRows(5);
        jScrollPane1.setViewportView(productIdTextArea);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 36, 330, 50));

        formPanel.add(jPanel3);

        productNamePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setText("Product Name");
        productNamePanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        productNameTextArea.setColumns(20);
        productNameTextArea.setRows(5);
        jScrollPane2.setViewportView(productNameTextArea);

        productNamePanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 36, 330, 50));

        formPanel.add(productNamePanel);

        productTypePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        productTypeLabel.setText("Product Type");
        productTypePanel.add(productTypeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        productTypeTextArea.setColumns(20);
        productTypeTextArea.setRows(5);
        jScrollPane3.setViewportView(productTypeTextArea);

        productTypePanel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 330, 50));

        formPanel.add(productTypePanel);

        productCategoryPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        productCategoryLabel.setText("Product Category");
        productCategoryPanel.add(productCategoryLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 30));

        productCategoryTextArea.setColumns(20);
        productCategoryTextArea.setRows(5);
        jScrollPane4.setViewportView(productCategoryTextArea);

        productCategoryPanel.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 330, 50));

        formPanel.add(productCategoryPanel);

        productAuthorPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        productAuthorLabel.setText("Author/Director");
        productAuthorPanel.add(productAuthorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 30));

        productAuthorTextArea.setColumns(20);
        productAuthorTextArea.setRows(5);
        jScrollPane5.setViewportView(productAuthorTextArea);

        productAuthorPanel.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 36, 330, 50));

        formPanel.add(productAuthorPanel);

        productListActorSinger.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setText("List actor/signer");
        productListActorSinger.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 30));

        productActorTextArea.setColumns(20);
        productActorTextArea.setRows(5);
        jScrollPane10.setViewportView(productActorTextArea);

        productListActorSinger.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 36, 330, 50));

        formPanel.add(productListActorSinger);

        productSellPricePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setText("Product Sell Price");
        productSellPricePanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 30));

        productSellPriceTextArea.setColumns(20);
        productSellPriceTextArea.setRows(5);
        jScrollPane6.setViewportView(productSellPriceTextArea);

        productSellPricePanel.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 36, 330, 50));

        formPanel.add(productSellPricePanel);

        productNumInStockPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setText("Product Input Price");
        productNumInStockPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 30));

        productInputPriceTextArea.setColumns(20);
        productInputPriceTextArea.setRows(5);
        jScrollPane9.setViewportView(productInputPriceTextArea);

        productNumInStockPanel1.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 36, 330, 50));

        formPanel.add(productNumInStockPanel1);

        productNumInStockPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setText("Number in stock");
        productNumInStockPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 30));

        productNumInStockTextArea.setColumns(20);
        productNumInStockTextArea.setRows(5);
        jScrollPane7.setViewportView(productNumInStockTextArea);

        productNumInStockPanel.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 330, 50));

        formPanel.add(productNumInStockPanel);

        dataRelease.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        productIdPanel1.setText("Date release");
        dataRelease.add(productIdPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        productDatareleaseTextArea.setColumns(20);
        productDatareleaseTextArea.setRows(5);
        jScrollPane8.setViewportView(productDatareleaseTextArea);

        dataRelease.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 330, 50));

        formPanel.add(dataRelease);

        backBtn.setBackground(new java.awt.Color(255, 0, 51));
        backBtn.setText("BACK");
        backBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout backBtnPanelLayout = new javax.swing.GroupLayout(backBtnPanel);
        backBtnPanel.setLayout(backBtnPanelLayout);
        backBtnPanelLayout.setHorizontalGroup(
            backBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backBtnPanelLayout.createSequentialGroup()
                .addContainerGap(153, Short.MAX_VALUE)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        backBtnPanelLayout.setVerticalGroup(
            backBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backBtnPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        formPanel.add(backBtnPanel);

        saveBtn.setBackground(new java.awt.Color(51, 255, 102));
        saveBtn.setText("SAVE");
        saveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout saveBtnPanelLayout = new javax.swing.GroupLayout(saveBtnPanel);
        saveBtnPanel.setLayout(saveBtnPanelLayout);
        saveBtnPanelLayout.setHorizontalGroup(
            saveBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(saveBtnPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
        );
        saveBtnPanelLayout.setVerticalGroup(
            saveBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(saveBtnPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        formPanel.add(saveBtnPanel);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(formPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(formPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseClicked
        // TODO add your handling code here:
        this.homePage.menuClicked(homePage.productInterface);
    }//GEN-LAST:event_backBtnMouseClicked

    private void saveBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveBtnMouseClicked
        // TODO add your handling code here:
        var productName = productNameTextArea.getText();
        var productId = productIdTextArea.getText();
        var productType = productTypeTextArea.getText();
        int productSellPrice = Integer.parseInt(productSellPriceTextArea.getText());
        int productInputPrice = Integer.parseInt(productInputPriceTextArea.getText());
        int productNumInStock = Integer.parseInt(productNumInStockTextArea.getText());

        int indexProduct = this.homePage.productInterface.productListItems.indexOf(this.productInfo);

        this.homePage.productInterface.productListItems.set(indexProduct, new Product(productId, productName, productType, productNumInStock, productInputPrice, productSellPrice));

        this.homePage.productInterface.reRenderProductListPanel();
        this.homePage.menuClicked(homePage.productInterface);
    }//GEN-LAST:event_saveBtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel InterfaceTitleLabel;
    private javax.swing.JButton backBtn;
    private javax.swing.JPanel backBtnPanel;
    private javax.swing.JPanel dataRelease;
    private javax.swing.JPanel formPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextArea productActorTextArea;
    private javax.swing.JLabel productAuthorLabel;
    private javax.swing.JPanel productAuthorPanel;
    private javax.swing.JTextArea productAuthorTextArea;
    private javax.swing.JLabel productCategoryLabel;
    private javax.swing.JPanel productCategoryPanel;
    private javax.swing.JTextArea productCategoryTextArea;
    private javax.swing.JTextArea productDatareleaseTextArea;
    private javax.swing.JLabel productIdPanel;
    private javax.swing.JLabel productIdPanel1;
    private javax.swing.JTextArea productIdTextArea;
    private javax.swing.JTextArea productInputPriceTextArea;
    private javax.swing.JPanel productListActorSinger;
    private javax.swing.JPanel productNamePanel;
    private javax.swing.JTextArea productNameTextArea;
    private javax.swing.JPanel productNumInStockPanel;
    private javax.swing.JPanel productNumInStockPanel1;
    private javax.swing.JTextArea productNumInStockTextArea;
    private javax.swing.JPanel productSellPricePanel;
    private javax.swing.JTextArea productSellPriceTextArea;
    private javax.swing.JLabel productTypeLabel;
    private javax.swing.JPanel productTypePanel;
    private javax.swing.JTextArea productTypeTextArea;
    private javax.swing.JButton saveBtn;
    private javax.swing.JPanel saveBtnPanel;
    // End of variables declaration//GEN-END:variables
}
