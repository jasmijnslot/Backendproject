package com.example.backendproject.dier;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    private Long id;

    @Column(name = "naam")
    private String naam;

    @Column(name = "geboortDatum")
    private Date geboorteDatum;

    @Column(name = "soort")
    private String soort;

}
