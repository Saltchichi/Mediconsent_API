package com.ort.mediconsent.services;

import com.ort.mediconsent.entities.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UtilisateurServices {
    @Autowired
    private com.ort.mediconsent.repositories.UtilisateurRepository UtilisateurRepository;

    public Utilisateur save(Utilisateur user) {
        if (user.getMot_de_passe_utilisateur() != null) {
            //TODO set the encrypted user password
            /*user.setMot_de_passe_utilisateur(DigestUtils.md5Hex(user.getMot_de_passe_utilisateur()));*/
        }
        return UtilisateurRepository.save(user);
    }

    public void deleteUser(Long id) {
        UtilisateurRepository.deleteById(id);
    }

}
