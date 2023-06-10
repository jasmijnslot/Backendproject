package com.example.backendproject.medicatie;

import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Medicatie")
public class Medicatie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @NonNull
    private Long id;

    @Column(name = "naam")
    @NonNull
    private String naam;

    @Column(name = "dosering")
    @NonNull
    private String dosering;

    @Column(name = "opmerking")
    @NonNull
    private String opmerking;
}
