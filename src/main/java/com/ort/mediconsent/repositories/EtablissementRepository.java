package com.ort.mediconsent.repositories;

import com.ort.mediconsent.entities.Etablissement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Repository
public interface EtablissementRepository extends JpaRepository<Etablissement, Long> {

    List<Etablissement> findAll();

    Optional<Etablissement> findById(@PathVariable Long id);

    void deleteById(@PathVariable Long id);

    Etablissement save(@RequestBody Etablissement etablissement);

    @Query(value = "SELECT e.* FROM Etablissement e, Utilisateur u, Etablissement_utilisateur eu " +
            "WHERE e.id_etablissement = eu.id_etablissement " +
            "AND eu.id_utilisateur = :id_utilisateur",
            nativeQuery = true)
    List<Etablissement> findEtablissementByUtilisateur(@Param("id_utilisateur") Long id_utilisateur);

}
