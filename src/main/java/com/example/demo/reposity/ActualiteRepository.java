package com.example.demo.reposity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Actualite;

@Repository
public interface ActualiteRepository extends  JpaRepository<Actualite, Integer> {

}
