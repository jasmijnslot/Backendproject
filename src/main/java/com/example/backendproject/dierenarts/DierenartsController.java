package com.example.backendproject.dierenarts;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class DierenartsController {

    @Autowired
    private DierenartsService dierenartsService;

    @PostMapping("/dierenartsen")
    public Dierenarts nieuweDierenarts(@RequestBody Dierenarts dierenarts){
        return dierenartsService.nieuweDierenarts(dierenarts);
    }

    @GetMapping("/dierenartsen")
    public List<Dierenarts> alleDierenartsen(){
        return dierenartsService.dierenartsLijst();
    }

    @GetMapping("/dierenartsen/{id}")
    public Dierenarts dierenartsPerId(@PathVariable Long id){
        return dierenartsService.dierenartsPerId(id);
    }

    @DeleteMapping("/dierenartsen/{id}")
    public void verwijderDierenarts(@PathVariable Long id){
        dierenartsService.verwijderDierenarts(id);
    }

}
