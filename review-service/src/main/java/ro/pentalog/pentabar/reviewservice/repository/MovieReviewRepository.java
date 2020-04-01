package ro.pentalog.pentabar.reviewservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RepositoryRestResource(path = "reviews", collectionResourceRel = "reviews")
public interface MovieReviewRepository extends JpaRepository<MovieReview, Long> {

    List<MovieReview> findAllByMovieId(Long movieID);
}
