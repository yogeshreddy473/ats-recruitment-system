package com.vergil.ats_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.vergil.ats_system.dto.DashboardResponse;
import com.vergil.ats_system.repository.*;

@RestController
@RequestMapping("/api/dashboard")
public class DashboardController {

    @Autowired
    private CandidateRepository candidateRepository;

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private RequirementRepository requirementRepository;

    @Autowired
    private InterviewRepository interviewRepository;

    @Autowired
    private PlacementRepository placementRepository;

    @GetMapping
    public DashboardResponse getDashboardData() {

        DashboardResponse response = new DashboardResponse();

        response.setTotalCandidates(candidateRepository.count());
        response.setTotalClients(clientRepository.count());
        response.setTotalRequirements(requirementRepository.count());
        response.setTotalInterviews(interviewRepository.count());
        response.setTotalPlacements(placementRepository.count());

        return response;
    }
}