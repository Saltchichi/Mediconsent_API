package com.ort.mediconsent.services;

import com.ort.mediconsent.entities.Avis;
import com.ort.mediconsent.repositories.AvisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class AvisServices {
    @Autowired
    private AvisRepository avisRepository;

    public List<Avis> findAll() {
        return avisRepository.findAll();
    }

    public Avis findById(@PathVariable Long id) {
        return avisRepository.findById(id).orElse(null);
    }

    public void deleteById(@PathVariable Long id) {
        avisRepository.deleteById(id);
    }

    public Avis save(@RequestBody Avis avis) {
        return avisRepository.save(avis);
    }
}
