package com.example.backendproject.klant;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@RequiredArgsConstructor
public class KlantService {

    @Autowired
    private KlantRepository klantRepository;

    public Klant nieuweKlant(@RequestBody Klant klant){
        return klantRepository.save(klant);
    }

    public List<Klant> klantLijst(){
        return klantRepository.findAll();
    }

    public Klant klantPerId(@PathVariable Long id){
        return klantRepository.findById(id).orElse(null);
    }

    public void verwijderKLant(@PathVariable Long id){
        klantRepository.deleteById(id);
    }

}
