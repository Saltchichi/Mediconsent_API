package com.ort.mediconsent.entities;

import javax.persistence.*;

@Entity
@Table(name = "role_fonctionnalite")
public class Role_fonctionnalite {

    /*@ManyToMany
    @JoinColumn(name = "id_role", table = "role")
    private Role role;

    @ManyToMany
    @JoinColumn(name = "id_fonctionnalite", table = "fonctionnalite")
    private Fonctionnalite fonctionnalite;*/
    @Id
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
