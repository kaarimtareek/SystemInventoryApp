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
public interface IAdminProductPrivilege extends ICommonProductPrivilege{
    boolean addProduct(Product product);
    boolean removeProduct(Product product);
    boolean updateProduct(int productId,Product updatedProduct);
    
    
    
}
