package ro.pentalog.pentabar.reviewservice.repository;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
public class MovieReview {
    @Id
    @GeneratedValue
    private Long Id;
    private Long movieId;
    private String review;
    private String authorName;
}
