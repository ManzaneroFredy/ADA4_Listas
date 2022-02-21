package Model;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;


public class Archivo{
    private String RUTA_ARCHIVO = "src/Docs/Movie.csv";
    private final static String SEPARADOR = ",";
    private BufferedReader lectorDocumento = null;

    
    /** 
     * @param lineaALeer
     * @return Movie
     * @throws Exception
     */
    public Movie leerDocumento(int lineaALeer) throws Exception {
        try {
            this.lectorDocumento = new BufferedReader(new FileReader(RUTA_ARCHIVO, StandardCharsets.UTF_8));
            String linea = "";
            linea = lectorDocumento.readLine();
            for(int i = 0; i < lineaALeer + 1; i++){
                linea = lectorDocumento.readLine();
            }
            String[] datosArchivo = linea.split(SEPARADOR);
            return new Movie(Integer.parseInt(datosArchivo[0]), datosArchivo[1],Integer.parseInt(datosArchivo[2]), datosArchivo[3], datosArchivo[4], datosArchivo[5], datosArchivo[6],Long.parseLong(datosArchivo[7]),Integer.parseInt(datosArchivo[8]), Double.parseDouble(datosArchivo[9]) ,Double.parseDouble(datosArchivo[9]), datosArchivo[11]);
        } catch (Exception ex) {
            System.out.println("problema detectado " + ex);
        } finally {
            if (null != lectorDocumento) {
                lectorDocumento.close();
            }

        }
        return new Movie("NODATA");
    }

    public void generarArchivoSalida(Link<Movie> listaMovie) throws Exception{
        FileOutputStream archivoCsv = new FileOutputStream("src/Docs/MovieFinal.csv");
        OutputStreamWriter salida = new OutputStreamWriter(archivoCsv, "UTF-8");
        Link<Movie> temp = listaMovie;

        while(temp.getNext() != null){
            salida.write(temp.getdData().getId() + ", " + temp.getdData().getMovie_title() + ", " + temp.getdData().getDuration()+ ", " + temp.getdData().getColor()+ ", " + temp.getdData().getLanguage()
            + ", " + temp.getdData().getCountry()+ ", " + temp.getdData().getContent_rating()+ ", " + temp.getdData().getBudget()+ ", " + temp.getdData().getYear()+ ", " + temp.getdData().getImdb_score()
            + ", " + temp.getdData().getAspect_ratio()+ ", " + temp.getdData().getMovie_imdb_link() + "\n");
            temp = temp.getNext();
        }
        
        
        salida.close();
    }

  
}
