package com.mycompany.mediaone.View.Bill;

import com.mycompany.mediaone.Model.BillModel.BillBuy;
import com.mycompany.mediaone.Model.BillModel.BillItem;
import com.mycompany.mediaone.Model.Product;
import com.mycompany.mediaone.View.HomePage;
import com.mycompany.mediaone.View.Product.AddProduct;
import java.awt.CardLayout;
import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BillBuyDetail extends javax.swing.JPanel {

    private HomePage homePage;
    private String typeInterface;
    private DefaultTableModel modelProductTable;
    private List<BillItem> listItem = new ArrayList<>();
    private String[] columHeaders = new String[]{"ID", "Name", "Quantity", "Unit Price", "Amount"};
    private BillItem chooseItem;
    private int choosenRow;

    public BillBuyDetail(HomePage homePage, String typeInterface) {
        initComponents();
        this.homePage = homePage;
        idInputField.setText(UUID.randomUUID().toString());
        if (chooseItem == null) {
            saveProductBtn.setEnabled(false);
        } else {
            addProductBtn.setEnabled(false);
        }
        initTable();
    }

    private void initTable() {

        modelProductTable = new DefaultTableModel();

        modelProductTable.setColumnIdentifiers(columHeaders);

        listItem.forEach(item
                -> {
            modelProductTable.addRow(new Object[]{item.getId(), item.getName(),
                item.getQuantity(), item.getUnitPrice(), item.getAmount()});
        }
        );
        productTable.setModel(modelProductTable);
    }

    private void rerenderRowData(List<BillItem> listItem) {
        int rowCount = modelProductTable.getRowCount();
        //remove all row 
        for (int i = rowCount - 1; i >= 0; i--) {
            modelProductTable.removeRow(i);
        }

        //add row back
        listItem.forEach(item
                -> {
            modelProductTable.addRow(new Object[]{item.getId(), item.getName(),
                item.getQuantity(), item.getUnitPrice(), item.getAmount()});
        }
        );

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BillDetail = new javax.swing.JPanel();
        PnlTableProducts = new javax.swing.JPanel();
        listBillItem = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        productEditInfo = new javax.swing.JPanel();
        idLabel = new javax.swing.JLabel();
        quantityLabel = new javax.swing.JLabel();
        nameItemLabel = new javax.swing.JLabel();
        unitPriceItemLabel = new javax.swing.JLabel();
        quantityInputField = new javax.swing.JTextField();
        idInputField = new javax.swing.JTextField();
        nameInputField = new javax.swing.JTextField();
        unitPriceInputField = new javax.swing.JTextField();
        addProductBtn = new javax.swing.JButton();
        saveProductBtn = new javax.swing.JButton();
        PnlButton = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        createBillBtn = new javax.swing.JButton();
        saveBillBtn = new javax.swing.JButton();

        BillDetail.setBackground(new java.awt.Color(0, 153, 153));
        BillDetail.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BILL BUY DETAIL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        PnlTableProducts.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        productTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        productTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productTableMouseClicked(evt);
            }
        });
        listBillItem.setViewportView(productTable);

        idLabel.setText("ID:");

        quantityLabel.setText("Quantity:");

        nameItemLabel.setText("Name:");

        unitPriceItemLabel.setText("Unit Price:");

        idInputField.setEditable(false);
        idInputField.setBackground(new java.awt.Color(204, 204, 204));

        addProductBtn.setText("Add");
        addProductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProductBtnActionPerformed(evt);
            }
        });

        saveProductBtn.setText("Save");
        saveProductBtn.setEnabled(false);
        saveProductBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveProductBtnMouseClicked(evt);
            }
        });
        saveProductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveProductBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout productEditInfoLayout = new javax.swing.GroupLayout(productEditInfo);
        productEditInfo.setLayout(productEditInfoLayout);
        productEditInfoLayout.setHorizontalGroup(
            productEditInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productEditInfoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(productEditInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(quantityLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(idLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(productEditInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(quantityInputField, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                    .addComponent(idInputField))
                .addGap(49, 49, 49)
                .addGroup(productEditInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(unitPriceItemLabel)
                    .addComponent(nameItemLabel))
                .addGroup(productEditInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(productEditInfoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(nameInputField, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                    .addGroup(productEditInfoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(unitPriceInputField, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productEditInfoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveProductBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addProductBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        productEditInfoLayout.setVerticalGroup(
            productEditInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productEditInfoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(productEditInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel)
                    .addComponent(nameItemLabel)
                    .addComponent(idInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(productEditInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unitPriceInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unitPriceItemLabel)
                    .addComponent(quantityInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantityLabel))
                .addGap(18, 18, 18)
                .addGroup(productEditInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveProductBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addProductBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout PnlTableProductsLayout = new javax.swing.GroupLayout(PnlTableProducts);
        PnlTableProducts.setLayout(PnlTableProductsLayout);
        PnlTableProductsLayout.setHorizontalGroup(
            PnlTableProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlTableProductsLayout.createSequentialGroup()
                .addGroup(PnlTableProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listBillItem)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlTableProductsLayout.createSequentialGroup()
                        .addGap(0, 2, Short.MAX_VALUE)
                        .addComponent(productEditInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        PnlTableProductsLayout.setVerticalGroup(
            PnlTableProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlTableProductsLayout.createSequentialGroup()
                .addComponent(listBillItem, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(productEditInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnDelete.setBackground(new java.awt.Color(255, 0, 0));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        createBillBtn.setBackground(new java.awt.Color(51, 255, 51));
        createBillBtn.setText("Create");
        createBillBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createBillBtnMouseClicked(evt);
            }
        });
        createBillBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBillBtnActionPerformed(evt);
            }
        });

        saveBillBtn.setText("Save");
        saveBillBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBillBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlButtonLayout = new javax.swing.GroupLayout(PnlButton);
        PnlButton.setLayout(PnlButtonLayout);
        PnlButtonLayout.setHorizontalGroup(
            PnlButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 387, Short.MAX_VALUE)
                .addComponent(saveBillBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(createBillBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PnlButtonLayout.setVerticalGroup(
            PnlButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlButtonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PnlButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createBillBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveBillBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(152, 152, 152))
        );

        javax.swing.GroupLayout BillDetailLayout = new javax.swing.GroupLayout(BillDetail);
        BillDetail.setLayout(BillDetailLayout);
        BillDetailLayout.setHorizontalGroup(
            BillDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(BillDetailLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(BillDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PnlTableProducts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PnlButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        BillDetailLayout.setVerticalGroup(
            BillDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BillDetailLayout.createSequentialGroup()
                .addComponent(PnlTableProducts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PnlButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 716, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(BillDetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 548, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(BillDetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void productTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productTableMouseClicked

        try {
            int row = productTable.getSelectedRow();
            choosenRow = row;
            if (row >= 0) {
                chooseItem = listItem.get(row);
                saveProductBtn.setEnabled(true);
                addProductBtn.setEnabled(false);
                idInputField.setText(chooseItem.getId());
                nameInputField.setText(chooseItem.getName());
                quantityInputField.setText("" + chooseItem.getQuantity());
                unitPriceInputField.setText("" + chooseItem.getUnitPrice());
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_productTableMouseClicked

    private void addProductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProductBtnActionPerformed
        try {
            StringBuilder errors = new StringBuilder();
            if (idInputField.getText().equals("")) {
                errors.append("ID must be entered\n");
                idInputField.setBackground(Color.red);
            } else {
                idInputField.setBackground(Color.white);
            }
            if (nameInputField.getText().equals("")) {
                errors.append("Name must be entered\n");
                nameInputField.setBackground(Color.red);
            } else {
                nameInputField.setBackground(Color.white);
            }
            if (quantityInputField.getText().equals("")) {
                errors.append("Quantity must be entered\n");
                quantityInputField.setBackground(Color.red);
            } else {
                quantityInputField.setBackground(Color.white);
            }
            if (unitPriceInputField.getText().equals("")) {
                errors.append("Unit price must be entered\n");
                unitPriceInputField.setBackground(Color.red);
            } else {
                unitPriceInputField.setBackground(Color.white);
            }

            String itemId = idInputField.getText();
            String itemName = nameInputField.getText();
            int itemQuantity = Integer.parseInt(quantityInputField.getText());
            double itemUnitPrice = (Double.parseDouble(unitPriceInputField.getText()));
            BillItem newBillItem = new BillItem(itemId, itemName, itemQuantity, itemUnitPrice);
            listItem.add(newBillItem);
            modelProductTable.addRow(new Object[]{newBillItem.getId(), newBillItem.getName(),
                newBillItem.getQuantity(), newBillItem.getUnitPrice(), newBillItem.getAmount()});

            idInputField.setText(UUID.randomUUID().toString());
            nameInputField.setText("");
            quantityInputField.setText("");
            unitPriceInputField.setText("");

            modelProductTable.fireTableDataChanged();

            JOptionPane.showMessageDialog(this, "New item added to bill");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_addProductBtnActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            if (idInputField.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Nothing is to deleted");
                return;
            }
            if (JOptionPane.showConfirmDialog(this, "Do you want to delete the product "
                    + idInputField.getText(), "Confirmation", JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION) {
                return;
            }
            boolean isDeleted = false;
            for (int i = 0; i < listItem.size(); i++) {
                BillItem item = listItem.get(i);
                if (item.getId().equals(idInputField.getText())) {
                    listItem.remove(i);
                    isDeleted = true;
                    break;
                }
            }
            if (isDeleted) {
                JOptionPane.showMessageDialog(this, "The product deleted");
                initTable();
                idInputField.setText("");
                nameInputField.setText("");
                quantityInputField.setText("");
                unitPriceInputField.setText("");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    

    private void createBillBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBillBtnActionPerformed

    }//GEN-LAST:event_createBillBtnActionPerformed

    private void saveProductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveProductBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveProductBtnActionPerformed

    private void saveBillBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBillBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveBillBtnActionPerformed

    private void saveProductBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveProductBtnMouseClicked
        // TODO add your handling code here:
        try {
            StringBuilder errors = new StringBuilder();
            if (nameInputField.getText().equals("")) {
                errors.append("Name must be entered\n");
                nameInputField.setBackground(Color.red);
            } else {
                nameInputField.setBackground(Color.white);
            }
            if (quantityInputField.getText().equals("")) {
                errors.append("Quantity must be entered\n");
                quantityInputField.setBackground(Color.red);
            } else {
                quantityInputField.setBackground(Color.white);
            }
            if (unitPriceInputField.getText().equals("")) {
                errors.append("Unit price must be entered\n");
                unitPriceInputField.setBackground(Color.red);
            } else {
                unitPriceInputField.setBackground(Color.white);
            }

            // set the row table 
            String itemId = idInputField.getText();
            String itemName = nameInputField.getText();
            int itemQuantity = Integer.parseInt(quantityInputField.getText());
            double itemUnitPrice = (Double.parseDouble(unitPriceInputField.getText()));
            BillItem editedBillItem = new BillItem(itemId, itemName, itemQuantity, itemUnitPrice);
            int indexBillItem = this.listItem.indexOf(this.chooseItem);
            this.listItem.set(indexBillItem, editedBillItem);
            this.rerenderRowData(listItem);

            //set the add product field 
            choosenRow = -1;
            chooseItem = null;
            idInputField.setText(UUID.randomUUID().toString());
            nameInputField.setText("");
            quantityInputField.setText("");
            unitPriceInputField.setText("");
            saveProductBtn.setEnabled(false);
            addProductBtn.setEnabled(true);

            modelProductTable.fireTableDataChanged();

            JOptionPane.showMessageDialog(this, "Item updated");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_saveProductBtnMouseClicked

    private void createBillBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createBillBtnMouseClicked
        BillBuy newBuyBill = new BillBuy();
        newBuyBill.setId(UUID.randomUUID().toString());
        newBuyBill.setItems(listItem);
        //newBuyBill.setTotal();
        this.homePage.billInterface.listBills.add(newBuyBill);

//        try {
//            this.productFileUtil.writeListToFile("product", this.homePage.productInterface.productListItems);
//        } catch (IOException ex) {
//            Logger.getLogger(AddProduct.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        this.homePage.productInterface.addNewProductToListPanel(new Product(productId, productName, productType, productNumInStock, productInputPrice, productSellPrice, releaseDate, productCategory, productAuthorDirectorMusician, productContributorActorSinger));
//        this.homePage.menuClicked(homePage.productInterface);
//        this.resetAllTextAfterCreateProduct();
        idInputField.setText("");
        nameInputField.setText("");
        quantityInputField.setText("");
        unitPriceInputField.setText("");
        idInputField.setBackground(Color.white);
        nameInputField.setBackground(Color.white);
        quantityInputField.setBackground(Color.white);
        unitPriceInputField.setBackground(Color.white);

    }//GEN-LAST:event_createBillBtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BillDetail;
    private javax.swing.JPanel PnlButton;
    private javax.swing.JPanel PnlTableProducts;
    private javax.swing.JButton addProductBtn;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton createBillBtn;
    private javax.swing.JTextField idInputField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JScrollPane listBillItem;
    private javax.swing.JTextField nameInputField;
    private javax.swing.JLabel nameItemLabel;
    private javax.swing.JPanel productEditInfo;
    private javax.swing.JTable productTable;
    private javax.swing.JTextField quantityInputField;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JButton saveBillBtn;
    private javax.swing.JButton saveProductBtn;
    private javax.swing.JTextField unitPriceInputField;
    private javax.swing.JLabel unitPriceItemLabel;
    // End of variables declaration//GEN-END:variables
}
