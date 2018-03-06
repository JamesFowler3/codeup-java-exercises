package movies;

public class Movie {
private String movie;
private String Category;

    public Movie(String movie, String category) {
        this.movie = movie;
        Category = category;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }
}

