package com.vergil.ats_system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vergil.ats_system.model.Placement;
import com.vergil.ats_system.repository.PlacementRepository;

@Service
public class PlacementService {

    @Autowired
    private PlacementRepository placementRepository;

    public Placement savePlacement(Placement placement) {
        return placementRepository.save(placement);
    }

    public List<Placement> getAllPlacements() {
        return placementRepository.findAll();
    }

    public Placement getPlacementById(Long id) {
        return placementRepository.findById(id).orElse(null);
    }

    public void deletePlacement(Long id) {
        placementRepository.deleteById(id);
    }
}