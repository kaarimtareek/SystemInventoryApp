/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminService;

import DataPackage.UserData;
import FileManagerPackage.FileManager;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author kimoo
 */
public class AdminServiceBase implements Serializable {

   static protected ArrayList<UserData> adminsList;
    private final FileManager<UserData> iFileManager;
    private final String path = "D:\\\\sectionPL2\\\\InventorySystemApp\\\\admins.txt";

    public AdminServiceBase() {
        adminsList = new ArrayList<>();
        iFileManager = new FileManager<>();

    }

    protected boolean getAdmins() {
        System.out.println("get admins begins");
//            if(!adminsList.isEmpty())
//                return true;
        try {
           
            ArrayList<String> result = iFileManager.readTextFile(path);
            if (result != null) {
                for(String data :result){
                    System.out.println("data in get admins " + data);
                    adminsList.add(new UserData(data));
                }
                System.out.println("get admins success");
                return true;
            }
            return false;
        } catch (IOException e) {

            System.out.println(e.toString());
            System.out.println("get admins failed");

            return false;
        }
    }

    protected boolean saveAdmins() {
        System.out.println("save admins begins");
        ArrayList<String> listString = new ArrayList<>();
                for(UserData data :adminsList){
                    System.out.println("data in save admins service"+data.toString());
                    listString.add(data.toString());
                }
        try {
            iFileManager.writeInTextFile(path, listString);
            return true;
        } catch (IOException e) {
            System.out.println(e.toString());

            return false;
        }

    }
}
