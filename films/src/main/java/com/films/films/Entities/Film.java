package com.films.films.Entities;


import java.util.Date;

@Entity
public class Film {

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
