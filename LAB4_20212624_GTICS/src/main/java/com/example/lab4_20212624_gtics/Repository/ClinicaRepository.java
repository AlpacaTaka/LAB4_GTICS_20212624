package com.example.lab4_20212624_gtics.Repository;


import com.example.lab4_20212624_gtics.Entity.Clinic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClinicaRepository extends JpaRepository<Clinic, Integer> {
}
