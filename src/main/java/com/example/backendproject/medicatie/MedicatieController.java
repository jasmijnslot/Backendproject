package com.example.backendproject.medicatie;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class MedicatieController {

    @Autowired
    private MedicatieService medicatieService;

    @PostMapping("/medicaties")
    public Medicatie nieuweMedicatie(@RequestBody Medicatie medicatie){
        return medicatieService.nieuweMedicatie(medicatie);
    }

    @GetMapping("/medicaties")
    public List<Medicatie> alleMedicatie(){
        return medicatieService.medicatieLijst();
    }

    @GetMapping("/medicaties/{id}")
    public Medicatie medicatiePerId(@PathVariable Long id){
        return medicatieService.medicatiePerId(id);
    }

    @DeleteMapping("/medicaties/{id}")
    public void verwijderMedicatie(@PathVariable Long id){
        medicatieService.verwijderMedicatie(id);
    }

}
