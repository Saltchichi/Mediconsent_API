package com.ort.mediconsent.controllers.rest;

import com.ort.mediconsent.entities.Examen;
import com.ort.mediconsent.repositories.ExamenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
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

    @RequestMapping(path = "/rest/examen/delete/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        examenRepository.deleteById(id);
    }

    @RequestMapping(path = "/rest/examen/save", method = RequestMethod.PUT)
    public Examen save(@RequestBody Examen examen) {
        return examenRepository.save(examen);
    }
}
