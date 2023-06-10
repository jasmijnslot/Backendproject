package com.example.backendproject.afspraak;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;


@Service
@RequiredArgsConstructor
public class AfspraakService {

    @Autowired
    private AfspraakRepository afspraakRepository;

    public Afspraak nieuweAfspraak(@RequestBody Afspraak afspraak) {
        return afspraakRepository.save(afspraak);
    }

    public List<Afspraak> afsprakenLijst(){
        return afspraakRepository.findAll();
    }

    public Afspraak afspraakPerId(@PathVariable Long id) {
        return afspraakRepository.findById(id).orElse(null);
    }

    public void verwijderAfspraak(@PathVariable Long id) {
        afspraakRepository.deleteById(id);
    }

}
