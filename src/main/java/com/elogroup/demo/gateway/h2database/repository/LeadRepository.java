package com.elogroup.demo.gateway.h2database.repository;

import com.elogroup.demo.gateway.h2database.model.LeadDatabase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeadRepository extends JpaRepository<LeadDatabase, Integer> {
    LeadDatabase findByEmail(String email);
}
