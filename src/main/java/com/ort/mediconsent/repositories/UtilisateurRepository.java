package com.ort.mediconsent.repositories;

import com.ort.mediconsent.entities.CsvFileHelper;
import com.ort.mediconsent.entities.Etablissement;
import com.ort.mediconsent.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {

    List<Utilisateur> findAll();

    Optional<Utilisateur> findById(@PathVariable Long id);

    void deleteById(@PathVariable Long id);

    Utilisateur save(@RequestBody Utilisateur utilisateur);

    @Query(value = "SELECT * FROM utilisateur WHERE " +
            "numero_securite_sociale = :numero_securite_sociale AND mot_de_passe_utilisateur = :mot_de_passe_utilisateur",
            nativeQuery = true)
    Utilisateur checkLogin(@Param("numero_securite_sociale") String numero_securite_sociale,
                           @Param("mot_de_passe_utilisateur") String mot_de_passe_utilisateur);

    @Query(value = "SELECT * FROM utilisateur WHERE " +
            "nom_utilisateur = :nom_utilisateur AND prenom_utilisateur = :prenom_utilisateur",
            nativeQuery = true)
    Utilisateur checkLogin2(@Param("nom_utilisateur") String nom_utilisateur,
                           @Param("prenom_utilisateur") String prenom_utilisateur);

    default boolean saveCsvDataFile(String FILE_NAME) throws IOException {
        System.out.println(FILE_NAME);
        final String fileName = FILE_NAME;

        final File file = CsvFileHelper.getResource(fileName);
        List<String> lines = CsvFileHelper.readFile(file);

        System.out.println(lines);
        return true;
    }
}
