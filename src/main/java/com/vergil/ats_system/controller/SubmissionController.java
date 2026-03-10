package com.vergil.ats_system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.vergil.ats_system.model.Submission;
import com.vergil.ats_system.service.SubmissionService;

@RestController
@RequestMapping("/api/submissions")
public class SubmissionController {

    @Autowired
    private SubmissionService submissionService;

    @PostMapping
    public Submission createSubmission(@RequestBody Submission submission) {
        return submissionService.saveSubmission(submission);
    }

    @GetMapping
    public List<Submission> getAllSubmissions() {
        return submissionService.getAllSubmissions();
    }

    @GetMapping("/{id}")
    public Submission getSubmissionById(@PathVariable Long id) {
        return submissionService.getSubmissionById(id);
    }

    @GetMapping("/pipeline")
    public List<Submission> getPipeline(@RequestParam String status) {
        return submissionService.getByPipelineStatus(status);
    }



    @DeleteMapping("/{id}")
    public String deleteSubmission(@PathVariable Long id) {
        submissionService.deleteSubmission(id);
        return "Submission deleted successfully";
    }
}