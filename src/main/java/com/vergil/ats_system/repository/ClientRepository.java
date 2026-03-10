package com.vergil.ats_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vergil.ats_system.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}