package com.ort.mediconsent.repositories;

import com.ort.mediconsent.entities.Avis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AvisRepository extends JpaRepository<Avis, Long> {
    //Avis findById(Long id_avis);

    void deleteById(Long id_avis);

    //Avis findByNotes(Long notes);
}
