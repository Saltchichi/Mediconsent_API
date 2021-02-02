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
    @JoinColumn(name = "id_examen")
    private Examen examen;

    @OneToOne
    @JoinColumn(name = "id_question")
    private Question question;

    @Column(name = "reponse")
    private String reponse;

    public Long getId_reponse() {
        return id_reponse;
    }

    public void setId_reponse(Long id_reponse) {
        this.id_reponse = id_reponse;
    }

    public Examen getExamen() {
        return examen;
    }

    public void setExamen(Examen examen) {
        this.examen = examen;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public String getReponse() {
        return reponse;
    }

    public void setReponse(String reponse) {
        this.reponse = reponse;
    }

    public Reponse() {
    }

    public Reponse(Examen examen, Question question, String reponse) {
        this.examen = examen;
        this.question = question;
        this.reponse = reponse;
    }
}
