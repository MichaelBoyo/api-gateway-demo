package org.example.clients.movies;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("movies")
public interface MovieClient {
    @PostMapping("api/movies")
    MovieResponse createLaundryOrder(@RequestBody MovieRequest movieRequest);
}
