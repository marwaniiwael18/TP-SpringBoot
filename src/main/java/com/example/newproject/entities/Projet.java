package com.example.newproject.entities;
import java.util.*;
import jakarta.persistence.*;

@Entity
public class Projet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String sujet;
  //Uniderctionelle
     @OneToOne
     private Projet_Detail projetDetail;
     @ManyToMany(mappedBy = "projets", cascade = CascadeType.ALL)
    private Set<Equipe> Equipe;

}
