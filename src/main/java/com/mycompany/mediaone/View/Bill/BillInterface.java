package com.mycompany.mediaone.View.Bill;

import com.mycompany.SharedType.WrapLayout;
import com.mycompany.mediaone.Component.BillComponent.BillCard;
import com.mycompany.mediaone.Model.BillModel.Bill;
import com.mycompany.mediaone.Util.FileUtil;
import com.mycompany.mediaone.View.HomePage;
import com.mycompany.mediaone.View.Bill.BillSoldDetail;
import java.io.IOException;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BillInterface extends javax.swing.JPanel {

    private HomePage homePage;
    public List<Bill> listBills = new ArrayList<>();
    private FileUtil<Bill> billFileUtil = new FileUtil<>();

    public BillInterface(HomePage homePage) {
        initComponents();
        this.billListPanel.setLayout(new WrapLayout());
        this.homePage = homePage;


        try {
            this.listBills = this.billFileUtil.readFile("bill");

            System.out.println(this.billFileUtil.readFile("bill"));

            for (Bill bill : listBills) {
                this.billListPanel.add(new BillCard(bill, this.homePage));
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Class object not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        }

    }

    public void addNewBillToListPanel(Bill bill) {
        this.billListPanel.add(new BillCard(bill, this.homePage));
    }
    
    public void reRenderBilltListPanel(List<Bill> curentRenderBillList) {
        this.billListPanel.removeAll();
        billListPanel.revalidate();
        billListPanel.repaint();
        for (Bill currentBill : curentRenderBillList) {
            this.addNewBillToListPanel(currentBill);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BillInterfacePanel = new javax.swing.JPanel();
        navBarPanel = new javax.swing.JPanel();
        filterBillBtn = new javax.swing.JComboBox<>();
        addBuyBillBtn = new javax.swing.JButton();
        addSoldBillBtn = new javax.swing.JButton();
        billListScrollPane = new javax.swing.JScrollPane();
        billListPanel = new javax.swing.JPanel();

        BillInterfacePanel.setBackground(new java.awt.Color(0, 153, 153));
        BillInterfacePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BILLS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        BillInterfacePanel.setPreferredSize(new java.awt.Dimension(689, 546));

        filterBillBtn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Input Bill", "Sell Bill", "All" }));
        filterBillBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        filterBillBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterBillBtnActionPerformed(evt);
            }
        });

        addBuyBillBtn.setBackground(new java.awt.Color(0, 255, 0));
        addBuyBillBtn.setText("New Buy Bill");
        addBuyBillBtn.setMargin(new java.awt.Insets(5, 14, 5, 14));
        addBuyBillBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBuyBillBtnMouseClicked(evt);
            }
        });

        addSoldBillBtn.setBackground(new java.awt.Color(0, 255, 0));
        addSoldBillBtn.setText("New Sold Bill");
        addSoldBillBtn.setMargin(new java.awt.Insets(5, 14, 5, 14));
        addSoldBillBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addSoldBillBtnMouseClicked(evt);
            }
        });
        addSoldBillBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSoldBillBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout navBarPanelLayout = new javax.swing.GroupLayout(navBarPanel);
        navBarPanel.setLayout(navBarPanelLayout);
        navBarPanelLayout.setHorizontalGroup(
            navBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navBarPanelLayout.createSequentialGroup()
                .addComponent(filterBillBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addSoldBillBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addBuyBillBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        navBarPanelLayout.setVerticalGroup(
            navBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(addBuyBillBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addSoldBillBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(filterBillBtn, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        billListScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        billListScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        billListPanel.setPreferredSize(new java.awt.Dimension(689, 566));
        billListScrollPane.setViewportView(billListPanel);

        javax.swing.GroupLayout BillInterfacePanelLayout = new javax.swing.GroupLayout(BillInterfacePanel);
        BillInterfacePanel.setLayout(BillInterfacePanelLayout);
        BillInterfacePanelLayout.setHorizontalGroup(
            BillInterfacePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BillInterfacePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BillInterfacePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(billListScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
                    .addComponent(navBarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        BillInterfacePanelLayout.setVerticalGroup(
            BillInterfacePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BillInterfacePanelLayout.createSequentialGroup()
                .addComponent(navBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(billListScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BillInterfacePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BillInterfacePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void filterBillBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterBillBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filterBillBtnActionPerformed

    private void addSoldBillBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addSoldBillBtnMouseClicked
        this.homePage.menuClicked(this.homePage.addBillSold);
    }//GEN-LAST:event_addSoldBillBtnMouseClicked

    private void addBuyBillBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBuyBillBtnMouseClicked
        this.homePage.menuClicked(this.homePage.addBillBuy);
    }//GEN-LAST:event_addBuyBillBtnMouseClicked

    private void addSoldBillBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSoldBillBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addSoldBillBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BillInterfacePanel;
    private javax.swing.JButton addBuyBillBtn;
    private javax.swing.JButton addSoldBillBtn;
    private javax.swing.JPanel billListPanel;
    private javax.swing.JScrollPane billListScrollPane;
    private javax.swing.JComboBox<String> filterBillBtn;
    private javax.swing.JPanel navBarPanel;
    // End of variables declaration//GEN-END:variables
}
