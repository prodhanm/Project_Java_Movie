package movie_info;

public class MovieRating {

    private String movieTitle;
    private float rating;
    private float avgRating;
    private int count;

    public MovieRating() {

    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public void addRating(float rating) {
        count = 0;
        this.rating += rating;
        this.count++;
    }

    public float getAverageRating() {
        avgRating = this.rating / count;
    }

}