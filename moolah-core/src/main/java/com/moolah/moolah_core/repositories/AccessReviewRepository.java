package com.moolah.moolah_core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moolah.moolah_core.models.AccessReview;

public interface AccessReviewRepository extends JpaRepository<AccessReview, Long> {
    
}
