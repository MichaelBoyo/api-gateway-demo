package org.example.movies;

import org.example.clients.movies.MovieRequest;
import org.example.clients.movies.MovieResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/movies")
public class MoviesController {

    List<String> movies = List.of(
            "The Shawshank Redemption",
            "Inception",
            "Pulp Fiction",
            "The Dark Knight",
            "Forrest Gump",
            "The Matrix",
            "The Godfather",
            "Jurassic Park",
            "Titanic",
            "The Lord of the Rings: The Fellowship of the Ring"
        );

    @GetMapping
    public List<String> movies() {
        return movies;
    }

    @PostMapping
    public MovieResponse addMovie(@RequestBody MovieRequest movieRequest) {
        return new MovieResponse("Movie added successfully");
    }
}
