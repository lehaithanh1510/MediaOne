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
