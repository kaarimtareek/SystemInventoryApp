/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SupplierService;

import DataPackage.SupplierData;
import FileManagerPackage.FileManager;
import FileManagerPackage.IFileManager;
import UsersPackage.Supplier;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author kimoo
 */
public abstract class SupplierServiceBase {

    protected FileManager<Supplier> iFileManager;

    public ArrayList<Supplier> getSuppliersList() {
        return suppliersList;
    }
    ArrayList<Supplier> suppliersList;
    private final String path = "suppliers.txt";

    public SupplierServiceBase() {
        iFileManager = new FileManager<>();
        suppliersList = new ArrayList<>();
    }

    public boolean getSuppliers() {
        try {
            ArrayList<String> result = iFileManager.readTextFile(path);
            if (result != null) {
                for (String data : result) {
                    suppliersList.add(new Supplier(new SupplierData(data)));
//TODO:
                }
            }
            return true;
        } catch (IOException e) {
            System.out.println(e.toString());
            return false;
        }
    }

    public boolean saveSuppliers() {
        try {
            ArrayList<String> data = new ArrayList<>();

            for (Supplier supplier : suppliersList) {
                data.add(supplier.toString());
            }
            return iFileManager.writeInTextFile(path, data);
        } catch (IOException e) {
            System.out.println(e.toString());

            return false;
        }
    }

}
