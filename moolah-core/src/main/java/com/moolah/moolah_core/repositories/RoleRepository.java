package com.moolah.moolah_core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moolah.moolah_core.models.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    
}
