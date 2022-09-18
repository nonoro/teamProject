package src.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import src.response.BoxOfficeMovieResponseIgnore;
import src.response.MovieApiResponse;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class BoxOfficeApiJsonParser {
    private static String API_KEY = "6664422d5d826ebd760816a5fb0fe419";

    private static ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    private static String BASE_URL = "https://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchWeeklyBoxOfficeList.json?key=" + API_KEY;

    public static BoxOfficeMovieResponseIgnore getObject(int targetDt) {
        String requestUrl = BASE_URL;
        requestUrl += "&targetDt=" + targetDt;

        System.out.println("Request API URL = " + requestUrl);
        BoxOfficeMovieResponseIgnore result;

        try {
            result = OBJECT_MAPPER.readValue(createUrl(requestUrl), BoxOfficeMovieResponseIgnore.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return result;
    }

    private static URL createUrl(String url) {
        try {
            return new URL(url);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
