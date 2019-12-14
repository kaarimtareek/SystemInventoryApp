/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UsersPackage;

import AdminService.AdminService;
import AdminService.IAdminFileService;
import ClientService.ClientService;
import ClientService.IClientFileService;
import DataPackage.Category;
import DataPackage.Product;
import DataPackage.UserData;
import ProductServices.AdminProductPrivilege;
import ProductServices.IAdminProductPrivilege;
import SupplierService.ISupplierAdminsPrivilege;
import SupplierService.SupplierService;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author kimoo
 */
public class Admin implements Serializable {
    private static Admin admin;
    public Admin( AdminProductPrivilege productService, ISupplierAdminsPrivilege suppleirService, IClientFileService clientService, IAdminFileService adminService) {
       
        this.productService = productService;
        this.suppleirService = suppleirService;
        this.clientService = clientService;
        this.adminService = adminService;
    }
    public static Admin getInstance(){
        if(admin==null){
            admin = new Admin();
            
        }
      return admin;
    }
    public ArrayList<Supplier> getAllSuppliers(){
        
     return    suppleirService.getAllSuppliers();
    }
    
    private Admin(){
        this.productService = new AdminProductPrivilege();
        this.suppleirService = new SupplierService();
        this.clientService = new ClientService();
        this.adminService = new AdminService();
    }
 private UserData adminData;   

    public UserData getAdminData() {
        return adminData;
    }
private  ArrayList<Supplier> suppliersList;
private final AdminProductPrivilege productService;
private final ISupplierAdminsPrivilege suppleirService;
private final IClientFileService clientService;
private final IAdminFileService adminService;
public boolean addSupplier(Supplier supplier){
   return  suppleirService.addSupplier(supplier);
} 
public boolean removeSupplier(int index){
   return  suppleirService.removeSupplier(index);
} 
public ArrayList<Product> searchProductByName(String name){
    return productService.searchProductByName(name);
}
public ArrayList<Product> searchProductByCategory(Category category){
    return productService.searchProductByCategory(category);
}
public ArrayList<Product> searchProductByDate(Date date){
    return productService.searchProductByDate(date);
}
public boolean addNewProduct(Product product){
    return productService.addProduct(product);
}
public ArrayList<Product> getAllProducts(){
        return productService.getAllProducts();
    }
public boolean updateProduct(Product product , int index){
  return  productService.updateProduct(index, product);
}
public boolean removeProduct(Product product){
    return productService.removeProduct(product);
}
 public boolean login(String name,String password){
                 System.out.println("login in admin begins");

    adminData= adminService.loginAdmin(name, password);
    if(adminData!= null)
        return true;
    return false;
 }
 
  public boolean register(String name,String password){
    adminData= adminService.registerAdmin(name, password);
    if(adminData!= null)
        return true;
    return false;
 }
}
