package org.dikkulah.controller;

import org.dikkulah.model.Product;
import org.dikkulah.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/product")
public class ProductController {
   @Autowired
    private ProductService productService;

    // Product kayıt etme
    @PostMapping
    public Product createProduct(@RequestBody Product request) {
        return productService.createProduct(request);
    }

    //Hepsini listele
    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    //id ile arama
    @GetMapping(value = "/{id}")
    public Product getProductById(@PathVariable Integer id) {
        return productService.getProductById(id);
    }

    //id ile bulup gönderilen body ile update etme
    @PutMapping
    public Product updateProduct(@RequestBody Product request) {
        return productService.updateProduct(request);
    }

    // id ile silme
    @DeleteMapping(value = "/{id}")
    public void deleteProductById(@PathVariable Integer id) {
         productService.deleteProductById(id);
    }

    // aktif- pasif listeleme
    @GetMapping(value = "state/{isActive}")
    public List<Product> getProductByIsActive(@PathVariable String isActive) {
        return productService.getProductByIsActive(Boolean.valueOf(isActive));
    }


}
