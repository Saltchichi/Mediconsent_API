package com.ort.mediconsent.entities;

import javax.persistence.*;

@Entity
@Table(name = "utilisateur_examen")
public class Utilisateur_examen {

    /*@ManyToMany
    @JoinColumn(name = "id_utilisateur", table = "utilisateur")
    private Utilisateur utilisateur;

    @ManyToOne
    @JoinColumn(name = "id_examen", table = "examen")
    private Examen examen;*/
    @Id
    private String id;


    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
