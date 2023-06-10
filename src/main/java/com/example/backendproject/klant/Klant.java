package com.example.backendproject.klant;

import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Klant")
public class Klant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @NonNull
    private Long id;

    @Column(name = "achterNaam")
    @NonNull
    private String achterNaam;

    @Column(name = "telefoonNr")
    @NonNull
    private String telefoonNr;

    @Column(name = "postcode")
    @NonNull
    private String postcode;

    @Column(name = "email")
    @NonNull
    private String email;


}
