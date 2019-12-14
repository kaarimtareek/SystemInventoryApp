/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClientService;

import DataPackage.UserData;
import FileManagerPackage.FileManager;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author kimoo
 */
public class ClientServiceBase {
    protected ArrayList<UserData> clientsList;
    private FileManager<UserData> iFileManager;
    private final String path ="clients.txt";
        public ClientServiceBase(){
            clientsList = new ArrayList<>();
            iFileManager = new FileManager();
        }
    public boolean getClients(){
        try{
            
           ArrayList<String> result = iFileManager.readTextFile(path);
           if(result!=null)
           {
               for(String data :result){
                   clientsList.add(new UserData(data));
               }
           }
            return true;
        }catch(IOException e){
            System.out.println(e.toString());
            return false;
        }
    }
    public boolean saveClients(){
        try{
            ArrayList<String> data= new ArrayList<>();
            for(UserData user: clientsList){
                data.add(user.toString());
            }
         return  iFileManager.writeInTextFile(path, data);
            
        }catch(Exception e){
            return false;
        }
    }
    
}
