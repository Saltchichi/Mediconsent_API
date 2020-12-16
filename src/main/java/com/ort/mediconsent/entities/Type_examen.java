package com.ort.mediconsent.entities;

import javax.persistence.*;

@Entity
@Table(name = "type_examen")
public class Type_examen {

    @Id
    @Column(name = "id_type_examen")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_type_examen;

    @Column(name = "type_examen")
    private String type_examen;

}
