package src.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MovieInfoResult {
    public MovieInfo movieInfo;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class MovieInfo {
        public String movieCd;
        public String movieNm;
        public int openDt;
        public List<Genre> genres;
        public List<Director> directors;

        public String getMovieCd() {
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

    public MovieInfo getMovieInfo() {
        return movieInfo;
    }
}
