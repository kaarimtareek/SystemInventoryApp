/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataPackage;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author kimoo
 */
public class Product implements Serializable {

    private String name;
    private int id;
    private int availableQuantity;
    private double purchasingPrice;
    private double sellingPrice;
    private Category category;
    private String expirationDate;
    private String productionDate;
    private final SimpleDateFormat formatter;
    private final String separator = "#";

    public Product() {
        this.formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        name = "default";
        this.availableQuantity = 200;
        this.purchasingPrice = 309;
        this.sellingPrice = 400;
        this.expirationDate = "";
        this.productionDate = "";
    }

    public Product(String data) {
        this.formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        String[] arryString = data.split(separator);
        this.name = arryString[0];
        this.id = Integer.parseInt(arryString[1]);
        this.availableQuantity = Integer.parseInt(arryString[2]);
        this.purchasingPrice = Double.parseDouble(arryString[3]);
        this.sellingPrice = Double.parseDouble(arryString[4]);
        this.productionDate = arryString[5];
        this.expirationDate = arryString[6];
        this.category = stringToCategory(arryString[7]);

    }

    public Product(String name, int availableQuantity, double purchasingPrice, double sellingPrice, Category category, String expirationDate, String productionDate) {
        this.formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        this.name = name;

        this.availableQuantity = availableQuantity;
        this.purchasingPrice = purchasingPrice;
        this.sellingPrice = sellingPrice;
        this.category = category;
        this.expirationDate = expirationDate;
        this.productionDate = productionDate;
    }

    @Override
    public String toString() {
        return name + separator + id + separator + availableQuantity + separator + purchasingPrice + separator + sellingPrice + separator
                + productionDate + separator + expirationDate + separator + category.toString();

    }

    public String getCategoryString() {
        return this.category.toString();
    }

    public void increaseQuantity(int quantity) {
        this.availableQuantity += quantity;

    }

    private Category stringToCategory(String name) {
        return Category.valueOf(name);
    }

    public void decreaseQuantity(int quantity) {
        this.availableQuantity -= quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public double getPurchasingPrice() {
        return purchasingPrice;
    }

    public void setPurchasingPrice(double purchasingPrice) {
        this.purchasingPrice = purchasingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate;
    }

}
