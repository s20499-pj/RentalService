package pl.pjatk.rentalservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.rentalservice.model.Movie;
import pl.pjatk.rentalservice.service.MovieService;


@org.springframework.web.bind.annotation.RestController
@RequestMapping
public class RestController {
    private final MovieService movieService;

    public RestController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movie> getMovie(@PathVariable Long id) {
        return ResponseEntity.ok(movieService.getMovie(id));
    }


    @PutMapping("/return/{id}/false")
    public ResponseEntity<Movie> returnMovie(@PathVariable Long id){
        return ResponseEntity.ok(movieService.returnMovie(id));
    }

    @PutMapping("/return/{id}/true")
    public ResponseEntity<Movie> rentMovie(@PathVariable Long id){
        return ResponseEntity.ok(movieService.rentMovie(id));
    }
}
