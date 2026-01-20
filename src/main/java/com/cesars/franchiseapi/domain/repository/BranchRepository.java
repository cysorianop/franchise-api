package com.cesars.franchiseapi.domain.repository;

import com.cesars.franchiseapi.domain.model.Branch;

import java.util.List;
import java.util.Optional;

public interface BranchRepository {

    Branch save(Branch branch);

    Optional<Branch> findById(Long id);

    List<Branch> findByFranchiseId(Long franchiseId);

    void deleteById(Long id);
}
