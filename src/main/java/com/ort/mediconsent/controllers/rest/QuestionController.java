package com.ort.mediconsent.controllers.rest;

import com.ort.mediconsent.entities.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public class QuestionController {
    @Autowired
    com.ort.mediconsent.repositories.QuestionRepository QuestionRepository;

    @RequestMapping(path = "/rest/questions", method = RequestMethod.GET)
    public List<Question> getUsers() {
        return QuestionRepository.findAll();
    }
}
