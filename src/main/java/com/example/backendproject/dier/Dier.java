package com.example.backendproject.dier;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Dier")
public class Dier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @NonNull
    private Long id;

    @Column(name = "naam")
    @NonNull
    private String naam;

    @Column(name = "geboortDatum")
    @NonNull
    private Date geboorteDatum;

    @Column(name = "soort")
    @NonNull
    private String soort;

}
