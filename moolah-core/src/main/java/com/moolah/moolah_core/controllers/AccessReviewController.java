package com.moolah.moolah_core.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moolah.moolah_core.models.AccessReview;
import com.moolah.moolah_core.repositories.AccessReviewRepository;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping("/api/")
public class AccessReviewController {
    /*
    API endpoint to review access permissions for a given user, and to approve or deny access requests.
    Example request: GET /api/review-access?userId=12345
    Response: ResponseEntity with access details.
    */  
    private final AccessReviewRepository accessReviewRepository;
    public AccessReviewController(AccessReviewRepository accessReviewRepository) {
        this.accessReviewRepository = accessReviewRepository;
    }

    @GetMapping
    public List<AccessReview> getAll() {
        return accessReviewRepository.findAll();
    }
    @GetMapping("{id}")
    public AccessReview getByAccessReviewId(@PathVariable Long id) {
        return accessReviewRepository.findById(id).orElseThrow();
    }

    @PostMapping
    public AccessReview createAccessReview(@RequestBody AccessReview review) {
        return accessReviewRepository.save(review);
    }
    
    @PutMapping("{id}")
    public AccessReview updateAccessReview(@PathVariable Long id, @RequestBody AccessReview review) {
        AccessReview current = accessReviewRepository.findById(id).orElseThrow();
        current.setUserId(review.getUserId());
        current.setRoleID(review.getRoleID());
        current.setReviewDate(review.getReviewDate());
        current.setApproved(review.getApproved());
        return accessReviewRepository.save(current);
    }

    @DeleteMapping("{id}")
    public void deleteAccessReview(@PathVariable Long id) {
        accessReviewRepository.deleteById(id);
    }
}
