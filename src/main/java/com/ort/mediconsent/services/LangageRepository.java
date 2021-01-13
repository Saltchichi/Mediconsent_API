package com.ort.mediconsent.services;

import com.ort.mediconsent.entities.Langage;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LangageRepository {
    @Autowired
    private com.ort.mediconsent.repositories.LangageRepository LangageRepository;

    public List<Langage> getLangage() {
        return LangageRepository.findAll();
    }

    /*public Langage getLangageById(Long id) {
        return LangageRepository.findById(id);
    }*/
}
