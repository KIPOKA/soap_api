/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.webservice;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.jws.WebService;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import za.tut.ac.session.ProductInterface;

/**
 *
 * @author ladyk
 */
@WebService(name = "ProductPort", serviceName = "ProductService")
public class ProductWS {
    private ProductInterface productBean;
    
    @PostConstruct
    public void initialiseBean() {
        try {
            InitialContext context = new InitialContext();
            productBean = (ProductInterface) context.lookup("za.tut.ac.session.ProductInterface");
        } catch (NamingException ex) {
            Logger.getLogger(ProductWebService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
