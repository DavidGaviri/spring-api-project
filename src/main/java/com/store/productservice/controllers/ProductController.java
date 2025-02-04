package com.store.productservice.controllers;

import com.store.productservice.domain.Product;
import com.store.productservice.domain.ProductDTO;
import com.store.productservice.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/productos")
public class ProductController {

    // Inyección de dependencia por constructor
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @GetMapping
    public ResponseEntity<List<Product>> getProducts() {

        return ResponseEntity.ok(productService.getProducts());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getProduct(@PathVariable int id) {
        Optional<Product> productOptional = productService.getProduct(id);

        return productOptional
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<?> postProduct(@RequestBody Product product){
        Product createdProduct = productService.postProduct(product);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(createdProduct.getId())
                .toUri();


        return ResponseEntity.created(location).build();
    }

    @PutMapping
    public ResponseEntity<?> putProduct(@RequestBody Product product){
        Optional<Product> productOptional = productService.getProduct(product.getId());

        if (productOptional.isPresent()){
            productService.putProduct(product);

            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.notFound().build();
        // return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Producto no encontrado");

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable int id){
        Optional<Product> productOptional = productService.getProduct(id);

        if(productOptional.isPresent()){
            productService.deleteProduct(id);

            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

}
