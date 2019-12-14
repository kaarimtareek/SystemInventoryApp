/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataPackage;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author kimoo
 */
public class UserData extends ObjData  implements Serializable {
    private String name;
     private String password;
    private int id;
    private final String separator = "@";
    public UserData(String name, String password) {
        this.name = name;
        this.password = password;
       
    }
    public UserData(String data){
//         ArrayList<String> spliter = new ArrayList<>(); 
    System.out.println(data);
    
    String[]   arryString = data.split(this.separator);
    System.out.println(arryString.length);
    this.name =arryString[0];
    this.password= arryString[1];
    this.id = Integer.parseInt(arryString[2]);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return this.name+separator+this.password+separator+this.id;
        
    }
    @Override
   public UserData fromString(String data){
       
      
//    UserData userData = new UserData(arryString[0],arryString[1]);
//    userData.setId(Integer.parseInt(arryString[2]));
//    return userData;
return null;
   } 
    public void setId(int id) {
        this.id = id;
    }
   
}
