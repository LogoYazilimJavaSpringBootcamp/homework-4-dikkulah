package com.dikkulah.isbasi.service;

import com.dikkulah.isbasi.model.Product;
import com.dikkulah.isbasi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
//
//    @Autowired
//    private ProductRepository productRepository;

    /*public Product createProduct(Product request) {
        return productRepository.save(request);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    public Product updateProduct(Long id, Product request) {
        return productRepository.updateById(id,request);
    }

    public Boolean deleteProductById(Long id) {
        return productRepository.deleteById(id);
    }

    public List<Product> getProductByIsActive(Boolean isActive) {
        return productRepository.findByIsActive(isActive);
    }*/
}
