/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminService;

import DataPackage.UserData;
import java.io.Serializable;

/**
 *
 * @author kimoo
 */
public class AdminService extends AdminServiceBase implements IAdminFileService,Serializable {

    public AdminService() {
        super();
    }
    
    @Override
    public UserData loginAdmin(String name, String password) {
        System.out.println("login in admin service begin");
        try {
           boolean result = getAdmins();
           if(!result){
               throw new Exception("Get admins Failed");
           }
            for (UserData data : adminsList) {
                if (data.getName().equals(name) && data.getPassword().equals(password)) {
                    System.out.println(data.toString()+"Data in login admin service");
                    return data;
                }
            }
            return null;
        } catch (Exception e) {
            System.out.println("login in admin service failed");
            System.out.println(e.toString());

            return null;
        }
    }

    @Override
    public UserData registerAdmin(String name, String password) {
        System.out.println("register in admin service begin");

        try {
            getAdmins();
            UserData newAdmin = new UserData(name, password);
            
            newAdmin.setId((int) (AdminServiceBase.adminsList.size() + 100 * Math.random()+10*Math.random()));
            System.out.println(newAdmin.toString()+" new admin");
            AdminServiceBase.adminsList.add(newAdmin);
            for(UserData data : adminsList)
            {
                System.out.println("in register admin service"+data.toString());
            }
            saveAdmins();
            System.out.println("register in admin service sucess");

            return newAdmin;
        } catch (Exception e) {
            System.out.println(e.toString());

            System.out.println("register in admin service failed");

            return null;
        }
    }

}
