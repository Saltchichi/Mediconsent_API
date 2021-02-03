package com.ort.mediconsent.controllers.rest;

import com.ort.mediconsent.entities.Question;
import com.ort.mediconsent.services.QuestionServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@CrossOrigin
@RestController
public class QuestionController {
    @Autowired
    QuestionServices questionServices;

    @RequestMapping(path = "/rest/questions", method = RequestMethod.GET)
    public List<Question> getQuestions() {
        return questionServices.findAll();
    }

    @RequestMapping(path = "/rest/question/{id}", method = RequestMethod.GET)
    public Question getQuestion(@PathVariable Long id) {
        return questionServices.findById(id);
    }

    @RequestMapping(path = "/rest/question/delete/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        questionServices.deleteById(id);
    }

    @RequestMapping(path = "/rest/question/save", method = RequestMethod.PUT)
    public Question save(@RequestBody Question question) {
        return questionServices.save(question);
    }

    @RequestMapping(path = "/rest/questions/formulaire/{id}", method = RequestMethod.GET)
    public Collection<Question> findQuestionsByFormulaire(@PathVariable Long id){
        return questionServices.findQuestionsByFormulaire(id);
    }
}
