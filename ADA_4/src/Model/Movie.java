package Model;


public class Movie<T extends Comparable<T>> {
    private int id; //1
    private String movie_title; //2
    private int duration; //3
    private String color; //4
    private String language; //5
    private String country; //6
    private String content_rating; //7 
    private long budget; //8
    private int year; //9
    private double imdb_score; //10
    private double aspect_ratio; //11
    private String movie_imdb_link; //12
    
    
    public Movie(){

    }

    public Movie(String titulo){
        this.movie_title = titulo;
    }

    
    public Movie(int id, String movie_title, int duration, String color, String language, String country,
            String content_rating, long budget, int year, double imdb_score, double aspect_ratio,
            String movie_imdb_link) {
        this.id = id;
        this.movie_title = movie_title;
        this.duration = duration;
        this.color = color;
        this.language = language;
        this.country = country;
        this.content_rating = content_rating;
        this.budget = budget;
        this.year = year;
        this.imdb_score = imdb_score;
        this.aspect_ratio = aspect_ratio;
        this.movie_imdb_link = movie_imdb_link;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovie_title() {
        return movie_title;
    }

    public void setMovie_title(String movie_title) {
        this.movie_title = movie_title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getContent_rating() {
        return content_rating;
    }

    public void setContent_rating(String content_rating) {
        this.content_rating = content_rating;
    }

    public long getBudget() {
        return budget;
    }

    public void setBudget(long budget) {
        this.budget = budget;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getImdb_score() {
        return imdb_score;
    }

    public void setImdb_score(double imdb_score) {
        this.imdb_score = imdb_score;
    }

    public double getAspect_ratio() {
        return aspect_ratio;
    }

    public void setAspect_ratio(double aspect_ratio) {
        this.aspect_ratio = aspect_ratio;
    }

    public String getMovie_imdb_link() {
        return movie_imdb_link;
    }

    public void setMovie_imdb_link(String movie_imdb_link) {
        this.movie_imdb_link = movie_imdb_link;
    }

}
