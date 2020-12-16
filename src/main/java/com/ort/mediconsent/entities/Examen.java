package com.ort.mediconsent.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "examen")
public class Examen {

    @Id
    @Column(name = "id_examen")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_examen;

    @ManyToMany
    @JoinColumn(name = "id_utilisateur", table = "utilisateur")
    private Utilisateur utilisateur;

    @Column(name = "date_examen")
    private Date date_examen;

    @Column(name = "consentement")
    private Boolean consentement;

    @Column(name = "doc_consentement")
    private String doc_consentement;

    @Column(name = "signature")
    private String signature;

    @Column(name = "annuler")
    private Boolean annuler;

    @Column(name = "date_annulation")
    private Date date_annulation;
}
