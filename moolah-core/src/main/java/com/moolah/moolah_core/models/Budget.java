package com.moolah.moolah_core.models;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Budget {
    private Long id;
    private Long userId;
    private Long categoryId;
    private Double spendingLimit;
    private Double amountSpent;
    private Integer month;
    private Integer year;
    private LocalDateTime updatedAt;
}
