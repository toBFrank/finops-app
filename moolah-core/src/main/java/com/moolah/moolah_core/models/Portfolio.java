package com.moolah.moolah_core.models;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Portfolio {
    private Long id;
    private Long userId;
    private String symbol;
    private Double shares;
    private Double averagePrice;
    private Double currentPrice;
    private Double totalValue;
    private LocalDateTime updatedAt;
}
