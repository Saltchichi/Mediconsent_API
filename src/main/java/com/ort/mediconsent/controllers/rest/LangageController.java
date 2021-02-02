package com.ort.mediconsent.controllers.rest;

import com.ort.mediconsent.entities.Langage;
import com.ort.mediconsent.services.LangageServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class LangageController {
    @Autowired
    LangageServices langageServices;

    @RequestMapping(path = "/rest/langages", method = RequestMethod.GET)
    public List<Langage> getLangages() {
        return langageServices.findAll();
    }

    @RequestMapping(path = "/rest/langage/{id}", method = RequestMethod.GET)
    public Langage getLangage(@PathVariable Long id) {
        return langageServices.findById(id);
    }

    @RequestMapping(path = "/rest/langage/delete/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        langageServices.deleteById(id);
    }

    @RequestMapping(path = "/rest/langage/save", method = RequestMethod.PUT)
    public Langage save(@RequestBody Langage langage) {
        return langageServices.save(langage);
    }
}
