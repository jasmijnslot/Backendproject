package com.example.backendproject.dierenarts;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class DierenartsController {

    @Autowired
    private DierenartsRepository dierenartsRepository;

    @PostMapping("/dierenartsen")
    public Dierenarts creatDierenarts(@RequestBody Dierenarts dierenarts){
        return dierenartsRepository.save(dierenarts);
    }
}
