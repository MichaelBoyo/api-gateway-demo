package org.example.auth.controller;

import lombok.RequiredArgsConstructor;
import org.example.auth.service.AuthService;
import org.example.clients.movies.MovieRequest;
import org.example.clients.movies.MovieResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @GetMapping
    public String hello() {
        return "Hello form Auth";
    }

    @PostMapping
    public MovieResponse addMovie(@RequestBody MovieRequest movieRequest) {
        return authService.addMovie(movieRequest);
    }
}
