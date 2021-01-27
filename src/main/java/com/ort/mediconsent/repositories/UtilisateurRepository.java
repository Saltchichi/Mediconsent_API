package com.ort.mediconsent.repositories;

import com.ort.mediconsent.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
   // boolean connect(Long numero_securite_sociale);
}
