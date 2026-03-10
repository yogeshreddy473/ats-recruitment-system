package com.vergil.ats_system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vergil.ats_system.model.Activity;
import com.vergil.ats_system.repository.ActivityRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ActivityService {

    @Autowired
    private ActivityRepository activityRepository;

    public Activity logActivity(String action, String performedBy) {

        Activity activity = new Activity();

        activity.setAction(action);
        activity.setPerformedBy(performedBy);
        activity.setTimestamp(LocalDateTime.now());

        return activityRepository.save(activity);
    }

    public List<Activity> getAllActivities() {
        return activityRepository.findAll();
    }
}