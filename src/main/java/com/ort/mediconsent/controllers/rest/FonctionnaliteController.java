package com.ort.mediconsent.controllers.rest;

import com.ort.mediconsent.entities.Fonctionnalite;
import com.ort.mediconsent.repositories.FonctionnaliteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FonctionnaliteController {
    @Autowired
    FonctionnaliteRepository fonctionnaliteRepository;

    @RequestMapping(path = "/rest/fonctionnalites", method = RequestMethod.GET)
    public List<Fonctionnalite> getFonctionnalites() {
        return fonctionnaliteRepository.findAll();
    }

    @RequestMapping(path = "/rest/fonctionnalite/{id}", method = RequestMethod.GET)
    public Fonctionnalite getFonctionnalite(@PathVariable Long id) {
        return fonctionnaliteRepository.findById(id).orElse(null);
    }
}
