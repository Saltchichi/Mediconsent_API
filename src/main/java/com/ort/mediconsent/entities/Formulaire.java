package com.ort.mediconsent.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "formulaire")
public class Formulaire {

    @Id
    @Column(name = "id_formulaire")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_formulaire;

    @OneToOne
    @JoinColumn(name = "id_langage", table = "langage")
    private Langage langage;

    @Column(name = "libelle_formulaire")
    private String libelle_formulaire;

    @Column(name = "version")
    private Float version;

    @Column(name = "date")
    private Date date;

    public Long getId_formulaire() {
        return id_formulaire;
    }

    public void setId_formulaire(Long id_formulaire) {
        this.id_formulaire = id_formulaire;
    }

    public Langage getLangage() {
        return langage;
    }

    public void setLangage(Langage langage) {
        this.langage = langage;
    }

    public String getLibelle_formulaire() {
        return libelle_formulaire;
    }

    public void setLibelle_formulaire(String libelle_formulaire) {
        this.libelle_formulaire = libelle_formulaire;
    }

    public Float getVersion() {
        return version;
    }

    public void setVersion(Float version) {
        this.version = version;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Formulaire() {}

    public Formulaire(Langage langage, String libelle_formulaire, Float version, Date date) {
        this.langage = langage;
        this.libelle_formulaire = libelle_formulaire;
        this.version = version;
        this.date = date;
    }
}
