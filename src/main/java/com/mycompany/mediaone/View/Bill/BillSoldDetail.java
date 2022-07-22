package com.mycompany.mediaone.View.Bill;

import com.mycompany.mediaone.Model.BillModel.Bill;
import com.mycompany.mediaone.Model.BillModel.BillItem;
import com.mycompany.mediaone.Model.BillModel.BillSold;
import com.mycompany.mediaone.Model.BillModel.Customer;
import com.mycompany.mediaone.View.Product.ProductInterface;
import com.mycompany.mediaone.Model.Product;
import com.mycompany.mediaone.View.Bill.BillInterface;
import com.mycompany.mediaone.View.HomePage;
import com.mycompany.mediaone.Component.BillComponent.BillCard;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Menu;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.html.CSS;

public class BillSoldDetail extends javax.swing.JPanel {

    private HomePage homePage;
    private String typeInterface;
    private List<BillItem> listItems = new ArrayList<>();
    private List<Bill> listBills = new ArrayList<>();
    private DefaultTableModel model;
    private String[] columHeaders = new String[]{"ID", "Name", "Quantity", "Unit Price"};
    private Bill BillInfo;
    private int choosenRow;
    private BillItem chooseItem;

    public BillSoldDetail(HomePage homePage, String typeInterface) {
        initComponents();
        this.homePage = homePage;
        initData();
        initTable();
        if (chooseItem == null) {
            btnDelete.setEnabled(false);
        } else {
            addProductBtn.setEnabled(false);
        }
        if (typeInterface == "add") {
            saveBillBtn.setEnabled(false);
        } else {
            createBillBtn.setEnabled(false);
        }
    }

    private void initData() {
        listItems.add(new BillItem("P01", "Titanic", 3, 100));
        listItems.add(new BillItem("P02", "Mozart", 5, 200));
    }

    private void initTable() {
        model = new DefaultTableModel();
        model.setColumnIdentifiers(columHeaders);

        listItems.forEach(item -> {
            model.addRow(new Object[]{item.getId(), item.getName(),
                item.getQuantity(), item.getUnitPrice()});
        });
        productTable.setModel(model);

    }

    public void setBillInfo(BillSold bill) {
        BillInfo = bill;
        listItems = bill.getItems();
        nameBillTextField.setText(bill.getName());
        dateBillTextField.setDate(bill.getCreatedAt());
        txtCustomerofName.setText(bill.getCustomer().getName());
        txtAddress.setText(bill.getCustomer().getName());
        txtPhoneNumber.setText(bill.getCustomer().getPhoneNumber());

        initTable();
    }

    private double calculateTotalPriceOfBill() {
        double totalPrice = 0;
        for (int i = 0; i < listItems.size(); i++) {
            totalPrice += listItems.get(i).getAmount();
        }
        System.out.println(totalPrice);
        return totalPrice;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BillDetail = new javax.swing.JPanel();
        PnlCustomerInfo = new javax.swing.JPanel();
        txtCustomerofName = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        phoneNumberLabel = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        customerLabel = new javax.swing.JLabel();
        nameBillLabel = new javax.swing.JLabel();
        nameBillLabel1 = new javax.swing.JLabel();
        nameBillTextField = new javax.swing.JTextField();
        dateBillTextField = new com.toedter.calendar.JDateChooser();
        PnlTableProducts = new javax.swing.JPanel();
        listBillItem = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        productEnterInfoPanel = new javax.swing.JPanel();
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
        btnSearch = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
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
        PnlButton = new javax.swing.JPanel();
        saveBillBtn = new javax.swing.JButton();
        createBillBtn = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        BillDetail.setBackground(new java.awt.Color(0, 153, 153));
        BillDetail.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BILL SOLD DETAIL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        addressLabel.setText("Address");

        phoneNumberLabel.setText("Phone number");

        customerLabel.setText("Customer's name");

        nameBillLabel.setText("Bill Name:");

        nameBillLabel1.setText("Date:");

        dateBillTextField.setDateFormatString("dd-MM-yyyy");

        javax.swing.GroupLayout PnlCustomerInfoLayout = new javax.swing.GroupLayout(PnlCustomerInfo);
        PnlCustomerInfo.setLayout(PnlCustomerInfoLayout);
        PnlCustomerInfoLayout.setHorizontalGroup(
            PnlCustomerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlCustomerInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlCustomerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addressLabel)
                    .addComponent(phoneNumberLabel)
                    .addComponent(customerLabel))
                .addGap(33, 33, 33)
                .addGroup(PnlCustomerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCustomerofName, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                    .addComponent(txtAddress)
                    .addComponent(txtPhoneNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PnlCustomerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameBillLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nameBillLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PnlCustomerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameBillTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateBillTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        PnlCustomerInfoLayout.setVerticalGroup(
            PnlCustomerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlCustomerInfoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PnlCustomerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCustomerofName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerLabel)
                    .addComponent(nameBillLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameBillTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PnlCustomerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlCustomerInfoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PnlCustomerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addressLabel)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PnlCustomerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phoneNumberLabel)
                            .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameBillLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlCustomerInfoLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(dateBillTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(451, 451, 451))
        );

