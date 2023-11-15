package movie_info;

class MovieRating implements Rating {

    private int totalRating;
    private int sumRatings;
    private int count;

    public MovieRating() {
        this.totalRating = 0;
        this.sumRatings = 0;
        this.count = 0;
    }

    @Override
    public void setRating(int rating) {
        if (rating <= 0 || rating >= 5) {
            this.sumRatings += rating;
        } else {
            throw new IllegalArgumentException("Rating must be between 0 and 5");
        }
    }
    
    @Override
    public double getAverageRating(double avg) {
        if (this.totalRating >= 0) {
            avg = this.sumRatings / this.totalRating;
        }
        return avg;
    }

    @Override
    public void countRating(int count) {
        this.count++;
    }

}

