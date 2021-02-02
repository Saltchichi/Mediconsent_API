package com.ort.mediconsent.services;

import com.ort.mediconsent.entities.Type_examen;
import com.ort.mediconsent.repositories.Type_examenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class Type_examenServices {
    @Autowired
    private Type_examenRepository type_examenRepository;

    public List<Type_examen> findAll() {
        return type_examenRepository.findAll();
    }

    public Type_examen findById(@PathVariable Long id) {
        return type_examenRepository.findById(id).orElse(null);
    }

    public void deleteById(@PathVariable Long id) {
        type_examenRepository.deleteById(id);
    }

    public Type_examen save(@RequestBody Type_examen type_examen) {
        return type_examenRepository.save(type_examen);
    }

}
