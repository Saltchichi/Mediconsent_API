package com.ort.mediconsent.controllers.rest;

import com.ort.mediconsent.entities.Avis;
import com.ort.mediconsent.services.AvisServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@CrossOrigin
public class AvisController {
    @Autowired
    AvisServices avisService;

    @RequestMapping(path = "/rest/avis", method = RequestMethod.GET)
    public List<Avis> getAvis() {
        return avisService.findAll();
    }

    @RequestMapping(path = "/rest/avis/{id}", method = RequestMethod.GET)
    public Avis getAvi(@PathVariable Long id) {
        return avisService.findById(id);
    }

    @RequestMapping(path = "/rest/avis/delete/{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable Long id) {
        avisService.deleteById(id);
    }

    @RequestMapping(path = "/rest/avis/save", method = RequestMethod.PUT)
    public Avis save(@RequestBody Avis avis) {
        return avisService.save(avis);
    }
}
