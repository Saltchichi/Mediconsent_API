package com.ort.mediconsent.repositories;

import com.ort.mediconsent.entities.Langage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LangageRepository extends JpaRepository<Langage, Long> {
}