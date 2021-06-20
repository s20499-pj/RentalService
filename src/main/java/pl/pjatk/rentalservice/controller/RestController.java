package pl.pjatk.rentalservice.controller;

import io.swagger.annotations.*;
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

    @ApiOperation(value =  "Find movie by given ID",
            response = Movie.class,
            notes = "Getting movie from provided id")

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "ok"),
            @ApiResponse(code = 404, message = "Movie not found"),
            @ApiResponse(code = 500, message = "Movie not found")
    })

    @GetMapping("/{id}")
    public ResponseEntity<Movie> getMovie(
            @ApiParam(name = "id",
                    type = "long",
                    value = "Description.",
                    example = "1",
                    required = true,
                    defaultValue = "1")
            @PathVariable Long id) {
        return ResponseEntity.ok(movieService.getMovie(id));
    }

    @PutMapping("/return/{id}")
    public ResponseEntity<Movie> returnMovie(@PathVariable Long id){
        return ResponseEntity.ok(movieService.returnMovie(id));
    }

    @PutMapping("/rent/{id}")
    public ResponseEntity<Movie> rentMovie(@PathVariable Long id){
        return ResponseEntity.ok(movieService.rentMovie(id));
    }
}
