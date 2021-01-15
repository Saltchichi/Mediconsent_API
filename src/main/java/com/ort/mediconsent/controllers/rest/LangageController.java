package com.ort.mediconsent.controllers.rest;

import com.ort.mediconsent.entities.Fonctionnalite;
import com.ort.mediconsent.entities.Langage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public class LangageController {
    @Autowired
    com.ort.mediconsent.repositories.LangageRepository LangageRepository;

    @RequestMapping(path = "/rest/langages", method = RequestMethod.GET)
    public List<Langage> getUsers() {
        return LangageRepository.findAll();
    }
}
