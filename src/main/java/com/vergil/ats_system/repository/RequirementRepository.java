package com.vergil.ats_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vergil.ats_system.model.Requirement;

public interface RequirementRepository extends JpaRepository<Requirement, Long> {

}