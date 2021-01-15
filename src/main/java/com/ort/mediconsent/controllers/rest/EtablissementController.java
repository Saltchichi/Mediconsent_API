package com.ort.mediconsent.controllers.rest;

import com.ort.mediconsent.entities.Etablissement;
import com.ort.mediconsent.repositories.EtablissementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EtablissementController {
    @Autowired
    EtablissementRepository etablissementRepository;

    @RequestMapping(path = "/rest/etablissements", method = RequestMethod.GET)
    public List<Etablissement> getEtablissements() {
        return etablissementRepository.findAll();
    }

    @RequestMapping(path = "/rest/etablissement/{id}", method = RequestMethod.GET)
    public Etablissement getEtablissement(@PathVariable Long id) {
        return etablissementRepository.findById(id).orElse(null);
    }

    @RequestMapping(path = "/rest/etablissement/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        etablissementRepository.deleteById(id);
    }

    @RequestMapping(path = "/rest/etablissement/save", method = RequestMethod.PUT)
    public Etablissement save(@RequestBody Etablissement etablissement) {
        return etablissementRepository.save(etablissement);
    }
}
