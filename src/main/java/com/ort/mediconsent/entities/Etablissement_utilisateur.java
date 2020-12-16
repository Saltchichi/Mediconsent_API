package com.ort.mediconsent.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "etablissement_utilisateur")
public class Etablissement_utilisateur {

    @ManyToMany
    @JoinColumn(name = "id_utilisateur", table = "utilisateur")
    private Utilisateur utilisateur;

    @ManyToMany
    @JoinColumn(name = "id_etablissement", table = "etablissement")
    private Etablissement etablissement;
}
