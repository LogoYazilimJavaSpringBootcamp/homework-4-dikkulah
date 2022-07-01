package org.dikkulah.service;

import org.dikkulah.model.Product;
import org.dikkulah.repository.jpa.ProductJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductJpa productJpa;

    public Product createProduct(Product request) {
        return productJpa.save(request);
    }

    public List<Product> getAllProducts() {
        return productJpa.findAll();
    }

    public Product getProductById(Integer id) {
        return productJpa.findById(id).orElseThrow(RuntimeException::new);
    }

    public Product updateProduct( Product request) {
        return productJpa.save(request);
    }

    public void deleteProductById(Integer id) {
         productJpa.deleteById(id);
    }

    public List<Product> getProductByIsActive(Boolean isActive) {
        return productJpa.findAllByIsActive(isActive);
    }
}
