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
public interface ICommonProductPrivilege {

    ArrayList<Product> searchProductByName(String name);

    ArrayList<Product> searchProductByDate(Date date);

    ArrayList<Product> searchProductByCategory(Category category);

   
}
