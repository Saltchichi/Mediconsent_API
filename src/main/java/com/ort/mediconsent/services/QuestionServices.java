package com.ort.mediconsent.services;

import com.ort.mediconsent.entities.Question;
import com.ort.mediconsent.repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class QuestionServices {
    @Autowired
    private QuestionRepository questionRepository;

    public List<Question> findAll() {
        return questionRepository.findAll();
    }

    public Question findById(@PathVariable Long id) {
        return questionRepository.findById(id).orElse(null);
    }

    public void deleteById(@PathVariable Long id) {
        questionRepository.deleteById(id);
    }

    public Question save(@RequestBody Question question) {
        return questionRepository.save(question);
    }

}
