package com.mycompany.mediaone.View.Bill;

import com.mycompany.SharedType.WrapLayout;
import com.mycompany.mediaone.Model.Bill;
import com.mycompany.mediaone.Model.BillItem;
import com.mycompany.mediaone.Model.Customer;
import com.mycompany.mediaone.View.HomePage;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.CaretListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MY LAPTOP
 */
public class BillInterface extends javax.swing.JPanel {

    private HomePage homePage;
    //Testing data
    private List<BillItem> listIn = new ArrayList<>();
    private List<BillItem> listOut = new ArrayList<>();
    private List<Customer> listCustomers = new ArrayList<>();
    private List<Bill> listBills = new ArrayList<>();
    private DefaultTableModel model;
    private String[] columHeaders = new String[]{"ID", "Name", "Quantity", "Unit Price", "Amount"};

    /**
     * Creates new form OrderInterface
     */
    public BillInterface(HomePage homePage) {
        initComponents();
        this.billListPanel.setLayout(new WrapLayout());

        initData();
        initTable();
        updateTotalAmount();
    }

    private void initData() {
        listIn.add(new BillItem("P01", "Titanic", 3, 100, 3 * 100));
        listIn.add(new BillItem("P02", "Mozart", 5, 200, 5 * 200));

        listOut.add(new BillItem("P_01", "1x Spider-Man: No Way Home (2021)", 1, 400, 1 * 400));

        listCustomers.add(new Customer("Nguyen Van A", "0899999999", "Dai Co Viet, Hai Ba Trung, Ha Noi"));
        listCustomers.add(new Customer("Nguyen Thi B", "0888888888", "Ha Noi"));

        listBills.add(new Bill("#B01", 1326, "22:22:07 12/6/2022", "Nguyen Van A", "3x Titanic\n5x Mozart", "Sell"));
        listBills.add(new Bill("#B02", 500, "21:20:07 12/6/2022", "Nguyen Thi B", "1x Spider-Man: No Way Home (2021)", "Input"));

    }

    private void initTable() {
        model = new DefaultTableModel();
        model.setColumnIdentifiers(columHeaders);

        listIn.forEach(item -> {
            model.addRow(new Object[]{item.getId(), item.getName(),
                item.getQuantity(), item.getUnitPrice(), item.getAmount()});
        });
        tblProducts.setModel(model);
    }

    private void updateTotalAmount() {
        try {
            float VAT = 0.02f;
            int sum = 0;
            for (int i = 0; i < listIn.size(); i++) {
                BillItem item = listIn.get(i);
                sum += item.getAmount();
            }
            txtTotalAmount.setText("" + sum);
            txtVATRate.setText("" + VAT);
            txtVATAmount.setText("" + (VAT * sum));
            txtGrandTotal.setText("" + (Float.parseFloat(txtTotalAmount.getText())
                    + Float.parseFloat(txtVATAmount.getText())));

            StringBuilder sb = new StringBuilder();
            // ghi ra chữ
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BillInterfacePanel = new javax.swing.JPanel();
        filterBillBtn = new javax.swing.JComboBox<>();
        billList = new javax.swing.JScrollPane();
        billListPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setLayout(new java.awt.CardLayout());

        BillInterfacePanel.setBackground(new java.awt.Color(0, 153, 153));
        BillInterfacePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BILLS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        filterBillBtn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Input Bill", "Sell Bill", "All" }));
        filterBillBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        billList.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        billList.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 698, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        billListPanel.add(jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        billListPanel.add(jPanel2);

        billList.setViewportView(billListPanel);

        javax.swing.GroupLayout BillInterfacePanelLayout = new javax.swing.GroupLayout(BillInterfacePanel);
        BillInterfacePanel.setLayout(BillInterfacePanelLayout);
        BillInterfacePanelLayout.setHorizontalGroup(
            BillInterfacePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BillInterfacePanelLayout.createSequentialGroup()
                .addComponent(filterBillBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(BillInterfacePanelLayout.createSequentialGroup()
                .addComponent(billList, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                .addContainerGap())
        );
        BillInterfacePanelLayout.setVerticalGroup(
            BillInterfacePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BillInterfacePanelLayout.createSequentialGroup()
                .addComponent(filterBillBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(billList)
                .addContainerGap())
        );

        add(BillInterfacePanel, "card3");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BillInterfacePanel;
    private javax.swing.JScrollPane billList;
    private javax.swing.JPanel billListPanel;
    private javax.swing.JComboBox<String> filterBillBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
