package com.ort.mediconsent.services;

import com.ort.mediconsent.entities.Examen;
import com.ort.mediconsent.entities.Question;
import com.ort.mediconsent.repositories.ExamenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collection;
import java.util.List;

@Service
public class ExamenServices {
    @Autowired
    private ExamenRepository examenRepository;

    public List<Examen> findAll() {
        return examenRepository.findAll();
    }

    public Examen findById(@PathVariable Long id) {
        return examenRepository.findById(id).orElse(null);
    }

    public void deleteById(@PathVariable Long id) {
        examenRepository.deleteById(id);
    }

    public Examen save(@RequestBody Examen examen) {
        return examenRepository.save(examen);
    }

    public Collection<Examen> findExamensByEtablissement(@Param("id_etablissement") Long id_etablissement){
        return examenRepository.findExamensByEtablissement(id_etablissement);
    }

    public Collection<Examen> findExamensByUtilisateur(@Param("id_utilisateur") Long id_utilisateur){
        return examenRepository.findExamensByUtilisateur(id_utilisateur);
    }

    public Collection<Examen> findExamensByPrenomNom(@PathVariable String prenom, @PathVariable String nom) {
        return examenRepository.findExamensByPrenomNom(prenom, nom);
    }
}
