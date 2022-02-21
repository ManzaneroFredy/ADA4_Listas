package Model;


public class Movie implements Comparable<Movie> {
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

    
    /** 
     * @return int
     */
    public int getId() {
        return id;
    }

    
    /** 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    
    /** 
     * @return String
     */
    public String getMovie_title() {
        return movie_title;
    }

    
    /** 
     * @param movie_title
     */
    public void setMovie_title(String movie_title) {
        this.movie_title = movie_title;
    }

    
    /** 
     * @return int
     */
    public int getDuration() {
        return duration;
    }

    
    /** 
     * @param duration
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }

    
    /** 
     * @return String
     */
    public String getColor() {
        return color;
    }

    
    /** 
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    
    /** 
     * @return String
     */
    public String getLanguage() {
        return language;
    }

    
    /** 
     * @param language
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    
    /** 
     * @return String
     */
    public String getCountry() {
        return country;
    }

    
    /** 
     * @param country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    
    /** 
     * @return String
     */
    public String getContent_rating() {
        return content_rating;
    }

    
    /** 
     * @param content_rating
     */
    public void setContent_rating(String content_rating) {
        this.content_rating = content_rating;
    }

    
    /** 
     * @return long
     */
    public long getBudget() {
        return budget;
    }

    
    /** 
     * @param budget
     */
    public void setBudget(long budget) {
        this.budget = budget;
    }

    
    /** 
     * @return int
     */
    public int getYear() {
        return year;
    }

    
    /** 
     * @param year
     */
    public void setYear(int year) {
        this.year = year;
    }

    
    /** 
     * @return double
     */
    public double getImdb_score() {
        return imdb_score;
    }

    
    /** 
     * @param imdb_score
     */
    public void setImdb_score(double imdb_score) {
        this.imdb_score = imdb_score;
    }

    
    /** 
     * @return double
     */
    public double getAspect_ratio() {
        return aspect_ratio;
    }

    
    /** 
     * @param aspect_ratio
     */
    public void setAspect_ratio(double aspect_ratio) {
        this.aspect_ratio = aspect_ratio;
    }

    
    /** 
     * @return String
     */
    public String getMovie_imdb_link() {
        return movie_imdb_link;
    }

    
    /** 
     * @param movie_imdb_link
     */
    public void setMovie_imdb_link(String movie_imdb_link) {
        this.movie_imdb_link = movie_imdb_link;
    }

    
    /** 
     * @param au
     * @return int
     */
    @Override
    public int compareTo(Movie au) {
        int last = this.movie_title.compareTo(au.movie_title);
        // Sorting by first name if last name is same d
        return last;
    }

    @Override
    public String toString() {
        
        return movie_title;
    }

}
