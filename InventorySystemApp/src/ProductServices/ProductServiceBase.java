/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProductServices;

import DataPackage.Product;
import FileManagerPackage.FileManager;
import FileManagerPackage.IFileManager;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author kimoo
 */
public abstract class ProductServiceBase {

    public static ArrayList<Product> productList = new ArrayList<>();
    FileManager<Product> iFileManager;
    private final String path = "products.txt";

    public ProductServiceBase() {
        this.iFileManager = new FileManager<>();
    }

    public ArrayList<Product> getAllProducts() {
        if (productList.isEmpty()) {
            getProducts();
        }
        return productList;
    }

    public boolean getProducts() {
        if (!productList.isEmpty()) {
            return true;
        }
        try {
            ArrayList<String> result = iFileManager.readTextFile(path);
            ArrayList<Product> resultPro = new ArrayList<>();
            if (result != null) {
                result.forEach((pro) -> {
                    resultPro.add(new Product(pro));
                });
               productList = resultPro;
            }
            return true;
        } catch (Exception e) {
            System.out.println(e.toString());

            return false;
        }
    }

    public boolean saveProducts() {
        try {
            ArrayList<String> data = new ArrayList<>();
            productList.forEach((prodcut) -> {
                data.add(prodcut.toString());
            });
            iFileManager.writeInTextFile(path, data);
            return true;
        } catch (IOException e) {
            System.out.println(e.toString());

            return false;
        }
    }
}
