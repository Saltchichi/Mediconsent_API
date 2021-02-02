package com.ort.mediconsent.controllers.rest;

import com.ort.mediconsent.entities.Fonctionnalite;
import com.ort.mediconsent.services.FonctionnaliteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class FonctionnaliteController {
    @Autowired
    FonctionnaliteServices fonctionnaliteServices;

    @RequestMapping(path = "/rest/fonctionnalites", method = RequestMethod.GET)
    public List<Fonctionnalite> getFonctionnalites() {
        return fonctionnaliteServices.findAll();
    }

    @RequestMapping(path = "/rest/fonctionnalite/{id}", method = RequestMethod.GET)
    public Fonctionnalite getFonctionnalite(@PathVariable Long id) {
        return fonctionnaliteServices.findById(id);
    }

    @RequestMapping(path = "/rest/fonctionnalite/delete/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        fonctionnaliteServices.deleteById(id);
    }

    @RequestMapping(path = "/rest/fonctionnalite/save", method = RequestMethod.PUT)
    public Fonctionnalite save(@RequestBody Fonctionnalite fonctionnalite) {
        return fonctionnaliteServices.save(fonctionnalite);
    }
}
