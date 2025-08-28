package com.moolah.moolah_core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moolah.moolah_core.models.Budget;

public interface BudgetRepository extends JpaRepository<Budget, Long> {
    
}
