package com.ort.mediconsent.controllers.rest;

import com.ort.mediconsent.entities.Utilisateur;
import com.ort.mediconsent.repositories.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UtilisateurController {
    @Autowired
    UtilisateurRepository utilisateurRepository;

    @RequestMapping(path = "/rest/utilisateurs", method = RequestMethod.GET)
    public List<Utilisateur> getUsers() {
        return utilisateurRepository.findAll();
    }
}
