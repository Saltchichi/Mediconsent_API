package com.ort.mediconsent.controllers.rest;

import com.ort.mediconsent.entities.Avis;
import com.ort.mediconsent.repositories.AvisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@CrossOrigin
public class AvisController {
    @Autowired
    AvisRepository avisRepository;

    @RequestMapping(path = "/rest/avis", method = RequestMethod.GET)
    public List<Avis> getAvis() {
        return avisRepository.findAll();
    }

    @RequestMapping(path = "/rest/avis/{id}", method = RequestMethod.GET)
    public Avis getAvi(@PathVariable Long id) {
        return avisRepository.findById(id).orElse(null);
    }

    @RequestMapping(path = "/rest/avis/delete/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        avisRepository.deleteById(id);
    }

    @RequestMapping(path = "/rest/avis/save", method = RequestMethod.PUT)
    public Avis save(@RequestBody Avis avis) {
        return avisRepository.save(avis);
    }
}
