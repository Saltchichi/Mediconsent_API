package com.ort.mediconsent.repositories;

import com.ort.mediconsent.entities.CsvFileHelper;
import com.ort.mediconsent.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {

    // boolean connect(Long numero_securite_sociale);

    List<Utilisateur> findAll();

    Optional<Utilisateur> findById(@PathVariable Long id);

    void deleteById(@PathVariable Long id);

    Utilisateur save(@RequestBody Utilisateur jutilisateur);

    default boolean saveCsvDataFile(String FILE_NAME) throws IOException {
        System.out.println(FILE_NAME);
        final String fileName = FILE_NAME;

        final File file = CsvFileHelper.getResource(fileName);
        List<String> lines = CsvFileHelper.readFile(file);

        System.out.println(lines);
        return true;
    }
}
