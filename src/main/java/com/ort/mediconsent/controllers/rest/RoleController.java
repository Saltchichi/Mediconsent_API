package com.ort.mediconsent.controllers.rest;

import com.ort.mediconsent.entities.Role;
import com.ort.mediconsent.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoleController {
    @Autowired
    RoleRepository roleRepository;

    @RequestMapping(path = "/rest/roles", method = RequestMethod.GET)
    public List<Role> getRole() {
        return roleRepository.findAll();
    }
}
