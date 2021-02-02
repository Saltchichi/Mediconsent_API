package com.ort.mediconsent.repositories;

import com.ort.mediconsent.entities.Langage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Repository
public interface LangageRepository extends JpaRepository<Langage, Long> {

    List<Langage> findAll();

    Optional<Langage> findById(@PathVariable Long id);

    void deleteById(@PathVariable Long id);

    Langage save(@RequestBody Langage langage);

}