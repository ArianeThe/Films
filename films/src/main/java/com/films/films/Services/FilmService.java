package com.films.films.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.films.films.Entities.Film;
import com.films.films.Repositories.FilmRepository;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Service
@Slf4j
public class FilmService {

    @Autowired
    FilmRepository filmRepository;


    /*créer un film */
    public Film createFilm(Film film) {
            return filmRepository.save(film);
        
    }

    /*recupérer une liste de film */
    public List<Film> getFilms(){
        List<Film> filmList = (List<Film>) filmRepository.findAll();
        for (Film film : filmList);

        return filmList;
    }

    /*récupérer un film par identifiant */
    public Film getFilmById (final Integer NO_FILM) {
        return (filmRepository.findById(NO_FILM).get());
    }

    /*supprimer un film */
    public void deleteFilm(final Integer NO_FILM){
        filmRepository.deleteById(NO_FILM);
    }


}