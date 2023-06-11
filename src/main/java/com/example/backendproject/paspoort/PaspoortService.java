package com.example.backendproject.paspoort;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import org.springframework.util.StringUtils;



import java.util.List;

@Service
@RequiredArgsConstructor
public class PaspoortService {

    @Autowired
    private PaspoortRepository paspoortRepository;

    public Paspoort nieuwPaspoort(@RequestBody Paspoort paspoort) {
        return paspoortRepository.save(paspoort);
    }

    public List<Paspoort> paspoortLijst() {
        return paspoortRepository.findAll();
    }

    public Paspoort paspoortPerId(@PathVariable Long id) {
        return paspoortRepository.findById(id).orElse(null);
    }

    public void verwijderPaspoort(@PathVariable Long id) {
        paspoortRepository.deleteById(id);
    }

    public Paspoort paspoortOpslag(MultipartFile file) {
        String nummer = StringUtils.cleanPath(file.getOriginalFilename());
        try {
            Paspoort paspoort = new Paspoort(nummer, file.getContentType(), file.getBytes());
            return paspoortRepository.save(paspoort);

        } catch (IOException ex) {
            throw new FileStorageException("Kon niet opgeslagen worden.", ex);
        }

    }

    public Paspoort krijgPaspoort(Long id) {
        return paspoortRepository.findById(id)
                .orElse(null);
    }
}
