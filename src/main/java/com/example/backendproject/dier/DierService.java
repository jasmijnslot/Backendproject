package com.example.backendproject.dier;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DierService {

    @Autowired
    private DierRepository dierRepository;

    public Dier nieuwDier(@RequestBody Dier dier){
        return dierRepository.save(dier);
    }

    public List<Dier> dierLijst(){
        return dierRepository.findAll();
    }

    public Dier dierPerId(@PathVariable Long id){
        return dierRepository.findById(id).orElse(null);
    }

    public void verwijderDier(@PathVariable Long id){
        dierRepository.deleteById(id);
    }

}
