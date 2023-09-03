package org.example.auth.service;

import lombok.RequiredArgsConstructor;
import org.example.clients.movies.MovieClient;
import org.example.clients.movies.MovieRequest;
import org.example.clients.movies.MovieResponse;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TheatreService {
    private final MovieClient movieClient;
    public MovieResponse addMovie(MovieRequest movieRequest) {
        return movieClient.createLaundryOrder(movieRequest);
    }
}
