package src.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MovieApiResponse {
    private MovieResult movieListResult;

    public MovieResult getMovieListResult() {
        return movieListResult;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class MovieResult {
       private int totCnt;
       private String source;
       private List<Movie> movieList;

        public int getTotCnt() {
            return totCnt;
        }

        public String getSource() {
            return source;
        }

        public List<Movie> getMovieList() {
            return movieList;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Movie {
        private String movieCd;
        private String movieNm;
        private String movieNmEn;
        private String prdtYear;
        private String openDt;
        private String repGenreNm;
        private List<Director> directors;
        private List<Company> companys;

        public String getMovieCd() {
            return movieCd;
        }

        public String getMovieNm() {
            return movieNm;
        }

        public String getMovieNmEn() {
            return movieNmEn;
        }

        public String getPrdtYear() {
            return prdtYear;
        }

        public String getOpenDt() {
            return openDt;
        }

        public String getRepGenreNm() {
            return repGenreNm;
        }

        public List<Director> getDirectors() {
            return directors;
        }

        public List<Company> getCompanys() {
            return companys;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Director {
        private String peopleNm;

        public String getPeopleNm() {
            return peopleNm;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Company {
        private String companyCd;
        private String companyNm;

        public String getCompanyCd() {
            return companyCd;
        }

        public String getCompanyNm() {
            return companyNm;
        }
    }


}
