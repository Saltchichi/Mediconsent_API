package com.ort.mediconsent.services;

import com.ort.mediconsent.entities.Etablissement;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EtablissementRepository {
    @Autowired
    private com.ort.mediconsent.repositories.EtablissementRepository EtablissementRepository;

    public List<Etablissement> getEtablissement() {
        return EtablissementRepository.findAll();
    }

    /*public Etablissement getEtablissementById(Long id) {
        return EtablissementRepository.findById(id);
    }*/
}
