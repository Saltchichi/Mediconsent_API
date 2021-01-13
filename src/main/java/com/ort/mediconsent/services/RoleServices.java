package com.ort.mediconsent.services;

import com.ort.mediconsent.entities.Role;
import com.ort.mediconsent.entities.Type_examen;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RoleServices {
    @Autowired
    private com.ort.mediconsent.repositories.RoleRepository RoleRepository;

    public List<Role> getRoles() {
        return RoleRepository.findAll();
    }

    public Role getRolesById(Long id) {
        return RoleRepository.findById(id).orElse(null);
    }
}
