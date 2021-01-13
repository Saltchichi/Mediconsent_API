package com.ort.mediconsent.repositories;

import com.ort.mediconsent.entities.Question;
import com.ort.mediconsent.entities.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepository extends JpaRepository {
    Role findById(Long id_role);
    void deleteById(Long id_role);
    Role findByLibelle(String libelle_role);
}
