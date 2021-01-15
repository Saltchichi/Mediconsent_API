package com.ort.mediconsent.controllers.rest;

import com.ort.mediconsent.entities.Avis;
import com.ort.mediconsent.repositories.AvisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AvisController {
    @Autowired
    AvisRepository avisRepository;

    @RequestMapping(path = "/rest/avis", method = RequestMethod.GET)
    public List<Avis> getAvis() {
        return avisRepository.findAll();
    }
}
