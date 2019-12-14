/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClientService;

import DataPackage.UserData;

/**
 *
 * @author kimoo
 */
public class ClientService extends ClientServiceBase implements IClientFileService{

    @Override
    public UserData loginClient(String name, String password) {
       getClients();
       for(UserData data : clientsList){
           if(data.getName().equals(name) && data.getPassword().equals(password))
               return data;
       }
       return null;
    }

    @Override
    public UserData registerClient(String name, String password) {
          getClients();
       UserData newClient = new UserData(name,password);
       newClient.setId((int) (clientsList.size()+1+100*Math.random()+10*Math.random()));
       clientsList.add(newClient);
       saveClients();
       System.out.println(" register client service sucess");
       return newClient;
    }
    
}
