package Test;

import Model.LinkList;
import Model.Movie;

public class App {
    public static void main(String[] args) throws Exception {
        /*
        LinkList<Movie> pelisPro = new LinkList<>();
        LinkList<String> movie_titles = new LinkList<>();
        Archivo archivoPelis = new Archivo();
        Movie aaa = new Movie("Omar");
        */
        /*
        LinkList<String> lista = new LinkList<>();
        Link<String> elemento = new Link<String>("Omar");
        Link<String> elemento2 = new Link<String>("Omar2");
        Link<String> elemento3 = new Link<String>("Fredy");

        
        lista.insertFirst("estas");
        lista.insertFirst("como");
        lista.insertFirst("Hola");

        lista.insertarAntesDeUnElemento(elemento, "como");
        System.out.println(lista.obtenerPrimerElemento().getdData());
        System.out.println(lista.obtenerUltimoElemento().getdData());
        System.out.println(lista.size());
        lista.insertarDespuesDeUnElemento(elemento2, "estas");
        System.out.println(lista.obtenerUltimoElemento().getdData());
        lista.displayList();
        lista.eliminarElemento("Omar");
        System.out.println(lista.obtenerUltimoElemento().getdData());
        System.out.println(lista.buscarElemento("Omar2"));
        lista.displayList();
        lista.reemplazarElemento(elemento3, 2);
        lista.displayList();
    */

        

        /*
        lista.insertarElementoFormaCreciente(15);
        lista.insertarElementoFormaCreciente(12);
        lista.insertarElementoFormaCreciente(16);
        lista.insertarElementoFormaCreciente(54);
        lista.insertarElementoFormaCreciente(13);
        lista.insertarElementoFormaCreciente(13);
        lista.insertarElementoFormaCreciente(11);
        lista.insertarElementoFormaCreciente(1);
        lista.insertarElementoFormaCreciente(13);
        lista.insertarElementoFormaCreciente(10);
        lista.insertarElementoFormaCreciente(10);
        lista.insertarElementoFormaCreciente(10);
        lista.insertarElementoFormaCreciente(13);
        */

        
        LinkList<Movie> listMovies = new LinkList<Movie>();
        Movie movie2 = new Movie("Chino la pelicula ");
        Movie movie3 = new Movie("Aleluya");
        Movie movie4 = new Movie("Ted");
        Movie movie5 = new Movie("Amigo ven te invito una copa");
        Movie movie6 = new Movie("Ted");
        listMovies.insertAscending(movie2);
        listMovies.insertAscending(movie3);
        listMovies.insertAscending(movie4);
        listMovies.insertAscending(movie5);
        listMovies.insertAscending(movie6);
        listMovies.displayList();
    }
}
