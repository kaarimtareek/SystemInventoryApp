/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UsersPackage;

import ClientService.ClientService;
import ClientService.IClientFileService;
import DataPackage.*;
import DataPackage.UserData;
import ProductServices.ClientProductPrivilege;
import ProductServices.IClientProductPrivilege;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author kimoo
 */
public class Client implements Serializable {

    private static Client client;
    private UserData clientData;
    private final Cart cart;
    private final IClientProductPrivilege productService;
    private final IClientFileService clientService;

    public UserData getClientData() {
        return clientData;
    }

    public Cart getCart() {
        return cart;
    }

    private Client() {
        this.cart = new Cart();
        this.productService = new ClientProductPrivilege();
        this.clientService = new ClientService();
    }

    public boolean addProductToCart(Product product, int quantity) {
        BuyedProduct buyedProduct = new BuyedProduct(product.getName(), product.getSellingPrice(), product.getCategoryString(), quantity);
        return cart.addProduct(buyedProduct);
    }
    //Singleton pattern
    public static Client getInstance() {
        if (client == null) {
            client = new Client();
        }
        return client;
    }

    public ArrayList<Product> searchProductByName(String name) {
        return productService.searchProductByName(name);
    }

    public ArrayList<Product> searchProductByCategory(Category category) {
        return productService.searchProductByCategory(category);
    }

    public ArrayList<Product> searchProductByDate(Date date) {
        return productService.searchProductByDate(date);
    }

    public boolean login(String name, String password) {
        clientData = clientService.loginClient(name, password);
        if (clientData != null) {
            return true;
        }
        return false;
    }

    public boolean register(String name, String password) {
        clientData = clientService.registerClient(name, password);
        if (clientData != null) {
            return true;
        }
        return false;
    }
}
