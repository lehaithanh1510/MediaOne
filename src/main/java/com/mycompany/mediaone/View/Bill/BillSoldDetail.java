package com.mycompany.mediaone.View.Bill;

import com.mycompany.mediaone.Model.BillModel.Bill;
import com.mycompany.mediaone.Model.BillModel.BillItem;
import com.mycompany.mediaone.View.HomePage;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BillSoldDetail extends javax.swing.JPanel {

    private HomePage homePage;
    private String typeInterface;
    private List<BillItem> listIn = new ArrayList<>();
    private List<BillItem> listOut = new ArrayList<>();
    private List<Bill> listBills = new ArrayList<>();
    private String[] columHeaders = new String[]{"ID", "Name", "Quantity", "Unit Price", "Amount"};

    public BillSoldDetail(HomePage homePage, String typeInterface) {
        initComponents();
        this.homePage = homePage;
    }

    private void initData() {
//        listIn.add(new BillItem("P01", "Titanic", 3, 100, 3 * 100));
//        listIn.add(new BillItem("P02", "Mozart", 5, 200, 5 * 200));
//
//        listOut.add(new BillItem("P_01", "1x Spider-Man: No Way Home (2021)", 1, 400, 1 * 400));

//        listCustomers.add(new Customer("Nguyen Van A", "0899999999", "Dai Co Viet, Hai Ba Trung, Ha Noi"));
//        listCustomers.add(new Customer("Nguyen Thi B", "0888888888", "Ha Noi"));
//        listBills.add(new Bill("#B01", 1326, "22:22:07 12/6/2022", "Nguyen Van A", "3x Titanic\n5x Mozart", "Sell"));
//        listBills.add(new Bill("#B02", 500, "21:20:07 12/6/2022", "Nguyen Thi B", "1x Spider-Man: No Way Home (2021)", "Input"));
    }

    private void initTable() {
        DefaultTableModel productTable;

        productTable = new DefaultTableModel();

        productTable.setColumnIdentifiers(columHeaders);

        listIn.forEach(item
                -> {
            productTable.addRow(new Object[]{item.getId(), item.getName(),
                item.getQuantity(), item.getUnitPrice(), item.getAmount()});
        }
        );
//        tblProducts.setModel(model);
    }

    private void updateTotalAmount() {
        try {
            float VAT = 0.02f;
            int sum = 0;
//            for (int i = 0; i < listIn.size(); i++) {
//                BillItem item = listIn.get(i);
//                sum += item.getAmount();
//            }
            txtTotalAmount.setText("" + sum);
            txtVATRate.setText("" + VAT);
            txtVATAmount.setText("" + (VAT * sum));
            txtGrandTotal.setText("" + (Float.parseFloat(txtTotalAmount.getText())
                    + Float.parseFloat(txtVATAmount.getText())));

            StringBuilder sb = new StringBuilder();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BillDetail = new javax.swing.JPanel();
        PnlCustomerInfo = new javax.swing.JPanel();
        txtCustomerofName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        PnlTableProducts = new javax.swing.JPanel();
        listBillItem = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        productEnterInfoPanel = new javax.swing.JPanel();
        PnlAmount = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtTotalAmount = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtVATRate = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtVATAmount = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtGrandTotal = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtInWords = new javax.swing.JTextField();
        productEditInfo = new javax.swing.JPanel();
        idLabel = new javax.swing.JLabel();
        quantityLabel = new javax.swing.JLabel();
        nameItemLabel = new javax.swing.JLabel();
        unitPriceItemLabel = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtUnitPrice = new javax.swing.JTextField();
        addProductBtn = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        PnlButton = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        txtEdit = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();

        BillDetail.setBackground(new java.awt.Color(0, 153, 153));
        BillDetail.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BILL SOLD DETAIL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel9.setText("Address");

        jLabel10.setText("Phone number");

        jLabel11.setText("Customer's name");

        javax.swing.GroupLayout PnlCustomerInfoLayout = new javax.swing.GroupLayout(PnlCustomerInfo);
        PnlCustomerInfo.setLayout(PnlCustomerInfoLayout);
        PnlCustomerInfoLayout.setHorizontalGroup(
            PnlCustomerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlCustomerInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlCustomerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(33, 33, 33)
                .addGroup(PnlCustomerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCustomerofName, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                    .addComponent(txtAddress)
                    .addComponent(txtPhoneNumber))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PnlCustomerInfoLayout.setVerticalGroup(
            PnlCustomerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlCustomerInfoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PnlCustomerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCustomerofName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlCustomerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlCustomerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(457, 457, 457))
        );

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

        productEnterInfoPanel.setLayout(new java.awt.CardLayout());

        PnlAmount.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N

        jLabel7.setText("Total amount: ");

        txtTotalAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalAmountActionPerformed(evt);
            }
        });

        jLabel8.setText("VAT rate:");

        jLabel12.setText("VAT amount:");

        jLabel13.setText("Grand total:");

        jLabel14.setText("In words:");

        javax.swing.GroupLayout PnlAmountLayout = new javax.swing.GroupLayout(PnlAmount);
        PnlAmount.setLayout(PnlAmountLayout);
        PnlAmountLayout.setHorizontalGroup(
            PnlAmountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlAmountLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(PnlAmountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlAmountLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlAmountLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(PnlAmountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PnlAmountLayout.createSequentialGroup()
                        .addComponent(txtVATRate, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)
                        .addGroup(PnlAmountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(PnlAmountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtVATAmount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                            .addComponent(txtGrandTotal, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTotalAmount)))
                    .addComponent(txtInWords))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        PnlAmountLayout.setVerticalGroup(
            PnlAmountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlAmountLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlAmountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PnlAmountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtVATRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtVATAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PnlAmountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PnlAmountLayout.createSequentialGroup()
                        .addGroup(PnlAmountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtGrandTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                    .addGroup(PnlAmountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtInWords, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        productEnterInfoPanel.add(PnlAmount, "card2");

        idLabel.setText("ID:");

        quantityLabel.setText("Quantity:");

        nameItemLabel.setText("Name:");

        unitPriceItemLabel.setText("Unit Price:");

        addProductBtn.setText("Add");
        addProductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProductBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout productEditInfoLayout = new javax.swing.GroupLayout(productEditInfo);
        productEditInfo.setLayout(productEditInfoLayout);
        productEditInfoLayout.setHorizontalGroup(
            productEditInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productEditInfoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(productEditInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(quantityLabel)
                    .addComponent(idLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(productEditInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                    .addComponent(txtID))
                .addGap(81, 81, 81)
                .addGroup(productEditInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameItemLabel)
                    .addComponent(unitPriceItemLabel))
                .addGap(36, 36, 36)
                .addGroup(productEditInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtName)
                    .addComponent(txtUnitPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productEditInfoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addProductBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        productEditInfoLayout.setVerticalGroup(
            productEditInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productEditInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(productEditInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel)
                    .addComponent(nameItemLabel)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(productEditInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantityLabel)
                    .addComponent(unitPriceItemLabel)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(addProductBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        productEnterInfoPanel.add(productEditInfo, "card4");

        javax.swing.GroupLayout PnlTableProductsLayout = new javax.swing.GroupLayout(PnlTableProducts);
        PnlTableProducts.setLayout(PnlTableProductsLayout);
        PnlTableProductsLayout.setHorizontalGroup(
            PnlTableProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlTableProductsLayout.createSequentialGroup()
                .addGroup(PnlTableProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlTableProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(listBillItem)
                        .addComponent(productEnterInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(162, 162, 162))
        );
        PnlTableProductsLayout.setVerticalGroup(
            PnlTableProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlTableProductsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listBillItem, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productEnterInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        txtEdit.setText("Edit");
        txtEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditActionPerformed(evt);
            }
        });

        btnNew.setText("Create");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlButtonLayout = new javax.swing.GroupLayout(PnlButton);
        PnlButton.setLayout(PnlButtonLayout);
        PnlButtonLayout.setHorizontalGroup(
            PnlButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PnlButtonLayout.setVerticalGroup(
            PnlButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlButtonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PnlButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(152, 152, 152))
        );

        javax.swing.GroupLayout BillDetailLayout = new javax.swing.GroupLayout(BillDetail);
        BillDetail.setLayout(BillDetailLayout);
        BillDetailLayout.setHorizontalGroup(
            BillDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BillDetailLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(BillDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(PnlCustomerInfo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PnlButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PnlTableProducts, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 697, Short.MAX_VALUE)))
        );
        BillDetailLayout.setVerticalGroup(
            BillDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BillDetailLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(PnlCustomerInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PnlTableProducts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PnlButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addGap(0, 589, Short.MAX_VALUE)
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

            if (row >= 0) {
                BillItem order = listIn.get(row);

                txtID.setText(order.getId());
                txtName.setText(order.getName());
                txtQuantity.setText("" + order.getQuantity());
                txtUnitPrice.setText("" + order.getUnitPrice());
                txtAmount.setText("" + Integer.parseInt(txtQuantity.getText()) * Integer.parseInt(txtUnitPrice.getText()));
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_productTableMouseClicked

    private void txtTotalAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalAmountActionPerformed

    private void addProductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProductBtnActionPerformed
        try {
            StringBuilder errors = new StringBuilder();
            if (txtID.getText().equals("")) {
                errors.append("ID must be entered\n");
                txtID.setBackground(Color.red);
            } else {
                txtID.setBackground(Color.white);
            }
            if (txtName.getText().equals("")) {
                errors.append("Name must be entered\n");
                txtName.setBackground(Color.red);
            } else {
                txtName.setBackground(Color.white);
            }
            if (txtQuantity.getText().equals("")) {
                errors.append("Quantity must be entered\n");
                txtQuantity.setBackground(Color.red);
            } else {
                txtQuantity.setBackground(Color.white);
            }
            if (txtUnitPrice.getText().equals("")) {
                errors.append("Unit price must be entered\n");
                txtUnitPrice.setBackground(Color.red);
            } else {
                txtUnitPrice.setBackground(Color.white);
            }
            if (txtAmount.getText().equals("")) {
                errors.append("Amount must be entered\n");
                txtAmount.setBackground(Color.red);
            } else {
                txtAmount.setBackground(Color.white);
            }
            //            if(!errors.isEmpty()){
            //                JOptionPane.showMessageDialog(this, errors.toString());
            //                return;
            //            }

            BillItem billItem = new BillItem();
            billItem.setId(txtID.getText());
            billItem.setName(txtName.getText());
            billItem.setQuantity(Integer.parseInt(txtQuantity.getText()));
            billItem.setUnitPrice(Double.parseDouble(txtUnitPrice.getText()));
            billItem.setAmount(Double.parseDouble(txtAmount.getText()));

            boolean isExisted = false;
            for (int i = 0; i < listIn.size(); i++) {
                BillItem billItem1 = listIn.get(i);
                if (billItem1.getId().equals(billItem.getId())) {
                    listIn.set(i, billItem);
                    isExisted = true;
                    break;

                }
            }
            if (!isExisted) {
                listIn.add(billItem);
            }
            model.setRowCount(0);
            listIn.forEach(item -> {
                model.addRow(new Object[]{item.getId(), item.getName(),
                    item.getQuantity(), item.getUnitPrice(), item.getAmount()});
            });

            model.fireTableDataChanged();

            JOptionPane.showMessageDialog(this, "New product saved or updated");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_addProductBtnActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            if (txtID.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Nothing is to deleted");
                return;
            }
            if (JOptionPane.showConfirmDialog(this, "Do you want to delete the product "
                    + txtID.getText(), "Confirmation", JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION) {
                return;
            }
            boolean isDeleted = false;
            for (int i = 0; i < listIn.size(); i++) {
                BillItem item = listIn.get(i);
                if (item.getId().equals(txtID.getText())) {
                    listIn.remove(i);
                    isDeleted = true;
                    break;
                }
            }
            if (isDeleted) {
                JOptionPane.showMessageDialog(this, "The product deleted");
                initTable();
                txtID.setText("");
                txtName.setText("");
                txtAmount.setText("");
                txtQuantity.setText("");
                txtUnitPrice.setText("");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditActionPerformed
        CardLayout layout = (CardLayout) productEnterInfoPanel.getLayout();

        layout.last(productEnterInfoPanel);

        txtID.setBackground(Color.white);
        txtName.setBackground(Color.white);
        txtQuantity.setBackground(Color.white);
        txtUnitPrice.setBackground(Color.white);
        txtAmount.setBackground(Color.white);
    }//GEN-LAST:event_txtEditActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        CardLayout layout = (CardLayout) productEnterInfoPanel.getLayout();

        layout.last(productEnterInfoPanel);
        txtID.setText("");
        txtName.setText("");
        txtAmount.setText("");
        txtQuantity.setText("");
        txtUnitPrice.setText("");

        txtID.setBackground(Color.white);
        txtName.setBackground(Color.white);
        txtQuantity.setBackground(Color.white);
        txtUnitPrice.setBackground(Color.white);
        txtAmount.setBackground(Color.white);

        txtID.requestFocus();

    }//GEN-LAST:event_btnNewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BillDetail;
    private javax.swing.JPanel PnlAmount;
    private javax.swing.JPanel PnlButton;
    private javax.swing.JPanel PnlCustomerInfo;
    private javax.swing.JPanel PnlTableProducts;
    private javax.swing.JButton addProductBtn;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane listBillItem;
    private javax.swing.JLabel nameItemLabel;
    private javax.swing.JPanel productEditInfo;
    private javax.swing.JPanel productEnterInfoPanel;
    private javax.swing.JTable productTable;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCustomerofName;
    private javax.swing.JButton txtEdit;
    private javax.swing.JTextField txtGrandTotal;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtInWords;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtTotalAmount;
    private javax.swing.JTextField txtUnitPrice;
    private javax.swing.JTextField txtVATAmount;
    private javax.swing.JTextField txtVATRate;
    private javax.swing.JLabel unitPriceItemLabel;
    // End of variables declaration//GEN-END:variables
}