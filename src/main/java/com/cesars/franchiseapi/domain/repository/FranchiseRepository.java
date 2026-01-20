package com.cesars.franchiseapi.domain.repository;

import com.cesars.franchiseapi.domain.model.Franchise;

import java.util.List;
import java.util.Optional;

public interface FranchiseRepository {

    Franchise save(Franchise franchise);

    Optional<Franchise> findById(Long id);

    List<Franchise> findAll();

    void deleteById(Long id);
}
