/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorysystemapp;


import LoginForm.LoginFrame;
import UsersPackage.Client;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author kimoo
 */
public class InventorySystemApp {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
//        String path = System.getProperty("user.dir");
//        File file = new File("clients.txt");
//        file.createNewFile();
//            Client client = Client.getInstance();
//           client.register("karim", "12300");
//        Admin newAdmin = Admin.getInstance();
//                System.out.println(newAdmin.register("kariooo", "0123123"));

//        newAdmin.addNewProduct(new Product("test",100,139.9,120.9,Category.Drinks,"data","date"));
//        System.out.println(newAdmin.login("karim", "12341234"));
//        System.out.println(newAdmin.addNewProduct(new Product("test", 100, 13.5, 15.9, Category.Drinks, "date", "proDate")));
//        System.out.println(newAdmin.addNewProduct(new Product("test1", 100, 13.5, 15.9, Category.Drinks, "date", "proDate")));
//      System.out.println( newAdmin.searchProductByName("gh"));

        LoginFrame frame = new LoginFrame();
        frame.setVisible(true);
//        File binFile = new File("D:\\sectionPL2\\InventorySystemApp\\data.dat");
//        FileOutputStream out = new FileOutputStream("D:\\sectionPL2\\InventorySystemApp\\admins.bin");
//            out.close();
//            FileOutputStream out1 = new FileOutputStream("D:\\sectionPL2\\InventorySystemApp\\suppliers.bin");
//            out1.close();
//        System.out.println(newAdmin.login("karioo", "1234234"));
//        System.out.println(newAdmin.getAdminData().getName());
//    System.out.println(newAdmin.addNewProduct(new Product()));
//        System.out.println(newAdmin.addNewProduct(new Product()));
//        File file = new File ("Demo.txt");
//        usingFileWriter();
//        readingTextFromFile("data", "path");
    }

    public static void usingFileWriter() throws IOException {
        String fileContent = "Hello Learner !! Welcome to howtodoinjava.com.";
        try (FileWriter fileWriter = new FileWriter("Demo.txt")) {
            fileWriter.write(fileContent);
        }
    }

    public static boolean readingTextFromFile(String data, String path) {

        try {
            FileInputStream fis = new FileInputStream("Demo.txt");
            Scanner sc = new Scanner(fis);    //file to be scanned  
            //returns true if there is another line to read  
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
                System.out.println("done");
                //returns the line that was skipped  
                //returns the line that was skipped  
            }
            sc.close();     //closes the scanner  
            return true;
        } catch (FileNotFoundException e) {
            return false;
        }
    }
}
