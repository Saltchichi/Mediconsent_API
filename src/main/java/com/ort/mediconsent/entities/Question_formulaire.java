package com.ort.mediconsent.entities;

import javax.persistence.*;

@Entity
@Table(name = "question_formulaire")
public class Question_formulaire {

   /* @ManyToMany
    @JoinColumn(name = "id_formulaire", table = "formulaire")
    private Formulaire formulaire;

    @ManyToMany
    @JoinColumn(name = "id_question", table = "question")
    private Question question;*/

    @Id
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
