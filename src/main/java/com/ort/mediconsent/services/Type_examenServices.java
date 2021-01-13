package com.ort.mediconsent.services;

import com.ort.mediconsent.entities.Type_examen;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Type_examenServices {
    @Autowired
    private com.ort.mediconsent.repositories.Type_examenRepository Type_examenRepository;

    public List<Type_examen> getType_examen() {
        return Type_examenRepository.findAll();
    }

    public Type_examen getType_examenById(Long id) {
        return Type_examenRepository.findById(id).orElse(null);
    }
}
