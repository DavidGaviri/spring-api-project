package com.store.productservice.domain;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    private Integer id;
    private String name;
    private Double price;
    private Integer stock;

}
