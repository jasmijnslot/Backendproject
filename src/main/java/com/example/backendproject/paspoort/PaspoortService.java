package com.example.backendproject.paspoort;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PaspoortService {

    @Autowired
    private PaspoortRepository paspoortRepository;

    public Paspoort nieuwPaspoort(@RequestBody Paspoort paspoort){
        return paspoortRepository.save(paspoort);
    }

    public List<Paspoort> paspoortLijst(){
        return paspoortRepository.findAll();
    }

    public Paspoort paspoortPerId(@PathVariable Long id){
        return paspoortRepository.findById(id).orElse(null);
    }

    public void verwijderPaspoort(@PathVariable Long id){
        paspoortRepository.deleteById(id);
    }

}
