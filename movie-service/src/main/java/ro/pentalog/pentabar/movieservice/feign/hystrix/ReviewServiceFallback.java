package ro.pentalog.pentabar.movieservice.feign.hystrix;

import org.springframework.hateoas.CollectionModel;
import org.springframework.stereotype.Component;
import ro.pentalog.pentabar.movieservice.feign.ReviewsFeignClient;
import ro.pentalog.pentabar.movieservice.model.MovieReview;

import java.util.Collections;

/**
 * Fallback class used for feign client, in case the hystrix circuit breaks
 */
@Component
public class ReviewServiceFallback implements ReviewsFeignClient {

    @Override
    public CollectionModel<MovieReview> getMovieReviews(Long movieId) {
        return new CollectionModel<>(Collections.emptyList());
    }
}
