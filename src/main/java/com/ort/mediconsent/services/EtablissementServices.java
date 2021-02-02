package com.ort.mediconsent.services;

import com.ort.mediconsent.entities.Etablissement;
import com.ort.mediconsent.repositories.EtablissementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtablissementServices {
    @Autowired
    private EtablissementRepository EtablissementRepository;

    public List<Etablissement> findEtablissementByUtilisateur(@Param("id_utilisateur") Long id_utilisateur){
        return EtablissementRepository.findEtablissementByUtilisateur(id_utilisateur);
    }

}
