package pl.pjatk.rentalservice.service;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.pjatk.rentalservice.model.Movie;

@Service
public class MovieService {

    private final RestTemplate restTemplate;

    public MovieService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Movie getMovie(Long id){
        Movie movie = restTemplate.getForEntity("http://localhost:8080/movies/" + id, Movie.class).getBody();
        return movie;
    }

    public Movie returnMovie(Long id) {
        Movie movie = restTemplate.exchange("http://localhost:8080/movies/" + id + "/true", HttpMethod.PUT, null,Movie.class).getBody();
        return movie;
    }

    public Movie rentMovie(Long id) {
        Movie movie = restTemplate.exchange("http://localhost:8080/movies/" + id + "/false", HttpMethod.PUT, null,Movie.class).getBody();
        return movie;
    }
}