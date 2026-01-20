package com.cesars.franchiseapi.domain.model;

public class Product {

    private Long id;
    private String name;
    private Integer stock;

    public Product(Long id, String name, Integer stock) {
        this.id = id;
        this.name = name;
        this.stock = stock;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getStock() {
        return stock;
    }
}
