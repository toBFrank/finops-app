package com.moolah.moolah_core.models;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class AccessReview {
    private Long id;
    private Long userId;
    private Long roleID;
    private LocalDateTime reviewDate;
    private Boolean approved;
}
