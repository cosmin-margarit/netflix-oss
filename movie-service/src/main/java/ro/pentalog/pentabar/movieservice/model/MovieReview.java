package ro.pentalog.pentabar.movieservice.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.RepresentationModel;

@Data
@NoArgsConstructor
public class MovieReview extends RepresentationModel<MovieReview> {
    private Long Id;
    private Long movieId;
    private String review;
    private String authorName;
}
