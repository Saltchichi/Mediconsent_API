package com.ort.mediconsent.controllers.rest;

import com.ort.mediconsent.entities.Langage;
import com.ort.mediconsent.entities.Type_examen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public class Type_examenController {
    @Autowired
    com.ort.mediconsent.repositories.Type_examenRepository Type_examenRepository;

    @RequestMapping(path = "/rest/type_examen", method = RequestMethod.GET)
    public List<Type_examen> getUsers() {
        return Type_examenRepository.findAll();
    }
}
