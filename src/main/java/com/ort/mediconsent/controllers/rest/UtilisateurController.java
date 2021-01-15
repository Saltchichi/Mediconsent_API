package com.ort.mediconsent.controllers.rest;

import com.ort.mediconsent.entities.Utilisateur;
import com.ort.mediconsent.repositories.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UtilisateurController {
    @Autowired
    UtilisateurRepository utilisateurRepository;

    @RequestMapping(path = "/rest/utilisateurs", method = RequestMethod.GET)
    public List<Utilisateur> getUsers() {
        return utilisateurRepository.findAll();
    }

    @GetMapping("/rest/utilisateurs/{id}")
    public String getUserById(@PathVariable(value = "id") Iterable id, Model model) {
        model.addAttribute("user", utilisateurRepository.findAllById(id));
        model.addAttribute("id", id);
        return "user";
    }


}
