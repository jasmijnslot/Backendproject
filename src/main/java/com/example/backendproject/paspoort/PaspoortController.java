package com.example.backendproject.paspoort;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class PaspoortController {

    @Autowired
    private PaspoortRepository paspoortRepository;

    @PostMapping("/paspoorten")
    public Paspoort createPaspoort(@RequestBody Paspoort paspoort){
        return paspoortRepository.save(paspoort);
    }

}
