/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProductServices;

import DataPackage.Product;

/**
 *
 * @author kimoo
 */
public class ClientProductPrivilege extends  CommonProductPrivilege implements IClientProductPrivilege {

    @Override
    public boolean buyProduct(int quantity, Product product) {
     try{ 
         getProducts();
         int index =  ProductServiceBase.productList.indexOf(product);
       product.decreaseQuantity(quantity);
        ProductServiceBase.productList.add(index, product);
        saveProducts();
        return true;
    }
     catch(Exception e){
         return false;
     }
    }
    
}
