package com.example.backendproject.dier;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class DierController {

    @Autowired
    private DierService dierService;

    @PostMapping("/dieren")
    public Dier nieuwDier(@RequestBody Dier dier) {
        return dierService.nieuwDier(dier);
    }

    @GetMapping("/dieren")
    public List<Dier> alleDieren(){
        return dierService.dierLijst();
    }

    @GetMapping("/dieren/{id}")
    public Dier dierPerId(@PathVariable Long id){
        return dierService.dierPerId(id);
    }

    @DeleteMapping("/dieren/{id}")
    public void verwijderDier(@PathVariable Long id){
        dierService.dierPerId(id);
    }

}
