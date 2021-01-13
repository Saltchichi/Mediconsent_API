package com.ort.mediconsent.services;

import com.ort.mediconsent.entities.Utilisateur;
import com.sun.crypto.provider.PBKDF2HmacSHA1Factory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;

import javax.crypto.spec.PBEKeySpec;
import java.util.List;

public class UtilisateurServices {
    @Autowired
    private com.ort.mediconsent.repositories.UtilisateurRepository UtilisateurRepository;

    public List<Utilisateur> getUsers() {
        return UtilisateurRepository.findAll();
    }

    public Utilisateur saveUser(Utilisateur user) {
        if (user.getMot_de_passe_utilisateur() != null) {
            //TODO set the encrypted user password
            /*user.setMot_de_passe_utilisateur(DigestUtils.md5Hex(user.getMot_de_passe_utilisateur()));*/
        }
        return UtilisateurRepository.save(user);
    }

    public Utilisateur getUserById(Long id) {
        return UtilisateurRepository.findById(id).orElse(null);
    }

    public void addUser(String nom_utilisateur, String prenom_utilisateur) {
        UtilisateurRepository.save(new Utilisateur(nom_utilisateur, prenom_utilisateur));
    }

    public void addUser(Utilisateur user) {
        addUser(user.getNom_utilisateur(), user.getPrenom_utilisateur());
    }

    public void removeUser(Long id) {
        UtilisateurRepository.deleteById(id);
    }

}
