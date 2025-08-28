package com.moolah.moolah_core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moolah.moolah_core.models.Alert;

public interface AlertRepository extends JpaRepository<Alert, Long> {
    
}
