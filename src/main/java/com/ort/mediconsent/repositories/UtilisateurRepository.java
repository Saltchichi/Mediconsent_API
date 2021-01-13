package com.ort.mediconsent.repositories;

import com.ort.mediconsent.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
    public Utilisateur findByUsername(String nom_utilisateur);
    Optional<Utilisateur> findById(Long id_utilisateur);
    void deleteById(Long id_type_examen);
    Utilisateur findByLibelle(String libelle_type_examen);
}
