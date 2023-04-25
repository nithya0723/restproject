package com.example.samplee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.samplee.model.Samplee;

@Repository
public interface SampleeRepository extends JpaRepository<Samplee,Integer> {

}
