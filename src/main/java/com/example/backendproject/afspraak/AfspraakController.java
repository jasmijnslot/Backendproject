package com.example.backendproject.afspraak;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class AfspraakController {

    @Autowired
    private AfspraakRepository afspraakRepository;

    @PostMapping("/afspraken")
    public Afspraak createAfspraak(@RequestBody Afspraak afspraak) {
        return afspraakRepository.save(afspraak);
    }

}
