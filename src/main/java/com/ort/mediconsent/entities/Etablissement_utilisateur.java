package com.ort.mediconsent.entities;

import javax.persistence.*;

@Entity
@Table(name = "etablissement_utilisateur")
public class Etablissement_utilisateur {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    @Id
    public String getId() {
        return id;
    }

    /*@ManyToMany
    @JoinColumn(name = "id_utilisateur", table = "utilisateur")
    private Utilisateur utilisateur;

    @ManyToMany
    @JoinColumn(name = "id_etablissement", table = "etablissement")
    private Etablissement etablissement;*/
}
