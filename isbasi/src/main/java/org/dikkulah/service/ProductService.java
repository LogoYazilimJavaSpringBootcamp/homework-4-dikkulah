package org.dikkulah.service;

import org.dikkulah.model.Product;
import org.dikkulah.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product createProduct(Product request) {
        return productRepository.save(request);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Integer id) {
        return productRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    public Product updateProduct( Product request) {
        return productRepository.save(request);
    }

    public void deleteProductById(Integer id) {
         productRepository.deleteById(id);
    }

    public List<Product> getProductByIsActive(Boolean isActive) {
        return productRepository.findAllByIsActive(isActive);
    }
}
