/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileManagerPackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import java.util.ArrayList;


/**
 *
 * @author kimoo
 */
public class FileManager<T> implements IFileManager<T>, Serializable {

    public boolean writeInTextFile(String path, ArrayList<String> data) throws IOException {
        File file = new File(path);
        if(file.exists())
        {
            //this is used to delete the content of the file and add all of it every time the data changed
            
            file.delete();
            file.createNewFile();
        }
        FileWriter writer = new FileWriter(file, true);
        try {

            for (String dataString : data) {
                System.out.println("Writer in text file begins");
                System.out.println("data in write in file " + dataString);
                writer.write(dataString);
                writer.append("\n");
            }

            return true;

        } catch (IOException e) {
                        System.out.println("Error in File Manager while writing"+ e.toString());

            return false;
        } finally {
            writer.close();
        }
    }

//        try {
//            FileInputStream fis = new FileInputStream("Demo.txt");
//            Scanner sc = new Scanner(fis);    //file to be scanned  
////returns true if there is another line to read  
//            while (sc.hasNextLine()) {
//                System.out.println(sc.nextLine());      //returns the line that was skipped  
//            }
//            sc.close();     //closes the scanner  
//            return true;
//        } catch (FileNotFoundException e) {
//            return false;
//        }
    public ArrayList<String> readTextFile(String path) throws IOException {
        File file = new File(path);
//          if(file.exists())
//        {
//            //this is used to delete the content of the file and add all of it every time the data changed
//            
//            file.delete();
//            file.createNewFile();
//        }
        
        try (BufferedReader br = new BufferedReader(new FileReader(file));) {
//              StringBuffer bf = new StringBuffer();
            ArrayList<String> listString = new ArrayList<>();
//               ArrayList<T> data = new ArrayList<>();
            String currentLine="";
            while ((currentLine = br.readLine()) != null) {
//                System.out.println(currentLine);
                listString.add(currentLine);
            }
            br.close();
            return listString;

        } catch (Exception e) {
            System.out.println("Error in File Manager while reading"+ e.toString());
            return null;
        }
    }

    @Override
    public T read(String path) {
        T result = null;
        System.out.println("read data begins");

//          
        try (ObjectInputStream reader = new ObjectInputStream(new FileInputStream(path))) {
            ;
            System.out.println("reading");
//                ArrayList<T> resultList = new ArrayList<>();
            if (reader.available() == 0) {

                System.out.println("the file is empty");
                return result;

            } else {
                result = (T) reader.readObject();
                System.out.println("read date sucess");
            }
            reader.close();
            return result;

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.toString());
            System.out.println("read data failed");

            return null;
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("read data failed");

            return null;
        }

    }

    @Override
    public boolean write(String path, T data) {
        System.out.println("write date begins");
//                        File file = new File("admins.text");

        try (ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(path))) {
//                System.out.println("writing scuess");
//                writer.reset();
            writer.writeObject(data);
            writer.close();
            System.out.println("write date sucess");

            return true;
        } catch (IOException e) {
            System.out.println(e.toString());

            return false;
        }

    }

}
