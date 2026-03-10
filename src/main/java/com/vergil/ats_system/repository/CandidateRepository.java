package com.vergil.ats_system.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.vergil.ats_system.model.Candidate;

public interface CandidateRepository extends JpaRepository<Candidate, Long> {

    List<Candidate> findBySkillsContainingIgnoreCase(String skills);

}