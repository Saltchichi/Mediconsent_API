package com.ort.mediconsent.controllers.rest;

import com.ort.mediconsent.entities.Fonctionnalite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public class FonctionnaliteController {
    @Autowired
    com.ort.mediconsent.repositories.FonctionnaliteRepository FonctionnaliteRepository;

    @RequestMapping(path = "/rest/fonctionnalites", method = RequestMethod.GET)
    public List<Fonctionnalite> getUsers() {
        return FonctionnaliteRepository.findAll();
    }
}
