package com.example.backendproject.klant;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class KlantController {

    @Autowired
    private KlantService klantService;

    @PostMapping("/klanten")
    public Klant nieuweKlant(@RequestBody Klant klant){
        return klantService.nieuweKlant(klant);
    }

    @GetMapping("/klanten")
    public List<Klant> alleKlanten(){
        return klantService.klantLijst();
    }

    @GetMapping("/klanten/{id}")
    public Klant klantPerId(@PathVariable Long id){
        return klantService.klantPerId(id);
    }

    @DeleteMapping("/klanten/{id}")
    public void verwijderKlant(@PathVariable Long id){
        klantService.verwijderKLant(id);
    }









}
