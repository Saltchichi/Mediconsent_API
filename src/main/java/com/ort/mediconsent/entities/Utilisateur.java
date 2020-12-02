package com.ort.mediconsent.entities;

import javax.persistence.*;

@Entity
@Table(name = "utilisateur")
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_utilisateur;

    @Column
    private String nom_utilisateur;

    @Column
    private String prenom_utilisateur;


}
