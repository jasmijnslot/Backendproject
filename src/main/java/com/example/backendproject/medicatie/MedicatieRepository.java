package com.example.backendproject.medicatie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicatieRepository extends JpaRepository< Medicatie, Long> {
}
