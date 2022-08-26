package src;

import src.domain.Movie;
import src.response.MovieApiResponse;
import src.response.MovieResponse;
import src.utils.MovieApiJsonParser;

import java.util.List;

/*
json to object (json을 오브젝트 매퍼로 변환하기)
*/
public class JsonTest {
    public static void main(String[] args) {
        MovieApiResponse result = MovieApiJsonParser.getObject("2022", 100);

        List<Movie> movies = Movie.fromApiResponse(result);

        for (Movie movie : movies) {
            System.out.println(movie);
            System.out.println(MovieResponse.fromEntity(movie));
        }
    }
}