package com.ort.mediconsent.controllers.rest;

import com.ort.mediconsent.entities.Etablissement;
import com.ort.mediconsent.services.EtablissementServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class EtablissementController {
    @Autowired
    EtablissementServices etablissementServices;

    @RequestMapping(path = "/rest/etablissements", method = RequestMethod.GET)
    public List<Etablissement> getEtablissements() {
        return etablissementServices.findAll();
    }

    @RequestMapping(path = "/rest/etablissement/{id}", method = RequestMethod.GET)
    public Etablissement getEtablissement(@PathVariable Long id) {
        return etablissementServices.findById(id);
    }

    @RequestMapping(path = "/rest/etablissement/delete/{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable Long id) {
        etablissementServices.deleteById(id);
    }

    @RequestMapping(path = "/rest/etablissement/save", method = RequestMethod.PUT)
    public Etablissement save(@RequestBody Etablissement etablissement) {
        return etablissementServices.save(etablissement);
    }

    @RequestMapping(path = "/rest/etablissement/utilisateur/{id}", method = RequestMethod.GET)
    public Etablissement findEtablissementByUtilisateur(@PathVariable Long id) {
        return etablissementServices.findEtablissementByUtilisateur(id);
    }
}
