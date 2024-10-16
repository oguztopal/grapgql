package com.springbootgraphql.demo.services;

import com.springbootgraphql.demo.model.Movie;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class MovieService {

    private final List<Movie> movies = Arrays.asList(
            new Movie("1", "2020", "Christopher Nolan", 2010),
            new Movie("2", "Interstellar", "Christopher Nolan", 2014),
            new Movie("3", "The Matrix", "The Wachowskis", 1999)
    );

    public Movie getMovieById(String id) {
        return movies.stream()
                .filter(movie -> movie.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public List<Movie> getAllMovies() {
        return movies;
    }

}
