package com.vergil.ats_system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.vergil.ats_system.model.Requirement;
import com.vergil.ats_system.model.Candidate;
import com.vergil.ats_system.service.RequirementService;

@RestController
@RequestMapping("/api/requirements")
public class RequirementController {

    @Autowired
    private RequirementService requirementService;

    // Create Requirement
    @PostMapping
    public Requirement createRequirement(@RequestBody Requirement requirement) {
        return requirementService.saveRequirement(requirement);
    }

    // Get All Requirements
    @GetMapping
    public List<Requirement> getAllRequirements() {
        return requirementService.getAllRequirements();
    }

    // Get Requirement by ID
    @GetMapping("/{id}")
    public Requirement getRequirementById(@PathVariable Long id) {
        return requirementService.getRequirementById(id);
    }

    // Delete Requirement
    @DeleteMapping("/{id}")
    public String deleteRequirement(@PathVariable Long id) {
        requirementService.deleteRequirement(id);
        return "Requirement deleted successfully";
    }

    // 🔥 Match Candidates with Requirement
    @GetMapping("/{id}/match-candidates")
    public List<Candidate> matchCandidates(@PathVariable Long id) {
        return requirementService.findMatchingCandidates(id);
    }
}