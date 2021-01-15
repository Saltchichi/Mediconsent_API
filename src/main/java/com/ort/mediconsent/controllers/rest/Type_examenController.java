package com.ort.mediconsent.controllers.rest;

import com.ort.mediconsent.entities.Type_examen;
import com.ort.mediconsent.repositories.Type_examenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Type_examenController {
    @Autowired
    Type_examenRepository type_examenRepository;

    @RequestMapping(path = "/rest/type_examens", method = RequestMethod.GET)
    public List<Type_examen> getType_examens() {
        return type_examenRepository.findAll();
    }

    @RequestMapping(path = "/rest/type_examen/{id}", method = RequestMethod.GET)
    public Type_examen getTypeExamen(@PathVariable Long id) {
        return type_examenRepository.findById(id).orElse(null);
    }
}
