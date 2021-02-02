package com.ort.mediconsent.services;

import com.ort.mediconsent.entities.Question;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class QuestionServices {
    @Autowired
    private com.ort.mediconsent.repositories.QuestionRepository QuestionRepository;

}
