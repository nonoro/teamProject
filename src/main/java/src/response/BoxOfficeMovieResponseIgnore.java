package src.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class BoxOfficeMovieResponse {
    @JsonIgnoreProperties(ignoreUnknown = true)
    private String boxofficeType;
    @JsonIgnoreProperties(ignoreUnknown = true)
    private String showRange;
    @JsonIgnoreProperties(ignoreUnknown = true)
    private String yearWeekTime;
    @JsonIgnoreProperties(ignoreUnknown = true)
    private String rnum;
    @JsonIgnoreProperties(ignoreUnknown = true)
    private String rank;
    @JsonIgnoreProperties(ignoreUnknown = true)
    private String rankInten;
    @JsonIgnoreProperties(ignoreUnknown = true)
    private String rankOldAndNew;

    private String movieCd;

    @JsonIgnoreProperties(ignoreUnknown = true)
    private String movieNm;
    @JsonIgnoreProperties(ignoreUnknown = true)
    private String openDt;
    @JsonIgnoreProperties(ignoreUnknown = true)
    private String salesAmt;
    @JsonIgnoreProperties(ignoreUnknown = true)
    private String salesShare;
    @JsonIgnoreProperties(ignoreUnknown = true)
    private String salesInten;
    @JsonIgnoreProperties(ignoreUnknown = true)
    private String salesChange;
    @JsonIgnoreProperties(ignoreUnknown = true)
    private String salesAcc;
    @JsonIgnoreProperties(ignoreUnknown = true)
    private String audiCnt;
    @JsonIgnoreProperties(ignoreUnknown = true)
    private String audiInten;
    @JsonIgnoreProperties(ignoreUnknown = true)
    private String audiChange;
    private String audiAcc;
    @JsonIgnoreProperties(ignoreUnknown = true)
    private String scrnCnt;
    @JsonIgnoreProperties(ignoreUnknown = true)
    private String showCnt;
}
