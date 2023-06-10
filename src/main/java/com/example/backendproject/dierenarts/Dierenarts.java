package com.example.backendproject.dierenarts;

import jakarta.persistence.*;
import lombok.*;

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
    @NonNull
    private Long id;

    @Column(name = "achterNaam")
    @NonNull
    private String Achternaam;

    @Column(name = "telefoonNr")
    @NonNull
    private int telefoonNr;

    @Column(name = "specialisatie")
    @NonNull
    private String specialisatie;
}
