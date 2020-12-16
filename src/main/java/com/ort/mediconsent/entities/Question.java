package com.ort.mediconsent.entities;

import javax.persistence.*;

@Entity
@Table(name = "question")
public class Question {

    @Id
    @Column(name = "id_question")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_question;

    @Column(name = "libelle_question")
    private String libelle_question;

    @Column(name = "isCheckbox")
    private Boolean isCheckbox;

    @Column(name = "icone")
    private String icone;
}
