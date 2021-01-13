package com.ort.mediconsent.repositories;

import com.ort.mediconsent.entities.Role;
import com.ort.mediconsent.entities.Type_examen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Type_examenRepository extends JpaRepository {
    Type_examen findById(Long id_type_examen);
    void deleteById(Long id_type_examen);
    Type_examen findByLibelle(String libelle_type_examen);
}
