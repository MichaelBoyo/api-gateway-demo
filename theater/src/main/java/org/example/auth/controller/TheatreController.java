package org.example.auth.controller;

import lombok.RequiredArgsConstructor;
import org.example.auth.service.TheatreService;
import org.example.clients.movies.MovieRequest;
import org.example.clients.movies.MovieResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/theatre")
@RequiredArgsConstructor
public class TheatreController {
    private final TheatreService theatreService;

    @GetMapping
    public String hello() {
        return "Hello form Theatre Service";
    }

    @PostMapping
    public MovieResponse addMovie(@RequestBody MovieRequest movieRequest) {
        return theatreService.addMovie(movieRequest);
    }
}
