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
public class SupplierService extends SupplierServiceBase implements ISupplierAdminsPrivilege {

    @Override
    public ArrayList<Supplier> getAllSuppliers() {
        getSuppliers();
        return suppliersList;
    }

    public SupplierService() {
        super();
    }

    @Override
    public boolean removeSupplier(int index) {
        try {
            getSuppliers();
            suppliersList.remove(index);
            saveSuppliers();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean addSupplier(Supplier supplier) {
        
        try {
            getSuppliers();
            supplier.getSupplierData().setId((int) ((int)suppliersList.size()+Math.random()*100+Math.random()*10));
            suppliersList.add(supplier);
            saveSuppliers();
            return true;
        } catch (Exception e) {
            System.out.println(e.toString());

            return false;
        }

    }

}
