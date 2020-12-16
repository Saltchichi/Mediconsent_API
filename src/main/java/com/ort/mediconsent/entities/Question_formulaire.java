package com.ort.mediconsent.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "question_formulaire")
public class Question_formulaire {

    @ManyToMany
    @JoinColumn(name = "id_formulaire", table = "formulaire")
    private Formulaire formulaire;

    @ManyToMany
    @JoinColumn(name = "id_question", table = "question")
    private Question question;
}
