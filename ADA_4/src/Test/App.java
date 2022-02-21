package Test;

import Model.Archivo;
import Model.LinkList;
import Model.Movie;

public class App {
    
    /** 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        
        LinkList<Movie> pelisPro = new LinkList<>();
        Archivo archivoPelis = new Archivo();
        
        
        LinkList<Movie> listMovies = new LinkList<Movie>();
        Movie movie2 = new Movie("Chino la pelicula ");
        Movie movie3 = new Movie("Aleluya");
        Movie movie4 = new Movie("Ted");
        Movie movie5 = new Movie("Amigo ven te invito una copa");
        Movie movie6 = new Movie("Ted");
        /*
        listMovies.insertAscending(movie2);
        listMovies.insertAscending(movie3);
        listMovies.insertAscending(movie4);
        listMovies.insertAscending(movie5);
        listMovies.insertAscending(movie6);
        listMovies.displayList();
        */


        for(int i = 0; i < 10; i++){
            listMovies.insertDescending(archivoPelis.leerDocumento(i));
        }

        archivoPelis.generarArchivoSalida(listMovies.obtenerPrimerElemento());
        listMovies.displayList();
    }
}
