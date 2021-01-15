package com.ort.mediconsent.repositories;

import com.ort.mediconsent.entities.Examen;
import com.ort.mediconsent.entities.Langage;
import com.ort.mediconsent.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {

}