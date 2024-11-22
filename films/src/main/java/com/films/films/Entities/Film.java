package com.films.films.Entities;


import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name="Films")
public class Film implements Serializable
{

    @Id
    @Column(name="NO_FILM")
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int NO_FILM;

    @Column(name="titre")
    private String Titre;

    @Column(name="annee")
    private String Annee;

    @Column(name="genre")
    private String Genre;

    @Column(name="realisateur")
    private String Realisateur;
  
    @Column(name="synopsis")
    private String Synopsis;

    @Column(name="description")
    private String Description;

}
