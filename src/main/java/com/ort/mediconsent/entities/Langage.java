package com.ort.mediconsent.entities;

import javax.persistence.*;

@Entity
@Table(name = "langage")
public class Langage {

    @Id
    @Column(name = "id_langage")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_langage;

    @Column(name = "libelle_langage")
    private String libelle_langage;

    public Long getId_langage() {
        return id_langage;
    }

    public void setId_langage(Long id_langage) {
        this.id_langage = id_langage;
    }

    public String getLibelle_langage() {
        return libelle_langage;
    }

    public void setLibelle_langage(String libelle_langage) {
        this.libelle_langage = libelle_langage;
    }

    public Langage() {
    }

    public Langage(String libelle_langage) {
        this.libelle_langage = libelle_langage;
    }
}
