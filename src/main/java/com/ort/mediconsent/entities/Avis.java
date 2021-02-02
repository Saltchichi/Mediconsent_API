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

    public Long getId_avis() {
        return id_avis;
    }

    public void setId_avis(Long id_avis) {
        this.id_avis = id_avis;
    }

    public Long getNotes() {
        return notes;
    }

    public void setNotes(Long notes) {
        this.notes = notes;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public Avis() {
    }

    public Avis(Long notes, String commentaire) {
        this.notes = notes;
        this.commentaire = commentaire;
    }
}
