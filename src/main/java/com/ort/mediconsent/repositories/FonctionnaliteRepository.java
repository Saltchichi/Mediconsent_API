package com.ort.mediconsent.repositories;

import com.ort.mediconsent.entities.Etablissement;
import com.ort.mediconsent.entities.Examen;
import com.ort.mediconsent.entities.Fonctionnalite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FonctionnaliteRepository extends JpaRepository<Fonctionnalite, Long> {
    //Fonctionnalite findById(Long id_fonctionnalite);
    void deleteById(Long id_fonctionnalite);
    //Fonctionnalite findByLibelle(String libelle_fonctionnalite);
}