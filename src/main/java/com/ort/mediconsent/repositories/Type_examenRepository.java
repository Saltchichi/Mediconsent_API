package com.ort.mediconsent.repositories;

import com.ort.mediconsent.entities.Type_examen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Repository
public interface Type_examenRepository extends JpaRepository<Type_examen, Long> {

    List<Type_examen> findAll();

    Optional<Type_examen> findById(@PathVariable Long id);

    void deleteById(@PathVariable Long id);

    Type_examen save(@RequestBody Type_examen type_examen);

}
