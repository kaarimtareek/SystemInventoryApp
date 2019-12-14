/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProductServices;

import DataPackage.Category;
import DataPackage.Product;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author kimoo
 */
public abstract class CommonProductPrivilege extends ProductServiceBase implements ICommonProductPrivilege {

    @Override
    public ArrayList<Product> searchProductByName(String name) {
       ArrayList<Product> result =new  ArrayList<>();
      for(Product  product :ProductServiceBase.productList)
      {
          if(product.getName().contains(name))
              result.add(product);
          
      }
      return result;
    }


    @Override
    public ArrayList<Product> searchProductByDate(Date date) {
        ArrayList<Product> result =new  ArrayList<>();
      for(Product  product :ProductServiceBase.productList)
      {
          if(product.getExpirationDate().equals(date)|| product.getProductionDate().equals(date))
              result.add(product);
          
      }
      return result;
    }

    @Override
    public ArrayList<Product> searchProductByCategory(Category category) {
      ArrayList<Product> result =new  ArrayList<>();
      for(Product  product :ProductServiceBase.productList)
      {
          if(product.getCategory()==category)
              result.add(product);
          
      }
      return result;
    }
    
}
