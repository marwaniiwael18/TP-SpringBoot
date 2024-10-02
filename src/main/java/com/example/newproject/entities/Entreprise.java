package com.example.newproject.entities;
import java.util.*;
import jakarta.persistence.*;

@Entity
public class Entreprise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;
    private String adresse;

    //uniderctionelle

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "Entreprise")
    private Set<Equipe> Equipe;
}
