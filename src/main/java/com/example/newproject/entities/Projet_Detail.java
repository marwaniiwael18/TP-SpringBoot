package com.example.newproject.entities;

import jakarta.persistence.*;

import java.util.Date;
@Entity
public class Projet_Detail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String description;
    private String technologie;
    private long cout_provisoire;
    private Date dateDebut;
    @OneToOne(mappedBy = "projetDetail")
    private Projet projet;
}
