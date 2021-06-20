package pl.pjatk.rentalservice.model;

import io.swagger.annotations.ApiModelProperty;

public class Movie {

    @ApiModelProperty(notes = "Id: ", required = true, value = "id", example = "1")
    private Long id;
    @ApiModelProperty(notes = "Title: ", required = true, value = "title", example = "Straszny Film")
    private String title;
    @ApiModelProperty(notes = "Category: ", required = true, value = "category", example = "Document")
    private Category category;
    @ApiModelProperty(notes = "Director: ", required = true, value = "director", example = "Mr Smith")
    private String director;
    @ApiModelProperty(notes = "Rating: ", required = true, value = "rating", example = "2")
    private float rating;
    @ApiModelProperty(notes = "Availability: ", required = true, value = "isAvailable", example = "true")
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
