package com.ort.mediconsent.controllers.rest;

import com.ort.mediconsent.entities.Avis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public class AvisController {
    @Autowired
    com.ort.mediconsent.repositories.AvisRepository AvisRepository;

    @RequestMapping(path = "/rest/avis", method = RequestMethod.GET)
    public List<Avis> getUsers() {
        return AvisRepository.findAll();
    }
}
