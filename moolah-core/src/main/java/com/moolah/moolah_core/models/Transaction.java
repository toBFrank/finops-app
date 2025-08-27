package com.moolah.moolah_core.models;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Transaction {
    private Long id;
    private Long userId;
    private Long categoryId;
    private Double amount;
    private String description;
    private LocalDateTime transactionDate;
    private LocalDateTime updatedAt;
}
