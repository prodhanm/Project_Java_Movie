package movie_info;

import java.io.IOException;

public class MovieRating {

    private String movieTitle;
    private float rating;
    private int count;

    public MovieRating() {

    }
    
    public String getMovieTitle() {
        return movieTitle;
    }
    
    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }
    
    public float getRating() throws IOException {
        if (rating >=0 && rating <= 5.0) {
            return rating;
        } else {
            System.out.println("Rating must be between 0 and 5");
        }
        return rating;
    }
    
    public void setRating(float rating) {
        this.rating = rating;
    }
    
    public void addRating(float rating) {
        this.rating += rating;
    }

    public int getCount() {
        count = 1;
        return count;
    }

    public void addCount() {
        this.count++;
    }
}
