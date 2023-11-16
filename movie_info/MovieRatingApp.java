package movie_info;

import java.util.Scanner;

public class MovieRatingApp {

    public static void main(String[] args) throws Exception {

        MovieRating movieRating = new MovieRating();
        Scanner movieInput = new Scanner(System.in);

        System.out.print("Enter movie title: ");
        String movieTitle = movieInput.nextLine();
        movieRating.setMovieTitle(movieTitle);

        System.out.print("Enter rating: ");
        float rating = movieInput.nextFloat();
        movieRating.setRating(rating);

        System.out.println("Movie title: " + movieRating.getMovieTitle());
        System.out.println("Rating: " + movieRating.getRating());
        System.out.println(movieRating.getMovieTitle() + " has been rated " + movieRating.getCount() + " times");
        System.out.println("Average rating: " + movieRating.getRating() / movieRating.getCount());   
        
        movieInput.close();
    }
}