        nameBillLabel.getAccessibleContext().setAccessibleName("");

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

        idLabel.setText("ID:");

        quantityLabel.setText("Quantity:");

        nameItemLabel.setText("Name:");

        unitPriceItemLabel.setText("Unit Price:");

        addProductBtn.setText("Add Item");
        addProductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProductBtnActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout productEditInfoLayout = new javax.swing.GroupLayout(productEditInfo);
        productEditInfo.setLayout(productEditInfoLayout);
        productEditInfoLayout.setHorizontalGroup(
            productEditInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productEditInfoLayout.createSequentialGroup()
                .addGroup(productEditInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(productEditInfoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addProductBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, productEditInfoLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(productEditInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quantityLabel)
                            .addComponent(idLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(productEditInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                            .addComponent(txtID))
                        .addGap(18, 18, 18)
                        .addGroup(productEditInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameItemLabel)
                            .addComponent(unitPriceItemLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(productEditInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtName)
                            .addComponent(txtUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        productEditInfoLayout.setVerticalGroup(
            productEditInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productEditInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(productEditInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel)
                    .addComponent(nameItemLabel)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(36, 36, 36)
                .addGroup(productEditInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantityLabel)
                    .addComponent(unitPriceItemLabel)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(productEditInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addProductBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        productEnterInfoPanel.add(productEditInfo, "card4");

        PnlAmount.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N

        jLabel7.setText("Total amount: ");

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

        javax.swing.GroupLayout PnlTableProductsLayout = new javax.swing.GroupLayout(PnlTableProducts);
        PnlTableProducts.setLayout(PnlTableProductsLayout);
        PnlTableProductsLayout.setHorizontalGroup(
            PnlTableProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlTableProductsLayout.createSequentialGroup()
                .addGroup(PnlTableProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(listBillItem)
                    .addComponent(productEnterInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(162, 162, 162))
        );
        PnlTableProductsLayout.setVerticalGroup(
            PnlTableProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlTableProductsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listBillItem, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(productEnterInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        saveBillBtn.setText(" Save");
        saveBillBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveBillBtnMouseClicked(evt);
            }
        });

        createBillBtn.setBackground(new java.awt.Color(0, 255, 102));
        createBillBtn.setText("Create Bill");
        createBillBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createBillBtnMouseClicked(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(255, 0, 0));
        btnBack.setText("Back");
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PnlButtonLayout = new javax.swing.GroupLayout(PnlButton);
        PnlButton.setLayout(PnlButtonLayout);
        PnlButtonLayout.setHorizontalGroup(
            PnlButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(createBillBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(saveBillBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PnlButtonLayout.setVerticalGroup(
            PnlButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlButtonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PnlButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBillBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createBillBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addGap(0, 1, Short.MAX_VALUE)
                    .addComponent(BillDetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 2, Short.MAX_VALUE)))
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
            choosenRow = productTable.getSelectedRow();

            if (choosenRow >= 0) {
                chooseItem = listItems.get(choosenRow);
                btnDelete.setEnabled(true);
                txtID.setText(chooseItem.getId());
                txtName.setText(chooseItem.getName());
                txtQuantity.setText("" + chooseItem.getQuantity());
                txtUnitPrice.setText("" + chooseItem.getUnitPrice());
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_productTableMouseClicked

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
            if (!errors.isEmpty()) {
                JOptionPane.showMessageDialog(this, errors.toString());
                return;
            }
            BillItem billItem = new BillItem();
            billItem.setId(txtID.getText());
            billItem.setName(txtName.getText());
            billItem.setQuantity(Integer.parseInt(txtQuantity.getText()));
            billItem.setUnitPrice(Double.parseDouble(txtUnitPrice.getText()));

            boolean isExisted = false;
            for (int i = 0; i < listItems.size(); i++) {
                BillItem billItem1 = listItems.get(i);
                if (billItem1.getId().equals(billItem.getId())) {
                    listItems.set(i, billItem);
                    isExisted = true;
                    break;

                }
            }
            if (!isExisted) {
                listItems.add(billItem);
            }
            model.setRowCount(0);
            listItems.forEach(item -> {
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
            for (int i = 0; i < listItems.size(); i++) {
                BillItem item = listItems.get(i);
                if (item.getId().equals(txtID.getText())) {
                    listItems.remove(i);
                    isDeleted = true;
                    break;
                }
            }
            if (isDeleted) {
                JOptionPane.showMessageDialog(this, "The product deleted");
                initTable();
                txtID.setText("");
                txtName.setText("");
                txtQuantity.setText("");
                txtUnitPrice.setText("");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        try {
            ProductInterface productItem = new ProductInterface(homePage);
            for (int i = 0; i < productItem.productListItems.size(); i++) {
                Product product = productItem.productListItems.get(i);
                if (txtName.getText().equals(product.getName())) {
                    txtID.setText(product.getId());
                    txtUnitPrice.setText("" + product.getSellPrice());
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        this.homePage.menuClicked(this.homePage.billInterface);
    }//GEN-LAST:event_btnBackMouseClicked

    private void createBillBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createBillBtnMouseClicked
        try {
            StringBuilder errors = new StringBuilder();

            if (txtCustomerofName.getText().equals("")) {
                errors.append("Customer of name must be entered\n");
                txtCustomerofName.setBackground(Color.red);
            } else {
                txtCustomerofName.setBackground(Color.white);
            }
            if (txtAddress.getText().equals("")) {
                errors.append("Address must be entered\n");
                txtAddress.setBackground(Color.red);
            } else {
                txtAddress.setBackground(Color.white);
            }
            if (txtPhoneNumber.getText().equals("")) {
                errors.append("Phone number must be entered\n");
                txtPhoneNumber.setBackground(Color.red);
            } else {
                txtPhoneNumber.setBackground(Color.white);
            }
            if (nameBillTextField.getText().equals("")) {
                errors.append("Bill of name must be entered\n");
                nameBillTextField.setBackground(Color.red);
            } else {
                nameBillTextField.setBackground(Color.white);
            }
            if (dateBillTextField.getDateFormatString().equals("")) {
                errors.append("Date must be entered\n");
                dateBillTextField.setBackground(Color.red);
            } else {
                dateBillTextField.setBackground(Color.white);
            }
            BillItem item = listItems.get(0);
                if (item.getId().equals("")) {
                errors.append("Product must be entered\n");
            }
            
            if (!errors.isEmpty()) {
                JOptionPane.showMessageDialog(this, errors.toString());
                return;
            }
            BillSold soldBill = new BillSold();
            soldBill.setId((UUID.randomUUID().toString()));
            soldBill.setName("abc");
            soldBill.setCreatedAt(dateBillTextField.getDate());
            soldBill.setType("sold");
            soldBill.setItems(listItems);
            soldBill.setName(this.nameBillTextField.getText());
            soldBill.setCustomer(new Customer(txtCustomerofName.getText(), txtAddress.getText(), txtPhoneNumber.getText()));
            JOptionPane.showMessageDialog(this, "New sold bil created");
            this.homePage.billInterface.listBills.add(soldBill);
            this.homePage.billInterface.addNewBillToListPanel(soldBill);
            this.homePage.menuClicked(this.homePage.billInterface);
            txtCustomerofName.setText("");
            txtAddress.setText("");
            txtPhoneNumber.setText("");
            nameBillTextField.setText("");
            dateBillTextField.setDate(null);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_createBillBtnMouseClicked

    private void saveBillBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveBillBtnMouseClicked
        BillSold editBillSold = new BillSold();
        editBillSold.setId(this.BillInfo.getId());
        editBillSold.setItems(listItems);
        editBillSold.setTotal(calculateTotalPriceOfBill());
        editBillSold.setCreatedAt(dateBillTextField.getDate());
        editBillSold.setType("sold");
        editBillSold.setName(this.nameBillTextField.getText());
        int indexProduct = this.homePage.billInterface.listBills.indexOf(this.BillInfo);

        this.homePage.billInterface.listBills.set(indexProduct, editBillSold);

        this.homePage.billInterface.reRenderBilltListPanel(this.homePage.billInterface.listBills);
        this.homePage.menuClicked(homePage.billInterface);
    }//GEN-LAST:event_saveBillBtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BillDetail;
    private javax.swing.JPanel PnlAmount;
    private javax.swing.JPanel PnlButton;
    private javax.swing.JPanel PnlCustomerInfo;
    private javax.swing.JPanel PnlTableProducts;
    private javax.swing.JButton addProductBtn;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton createBillBtn;
    private javax.swing.JLabel customerLabel;
    private com.toedter.calendar.JDateChooser dateBillTextField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane listBillItem;
    private javax.swing.JLabel nameBillLabel;
    private javax.swing.JLabel nameBillLabel1;
    private javax.swing.JTextField nameBillTextField;
    private javax.swing.JLabel nameItemLabel;
    private javax.swing.JLabel phoneNumberLabel;
    private javax.swing.JPanel productEditInfo;
    private javax.swing.JPanel productEnterInfoPanel;
    private javax.swing.JTable productTable;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JButton saveBillBtn;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCustomerofName;
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
