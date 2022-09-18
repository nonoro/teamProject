package src.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import src.response.MovieApiResponse;


import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class MovieApiJsonParser {
        private static String API_KEY = "6664422d5d826ebd760816a5fb0fe419";
//    private static String API_KEY = "f2be8dea6d81c9b399f0d5a92c2983f9";

    // Deseriallizer : json값을 객체로받아온거 , seriallizer : 객체로받아온걸 내보내는거
    // 여기에 사용된 라이브러리가 젝슨라이브러리
    private static ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    private static String BASE_URL = "http://www.kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchWeeklyBoxOfficeList.json?key=" + API_KEY;

    public static MovieApiResponse getObject(String targetDt, int itemPerPage) {
        String requestUrl = BASE_URL;
        requestUrl += "&targetDt=" + targetDt;
        requestUrl += "&itemPerPage=" + itemPerPage;


        System.out.println("Request API URL = " + requestUrl);
        MovieApiResponse result;

        try {
            result = OBJECT_MAPPER.readValue(createUrl(requestUrl), MovieApiResponse.class);
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
