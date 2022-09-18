package src;

import src.domain.Actor;
import src.domain.BoxOfficeInfo;
import src.domain.Movie;
import src.repository.MovieApiRepository;
import src.response.BoxOfficeMovieResponseIgnore;
import src.response.MovieInfoResultResponse;
import src.utils.BoxOfficeApiJsonParser;
import src.utils.MovieInfoResultApiJsonParser;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
json to object (json을 오브젝트 매퍼로 변환하기)
*/
public class JsonTest {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        List<Actor> actors = new ArrayList<>();
        Set<BoxOfficeInfo> boxOfficeInfos = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            BoxOfficeMovieResponseIgnore result = BoxOfficeApiJsonParser.getObject(20220901 - (i * 100));
            List<BoxOfficeMovieResponseIgnore.BoxOfficeInfo> boxOfficeInfo = result.getBoxOfficeInfo();

            for (BoxOfficeMovieResponseIgnore.BoxOfficeInfo officeInfo : boxOfficeInfo) {
                boxOfficeInfos.add(new BoxOfficeInfo(officeInfo.getMovieCd(), officeInfo.getAudiAcc()));
            }
        }

        System.out.println(boxOfficeInfos.size());
        for (BoxOfficeInfo boxOfficeInfo : boxOfficeInfos) {
            MovieInfoResultResponse result = MovieInfoResultApiJsonParser.getObject(boxOfficeInfo.getId());
            Movie movie = Movie.from(result, boxOfficeInfo.getAudiAcc());
            movies.add(movie);
            System.out.println(movie);
        }
//        MovieApiRepository.saveMovie(movies);

        for (BoxOfficeInfo boxOfficeInfo : boxOfficeInfos) {
            MovieInfoResultResponse result = MovieInfoResultApiJsonParser.getObject(boxOfficeInfo.getId());
            List<Actor> tmp = Actor.from(result);
            System.out.println(tmp);
            actors.addAll(tmp);
        }
//        MovieApiRepository.saveActor(actors);

    }
}