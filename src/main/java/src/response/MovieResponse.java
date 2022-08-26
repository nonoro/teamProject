package src.response;

import src.domain.Movie;

public class MovieResponse {
    private String name;

    public MovieResponse(String name) {
        this.name = name;
    }

    public static MovieResponse fromEntity(Movie movie) {
        return new MovieResponse(movie.getName());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MovieResponse{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
