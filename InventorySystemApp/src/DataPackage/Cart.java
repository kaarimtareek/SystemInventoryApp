/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataPackage;

import java.util.ArrayList;

/**
 *
 * @author kimoo
 */
public class Cart {

    ArrayList<BuyedProduct> products;
    private double totalPrice;

    public Cart() {
        products = new ArrayList<>();
    }

    public ArrayList<BuyedProduct> getProducts() {
        return products;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public boolean addProduct(BuyedProduct product) {
        if (products.contains(product)) {
            System.out.println("already exsited");
            return false;
        }
        products.add(product);
        calculateTotalPrice();
        return true;
    }

    public boolean removeProduct(BuyedProduct product) {
        products.remove(product);
        calculateTotalPrice();

        return true;
    }

    public void calculateTotalPrice() {
         totalPrice = 0;
        for (BuyedProduct product : products) {
           
            totalPrice += product.getTotalPrice();
        }
    }

}
