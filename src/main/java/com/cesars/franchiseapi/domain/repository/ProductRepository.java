package com.cesars.franchiseapi.domain.repository;

import com.cesars.franchiseapi.domain.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {

    Product save(Product product);

    Optional<Product> findById(Long id);

    List<Product> findByBranchId(Long branchId);

    void deleteById(Long id);
}
