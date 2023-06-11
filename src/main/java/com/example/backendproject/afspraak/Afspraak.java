package com.example.backendproject.afspraak;

import com.example.backendproject.dier.Dier;
import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Afspraak")
public class Afspraak {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @NonNull
    private Long id;

    @NonNull
    @Column(name = "datum")
    private Date datum;

    @NonNull
    @Column(name = "reden")
    private String reden;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_id")
    private Dier dier;


}