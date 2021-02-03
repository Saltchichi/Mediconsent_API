package com.ort.mediconsent.services;

import com.ort.mediconsent.entities.Etablissement;
import com.ort.mediconsent.repositories.EtablissementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class EtablissementServices {
    @Autowired
    private EtablissementRepository etablissementRepository;

    public List<Etablissement> findAll() {
        return etablissementRepository.findAll();
    }

    public Etablissement findById(@PathVariable Long id) {
        return etablissementRepository.findById(id).orElse(null);
    }

    public void deleteById(@PathVariable Long id) {
        etablissementRepository.deleteById(id);
    }

    public Etablissement save(@RequestBody Etablissement etablissement) {
        return etablissementRepository.save(etablissement);
    }

    public Etablissement findEtablissementByUtilisateur(@Param("id_utilisateur") Long id_utilisateur){
        return etablissementRepository.findEtablissementByUtilisateur(id_utilisateur);
    }

}
