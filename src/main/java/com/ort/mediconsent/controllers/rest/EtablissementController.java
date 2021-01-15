package com.ort.mediconsent.controllers.rest;

import com.ort.mediconsent.entities.Etablissement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public class EtablissementController {
    @Autowired
    com.ort.mediconsent.repositories.EtablissementRepository EtablissementRepository;

    @RequestMapping(path = "/rest/etablissements", method = RequestMethod.GET)
    public List<Etablissement> getUsers() {
        return EtablissementRepository.findAll();
    }
}
