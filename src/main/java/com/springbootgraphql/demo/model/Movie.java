package com.springbootgraphql.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Movie {

    private String id;
    private String title;
    private String director;
    private int releaseYear;

}
