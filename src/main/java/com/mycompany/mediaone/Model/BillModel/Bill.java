package com.mycompany.mediaone.Model.BillModel;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

abstract public class Bill {

    private String id;
    private String name;
    private double total; //grand total
    private Date createdAt;
    private List<BillItem> items;
    private String type;

    public Bill() {
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
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

    public void setTotal(double total) {
        this.total = total;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getTotal() {
        double total = 0;
        for (int i = 0; i < items.size(); i++) {
            total += items.get(i).getAmount();
        }
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

    public int getTotalItemQuantityInBill() {
        double totalQuantityItem = 0;
        for (int i = 0; i < items.size(); i++) {
            totalQuantityItem += items.get(i).getQuantity();
        }
        return (int) totalQuantityItem;
    }
}
