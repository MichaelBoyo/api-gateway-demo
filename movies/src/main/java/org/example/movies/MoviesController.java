package org.example.movies;

import org.example.clients.movies.MovieRequest;
import org.example.clients.movies.MovieResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/movies")
public class MoviesController {

    @GetMapping
    public String hello() {
        return "YO!! from Movies";
    }

    @PostMapping
    public MovieResponse addMovie(@RequestBody MovieRequest movieRequest) {
        return new MovieResponse("Movie added successfully");
    }
}
