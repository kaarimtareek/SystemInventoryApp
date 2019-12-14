/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SupplierService;

import UsersPackage.Supplier;
import java.util.ArrayList;


/**
 *
 * @author kimoo
 */
public interface ISupplierAdminsPrivilege {
    boolean removeSupplier(int index);
    boolean addSupplier(Supplier supplier);
    ArrayList<Supplier> getAllSuppliers();
    
}
