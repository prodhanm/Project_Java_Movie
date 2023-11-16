package movie_info;

public class MovieRatingApp {

    public static void main(String[] args) {
        MovieRating movieRating = new MovieRating();
        movieRating.setMovieTitle("The Matrix");
        movieRating.addRating(5);
        movieRating.addRating(4);
        movieRating.getAverageRating();

        System.out.println("Movie title: " + movieRating.getMovieTitle());
        System.out.println("Rating: " + movieRating.getRating());
        System.out.println("Average rating: " + movieRating.getAverageRating());    
    }
}

