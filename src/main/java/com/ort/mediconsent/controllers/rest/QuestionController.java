package com.ort.mediconsent.controllers.rest;

import com.ort.mediconsent.entities.Question;
import com.ort.mediconsent.repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class QuestionController {
    @Autowired
    QuestionRepository questionRepository;

    @RequestMapping(path = "/rest/questions", method = RequestMethod.GET)
    public List<Question> getQuestions() {
        return questionRepository.findAll();
    }

    @RequestMapping(path = "/rest/question/{id}", method = RequestMethod.GET)
    public Question getQuestion(@PathVariable Long id) {
        return questionRepository.findById(id).orElse(null);
    }

    @RequestMapping(path = "/rest/question/delete/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        questionRepository.deleteById(id);
    }

    @RequestMapping(path = "/rest/question/save", method = RequestMethod.PUT)
    public Question save(@RequestBody Question question) {
        return questionRepository.save(question);
    }
}
