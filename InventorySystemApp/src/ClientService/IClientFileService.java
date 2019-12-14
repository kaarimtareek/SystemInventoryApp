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
public interface IClientFileService {
    UserData loginClient(String name,String password);
    UserData registerClient(String name,String password);
}
