/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileManagerPackage;

import DataPackage.ObjData;

/**
 *
 * @author kimoo
 */
public interface IFileManager <T> {
    T read(String path);
    boolean write(String path,T data);
    
}
