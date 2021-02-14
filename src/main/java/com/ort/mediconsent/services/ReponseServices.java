package com.ort.mediconsent.services;

import com.ort.mediconsent.entities.Reponse;
import com.ort.mediconsent.repositories.ReponseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ReponseServices {
    @Autowired
    private ReponseRepository reponseRepository;

    public List<Reponse> findAll() {
        return reponseRepository.findAll();
    }

    public Reponse findById(@PathVariable Long id) {
        return reponseRepository.findById(id).orElse(null);
    }

    public void deleteById(@PathVariable Long id) {
        reponseRepository.deleteById(id);
    }

    public Reponse save(@RequestBody Reponse reponse) {
        return reponseRepository.save(reponse);
    }
}
