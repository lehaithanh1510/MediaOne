package com.mycompany.mediaone.Model.BillModel;

public class BillSold extends Bill {

    private Customer customer;

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }
}
