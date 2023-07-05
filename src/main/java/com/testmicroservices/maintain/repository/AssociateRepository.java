package com.testmicroservices.maintain.repository;

import com.testmicroservices.maintain.entities.Associate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssociateRepository extends JpaRepository<Associate, String> {

    public Associate findByUsername(String username) ;

}
