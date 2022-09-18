package src.domain;


import src.response.MovieInfoResultResponse;


public class Movie {
    private int id;
    private String name;
    private String genre;
    private String plot;
    private int releaseDate;
    private String director;
    private int audiAcc;

    public Movie(int id, String name, String genre, String plot, int releaseDate, String director, int audiAcc) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.plot = plot;
        this.releaseDate = releaseDate;
        this.director = director;
        this.audiAcc = audiAcc;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public String getPlot() {
        return plot;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public String getDirector() {
        return director;
    }

    public int getAudiAcc() {
        return audiAcc;
    }

    public static Movie from(MovieInfoResultResponse movieInfoResultResponse, int audiAcc) {
        MovieInfoResultResponse.MovieInfo result = movieInfoResultResponse.getMovieInfoResult().getMovieInfo();

        String directorName;

        if (result.getDirectors().isEmpty()) {
            directorName = "없음";
        } else {
            directorName = result.getDirectors().get(0).getPeopleNm();
        }

        return new Movie(
                result.getMovieCd(),
                result.getMovieNm(),
                result.getGenres().get(0).getGenreNm(),
                "",
                result.getOpenDt(),
                directorName,
                audiAcc
        );


    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Movie{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", genre='").append(genre).append('\'');
        sb.append(", plot='").append(plot).append('\'');
        sb.append(", releaseDate=").append(releaseDate);
        sb.append(", director='").append(director).append('\'');
        sb.append(", audiAcc=").append(audiAcc);
        sb.append('}');
        return sb.toString();
    }
}

