package mediaone.View.Profit;

import mediaone.Model.BillModel.Bill;
import mediaone.Model.BillModel.BillItem;
import mediaone.Model.BillModel.Customer;
import mediaone.View.HomePage;
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
        btnloadBill = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));

        timeForm.setForeground(new java.awt.Color(255, 255, 255));
        timeForm.setText("Time From");

        to.setForeground(new java.awt.Color(255, 255, 255));
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

        proFit.setForeground(new java.awt.Color(255, 255, 255));
        proFit.setText("Profit");

        totalSale.setForeground(new java.awt.Color(255, 255, 255));
        totalSale.setText("Total Sale");

        profittext.setViewportView(totalProfit);

        totalCost.setForeground(new java.awt.Color(255, 255, 255));
        totalCost.setText("Total Cost");

        unitvnd.setForeground(new java.awt.Color(255, 255, 255));
        unitvnd.setText("VND");

        saletables.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        saletables.setForeground(new java.awt.Color(255, 255, 255));
        saletables.setText("Sales Table");

        coststable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        coststable.setForeground(new java.awt.Color(255, 255, 255));
        coststable.setText("Costs Table");

        totalCostLabel.setForeground(new java.awt.Color(255, 0, 0));
        totalCostLabel.setText("Tiền mua hàng");

        totalSaleLabel.setForeground(new java.awt.Color(0, 255, 51));
        totalSaleLabel.setText("Tiền bán hàng");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("VND");

        btnloadBill.setText("LOADBILL");
        btnloadBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnloadBillMouseClicked(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("VND");

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalCostLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalSaleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                        .addComponent(proFit)
                        .addGap(18, 18, 18)
                        .addComponent(profittext, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(unitvnd)
                        .addContainerGap(56, Short.MAX_VALUE))
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
                    .addComponent(saleTable, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(coststable))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(saletables)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(coststable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(costsTable, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saletables)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saleTable, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(totalCost))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(totalCostLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3)
                                        .addComponent(proFit))
                                    .addComponent(profittext, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(totalSaleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(totalSale)
                                    .addComponent(jLabel5)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(unitvnd)))
                .addGap(11, 11, 11))
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
                totalProfit.setText(Double.toString(sumSale - sumCost));
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
    private javax.swing.JLabel jLabel5;
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
