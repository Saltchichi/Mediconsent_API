package com.ort.mediconsent.services;

import com.ort.mediconsent.entities.Avis;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AvisRepository {
    @Autowired
    private com.ort.mediconsent.repositories.AvisRepository AvisRepository;

    public List<Avis> getAvis() {
        return AvisRepository.findAll();
    }

   /* public Avis getAvisById(Long id) {
        return AvisRepository.findById(id);
    }*/
}
