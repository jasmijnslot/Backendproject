package com.example.backendproject.paspoort;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class PaspoortController {

    @Autowired
    private PaspoortService paspoortService;

    @PostMapping("/paspoorten")
    public Paspoort nieuwPaspoort(@RequestBody Paspoort paspoort){
        return paspoortService.nieuwPaspoort(paspoort);
    }

    @GetMapping("/paspoorten")
    public List<Paspoort> allePaspoorten(){
        return paspoortService.paspoortLijst();
    }

    @GetMapping("/paspoorten/{id}")
    public Paspoort paspoortPerId(@PathVariable Long id){
        return paspoortService.paspoortPerId(id);
    }

    @DeleteMapping("/paspoorten/{id}")
    public void verwijderPaspoort(@PathVariable Long id){
        paspoortService.verwijderPaspoort(id);
    }

}
