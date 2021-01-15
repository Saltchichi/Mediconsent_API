package com.ort.mediconsent.controllers.rest;

import com.ort.mediconsent.entities.Type_examen;
import com.ort.mediconsent.repositories.Type_examenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(path = "/rest/type_examen/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        type_examenRepository.deleteById(id);
    }


    @RequestMapping(path = "/rest/type_examen/save", method = RequestMethod.PUT)
    public Type_examen save(@RequestBody Type_examen type_examen) {
        return type_examenRepository.save(type_examen);
    }
}