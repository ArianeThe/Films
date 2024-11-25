package com.films.films.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.films.films.Entities.Film;
import com.films.films.Repositories.FilmRepository;
import com.films.films.Services.FilmService;

public class FilmController {

    @Autowired
    private FilmService filmService;
    @Autowired
    public FilmRepository filmRepository;

    /*créer une fiche film */
    public Film createFilm() {
        return filmService.createFilm(Film);
    }
     /* @CrossOrigin(origins = "*")
    @PostMapping(value="Entities/Frais",produces = MediaType.APPLICATION_JSON_VALUE)
    public Frais createFrais(@RequestBody Frais frais){
        return frais;
    }*/

    /*Récupérer une fiche film */

    /*Modifier une fiche film */

    /*supprimer une fiche film */
    
}
