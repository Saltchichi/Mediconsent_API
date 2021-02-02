package com.ort.mediconsent.services;

import com.ort.mediconsent.entities.Role;
import com.ort.mediconsent.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class RoleServices {
    @Autowired
    private RoleRepository roleRepository;

    public List<Role> findAll() {
        return roleRepository.findAll();
    }

    public Role findById(@PathVariable Long id) {
        return roleRepository.findById(id).orElse(null);
    }

    public void deleteById(@PathVariable Long id) {
        roleRepository.deleteById(id);
    }

    public Role save(@RequestBody Role role) {
        return roleRepository.save(role);
    }

}
