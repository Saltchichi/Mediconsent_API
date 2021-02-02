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

    public Long getId_question() {
        return id_question;
    }

    public void setId_question(Long id_question) {
        this.id_question = id_question;
    }

    public String getLibelle_question() {
        return libelle_question;
    }

    public void setLibelle_question(String libelle_question) {
        this.libelle_question = libelle_question;
    }

    public Boolean getCheckbox() {
        return isCheckbox;
    }

    public void setCheckbox(Boolean checkbox) {
        isCheckbox = checkbox;
    }

    public String getIcone() {
        return icone;
    }

    public void setIcone(String icone) {
        this.icone = icone;
    }

    public Question() {
    }

    public Question(String libelle_question, Boolean isCheckbox, String icone) {
        this.libelle_question = libelle_question;
        this.isCheckbox = isCheckbox;
        this.icone = icone;
    }
}
