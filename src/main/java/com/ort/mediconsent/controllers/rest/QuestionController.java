package com.ort.mediconsent.controllers.rest;

import com.ort.mediconsent.entities.Question;
import com.ort.mediconsent.repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuestionController {
    @Autowired
    QuestionRepository questionRepository;

    @RequestMapping(path = "/rest/questions", method = RequestMethod.GET)
    public List<Question> getQuestion() {
        return questionRepository.findAll();
    }
}
