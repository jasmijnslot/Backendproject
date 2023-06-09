package com.example.backendproject.dier;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class DierController {

    @Autowired
    private DierRepository dierRepository;

    @PostMapping("/dieren")
    public Dier createDier(@RequestBody Dier dier) {
        return dierRepository.save(dier);
    }

}
