package Model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;


public class Archivo{
    private String RUTA_ARCHIVO = "ADA_4/src/Docs/Movie.csv";
    private final static String SEPARADOR = ",";
    private BufferedReader lectorDocumento = null;

    public Movie leerDocumento(int lineaALeer) throws Exception {
        try {
            this.lectorDocumento = new BufferedReader(new FileReader(RUTA_ARCHIVO, StandardCharsets.UTF_8));
            String linea = "";
            linea = lectorDocumento.readLine();
            for(int i = 0; i < lineaALeer + 1; i++){
                linea = lectorDocumento.readLine();
            }
            String[] datosArchivo = linea.split(SEPARADOR);
            datosArchivo[0] = datosArchivo[0].replace("?1", "1");
            return new Movie(Integer.parseInt(datosArchivo[0]), datosArchivo[1],Integer.parseInt(datosArchivo[2]), datosArchivo[3], datosArchivo[4], datosArchivo[5], datosArchivo[6],Long.parseLong(datosArchivo[7]),Integer.parseInt(datosArchivo[8]), Double.parseDouble(datosArchivo[9]) ,Double.parseDouble(datosArchivo[9]), datosArchivo[11]);
        } catch (Exception ex) {
            System.out.println("problema detectado " + ex);
        } finally {
            if (null != lectorDocumento) {
                lectorDocumento.close();
            }

        }
        return new Movie("omar");
    }

  
}
