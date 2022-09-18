package src.response;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
public class BoxOfficeMovieResponseIgnore {
    public BoxOfficeResult boxOfficeResult;

    public List<BoxOfficeInfo> getBoxOfficeInfo() {
        return boxOfficeResult.getWeeklyBoxOfficeList();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class BoxOfficeResult {
        public List<BoxOfficeInfo> weeklyBoxOfficeList;

        public List<BoxOfficeInfo> getWeeklyBoxOfficeList() {
            return weeklyBoxOfficeList;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class BoxOfficeInfo {
        private String movieCd;
        private int audiAcc;

        public String getMovieCd() {
            return movieCd;
        }

        public int getAudiAcc() {
            return audiAcc;
        }
    }




}
