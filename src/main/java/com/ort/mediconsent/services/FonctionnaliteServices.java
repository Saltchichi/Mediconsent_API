package com.ort.mediconsent.services;

import com.ort.mediconsent.entities.Fonctionnalite;
import com.ort.mediconsent.repositories.FonctionnaliteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class FonctionnaliteServices {
    @Autowired
    private FonctionnaliteRepository fonctionnaliteRepository;

    public List<Fonctionnalite> findAll() {
        return fonctionnaliteRepository.findAll();
    }

    public Fonctionnalite findById(@PathVariable Long id) {
        return fonctionnaliteRepository.findById(id).orElse(null);
    }

    public void deleteById(@PathVariable Long id) {
        fonctionnaliteRepository.deleteById(id);
    }

    public Fonctionnalite save(@RequestBody Fonctionnalite fonctionnalite) {
        return fonctionnaliteRepository.save(fonctionnalite);
    }

}
