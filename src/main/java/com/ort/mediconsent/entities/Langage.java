package com.ort.mediconsent.entities;

import javax.persistence.*;

@Entity
@Table(name = "langage")
public class Langage {

    @Id
    @Column(name = "id_langage")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_fonctionnalite;

    @Column(name = "libelle_langage")
    private String libelle_fonctionnalite;

    public Long getId_fonctionnalite() {
        return id_fonctionnalite;
    }

    public void setId_fonctionnalite(Long id_fonctionnalite) {
        this.id_fonctionnalite = id_fonctionnalite;
    }

    public String getLibelle_fonctionnalite() {
        return libelle_fonctionnalite;
    }

    public void setLibelle_fonctionnalite(String libelle_fonctionnalite) {
        this.libelle_fonctionnalite = libelle_fonctionnalite;
    }

    public Langage(){}

    public Langage(String libelle_fonctionnalite) {
        this.libelle_fonctionnalite = libelle_fonctionnalite;
    }
}
