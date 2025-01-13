package co.com.graphql.service;

import co.com.graphql.model.Movie;

import java.util.List;

public interface IMovieService {
    List<Movie> findAll();
    Movie findById(Long id);
    Movie save(String title, String director, Integer releaseYear);
    Movie update(Long id, String title, String director, Integer releaseYear);
    Boolean delete(Long id);
}
