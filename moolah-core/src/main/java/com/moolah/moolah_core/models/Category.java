package com.moolah.moolah_core.models;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Category {
    private Long id;
    private Long userId;
    private String name;
    private LocalDateTime updatedAt;
}
