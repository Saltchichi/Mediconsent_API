package com.ort.mediconsent.entities;

import javax.persistence.*;

@Entity
@Table(name = "type_examen")
public class Type_examen {

    @Id
    @Column(name = "id_type_examen")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_type_examen;

    @Column(name = "libelle_type_examen")
    private String libelle_type_examen;

    @OneToOne
    @JoinColumn(name = "id_formulaire", table = "formulaire")
    private Formulaire formulaire;

}
