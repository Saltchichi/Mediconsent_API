package com.ort.mediconsent.services;

import com.ort.mediconsent.entities.Utilisateur;
import com.ort.mediconsent.repositories.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.IOException;
import java.util.List;

@Service
public class UtilisateurServices {
    @Autowired
    private UtilisateurRepository utilisateurRepository;

    public List<Utilisateur> findAll() {
        return utilisateurRepository.findAll();
    }

    public Utilisateur findById(@PathVariable Long id) {
        return utilisateurRepository.findById(id).orElse(null);
    }

    public void deleteById(@PathVariable Long id) {
        utilisateurRepository.deleteById(id);
    }

    public Utilisateur save(@RequestBody Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    public Utilisateur checkLogin(@Param("numero_securite_sociale") String numero_securite_sociale,
                                  @Param("mot_de_passe_utilisateur") String mot_de_passe_utilisateur){
        return utilisateurRepository.checkLogin(numero_securite_sociale, mot_de_passe_utilisateur);
    }

    public Utilisateur checkLogin2(@Param("nom_utilisateur") String nom_utilisateur,
                                  @Param("nom_utilisateur") String prenom_utilisateur){
        return utilisateurRepository.checkLogin(nom_utilisateur, prenom_utilisateur);
    }

    public void saveCsvDataFile(@PathVariable String csvfile) throws IOException {
        utilisateurRepository.saveCsvDataFile(csvfile);
    }

    /*public Utilisateur save(Utilisateur user) {
        if (user.getMot_de_passe_utilisateur() != null) {
            //TODO set the encrypted user password
            /*user.setMot_de_passe_utilisateur(DigestUtils.md5Hex(user.getMot_de_passe_utilisateur()));
        }
        return UtilisateurRepository.save(user);
    }*/

    /*public boolean connect(Long numero_securite_sociale){
        return true;
    }*/

}
