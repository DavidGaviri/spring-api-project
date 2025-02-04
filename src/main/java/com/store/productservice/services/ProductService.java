package com.store.productservice.services;

import com.store.productservice.domain.Product;
import com.store.productservice.domain.ProductDTO;

import java.util.List;
import java.util.Optional;

/**
 * Interfaz que define los métódos del servicio de productos
 */
public interface ProductService {

    /**
     * Métódo que se utiliza para el patron de diseño DTO
     * @return
     */
    public List<ProductDTO> getProductsDTO();

    /**
     * Metódo para consultar todos los productos de la lista
     * @return una lista de productos
     */
    public List<Product> getProducts();

    /**
     *
     * @param id
     * @return
     */
    public Optional<Product> getProduct(int id);

    /**
     * Crea un producto
     * @param product
     * @return
     */
    public Product postProduct(Product product);

    /**
     *
     * @param product
     * @return
     */
    public void putProduct(Product product);

    /**
     *
     * @param product
     * @return
     */
    public Product patchProduct(Product product);

    /**
     *
     * @param id
     */
    public void deleteProduct(int id);

}
