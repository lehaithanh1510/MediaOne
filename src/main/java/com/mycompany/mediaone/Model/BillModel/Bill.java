package com.mycompany.mediaone.Model.BillModel;

import java.util.Date;
import java.util.List;

public class Bill {

    private String id;
    private double total; //grand total
    private Date createdAt;
    private List<BillItem> items;
    private String type;

    public Bill() {
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public void setItems(List<BillItem> items) {
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

    public Date getCreatedAt() {
        return createdAt;
    }

    public List<BillItem> getItems() {
        return items;
    }

    public String getType() {
        return type;
    }
}
