package com.elogroup.demo.gateway.h2database.repository;

import com.elogroup.demo.gateway.h2database.model.Userdatabase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Userdatabase, Integer> {
}
