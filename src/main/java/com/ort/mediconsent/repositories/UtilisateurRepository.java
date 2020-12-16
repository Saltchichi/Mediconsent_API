package com.ort.mediconsent.repositories;

import com.ort.mediconsent.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
    public Utilisateur findByUsername(String nom_utilisateur);
}
