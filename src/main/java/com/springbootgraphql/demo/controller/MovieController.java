package com.springbootgraphql.demo.controller;

import com.springbootgraphql.demo.model.Movie;
import com.springbootgraphql.demo.resolver.MovieQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class MovieController {

    private final MovieQueryResolver movieQueryResolver;

    @QueryMapping
    public Movie getMovieById(@Argument String id) {
        return movieQueryResolver.getMovieById(id);
    }

}
