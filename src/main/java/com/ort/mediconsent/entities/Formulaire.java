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

}
