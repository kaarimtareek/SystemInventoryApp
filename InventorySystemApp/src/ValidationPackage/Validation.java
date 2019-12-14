/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ValidationPackage;

/**
 *
 * @author kimoo
 */
public class Validation {
    public static boolean isValidNumber(String number){
        try{
           Integer.parseInt(number);
        return true;
        }
        catch(NumberFormatException e){
        return false;
        
    }
}
    public static boolean isValidPrice(String price){
        try{
            Double.parseDouble(price);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }

}
