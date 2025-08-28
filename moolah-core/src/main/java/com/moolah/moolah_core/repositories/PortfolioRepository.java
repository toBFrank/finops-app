package com.moolah.moolah_core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moolah.moolah_core.models.Portfolio;

public interface PortfolioRepository extends JpaRepository<Portfolio, Long> {
    
}