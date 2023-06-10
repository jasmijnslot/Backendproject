package com.example.backendproject.dierenarts;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DierenartsService {

    @Autowired
    private DierenartsRepository dierenartsRepository;

    public Dierenarts nieuweDierenarts(@RequestBody Dierenarts dierenarts){
        return dierenartsRepository.save(dierenarts);
    }

    public List<Dierenarts> dierenartsLijst(){
        return dierenartsRepository.findAll();
    }

    public Dierenarts dierenartsPerId(@PathVariable Long id){
        return dierenartsRepository.findById(id).orElse(null);
    }

    public void verwijderDierenarts(@PathVariable Long id){
        dierenartsRepository.deleteById(id);
    }

}
