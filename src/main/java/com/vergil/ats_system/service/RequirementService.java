package com.vergil.ats_system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vergil.ats_system.model.Requirement;
import com.vergil.ats_system.model.Candidate;
import com.vergil.ats_system.repository.RequirementRepository;
import com.vergil.ats_system.repository.CandidateRepository;

@Service
public class RequirementService {

    @Autowired
    private RequirementRepository requirementRepository;

    @Autowired
    private CandidateRepository candidateRepository;

    // Create Requirement
    public Requirement saveRequirement(Requirement requirement) {
        return requirementRepository.save(requirement);
    }

    // Get All Requirements
    public List<Requirement> getAllRequirements() {
        return requirementRepository.findAll();
    }

    // Get Requirement By ID
    public Requirement getRequirementById(Long id) {
        return requirementRepository.findById(id).orElse(null);
    }

    // Delete Requirement
    public void deleteRequirement(Long id) {
        requirementRepository.deleteById(id);
    }

    // 🔥 Find Matching Candidates for Requirement
    public List<Candidate> findMatchingCandidates(Long requirementId) {

        Requirement requirement = requirementRepository.findById(requirementId).orElse(null);

        if (requirement == null) {
            return null;
        }

        String skills = requirement.getSkillsRequired();

        return candidateRepository.findBySkillsContainingIgnoreCase(skills);
    }
}