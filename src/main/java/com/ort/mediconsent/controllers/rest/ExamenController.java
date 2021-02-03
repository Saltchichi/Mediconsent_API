package com.ort.mediconsent.controllers.rest;

import com.ort.mediconsent.entities.Examen;
import com.ort.mediconsent.entities.Question;
import com.ort.mediconsent.services.ExamenServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@CrossOrigin
@RestController
public class ExamenController {
    @Autowired
    ExamenServices examenServices;

    @RequestMapping(path = "/rest/examens", method = RequestMethod.GET)
    public List<Examen> getExamens() {
        return examenServices.findAll();
    }

    @RequestMapping(path = "/rest/examen/{id}", method = RequestMethod.GET)
    public Examen getExamen(@PathVariable Long id) {
        return examenServices.findById(id);
    }

    @RequestMapping(path = "/rest/examen/delete/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        examenServices.deleteById(id);
    }

    @RequestMapping(path = "/rest/examen/save", method = RequestMethod.PUT)
    public Examen save(@RequestBody Examen examen) {
        return examenServices.save(examen);
    }

    @RequestMapping(path = "/rest/examens/etablissement/{id}", method = RequestMethod.GET)
    public Collection<Examen> findExamensByEtablissement(@PathVariable Long id){
        return examenServices.findExamensByEtablissement(id);
    }

    @RequestMapping(path = "/rest/examens/utilisateur/{id}", method = RequestMethod.GET)
    public Collection<Examen> findExamensByUtilisateur(@PathVariable Long id){
        return examenServices.findExamensByEtablissement(id);
    }
}
