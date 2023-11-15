package movie_info;

public class MovieRatingApp {

    private int rating;

    public MovieRatingApp() {
        
    }

    public int getRating() {
        return rating;
    }

    public void selectRating(int rating) {

        System.out.println("Please select a rating between 0 and 5, inclusive.");
        System.out.println("0 - Don't watch this movie");
        System.out.println("1 - Watch this movie at your own risk");
        System.out.println("2 - It's so bad, it's good");
        System.out.println("3 - Much better than expected");
        System.out.println("4 - This Movie is really good");
        System.out.println("5 - Watch this movie, cause it's excellent");

    }

    public void sRating(int rating) {
        switch (rating) {
            case 0:
                this.rating = 0;
                break;
            case 1:
                this.rating = 1;
                break;
            case 2:
                this.rating = 2;
                break;
            case 3:
                this.rating = 3;
                break;
            case 4:
                this.rating = 4;
                break;
            case 5:
                this.rating = 5;
                break;
            default:
                throw new IllegalArgumentException("Rating must be between 0 and 5, inclusive.");
        }
    }



}
