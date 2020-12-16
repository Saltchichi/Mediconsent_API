package com.ort.mediconsent.entities;

import javax.persistence.*;

@Entity
@Table(name = "Reponse")
public class Reponse {

    @Id
    @Column(name = "id_reponse")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_reponse;

    @OneToOne
    @JoinColumn(name = "id_examen", table = "examen")
    private Examen examen;

    @OneToOne
    @JoinColumn(name = "id_question", table = "question")
    private Question question;

    @Column(name = "libelle_reponse")
    private String libelle_reponse;

}
