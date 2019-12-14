/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataPackage;

import java.io.Serializable;

/**
 *
 * @author kimoo
 */
public enum Category implements Serializable {
    Vegetables,
    Meats,
    Drinks,
    MilkProducts;

    @Override
    public String toString() {
        return this.name().toString();
    }

    public static Category getVegetables() {
        return Vegetables;
    }

    public static Category getMeats() {
        return Meats;
    }

    public static Category getDrinks() {
        return Drinks;
    }

    public static Category getMilkProducts() {
        return MilkProducts;
    }
}
