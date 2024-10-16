package com.springbootgraphql.demo.resolver;

import com.springbootgraphql.demo.model.Movie;
import com.springbootgraphql.demo.services.MovieService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MovieQueryResolver implements GraphQLQueryResolver {

    private final MovieService movieService;

    public Movie getMovieById(String id) {
        return movieService.getMovieById(id);
    }
}