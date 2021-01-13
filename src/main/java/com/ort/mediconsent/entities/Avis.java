package com.ort.mediconsent.entities;

import javax.persistence.*;

@Entity
@Table(name = "avis")
public class Avis {

    @Id
    @Column(name = "id_avis")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_avis;

    @Column(name = "notes")
    private Long notes;

    @Column(name = "commentaire")
    private String commentaire;

}
