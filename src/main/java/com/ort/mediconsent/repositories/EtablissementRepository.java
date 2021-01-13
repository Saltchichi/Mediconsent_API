package com.ort.mediconsent.repositories;

import com.ort.mediconsent.entities.Avis;
import com.ort.mediconsent.entities.Etablissement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtablissementRepository extends JpaRepository {
    Etablissement findById(Long id_etablissement);
    void deleteById(Long id_etablissement);
    Etablissement findByNom(String nom_etablissement);
}
