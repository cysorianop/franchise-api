package com.cesars.franchiseapi.domain.model;

import java.util.List;

public class Branch {

    private Long id;
    private String name;
    private List<Product> products;

    public Branch(Long id, String name, List<Product> products) {
        this.id = id;
        this.name = name;
        this.products = products;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Product> getProducts() {
        return products;
    }
}
