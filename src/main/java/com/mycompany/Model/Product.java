package com.mycompany.Model;

import java.util.HashMap;
import java.util.Map;

public class Product {

    public Product(String id, String name, String type, int numberInStock, int inputPrice, int sellPrice) {
        this.name = name;
        this.type = type;
        this.id = id;
        this.numberInStock = numberInStock;
        this.inputPrice = inputPrice;
        this.sellPrice = sellPrice;
    }
// Đã tạo thêm setter
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setNumberInStock(int numberInStock) {
        this.numberInStock = numberInStock;
    }

    public void setInputPrice(int inputPrice) {
        this.inputPrice = inputPrice;
    }

    public void setSellPrice(int sellPrice) {
        this.sellPrice = sellPrice;
    }

    private String id;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getNumberInStock() {
        return numberInStock;
    }

    public int getInputPrice() {
        return inputPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }
    private String name;
    private String type;
    private int numberInStock;
    private int inputPrice;
    private int sellPrice;

}
