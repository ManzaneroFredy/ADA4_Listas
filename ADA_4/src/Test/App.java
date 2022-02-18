package Test;

import Model.Link;
import Model.LinkList;

public class App {
    public static void main(String[] args) throws Exception {
        LinkList<Integer> lista = new LinkList<>();
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

        Link<Integer> elemento = new Link<>(2);
        Link<Integer> elemento2 = new Link<>(6);
        Link<Integer> elemento3 = new Link<>(12);
        Link<Integer> elemento4 = new Link<>(1);



    }
}
