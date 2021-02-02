package com.ort.mediconsent.repositories;

import com.ort.mediconsent.entities.Etablissement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EtablissementRepository extends JpaRepository<Etablissement, Long> {

    @Query(value = "SELECT e.* FROM Etablissement e, Utilisateur u, Etablissement_utilisateur eu" +
            "WHERE e.id_etablissement = eu.id_etablissement " +
            "AND WHERE :id_utilisateur = eu.id_utilisateur",
            nativeQuery = true)
    List<Etablissement> findEtablissementByUtilisateur(@Param("id_utilisateur") int id_utilisateur);

}
