package com.vergil.ats_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vergil.ats_system.model.Activity;

public interface ActivityRepository extends JpaRepository<Activity, Long> {

}