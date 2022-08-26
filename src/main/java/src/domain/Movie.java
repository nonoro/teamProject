package src.domain;

import src.response.MovieApiResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Movie {

    private String name;
    private String genre; // 민감정보

    public Movie(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public static List<Movie> fromApiResponse(MovieApiResponse response) {
        List<MovieApiResponse.Movie> movieList = response.getMovieListResult().getMovieList();

        return movieList.stream()
                .filter(movie -> !movie.getRepGenreNm().equals("성인물(에로)"))
                .filter(movie -> !movie.getMovieNm().contains("음란"))
                .map(Movie::fromApiMovie)
                .collect(Collectors.toList());
    }

    public static Movie fromApiMovie(MovieApiResponse.Movie movie) {
        return new Movie(movie.getMovieNm(), movie.getRepGenreNm());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Movie{");
        sb.append("name='").append(name).append('\'');
        sb.append(", genre='").append(genre).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
