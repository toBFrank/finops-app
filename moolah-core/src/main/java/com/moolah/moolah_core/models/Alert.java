package com.moolah.moolah_core.models;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Alert {
    private Long id;
    private Long userId;
    private String message;
    private Integer severity; // 1 = low, 2 = medium, 3 = high
    private LocalDateTime createdAt;
    private Boolean resolved;
}
