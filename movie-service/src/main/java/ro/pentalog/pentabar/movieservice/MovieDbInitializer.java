package ro.pentalog.pentabar.movieservice;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import ro.pentalog.pentabar.movieservice.repository.Movie;
import ro.pentalog.pentabar.movieservice.repository.MovieRepository;

@Service
public class MovieDbInitializer {


    @Bean
    ApplicationRunner initReviews(MovieRepository movieRepository) {
        return args -> {
            Movie lordOfTheRings = new Movie();
            lordOfTheRings.setTitle("The Lord Of The Rings: The Return of the King");
            lordOfTheRings.setPoster("https://resizing.flixster.com/0HK1Y-onFu90kMEV1KfRbs7-WGE=/206x305/v1.bTsxMTE2NjQyMztqOzE4NDQ0OzEyMDA7ODAwOzEyMDA");
            movieRepository.save(lordOfTheRings);

            Movie theLastSamurai = new Movie();
            theLastSamurai.setTitle("The Last Samurai");
            theLastSamurai.setPoster("https://resizing.flixster.com/bJPMRIGxIceRp965aQ6Htekf-xM=/206x305/v1.bTsxMTE2Njg2MTtqOzE4NDQ0OzEyMDA7ODAwOzEyMDA");
            movieRepository.save(theLastSamurai);

            movieRepository.findAll().forEach(System.out::println);
        };
    }
}
