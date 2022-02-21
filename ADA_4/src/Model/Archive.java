package Model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;

public class Archive {
    private String RUTA_ARCHIVO = "ADA_4/src/Docs/Movie.csv";
    private final static String SEPARATOR = ",";
    private BufferedReader documentReader = null;

    public Movie readMovie(int lines) throws Exception {
        try {
            this.documentReader = new BufferedReader(new FileReader(RUTA_ARCHIVO));
            String line = "";
            line = documentReader.readLine();
            for(int i = 0; i < lines + 1; i++){
                line = documentReader.readLine();
            }
            String[] fileData = line.split(SEPARATOR);
            //fileData[0] = fileData[0].replace("?1", "1");
            Movie movie = new Movie();
            movie.setId(fileData[0] != "" ? Integer.parseInt(fileData[0]): 0 );
            movie.setMovie_title(fileData[1] != "" ? fileData[1] : "No Title");
            movie.setDuration(fileData[2] != "" ? Integer.parseInt(fileData[2]) : 00);
            movie.setColor(fileData[3] != "" ? fileData[3] : "No Color");
            movie.setLanguage(fileData[4] != ""? fileData[4] : "No language");
            movie.setCountry(fileData[5] != ""? fileData[4] : "No Country");
            movie.setContent_rating(fileData[6] != ""? fileData[6] : "No Content rating");
            movie.setBudget(fileData[7] != ""? Long.parseLong(fileData[7]) : 0);
            movie.setYear(fileData[8] != ""? Integer.parseInt(fileData[8]) : 0);
            movie.setImdb_score(fileData[9] != ""? Double.parseDouble(fileData[9]) : 0);
            movie.setAspect_ratio(fileData[10] != ""? Double.parseDouble(fileData[10]) : 0);
            movie.setMovie_imdb_link(fileData[11] != "" ? fileData[11] : "No imdb Link");
            return movie;
        } catch (Exception ex) {
            System.out.println("problema detectado " + ex);
            return new Movie("No DATA");
        } finally {
            if (null != documentReader) {
                documentReader.close();
            }
        }
        
    }
}
