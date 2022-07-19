package com.mycompany.mediaone.Model.BillModel;

public class BillItem {

    private int quantity;
    private String name;
    private double unitPrice;
    private String id;
    private double amount;

    public BillItem(String id, String name, int quantity, double unitPrice) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.amount = quantity * unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public String getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }
}
