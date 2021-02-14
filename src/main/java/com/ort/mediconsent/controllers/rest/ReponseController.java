package com.ort.mediconsent.controllers.rest;

import com.ort.mediconsent.entities.Reponse;
import com.ort.mediconsent.services.ReponseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class ReponseController {

    @Autowired
    ReponseServices reponseServices;

    @RequestMapping(path = "/rest/reponses", method = RequestMethod.GET)
    public List<Reponse> getReponses() {
        return reponseServices.findAll();
    }

    @RequestMapping(path = "/rest/reponse/{id}", method = RequestMethod.GET)
    public Reponse getReponse(@PathVariable Long id) {
        return reponseServices.findById(id);
    }

    @RequestMapping(path = "/rest/reponse/delete/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        reponseServices.deleteById(id);
    }

    @RequestMapping(path = "/rest/reponse/save", method = RequestMethod.PUT)
    public Reponse save(@RequestBody Reponse reponse) {
        return reponseServices.save(reponse);
    }
}
