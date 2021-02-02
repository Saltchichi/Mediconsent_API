package com.ort.mediconsent.controllers.rest;

import com.ort.mediconsent.entities.Role;
import com.ort.mediconsent.services.RoleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class RoleController {
    @Autowired
    RoleServices roleServices;

    @RequestMapping(path = "/rest/roles", method = RequestMethod.GET)
    public List<Role> getRoles() {
        return roleServices.findAll();
    }

    @RequestMapping(path = "/rest/role/{id}", method = RequestMethod.GET)
    public Role getRole(@PathVariable Long id) {
        return roleServices.findById(id);
    }

    @RequestMapping(path = "/rest/role/delete/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        roleServices.deleteById(id);
    }

    @RequestMapping(path = "/rest/role/save", method = RequestMethod.PUT)
    public Role save(@RequestBody Role role) {
        return roleServices.save(role);
    }
}
