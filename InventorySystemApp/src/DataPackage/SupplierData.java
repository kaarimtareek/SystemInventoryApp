/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataPackage;

import java.io.Serializable;

/**
 *
 * @author kimoo
 */
public class SupplierData implements Serializable {
    private String name;
    private int id;
    private String contactMail;
    private String separator ="!";
    public SupplierData(String name, String contactMail) {
        this.name = name;
        this.contactMail = contactMail;
    }
    public SupplierData(String data){
        String[] arryString = data.split(separator);
        this.name = arryString[0];
        this.id = Integer.parseInt(arryString[1]);
        this.contactMail =arryString[2];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContactMail() {
        return contactMail;
    }

    public void setContactMail(String contactMail) {
        this.contactMail = contactMail;
    }

   

    @Override
    public String toString() {
        return  name + separator + id +separator + contactMail;
    }
}
