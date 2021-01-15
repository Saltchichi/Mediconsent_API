package com.ort.mediconsent.controllers.rest;

import com.ort.mediconsent.entities.Examen;
import com.ort.mediconsent.repositories.ExamenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExamenController {
    @Autowired
    ExamenRepository examenRepository;

    @RequestMapping(path = "/rest/examens", method = RequestMethod.GET)
    public List<Examen> getExamens() {
        return examenRepository.findAll();
    }

    @RequestMapping(path = "/rest/examen/{id}", method = RequestMethod.GET)
    public Examen getExamen(@PathVariable Long id) {
        return examenRepository.findById(id).orElse(null);
    }
}
