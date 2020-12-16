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
}
