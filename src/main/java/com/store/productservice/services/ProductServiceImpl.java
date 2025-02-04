package com.store.productservice.services;

import com.store.productservice.domain.Product;
import com.store.productservice.domain.ProductDTO;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
@Primary
public class ProductServiceImpl implements ProductService {

    private List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(1, "Teclado Mecánico", 75.99, 120),
            new Product(2, "Monitor 24'' Full HD", 159.99, 80),
            new Product(3, "Mouse Inalámbrico", 25.49, 200),
            new Product(4, "Audífonos Bluethooth", 49.99, 150)
    ));

    @Override
    public List<ProductDTO> getProductsDTO() {
        return List.of();
    }

    @Override
    public List<Product> getProducts() {

        return products;
    }

    @Override
    public Optional<Product> getProduct(int id) {

        return products.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();
    }

    @Override
    public Product postProduct(Product product) {
        products.add(product);

        return product;
    }

    @Override
    public void putProduct(Product product) {
        Product productFound = products.stream()
                .filter(p -> p.getId().equals(product.getId()))
                .findFirst()
                .orElseThrow();

        productFound.setName(product.getName());
        productFound.setPrice(product.getPrice());
        productFound.setStock(product.getStock());

    }

    @Override
    public Product patchProduct(Product product) {
        // FIXME: Método aún no implementado
        throw new UnsupportedOperationException("Method patchProduct is not yet implemented.");
    }

    @Override
    public void deleteProduct(int id) {
        Product productFound = products.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElseThrow();

        products.remove(productFound);
    }
}
