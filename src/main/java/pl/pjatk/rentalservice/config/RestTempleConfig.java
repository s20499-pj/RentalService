package pl.pjatk.rentalservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTempleConfig {

    @Bean
    public RestTemplate restTemple() {
        return new RestTemplate();
    }
}