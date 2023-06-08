package com.example.backendproject.dierenarts;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Dierenarts")
public class Dierenarts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "achterNaam")
    private String Achternaam;

    @Column(name = "telefoonNr")
    private int telefoonNr;

    @Column(name = "specialisatie")
    private String specialisatie;
}
