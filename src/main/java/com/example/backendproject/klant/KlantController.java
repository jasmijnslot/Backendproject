package com.example.backendproject.klant;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class KlantController {

    @Autowired
    private KlantRepository klantRepository;

    @PostMapping("/klanten")
    public Klant createKlant(@RequestBody Klant klant){
        return klantRepository.save(klant);
    }

}
