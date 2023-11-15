package movie_info;

public class Movie {

    private String title;

    public Movie() {
        
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
        this.title = title;
    }

    public static void main(String[] args) {
        Movie movie = new Movie();
        MovieRating rating = new MovieRating();
        movie.setTitle("The Godfather");
        System.out.println(movie.getTitle());
        rating.setRating(5);
        System.out.println(rating.getAverageRating(5));
    }

}
