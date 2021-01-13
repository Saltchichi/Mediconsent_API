package com.ort.mediconsent.repositories;

import com.ort.mediconsent.entities.Etablissement;
import com.ort.mediconsent.entities.Examen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamenRepository extends JpaRepository<Examen, Long> {
    //Examen findById(Long id_examen);
    //void deleteById(Long id_examen);
}
