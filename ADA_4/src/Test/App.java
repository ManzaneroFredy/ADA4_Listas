package Test;

import Model.Archivo;
import Model.LinkList;
import Model.Movie;

public class App {
    public static void main(String[] args) throws Exception {
        LinkList<Movie> pelisPro = new LinkList<>();
        LinkList<String> movie_titles = new LinkList<>();
        Archivo archivoPelis = new Archivo();
        Movie aaa = new Movie("Omar");
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

        
        for(int i = 0; i < 10; i++){
            pelisPro.insertFirst(archivoPelis.leerDocumento(i));
            System.out.println(pelisPro.obtenerPrimerElemento().getdData().getMovie_title());
        }
        
        pelisPro.deleteFirst();
        System.out.println("depues de borrar " + pelisPro.obtenerPrimerElemento().getdData().getMovie_title());
        System.out.println(pelisPro.obtenerUltimoElemento().getdData().getMovie_title());

        pelisPro.insertAscending(aaa);
        
        pelisPro.displayList();
         
    }
}
