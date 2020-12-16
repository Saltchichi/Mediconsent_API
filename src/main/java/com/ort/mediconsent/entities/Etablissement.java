package com.ort.mediconsent.entities;

import javax.persistence.*;

@Entity
@Table(name = "etablissement")
public class Etablissement {

    @Id
    @Column(name = "id_etablissement")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_etablissement;

    @Column(name = "nom_etablissement")
    private String nom_etablissement;

    @Column(name = "adresse_etablissement")
    private String adresse_etablissement;

    @Column(name = "telephone_etablissement")
    private String telephone_etablissement;

    @Column(name = "sigle_etablissement")
    private String sigle_etablissement;

}
