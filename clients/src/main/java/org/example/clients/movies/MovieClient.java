package org.example.clients.movies;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient("movies")
public interface MovieClient {
    @PostMapping("api/movies")
    MovieResponse createLaundryOrder(@RequestBody MovieRequest movieRequest);

    @GetMapping("api/movies")
    List<String> getMovies();
}
