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

}
