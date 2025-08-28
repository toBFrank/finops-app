package com.moolah.moolah_core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moolah.moolah_core.models.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    
}
