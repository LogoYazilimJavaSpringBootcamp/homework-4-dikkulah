package org.dikkulah.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/product")
public class ProductController {
  /*  @Autowired
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
    public Product getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    //id ile bulup gönderilen body ile update etme
    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product request) {
        return productService.updateProduct(id, request);
    }

    // id ile silme
    @DeleteMapping(value = "/{id}")
    public Boolean deleteProductById(@PathVariable Long id) {
        return productService.deleteProductById(id);
    }

    // aktif- pasif listeleme
    @GetMapping(value = "state/{isActive}")
    public List<Product> getProductByIsActive(@PathVariable String isActive) {
        return productService.getProductByIsActive(Boolean.valueOf(isActive));
    }

*/

}
