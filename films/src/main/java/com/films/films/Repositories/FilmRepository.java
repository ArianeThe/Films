package com.films.films.Repositories;

import com.films.films.Entities.Film;

import java.util.List;

//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface FilmRepository //extends CrudRepository<Film, Long> 
{

    Film save(Film film);

    List<Film> findAll();

    Object findById(Integer nO_FILM);

    void deleteById(Integer nO_FILM); 
    
}
