package com.ort.mediconsent.controllers.rest;

import com.ort.mediconsent.entities.Langage;
import com.ort.mediconsent.repositories.LangageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LangageController {
    @Autowired
    LangageRepository langageRepository;

    @RequestMapping(path = "/rest/langages", method = RequestMethod.GET)
    public List<Langage> getLangage() {
        return langageRepository.findAll();
    }
}
