package com.mycompany.mediaone.Model;

import java.util.Date;
import java.util.List;

public class Bill {

    private String id;
    private double total; //grand total
    private String createdAt;
    private String customer;
    private String items;
    private String type;

    public Bill() {
    }

    public Bill(String id, double total, String createdAt, String customer, String items, String type) {
        this.id = id;
        this.total = total;
        this.createdAt = createdAt;
        this.customer = customer;
        this.items = items;
        this.type = type;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    

    public String getId() {
        return id;
    }

    public double getTotal() {
        return total;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getCustomer() {
        return customer;
    }

    public String getItems() {
        return items;
    }

    public String getType() {
        return type;
    }
}
