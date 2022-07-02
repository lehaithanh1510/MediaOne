package com.mycompany.mediaone.View;

import com.mycompany.Model.Product;
import com.mycompany.Util.WrapLayout;
import com.mycompany.mediaone.View.component.ProductCard;
import java.util.ArrayList;
import java.util.List;

public class ProductInterface extends javax.swing.JPanel {
    
    private HomePage homePage;
    
    public List<Product> productListItems = new ArrayList();
    
    public ProductInterface(HomePage homePage) {
        initComponents();
        this.productListItems.add(new Product("001", "Titanic", "Film CD", 20, 40000, 50000));
        this.productListItems.add(new Product("002", "Chipmunk", "Film CD", 20, 40000, 50000));
        this.homePage = homePage;
        
        for (Product productListItem : productListItems) {
            this.ProductListPanel.add(new ProductCard(productListItem, this.homePage));
        }
        this.ProductListPanel.setLayout(new WrapLayout());
    }
    
    public void addNewProductToListPanel(Product product) {
        this.ProductListPanel.add(new ProductCard(product, this.homePage));
    }
    
    public void reRenderProductListPanel() {
        this.ProductListPanel.removeAll();
        for (Product productListItem : productListItems) {
            this.addNewProductToListPanel(productListItem);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainProductInterface = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        InterfaceTitleLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        typeProductFilterPanel = new javax.swing.JPanel();
        musicCDField = new javax.swing.JTextField();
        filmCDField = new javax.swing.JTextField();
        bookField = new javax.swing.JTextField();
        allProductField = new javax.swing.JTextField();
        productTypeHeader = new javax.swing.JPanel();
        productLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductListPanel = new javax.swing.JPanel();

        setToolTipText("");
        setPreferredSize(new java.awt.Dimension(677, 543));
        setLayout(new java.awt.GridLayout(1, 0));

        InterfaceTitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        InterfaceTitleLabel.setText("Products");

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\MY LAPTOP\\OneDrive\\Documents\\NetBeansProjects\\MediaOne\\lib\\unknown\\binary\\image\\plus.png")); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(InterfaceTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(headerPanelLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6))
                    .addComponent(InterfaceTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        typeProductFilterPanel.setLayout(new java.awt.GridLayout(1, 0));

        musicCDField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        musicCDField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        musicCDField.setText("Music CD ");
        musicCDField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                musicCDFieldMouseClicked(evt);
            }
        });
        typeProductFilterPanel.add(musicCDField);

        filmCDField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        filmCDField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        filmCDField.setText("Film CD ");
        filmCDField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                filmCDFieldMouseClicked(evt);
            }
        });
        typeProductFilterPanel.add(filmCDField);

        bookField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bookField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bookField.setText("Book ");
        bookField.setToolTipText("");
        bookField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookFieldMouseClicked(evt);
            }
        });
        typeProductFilterPanel.add(bookField);

        allProductField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        allProductField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        allProductField.setText("All Product");
        allProductField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                allProductFieldMouseClicked(evt);
            }
        });
        typeProductFilterPanel.add(allProductField);

        productLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        productLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productLabel.setText("Music CD");

        javax.swing.GroupLayout productTypeHeaderLayout = new javax.swing.GroupLayout(productTypeHeader);
        productTypeHeader.setLayout(productTypeHeaderLayout);
        productTypeHeaderLayout.setHorizontalGroup(
            productTypeHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productTypeHeaderLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(productLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        productTypeHeaderLayout.setVerticalGroup(
            productTypeHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productTypeHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(productLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(ProductListPanel);

        javax.swing.GroupLayout MainProductInterfaceLayout = new javax.swing.GroupLayout(MainProductInterface);
        MainProductInterface.setLayout(MainProductInterfaceLayout);
        MainProductInterfaceLayout.setHorizontalGroup(
            MainProductInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(typeProductFilterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(productTypeHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MainProductInterfaceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        MainProductInterfaceLayout.setVerticalGroup(
            MainProductInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainProductInterfaceLayout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(typeProductFilterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productTypeHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE))
        );

        add(MainProductInterface);
    }// </editor-fold>//GEN-END:initComponents

    private void musicCDFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_musicCDFieldMouseClicked
        this.productLabel.setText("Music CD");
    }//GEN-LAST:event_musicCDFieldMouseClicked

    private void filmCDFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filmCDFieldMouseClicked
        this.productLabel.setText("Film CD");
    }//GEN-LAST:event_filmCDFieldMouseClicked

    private void bookFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookFieldMouseClicked
        this.productLabel.setText("Book");
    }//GEN-LAST:event_bookFieldMouseClicked

    private void allProductFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allProductFieldMouseClicked
        this.productLabel.setText("All Product");
    }//GEN-LAST:event_allProductFieldMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        this.homePage.menuClicked(homePage.addProduct);

    }//GEN-LAST:event_jButton1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel InterfaceTitleLabel;
    private javax.swing.JPanel MainProductInterface;
    private javax.swing.JPanel ProductListPanel;
    private javax.swing.JTextField allProductField;
    private javax.swing.JTextField bookField;
    private javax.swing.JTextField filmCDField;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField musicCDField;
    private javax.swing.JLabel productLabel;
    private javax.swing.JPanel productTypeHeader;
    private javax.swing.JPanel typeProductFilterPanel;
    // End of variables declaration//GEN-END:variables
}
