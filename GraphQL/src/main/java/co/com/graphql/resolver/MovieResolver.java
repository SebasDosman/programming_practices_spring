package co.com.graphql.resolver;

import co.com.graphql.model.Movie;
import co.com.graphql.service.IMovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class MovieResolver {
    private final IMovieService movieService;

    @QueryMapping
    public List<Movie> findAll() {
        return movieService.findAll();
    }

    @QueryMapping
    public Movie findById(@Argument Long id) {
        return movieService.findById(id);
    }

    @MutationMapping
    public Movie save(@Argument String title, @Argument String director, @Argument Integer releaseYear) {
        return movieService.save(title, director, releaseYear);
    }

    @MutationMapping
    public Movie update(@Argument Long id, @Argument String title, @Argument String director, @Argument Integer releaseYear) {
        return movieService.update(id, title, director, releaseYear);
    }

    @MutationMapping
    public Boolean delete(@Argument Long id) {
        return movieService.delete(id);
    }
}
