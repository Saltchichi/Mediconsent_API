package com.ort.mediconsent.services;

import com.ort.mediconsent.entities.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UtilisateurServices {
    @Autowired
    private com.ort.mediconsent.repositories.UtilisateurRepository UtilisateurRepository;

    public List<Utilisateur> getUsers() {
        return UtilisateurRepository.findAll();
    }

   /* public Utilisateur editUser(Utilisateur user) {
        Utilisateur dbUser = getUserById(user.getLogin());
        dbUser.setNom(user.getNom());
        dbUser.setPrenom(user.getPrenom());
        if (user.getMotDePasse() != null) {
            dbUser.setMotDePasse(DigestUtils.md5Hex(user.getMotDePasse()));
        }
        return UtilisateurRepository.save(dbUser);
    }*/

    /*public Utilisateur saveUser(Utilisateur user)
    {
        if (user.getMotDePasse() != null) {
            user.setMotDePasse(DigestUtils.md5Hex(user.getMotDePasse()));
        }
        return UtilisateurRepository.save(user);
    }*/

    public Utilisateur getUserById(Long id) {
        return UtilisateurRepository.findById(id).orElse(null);
    }

    public void addUser(String nom_utilisateur, String prenom_utilisateur) {
        UtilisateurRepository.save(new Utilisateur(nom_utilisateur, prenom_utilisateur));
    }

    /*public void addUser(Utilisateur user) {
        addUser(user.getNom(), user.getPrenom());
    }*/

    public void removeUser(Long id) {
        UtilisateurRepository.deleteById(id);
    }

}
