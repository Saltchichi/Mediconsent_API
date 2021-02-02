package com.ort.mediconsent.repositories;

import com.ort.mediconsent.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {

    List<Question> findAll();

    Optional<Question> findById(@PathVariable Long id);

    void deleteById(@PathVariable Long id);

    Question save(@RequestBody Question question);

}