package za.ac.tut.webservice;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import za.ac.tut.product.Product;
import za.tut.ac.session.ProductInterface;

/**
 *
 * @author ladyk
 */
@WebService(name = "ProductPort", serviceName = "ProductService")
public class ProductWebService {

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

    // Endpoint to insert a product
    @WebMethod(operationName = "insert")
    public String addProduct(Product product) {
        productBean.addProduct(product);
        return "A product " + product.getName() + "\n" + "Product price: " + product.getPrice();
    }

    // Endpoint to get a product by ID
    @WebMethod(operationName = "getProduct")
    public Product findProduct(int id) {
        return productBean.getProduct(id);
    }

    // Endpoint to delete a product by ID
    @WebMethod(operationName = "deleteProduct")
    public String deleteProduct(int id) {
        try {
            productBean.deleteProduct(id);
            return "Product with ID " + id + " has been deleted.";
        } catch (Exception e) {
            return "Failed to delete product: " + e.getMessage();
        }
    }

    // Endpoint to update a product
    @WebMethod(operationName = "updateProduct")
    public String updateProduct(Product updatedProduct) {
        try {
            productBean.updateProduct(updatedProduct);
            return "Product with ID " + updatedProduct.getId() + " has been updated.";
        } catch (Exception e) {
            return "Failed to update product: " + e.getMessage();
        }
    }
}
