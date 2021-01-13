package com.ort.mediconsent.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "examen")
public class Examen {

    @Id
    @Column(name = "id_examen")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_examen;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "id_type_examen")
    private Type_examen type_examen;

    @ManyToOne
    @JoinColumn(name = "id_etablissement")
    private Etablissement etablissement;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "id_avis")
    private Avis avis;

    @Column(name = "date_examen")
    private Date date_examen;

    @Column(name = "consentement")
    private Boolean consentement;

    @Column(name = "doc_consentement")
    private String doc_consentement;

    @Column(name = "signature")
    private String signature;

    @Column(name = "annuler")
    private Boolean annuler;

    @Column(name = "date_annulation")
    private Date date_annulation;

    public Long getId_examen() {
        return id_examen;
    }

    public void setId_examen(Long id_examen) {
        this.id_examen = id_examen;
    }

    public Type_examen getType_examen() {
        return type_examen;
    }

    public void setType_examen(Type_examen type_examen) {
        this.type_examen = type_examen;
    }

    public Etablissement getEtablissement() {
        return etablissement;
    }

    public void setEtablissement(Etablissement etablissement) {
        this.etablissement = etablissement;
    }

    public Avis getAvis() {
        return avis;
    }

    public void setAvis(Avis avis) {
        this.avis = avis;
    }

    public Date getDate_examen() {
        return date_examen;
    }

    public void setDate_examen(Date date_examen) {
        this.date_examen = date_examen;
    }

    public Boolean getConsentement() {
        return consentement;
    }

    public void setConsentement(Boolean consentement) {
        this.consentement = consentement;
    }

    public String getDoc_consentement() {
        return doc_consentement;
    }

    public void setDoc_consentement(String doc_consentement) {
        this.doc_consentement = doc_consentement;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public Boolean getAnnuler() {
        return annuler;
    }

    public void setAnnuler(Boolean annuler) {
        this.annuler = annuler;
    }

    public Date getDate_annulation() {
        return date_annulation;
    }

    public void setDate_annulation(Date date_annulation) {
        this.date_annulation = date_annulation;
    }

    public Examen(){}

    public Examen(Type_examen type_examen, Etablissement etablissement, Avis avis, Date date_examen, Boolean consentement, String doc_consentement, String signature, Boolean annuler, Date date_annulation) {
        this.type_examen = type_examen;
        this.etablissement = etablissement;
        this.avis = avis;
        this.date_examen = date_examen;
        this.consentement = consentement;
        this.doc_consentement = doc_consentement;
        this.signature = signature;
        this.annuler = annuler;
        this.date_annulation = date_annulation;
    }
}
