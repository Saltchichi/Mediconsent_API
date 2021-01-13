package com.ort.mediconsent.services;

import com.ort.mediconsent.entities.Fonctionnalite;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class FonctionnaliteRepository {
    @Autowired
    private com.ort.mediconsent.repositories.FonctionnaliteRepository FonctionnaliteRepository;

    public List<Fonctionnalite> getFonctionnalite() {
        return FonctionnaliteRepository.findAll();
    }

    /*public Fonctionnalite getFonctionnaliteById(Long id) {
        return FonctionnaliteRepository.findById(id);
    }*/
}
