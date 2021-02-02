package com.ort.mediconsent.entities;

import javax.persistence.*;

@Entity
@Table(name = "fonctionnalite")
public class Fonctionnalite {

    @Id
    @Column(name = "id_fonctionnalite")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_fonctionnalite;

    @Column(name = "libelle_fonctionnalite")
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

    public Fonctionnalite() {
    }

    public Fonctionnalite(String libelle_fonctionnalite) {
        this.libelle_fonctionnalite = libelle_fonctionnalite;
    }
}
