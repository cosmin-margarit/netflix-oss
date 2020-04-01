package ro.pentalog.pentabar.movieservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MovieRepository extends CrudRepository<Movie, Long> {
}
