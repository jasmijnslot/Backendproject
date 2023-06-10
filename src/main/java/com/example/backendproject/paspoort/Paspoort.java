package com.example.backendproject.paspoort;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Paspoort")
public class Paspoort {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @NonNull
    private Long id;

    @Column(name = "afgifteDatum")
    @NonNull
    private Date afgifteDatum;

    @Column(name = "nummer")
    @NonNull
    private String nummer;


}
