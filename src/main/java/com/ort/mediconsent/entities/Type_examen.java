package com.ort.mediconsent.entities;

import javax.persistence.*;

@Entity
@Table(name = "type_examen")
public class Type_examen {

    @Id
    @Column(name = "id_type_examen")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_type_examen;

    @Column(name = "libelle_type_examen")
    private String libelle_type_examen;

    @Column(name = "type_examen")
    private String type_examen;

    @OneToOne
    @JoinColumn(name = "id_formulaire")
    private Formulaire formulaire;

    public Long getId_type_examen() {
        return id_type_examen;
    }

    public void setId_type_examen(Long id_type_examen) {
        this.id_type_examen = id_type_examen;
    }

    public String getLibelle_type_examen() {
        return libelle_type_examen;
    }

    public void setLibelle_type_examen(String libelle_type_examen) {
        this.libelle_type_examen = libelle_type_examen;
    }

    public Formulaire getFormulaire() {
        return formulaire;
    }

    public void setFormulaire(Formulaire formulaire) {
        this.formulaire = formulaire;
    }

    public Type_examen() {
    }

    public Type_examen(String libelle_type_examen, Formulaire formulaire) {
        this.type_examen = libelle_type_examen;
        this.formulaire = formulaire;
    }
}
