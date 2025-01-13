package co.com.graphql.service.implementation;

import co.com.graphql.model.Movie;
import co.com.graphql.repository.MovieRepository;
import co.com.graphql.service.IMovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class MovieService implements IMovieService {
    private final MovieRepository movieRepository;

    @Override
    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

    @Override
    public Movie findById(Long id) {
        return movieRepository.getReferenceById(id);
    }

    @Override
    public Movie save(String title, String director, Integer releaseYear) {
        Movie movie = Movie.builder()
                .title(title)
                .director(director)
                .releaseYear(releaseYear)
                .build();

        return movieRepository.save(movie);
    }

    @Override
    public Movie update(Long id, String title, String director, Integer releaseYear) {
        Movie movie = movieRepository.getReferenceById(id);

        if (title != null) movie.setTitle(title);
        if (director != null) movie.setDirector(director);
        if (releaseYear != null) movie.setReleaseYear(releaseYear);

        return movieRepository.save(movie);
    }

    @Override
    public Boolean delete(Long id) {
        movieRepository.deleteById(id);

        return true;
    }
}
