package com.example.backendproject.dier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DierRepository extends JpaRepository<Dier, Long> {
}
