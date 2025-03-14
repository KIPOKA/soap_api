/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.tut.ac.session;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import za.ac.tut.product.Product;

/**
 *
 * @author ladyk
 */
@Stateless
public class ProductBean implements ProductInterface {

   @PersistenceContext(unitName="productUnit")
    EntityManager manager;
   
    @Override
    public void addProduct(Product product) {
        manager.persist(product);
    }

    @Override
    public Product getProduct(int id) {
       
    return manager.find(Product.class, id);
    }

   @Override
public void deleteProduct(int id) {
    Product product =getProduct( id);
    if (product != null) {
        manager.remove(product);
        System.out.println("Product with ID " + id + " has been deleted.");
    } else {
        System.out.println("Product not found.");
    }
}

   @Override
    public Product updateProduct(Product updatedProduct) {
        return manager.merge(updatedProduct);
    }
  
}
