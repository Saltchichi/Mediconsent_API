package com.ort.mediconsent.entities;

import javax.persistence.*;

@Entity
@Table(name = "role")
public class Role {

    @Id
    @Column(name = "id_role")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_role;

    @Column(name = "libelle_role")
    private String libelle_role;

    public Long getId_role() {
        return id_role;
    }

    public void setId_role(Long id_role) {
        this.id_role = id_role;
    }

    public String getLibelle_role() {
        return libelle_role;
    }

    public void setLibelle_role(String libelle_role) {
        this.libelle_role = libelle_role;
    }

    public Role(){}

    public Role(String libelle_role) {
        this.libelle_role = libelle_role;
    }
}
