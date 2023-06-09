package com.example.backendproject.medicatie;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class MedicatieController {

    @Autowired
    private MedicatieRepository medicatieRepository;

    @PostMapping("/medicaties")
    public Medicatie createMedicatie(@RequestBody Medicatie medicatie){
        return medicatieRepository.save(medicatie);
    }

}
