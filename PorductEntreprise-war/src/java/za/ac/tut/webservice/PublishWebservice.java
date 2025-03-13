/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package za.ac.tut.webservice;

import javax.xml.ws.Endpoint;



/**
 *
 * @author ladyk
 */
public class PublishWebservice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        Endpoint.publish("http://localhost:9897/productwebservice/product",new ProductWebService());
    }
    
}
