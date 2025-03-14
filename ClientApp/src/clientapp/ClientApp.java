/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clientapp;

import za.ac.tut.clientsoap.Product;
import za.ac.tut.clientsoap.ProductPort;
import za.ac.tut.clientsoap.ProductService;

/**
 * @author ladyk
 */
public class ClientApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ProductService service = new ProductService();
        ProductPort port = service.getProductPortPort();
        Product product = new Product();
        product.setName("Rapid roach");
        product.setPrice(25);
        product.setQty(23);         
        //Insert into the DB
        System.out.println(port.insert(product));
    }
    
}
