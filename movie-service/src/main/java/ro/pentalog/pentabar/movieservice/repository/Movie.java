package ro.pentalog.pentabar.movieservice.repository;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
public class Movie {
    @Id
    @GeneratedValue
    private Long Id;
    private String title;
    private String poster;
}
