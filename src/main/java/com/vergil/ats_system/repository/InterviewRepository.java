package com.vergil.ats_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vergil.ats_system.model.Interview;

public interface InterviewRepository extends JpaRepository<Interview, Long> {

}