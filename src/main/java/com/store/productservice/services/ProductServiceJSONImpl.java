package com.store.productservice.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.store.productservice.domain.Product;
import com.store.productservice.domain.ProductDTO;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceJSONImpl implements ProductService {

    @Override
    public List<ProductDTO> getProductsDTO() {
        List<ProductDTO> products;

        try{
            products = new ObjectMapper()
                    .readValue(this.getClass().getResourceAsStream("/productsDTO.json"),
                            new TypeReference<List<ProductDTO>>() {});

            return products;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public List<Product> getProducts() {
        List<Product> products;

        try{
            products = new ObjectMapper()
                    .readValue(this.getClass().getResourceAsStream("/products.json"),
                            new TypeReference<List<Product>>() {});

            return products;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Optional<Product> getProduct(int id) {
        return Optional.empty();
    }

    @Override
    public Product postProduct(Product product) {
        return null;
    }

    @Override
    public void putProduct(Product product) {

    }

    @Override
    public Product patchProduct(Product product) {
        return null;
    }

    @Override
    public void deleteProduct(int id) {

    }
}
