package com.ort.mediconsent.entities;

import javax.persistence.*;

@Entity
@Table(name = "utilisateur")
public class Utilisateur {

    @Id
    @Column(name = "id_utilisateur")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_utilisateur;

    @Column(name = "nom_utilisateur")
    private String nom_utilisateur;

    @Column(name = "prenom_utilisateur")
    private String prenom_utilisateur;

    @Column(name = "mot_de_passe_utilisateur")
    private String mot_de_passe_utilisateur;

    @Column(name = "numero_securite_sociale")
    private Long numero_securite_sociale;

    public Long getId_utilisateur() {
        return id_utilisateur;
    }

    public void setId_utilisateur(Long id_utilisateur) {
        this.id_utilisateur = id_utilisateur;
    }

    public String getNom_utilisateur() {
        return nom_utilisateur;
    }

    public void setNom_utilisateur(String nom_utilisateur) {
        this.nom_utilisateur = nom_utilisateur;
    }

    public String getPrenom_utilisateur() {
        return prenom_utilisateur;
    }

    public void setPrenom_utilisateur(String prenom_utilisateur) {
        this.prenom_utilisateur = prenom_utilisateur;
    }

    public String getMot_de_passe_utilisateur() {
        return mot_de_passe_utilisateur;
    }

    public void setMot_de_passe_utilisateur(String mot_de_passe_utilisateur) {
        this.mot_de_passe_utilisateur = mot_de_passe_utilisateur;
    }

    public Long getNumero_securite_sociale() {
        return numero_securite_sociale;
    }

    public void setNumero_securite_sociale(Long numero_securite_sociale) {
        this.numero_securite_sociale = numero_securite_sociale;
    }

    public Utilisateur() {}

    public Utilisateur(String nom_utilisateur, String prenom_utilisateur) {
        this.nom_utilisateur = nom_utilisateur;
        this.prenom_utilisateur = prenom_utilisateur;
    }

    @Override
    public String toString() {
        return "Utilisateur{"+"id=" + this.id_utilisateur
                + ", nom='" + this.nom_utilisateur
                + ", prenom='" + this.prenom_utilisateur
                + ", n°Secu='" + this.numero_securite_sociale
                + "}";
    }
}
