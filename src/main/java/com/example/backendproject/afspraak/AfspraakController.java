package com.example.backendproject.afspraak;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class AfspraakController {

    @Autowired
    private AfspraakService afspraakService;

    @PostMapping("/afspraken")
    public Afspraak nieuweAfspraak(@RequestBody Afspraak afspraak){
        return afspraakService.nieuweAfspraak(afspraak);
    }

    @GetMapping("/afspraken")
    public List<Afspraak> alleAfspraken(){
        return afspraakService.afsprakenLijst();
    }

    @GetMapping("/afspraken/{id}")
    public Afspraak afspraakPerId(@PathVariable Long id) {
        return afspraakService.afspraakPerId(id);
    }

    @DeleteMapping("/afspraken/{id}")
    public void verwijderPerId(@PathVariable Long id) {
        afspraakService.verwijderAfspraak(id);
    }


}
