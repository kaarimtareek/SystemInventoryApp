/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UsersPackage;

import DataPackage.Product;
import DataPackage.SupplierData;
import ProductServices.ISupplierProductPrivilege;
import ProductServices.SupplierProductPrivilege;
import java.io.Serializable;

/**
 *
 * @author kimoo
 */
public class Supplier  implements Serializable{
    private SupplierData supplierData;

    @Override
    public String toString() {
        return this.supplierData.toString();
    }
    private ISupplierProductPrivilege productService;
    public SupplierData getSupplierData() {
        return supplierData;
    }

    public Supplier() {
        this.productService =new  SupplierProductPrivilege();
    }

    public Supplier(SupplierData supplierData) {
        this.supplierData = supplierData;
    }

    public void setSupplierData(SupplierData supplierData) {
        this.supplierData = supplierData;
    }
    public boolean addProductQuantity(int quantity,Product product){
      return  productService.addProductQuantity(quantity, product);
    }
}
