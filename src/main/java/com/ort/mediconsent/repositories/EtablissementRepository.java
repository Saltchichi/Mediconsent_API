package com.ort.mediconsent.repositories;

import com.ort.mediconsent.entities.Avis;
import com.ort.mediconsent.entities.Etablissement;
import com.ort.mediconsent.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtablissementRepository extends JpaRepository<Etablissement, Long> {

}
