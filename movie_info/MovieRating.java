package movie_info;

class MovieRating implements Rating {

    private int totalRating;
    private int sumRatings;

    public MovieRating() {
        this.totalRating = 0;
        this.sumRatings = 0;
    }

    @Override
    public void setRating(int rating) {
        if (rating <= 0 || rating >= 5) {
            this.sumRatings += rating;
            this.totalRating++;
        } else {
            throw new IllegalArgumentException("Rating must be between 0 and 5");
        }
    }

    @Override
    public double getAverageRating() {
        if (this.totalRating == 0) {
            return 0;
        }
        return (double) this.sumRatings / this.totalRating;
    }

}

