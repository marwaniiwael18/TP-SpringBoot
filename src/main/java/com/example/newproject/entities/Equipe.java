    package com.example.newproject.entities;
import jakarta.persistence.*;
import java.util.*;
import org.hibernate.engine.internal.Cascade;

@Entity
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String specialite;
   //biderction
    @ManyToOne
    Entreprise Entreprise;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Projet> projets;
}
