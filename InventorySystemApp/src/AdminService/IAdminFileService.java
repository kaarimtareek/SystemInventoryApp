/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminService;

import DataPackage.UserData;

/**
 *
 * @author kimoo
 */
public interface IAdminFileService  {
    UserData loginAdmin(String name,String password);
    UserData registerAdmin(String name,String password);
}
