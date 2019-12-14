/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProductServices;

import DataPackage.Product;
import java.util.ArrayList;

/**
 *
 * @author kimoo
 */
public class AdminProductPrivilege extends CommonProductPrivilege implements IAdminProductPrivilege {

    @Override
    public boolean addProduct(Product product) {
        try {

            getProducts();
            product.setId((int) (ProductServiceBase.productList.size() + 1 + Math.random() * 100 + Math.random() * 10));
            ProductServiceBase.productList.add(product);
            saveProducts();
            return true;
        } catch (Exception e) {
            System.out.println(e.toString());

            return false;
        }
    }

    @Override
    public boolean removeProduct(Product product) {
        try {
            getProducts();
            ProductServiceBase.productList.remove(product);
            saveProducts();
            return true;
        } catch (Exception e) {
            System.out.println(e.toString());

            return false;
        }
    }

    @Override
    public boolean updateProduct(int index, Product updatedProduct) {
        try {
            getProducts();
           
            ProductServiceBase.productList.set(index, updatedProduct);
            saveProducts();
            return true;
        } catch (Exception e) {
            System.out.println(e.toString());

            return false;
        }

    }

   
}
