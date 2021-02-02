package com.ort.mediconsent.repositories;

import com.ort.mediconsent.entities.Examen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Repository
public interface ExamenRepository extends JpaRepository<Examen, Long> {

    List<Examen> findAll();

    Optional<Examen> findById(@PathVariable Long id);

    void deleteById(@PathVariable Long id);

    Examen save(@RequestBody Examen examen);

}
