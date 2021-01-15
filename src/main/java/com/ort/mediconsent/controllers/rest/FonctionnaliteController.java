package com.ort.mediconsent.controllers.rest;

import com.ort.mediconsent.entities.Fonctionnalite;
import com.ort.mediconsent.repositories.FonctionnaliteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(path = "/rest/fonctionnalite/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        fonctionnaliteRepository.deleteById(id);
    }

    @RequestMapping(path = "/rest/fonctionnalite/save", method = RequestMethod.PUT)
    public Fonctionnalite save(@RequestBody Fonctionnalite fonctionnalite) {
        return fonctionnaliteRepository.save(fonctionnalite);
    }
}
