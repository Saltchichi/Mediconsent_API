package com.ort.mediconsent.repositories;

import com.ort.mediconsent.entities.Fonctionnalite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Repository
public interface FonctionnaliteRepository extends JpaRepository<Fonctionnalite, Long> {

    List<Fonctionnalite> findAll();

    Optional<Fonctionnalite> findById(@PathVariable Long id);

    void deleteById(@PathVariable Long id);

    Fonctionnalite save(@RequestBody Fonctionnalite fonctionnalite);

}