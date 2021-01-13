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

    public Long getId_etablissement() {
        return id_etablissement;
    }

    public void setId_etablissement(Long id_etablissement) {
        this.id_etablissement = id_etablissement;
    }

    public String getNom_etablissement() {
        return nom_etablissement;
    }

    public void setNom_etablissement(String nom_etablissement) {
        this.nom_etablissement = nom_etablissement;
    }

    public String getAdresse_etablissement() {
        return adresse_etablissement;
    }

    public void setAdresse_etablissement(String adresse_etablissement) {
        this.adresse_etablissement = adresse_etablissement;
    }

    public String getTelephone_etablissement() {
        return telephone_etablissement;
    }

    public void setTelephone_etablissement(String telephone_etablissement) {
        this.telephone_etablissement = telephone_etablissement;
    }

    public String getSigle_etablissement() {
        return sigle_etablissement;
    }

    public void setSigle_etablissement(String sigle_etablissement) {
        this.sigle_etablissement = sigle_etablissement;
    }

    public Etablissement(){}

    public Etablissement(String nom_etablissement, String adresse_etablissement, String telephone_etablissement, String sigle_etablissement) {
        this.nom_etablissement = nom_etablissement;
        this.adresse_etablissement = adresse_etablissement;
        this.telephone_etablissement = telephone_etablissement;
        this.sigle_etablissement = sigle_etablissement;
    }
}
