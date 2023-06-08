package com.example.backendproject.klant;

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
@Table(name = "Klant")
public class Klant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "achterNaam")
    private String achterNaam;
    @Column(name = "telefoonNr")
    private String telefoonNr;
    @Column(name = "postcode")
    private String postcode;
    @Column(name = "email")
    private String email;


}
