package com.ort.mediconsent.controllers.rest;

import com.ort.mediconsent.entities.Examen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public class ExamenController {
    @Autowired
    com.ort.mediconsent.repositories.ExamenRepository ExamenRepository;

    @RequestMapping(path = "/rest/examens", method = RequestMethod.GET)
    public List<Examen> getUsers() {
        return ExamenRepository.findAll();
    }
}
