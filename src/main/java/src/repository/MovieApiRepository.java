package src.repository;

import src.domain.Actor;
import src.domain.Movie;
import src.utils.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class MovieApiRepository {
    public static void saveMovie(List<Movie> movies) {
        Connection con = null;
        PreparedStatement ps = null;
        String sql = "insert into movie_api values(?, ?, ?, ? ,?, ?, ?)";

        try {
            con = DbUtil.getConnection();
            ps = con.prepareStatement(sql);
            for (Movie movie : movies) {
                ps.setInt(1, movie.getId());
                ps.setString(2, movie.getName());
                ps.setString(3, movie.getGenre());
                ps.setString(4, movie.getPlot());
                ps.setString(5, String.valueOf(movie.getReleaseDate()));
                ps.setString(6, movie.getDirector());
                ps.setInt(7, movie.getAudiAcc());

                ps.executeQuery();

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DbUtil.close(con, ps);
        }
    }

    public static void saveActor(List<Actor> Actors) {
        Connection con = null;
        PreparedStatement ps = null;
        String sql = "insert into actor_api values(actor_api_seq.nextval, ?, ?, ?)";

        try {
            con = DbUtil.getConnection();
            ps = con.prepareStatement(sql);
            for (Actor actor : Actors) {
                ps.setInt(1, actor.getMovieId());
                ps.setString(2, actor.getActorsName());
                ps.setString(3, actor.getMovieName());

                ps.executeQuery();

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DbUtil.close(con, ps);
        }
    }
}
