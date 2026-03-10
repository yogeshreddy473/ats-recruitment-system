package com.vergil.ats_system.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.vergil.ats_system.model.Submission;

public interface SubmissionRepository extends JpaRepository<Submission, Long> {

    List<Submission> findByPipelineStatus(String pipelineStatus);

}