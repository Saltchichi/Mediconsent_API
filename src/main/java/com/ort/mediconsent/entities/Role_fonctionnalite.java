package com.ort.mediconsent.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "role_fonctionnalite")
public class Role_fonctionnalite {

    @ManyToMany
    @JoinColumn(name = "id_role", table = "role")
    private Role role;

    @ManyToMany
    @JoinColumn(name = "id_fonctionnalite", table = "fonctionnalite")
    private Fonctionnalite fonctionnalite;
}
