package pl.pjatk.rentalservice.model;

public class Movie {

    private Long id;
    private String title;
    private Category category;
    private String director;
    private float rating;
    private boolean isAvailable;

    public Movie() {
    }

    public Movie(Long id, String title, Category category, String director, float rating, boolean isAvailable) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.director = director;
        this.rating = rating;
        this.isAvailable = isAvailable;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", category=" + category +
                ", director='" + director + '\'' +
                ", rating=" + rating +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
