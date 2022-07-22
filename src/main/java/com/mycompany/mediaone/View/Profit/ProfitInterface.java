package com.mycompany.mediaone.View.Profit;

import com.mycompany.mediaone.Model.BillModel.Bill;
import com.mycompany.mediaone.Model.BillModel.BillItem;
import com.mycompany.mediaone.Model.BillModel.Customer;
import com.mycompany.mediaone.View.HomePage;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ProfitInterface extends javax.swing.JPanel {

    private List<Bill> listSoldBill = new ArrayList<>();
    private List<Bill> listBuyBill = new ArrayList<>();
    private Customer customer;
    private List<BillItem> listItems = new ArrayList<>();
    private DefaultTableModel model;
    private final HomePage homePage;
    private String[] costcolumHeaders = new String[]{"Ordinal Number", "ID", "Name", "Time", "Price"};
    private String[] salecolumHeaders = new String[]{"Ordinal Number", "ID", "Name", "Time", "Price"};
    private Object total;

    public ProfitInterface(HomePage homePage) {
        initComponents();
        this.homePage = homePage;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        timeForm = new javax.swing.JLabel();
        to = new javax.swing.JLabel();
        timeFrom = new com.toedter.calendar.JDateChooser();
        timeTo = new com.toedter.calendar.JDateChooser();
        costsTable = new javax.swing.JScrollPane();
        CostsTable = new javax.swing.JTable();
        saleTable = new javax.swing.JScrollPane();
        SalesTable = new javax.swing.JTable();
        proFit = new javax.swing.JLabel();
        totalSale = new javax.swing.JLabel();
        profittext = new javax.swing.JScrollPane();
        totalProfit = new javax.swing.JTextPane();
        totalCost = new javax.swing.JLabel();
        unitvnd = new javax.swing.JLabel();
        saletables = new javax.swing.JLabel();
        coststable = new javax.swing.JLabel();
        totalCostLabel = new javax.swing.JLabel();
        totalSaleLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnloadBill = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        timeForm.setText("Time From");

        to.setText(" To");

        CostsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Number", "ID", "Time", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        costsTable.setViewportView(CostsTable);

        SalesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Number", "ID", "Time", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        saleTable.setViewportView(SalesTable);

        proFit.setText("Profit");

        totalSale.setText("Total Sale");

        profittext.setViewportView(totalProfit);

        totalCost.setText("Total Cost");

        unitvnd.setText("VND");

        saletables.setText("Sales Table");

        coststable.setText("Costs Table");

        totalCostLabel.setText("Tiền mua hàng");

        totalSaleLabel.setText("Tiền bán hàng");

        jLabel3.setText("VND");

        jLabel4.setText("VND");

        btnloadBill.setText("LOADBILL");
        btnloadBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnloadBillMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(totalSale)
                            .addComponent(totalCost))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(totalCostLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(totalSaleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(proFit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(profittext, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(unitvnd)
                                .addGap(80, 80, 80))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(440, 440, 440))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(costsTable, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(timeForm)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(timeFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(226, 226, 226)
                                        .addComponent(to)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(timeTo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(24, 24, 24)
                                .addComponent(btnloadBill, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(saleTable, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(301, 301, 301)
                .addComponent(coststable))
            .addGroup(layout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(saletables))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(timeForm)
                        .addComponent(timeFrom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(to)
                        .addComponent(timeTo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnloadBill))
                .addGap(18, 18, 18)
                .addComponent(coststable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(costsTable, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saletables)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saleTable, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(profittext, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(totalCost))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalCostLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(proFit))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(totalSaleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalSale)))
                    .addComponent(unitvnd))
                .addContainerGap(11, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnloadBillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnloadBillMouseClicked
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd");
            SimpleDateFormat formatter1 = new SimpleDateFormat("MM");
            SimpleDateFormat formatter2 = new SimpleDateFormat("yyyy");
            int dateFrom = Integer.parseInt(formatter.format(timeFrom.getDate()));
            int dateFrom1 = Integer.parseInt(formatter1.format(timeFrom.getDate()));
            int dateFrom2 = Integer.parseInt(formatter2.format(timeFrom.getDate()));

            int dateTo = Integer.parseInt(formatter.format(timeTo.getDate()));
            int dateTo1 = Integer.parseInt(formatter1.format(timeTo.getDate()));
            int dateTo2 = Integer.parseInt(formatter2.format(timeTo.getDate()));

            listBuyBill = this.homePage.billInterface.listBills.stream()
                    .filter(bill -> "buy".equals(bill.getType()))
                    .collect(Collectors.toList());

            listSoldBill = this.homePage.billInterface.listBills.stream()
                    .filter(bill -> "sold".equals(bill.getType()))
                    .collect(Collectors.toList());

            if ((dateFrom2 <= dateTo2) && (dateFrom1 <= dateTo1)
                    && (dateFrom <= dateTo)) {
                int sumCost = 0;
                int sumSale = 0;
                model = new DefaultTableModel();

                model.setColumnIdentifiers(costcolumHeaders);

                for (int i = 0; i < listBuyBill.size(); i++) {
                    Bill bill = listBuyBill.get(i);
                    int dateBuyBill = Integer.parseInt(formatter.format(bill.getCreatedAt()));
                    int dateBuyBill1 = Integer.parseInt(formatter1.format(bill.getCreatedAt()));
                    int dateBuyBill2 = Integer.parseInt(formatter2.format(bill.getCreatedAt()));

                    if ((dateBuyBill2 >= dateFrom2) && (dateBuyBill2 <= dateTo2)
                            && (dateBuyBill1 >= dateFrom1) && (dateBuyBill1 <= dateTo1)
                            && (dateBuyBill >= dateFrom) && (dateBuyBill <= dateTo)) {

                        model.addRow(new Object[]{model.getRowCount(), bill.getId(), bill.getName(),
                            bill.getCreatedAt(), bill.getTotal()});

                        sumCost += bill.getTotal();
                    }
                }
                CostsTable.setModel(model);

                model = new DefaultTableModel();

                model.setColumnIdentifiers(salecolumHeaders);

                for (int i = 0; i < listSoldBill.size(); i++) {
                    Bill bill = listSoldBill.get(i);
                    int dateSoldBill = Integer.parseInt(formatter.format(bill.getCreatedAt()));
                    int dateSoldBill1 = Integer.parseInt(formatter1.format(bill.getCreatedAt()));
                    int dateSoldBill2 = Integer.parseInt(formatter2.format(bill.getCreatedAt()));

                    if ((dateSoldBill2 >= dateFrom2) && (dateSoldBill2 <= dateTo2)
                            && (dateSoldBill1 >= dateFrom1) && (dateSoldBill1 <= dateTo1)
                            && (dateSoldBill >= dateFrom) && (dateSoldBill <= dateTo)) {

                        model.addRow(new Object[]{model.getRowCount(), bill.getId(), bill.getName(),
                            bill.getCreatedAt(), bill.getTotal()});

                        sumSale += bill.getTotal();
                    }
                }
                SalesTable.setModel(model);

                totalCostLabel.setText(Double.toString(sumCost));
                totalSaleLabel.setText(Double.toString(sumSale));
                totalProfit.setText(Double.toString(sumCost + sumSale));
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }


    }//GEN-LAST:event_btnloadBillMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CostsTable;
    private javax.swing.JTable SalesTable;
    private javax.swing.JButton btnloadBill;
    private javax.swing.JScrollPane costsTable;
    private javax.swing.JLabel coststable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel proFit;
    private javax.swing.JScrollPane profittext;
    private javax.swing.JScrollPane saleTable;
    private javax.swing.JLabel saletables;
    private javax.swing.JLabel timeForm;
    private com.toedter.calendar.JDateChooser timeFrom;
    private com.toedter.calendar.JDateChooser timeTo;
    private javax.swing.JLabel to;
    private javax.swing.JLabel totalCost;
    private javax.swing.JLabel totalCostLabel;
    private javax.swing.JTextPane totalProfit;
    private javax.swing.JLabel totalSale;
    private javax.swing.JLabel totalSaleLabel;
    private javax.swing.JLabel unitvnd;
    // End of variables declaration//GEN-END:variables

}
