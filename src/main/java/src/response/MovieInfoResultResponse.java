package src.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import src.domain.Actor;
import src.domain.Movie;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MovieInfoResultResponse {
    public MovieInfoResult movieInfoResult;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class MovieInfoResult {
        public MovieInfo movieInfo;

        public MovieInfo getMovieInfo() {
            return movieInfo;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class MovieInfo {
        public int movieCd;
        public String movieNm;
        public int openDt;
        public List<Genre> genres;
        public List<Director> directors;
        public List<Actor> actors;


        public int getMovieCd() {
            return movieCd;
        }

        public String getMovieNm() {
            return movieNm;
        }

        public int getOpenDt() {
            return openDt;
        }

        public List<Genre> getGenres() {
            return genres;
        }

        public List<Director> getDirectors() {
            return directors;
        }

        public List<Actor> getActors() {
            return actors;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("MovieInfo{");
            sb.append("actors=").append(actors);
            sb.append('}');
            return sb.toString();
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Genre {
        String genreNm;

        public String getGenreNm() {
            return genreNm;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Director {
        String peopleNm;

        public String getPeopleNm() {
            return peopleNm;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Actor {
        String peopleNm;

        public String getPeopleNm() {
            return peopleNm;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Actor{");
            sb.append("peopleNm='").append(peopleNm).append('\'');
            sb.append('}');
            return sb.toString();
        }
    }

    public MovieInfoResult getMovieInfoResult() {
        return movieInfoResult;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MovieInfoResultResponse{");
        sb.append("movieInfoResult=").append(movieInfoResult);
        sb.append('}');
        return sb.toString();
    }
}

