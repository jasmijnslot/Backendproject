package com.example.backendproject.afspraak;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AfspraakRepository extends JpaRepository<Afspraak, Long> {

}
