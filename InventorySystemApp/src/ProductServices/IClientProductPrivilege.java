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
public interface IClientProductPrivilege extends ICommonProductPrivilege{
    boolean buyProduct(int quantity,Product product);
    
}
