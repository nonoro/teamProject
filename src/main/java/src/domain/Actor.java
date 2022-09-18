package src.domain;

import src.response.MovieInfoResultResponse;

import java.util.ArrayList;
import java.util.List;

public class Actor {
    private int id;
    private int movieId;
    private String actorsName;
    private String movieName;

    public Actor(int id, int movieId, String actorsName, String movieName) {
        this.id = id;
        this.movieId = movieId;
        this.actorsName = actorsName;
        this.movieName = movieName;
    }

    public Actor(int movieId, String actorsName, String movieName) {
        this.movieId = movieId;
        this.actorsName = actorsName;
        this.movieName = movieName;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getActorsName() {
        return actorsName;
    }

    public void setActorsName(String actorsName) {
        this.actorsName = actorsName;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public static List<Actor> from(MovieInfoResultResponse movieInfoResultResponse) {
        List<Actor> result = new ArrayList<>();
        MovieInfoResultResponse.MovieInfo movieInfo = movieInfoResultResponse.getMovieInfoResult().getMovieInfo();
        List<MovieInfoResultResponse.Actor> actors = movieInfo.getActors();

        System.out.println(movieInfo.getMovieNm());

        for (MovieInfoResultResponse.Actor actor : actors) {
            String actorName = actor.getPeopleNm();
            Actor newActor = new Actor(movieInfo.getMovieCd(), actorName, movieInfo.getMovieNm());
            System.out.println(newActor);
            result.add(newActor);
        }

        return result;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Actor{");
        sb.append("id=").append(id);
        sb.append(", movieId=").append(movieId);
        sb.append(", actorsName='").append(actorsName).append('\'');
        sb.append(", movieName='").append(movieName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
