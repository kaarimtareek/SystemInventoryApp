/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataPackage;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author kimoo
 */
public class Invoice {
    private String clientName;
    private double totalPrice;
    private int id;
    private Date orderDate;
    private ArrayList<String> productsName;

    public Invoice(String clientName, double totalPrice, Date orderDate, ArrayList<String> productsName) {
        this.clientName = clientName;
        this.totalPrice = totalPrice;
        this.orderDate = orderDate;
        this.productsName = productsName;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public ArrayList<String> getProductsName() {
        return productsName;
    }

    public void setProductsName(ArrayList<String> productsName) {
        this.productsName = productsName;
    }
    
}
