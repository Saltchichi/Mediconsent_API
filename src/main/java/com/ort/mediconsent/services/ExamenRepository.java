package com.ort.mediconsent.services;

import com.ort.mediconsent.entities.Examen;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ExamenRepository {
    @Autowired
    private com.ort.mediconsent.repositories.ExamenRepository ExamenRepository;

    public List<Examen> getExamens() {
        return ExamenRepository.findAll();
    }

    /*public Examen getExamenById(Long id) {
        return ExamenRepository.findById(id);
    }*/
}
