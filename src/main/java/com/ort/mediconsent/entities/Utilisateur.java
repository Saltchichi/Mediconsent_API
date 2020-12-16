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

    @@Column(name = "mot_de_passe_utilisateur")
    private String mot_de_passe_utilisateur;

    @@Column(name = "numero_securite_sociale")
    private Long numero_securite_sociale;
}
