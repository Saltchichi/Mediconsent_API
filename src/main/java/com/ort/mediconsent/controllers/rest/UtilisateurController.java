package com.ort.mediconsent.controllers.rest;

import com.ort.mediconsent.entities.Etablissement;
import com.ort.mediconsent.entities.Utilisateur;
import com.ort.mediconsent.services.UtilisateurServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@CrossOrigin
@RestController
public class UtilisateurController {
    @Autowired
    UtilisateurServices utilisateurServices;

    @RequestMapping(path = "/rest/utilisateurs", method = RequestMethod.GET)
    public List<Utilisateur> getUsers() {
        return utilisateurServices.findAll();
    }

    @RequestMapping(path = "/rest/utilisateur/{id}", method = RequestMethod.GET)
    public Utilisateur getUser(@PathVariable Long id) {
        return utilisateurServices.findById(id);
    }

    @RequestMapping(path = "/rest/utilisateur/delete/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        utilisateurServices.deleteById(id);
    }

    @RequestMapping(path = "/rest/utilisateur/save", method = RequestMethod.PUT)
    public Utilisateur save(@RequestBody Utilisateur utilisateur) {
        return utilisateurServices.save(utilisateur);
    }

    @RequestMapping(path = "/rest/utilisateurs/import/csv/{csvfile}", method = RequestMethod.POST)
    public void saveCsvDataFile(@PathVariable String csvfile) throws IOException {
        utilisateurServices.saveCsvDataFile(csvfile);
    }

    @RequestMapping(path = "/rest/checkLogin/{numero_securite_sociale}/{mot_de_passe_utilisateur}", method = RequestMethod.GET)
    public Utilisateur checkLogin(@PathVariable String numero_securite_sociale,
                                  @PathVariable String mot_de_passe_utilisateur) {
        return utilisateurServices.checkLogin(numero_securite_sociale, mot_de_passe_utilisateur);
    }

    @RequestMapping(path = "/rest/checkLogin2/{nom_utilisateur}/{mot_de_passe_utilisateur}", method = RequestMethod.GET)
    public Utilisateur checkLogin2(@PathVariable String nom_utilisateur,
                                  @PathVariable String mot_de_passe_utilisateur) {
        return utilisateurServices.checkLogin2(nom_utilisateur, mot_de_passe_utilisateur);
    }

}
