package com.mycompany.mediaone.Model.BillModel;

import java.time.LocalDate;
import java.util.List;

abstract public class Bill {

    private String id;
    private String name;
    private double total; //grand total
    private LocalDate createdAt;
    private List<BillItem> items;
    private String type;

    public Bill() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public void setName(String name){
        this.name = name;
    }

<<<<<<< HEAD

=======
>>>>>>> 7823851f68ae841016ef7aa837f30ba12266b5fc
    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public void setItems(List<BillItem> items) {
        this.items = items;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getTotal() {
        return total;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public List<BillItem> getItems() {
        return items;
    }

    public String getType() {
        return type;
    }
<<<<<<< HEAD
    
    public String getName(){
        return name;
    }
    public double caculateTotal(){
        double totalPrice = 0;
        for (int i = 0; i < this.getItems().size(); i++) {
            totalPrice += this.getItems().get(i).getAmount();
        }
        System.out.println(totalPrice);
        this.total = totalPrice;
        return total;
=======

    public int getTotalItemQuantityInBill() {
        double totalQuantityItem = 0;
        for (int i = 0; i < items.size(); i++) {
            totalQuantityItem += items.get(i).getQuantity();
        }
        return (int) totalQuantityItem;
>>>>>>> 7823851f68ae841016ef7aa837f30ba12266b5fc
    }
}
