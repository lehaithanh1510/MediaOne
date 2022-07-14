package com.mycompany.mediaone.Model;

public class BillItem {

    private int quantity;
    private String productName;
    private float unitPrice;
    private String productId;
    private float amount;

    public float getAmount() {
        return amount;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getProductName() {
        return productName;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public String getProductId() {
        return productId;
    }
}
