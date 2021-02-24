package com.example.springbootservicecomponent.service;

import com.example.springbootservicecomponent.model.Product;

import java.util.Collection;

/**
 * Created by shivam.si on 24/02/21 12:58 pm
 */
public interface ProductService {
    public abstract void createProduct(Product product);
    public abstract void updateProduct(String id, Product product);
    public abstract void deleteProduct(String id);
    public abstract Collection<Product> getProducts();
}
