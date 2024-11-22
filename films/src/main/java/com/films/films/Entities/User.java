package com.films.films.Entities;

import java.io.Serializable;

@Entity
public class User implements Serializable {

    @Id
    private int No_Users;

    private String User_Name;

    private String User_pseudo;

    private String User_MotDePasse;
    
}
