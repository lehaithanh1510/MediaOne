package com.mycompany.mediaone.Model;

import java.util.Date;
import java.util.List;

public class Bill {

    private String id;
    private int total;
    private Date createdAt;
    private Customer customerDetails;
    private List<BillItem> items;
    private String type;

    public String getId() {
        return id;
    }

    public int getTotal() {
        return total;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Customer getCustomerDetails() {
        return customerDetails;
    }

    public List<BillItem> getItems() {
        return items;
    }

    public String getType() {
        return type;
    }
}
