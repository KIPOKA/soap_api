/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package za.tut.ac.session;

import za.ac.tut.product.Product;

/**
 *
 * @author ladyk
 */
public interface ProductInterface {
    public void addProduct(Product product);
    public Product getProduct(int id);
    public void deleteProduct(int id);
    public Product updateProduct(Product product);
}
