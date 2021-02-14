package com.ort.mediconsent.repositories;

import com.ort.mediconsent.entities.Examen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Repository
public interface ExamenRepository extends JpaRepository<Examen, Long> {

    List<Examen> findAll();

    Optional<Examen> findById(@PathVariable Long id);

    void deleteById(@PathVariable Long id);

    Examen save(@RequestBody Examen examen);

    @Query(value = "SELECT * FROM examen WHERE id_etablissement = :id_etablissement",
            nativeQuery = true)
    Collection<Examen> findExamensByEtablissement(@Param("id_etablissement") Long id_etablissement);

    @Query(value = "SELECT e.* FROM examen e, utilisateur u, utilisateur_examen ue " +
            "WHERE e.id_examen = ue.id_examen " +
            "AND ue.id_utilisateur = :id_utilisateur",
            nativeQuery = true)
    Collection<Examen> findExamensByUtilisateur(@Param("id_utilisateur") Long id_utilisateur);

    @Query(value = "SELECT e.*,te.* " +
            "FROM" +
            "    examen e " +
            "    JOIN utilisateur_examen ue ON ue.id_examen = e.id_examen " +
            "    JOIN utilisateur u ON ue.id_utilisateur = u.id_utilisateur " +
            "    JOIN type_examen te ON e.id_type_examen = te.id_type_examen " +
            "WHERE" +
            "    e.date_examen = CURDATE()" +
            "    AND u.nom_utilisateur = :nom" +
            "    AND u.prenom_utilisateur = :prenom" +
            "    AND e.annuler = 0",
            nativeQuery = true)
    Collection<Examen> findExamensByPrenomNom(@Param("prenom") String prenom,
                                              @Param("nom") String nom);

}
