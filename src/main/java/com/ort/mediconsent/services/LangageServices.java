package com.ort.mediconsent.services;

import com.ort.mediconsent.entities.Langage;
import com.ort.mediconsent.repositories.LangageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class LangageServices {
    @Autowired
    private LangageRepository langageRepository;

    public List<Langage> findAll() {
        return langageRepository.findAll();
    }

    public Langage findById(@PathVariable Long id) {
        return langageRepository.findById(id).orElse(null);
    }

    public void deleteById(@PathVariable Long id) {
        langageRepository.deleteById(id);
    }

    public Langage save(@RequestBody Langage langage) {
        return langageRepository.save(langage);
    }

}
