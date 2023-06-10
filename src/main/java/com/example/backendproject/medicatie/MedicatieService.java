package com.example.backendproject.medicatie;

import com.example.backendproject.afspraak.Afspraak;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MedicatieService {

    @Autowired
    private MedicatieRepository medicatieRepository;

    public Medicatie nieuweMedicatie(@RequestBody Medicatie medicatie){
        return medicatieRepository.save(medicatie);
    }

    public List<Medicatie> medicatieLijst(){
        return medicatieRepository.findAll();
    }

    public Medicatie medicatiePerId(@PathVariable Long id) {
        return medicatieRepository.findById(id).orElse(null);
    }

    public void verwijderMedicatie(@PathVariable Long id) {
        medicatieRepository.deleteById(id);
    }

}
