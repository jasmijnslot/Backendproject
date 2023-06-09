package com.example.backendproject.paspoort;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaspoortRepository extends JpaRepository<Paspoort, Long> {

}
