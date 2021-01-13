package com.ort.mediconsent.repositories;

import com.ort.mediconsent.entities.Fonctionnalite;
import com.ort.mediconsent.entities.Langage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LangageRepository extends JpaRepository {
    Langage findById(Long id_langage);
    void deleteById(Long id_langage);
    Langage findByLibelle(String libelle_langage);
}