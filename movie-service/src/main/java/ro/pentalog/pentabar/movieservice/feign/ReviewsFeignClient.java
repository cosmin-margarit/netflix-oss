package ro.pentalog.pentabar.movieservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ro.pentalog.pentabar.movieservice.feign.hystrix.ReviewServiceFallback;
import ro.pentalog.pentabar.movieservice.feign.hystrix.ReviewServiceFallbackFactory;
import ro.pentalog.pentabar.movieservice.model.MovieReview;

@FeignClient(name = "review-service", /*fallback = ReviewServiceFallback.class,*/ fallbackFactory = ReviewServiceFallbackFactory.class)
public interface ReviewsFeignClient {

    @GetMapping("/reviews/search/findAllByMovieId")
    CollectionModel<MovieReview> getMovieReviews(@RequestParam("movieID") Long movieId);
}