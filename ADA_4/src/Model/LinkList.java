package Model;

import java.util.ArrayList;

public class LinkList<T extends Comparable<T>> {
    private Link<T> first;

    public LinkList() {
        first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(T dd) {
        Link<T> newLink = new Link<>(dd);
        newLink.setNext(first);
        first = newLink;
    }

    public Link<T> deleteFirst() {
        Link<T> temp = null;
        if (!isEmpty()) {
            temp = first;
            first = first.getNext();
        }
        return temp;
    }

    public void displayList() {
        System.out.print("List (first--> ");
        Link<T> current = first;
        while (current != null) {
            current.displayLink();
            current = current.getNext();
        }
        System.out.println("<--last)");
    }

    // Método extra para recorrer la lista
    private Link<T> recorreLista() {
        Link<T> current;
        current = this.first;
        while (current.getNext() != null) {
            current = current.getNext();
        }

        return current;
    }

    // 1.- Método para devolver el primer elemento sin eliminarlo
    public Link<T> obtenerPrimerElemento() {
        return this.first;
    }

    // 2.- Método para devolver el último elemento de la lista
    public Link<T> obtenerUltimoElemento() {
        return this.recorreLista();
    }

    // 3.- Método que retorne el size de la lista
    public int size() {
        Link<T> current;
        int i = 0;
        current = this.first;
        while (current != null) {
            current = current.getNext();
            i++;
        }

        return i;
    }

    // Método 4: Insertar un elemento antes de uno proporcionado
    public void insertarAntesDeUnElemento(T dd, T datoABuscar) {
        Link<T> elementoInsertar = new Link<>(dd);
        Link<T> current;
        current = first;

        if (current.getdData() == datoABuscar) {
            elementoInsertar.setNext(first);
            first = elementoInsertar;
        } else {

            while (current.getNext() != null) {
                if (current.getNext().getdData() == datoABuscar) {
                    break;
                } else {
                    current = current.getNext();
                }

            }
            elementoInsertar.setNext(current.getNext());
            current.setNext(elementoInsertar);
        }
    }

    // Método 5: insertar un elemento despues de uno proporcionado
    public void insertarDespuesDeUnElemento(T dd, T datoABuscar) {
        Link<T> elementoInsertar = new Link<>(dd);
        Link<T> current;
        current = first;

        while (current != null) {
            if (current.getdData() == datoABuscar) {
                break;
            } else {
                current = current.getNext();
            }
        }

        elementoInsertar.setNext(current.getNext());
        current.setNext(elementoInsertar);
    }

    // Método 6: Insertar un elemento de forma ordenada.
    // Método 6A: Insertar un elemento de forma ordenada Creciente
    
    // Método extra: Comparar dos Strings.
    private boolean esMayor(String cadenaComparar, String cadenaAComparar){
        //Primero se debe comparar las primeras letras de los Strings
        if(cadenaComparar.charAt(0) == cadenaAComparar.charAt(0)){
            //Si la primera letra de la String es igual, entonces se deben comprobar todas las demás letras
            //Primero debo comprobar cual es la String más pequeña, para que no me de una excepción de tamaño de arreglo

            if(cadenaComparar.length() >= cadenaAComparar.length()){
                int i = 1;
                //Como ya se comprobo el primer caracter, entonces, paso al siguiente
                for(i = 1; i < cadenaAComparar.length(); i++){
                    //Si en algún momento, una letra de la string es mayor, se rompe el bucle, y se envia cual es la mayor
                    if(cadenaComparar.charAt(i) > cadenaAComparar.charAt(i)){
                        return true;
                    }else{
                        if(cadenaComparar.charAt(i) < cadenaAComparar.charAt(i)){
                            return false;
                        }
                    }
                }

                if(i == cadenaAComparar.length()){
                    return false;
                }
                ArrayList<String> a = new ArrayList<>();
                
            }else{
                int i = 1;
                for(i = 1; i < cadenaComparar.length(); i++){
                    if(cadenaComparar.charAt(i) > cadenaAComparar.charAt(i)){
                        return true;
                    }else{
                        if(cadenaComparar.charAt(i) < cadenaAComparar.charAt(i)){
                            return false;
                        }
                    }
                }
            }

        }else{
            if(cadenaComparar.charAt(0) > cadenaAComparar.charAt(0)){
                return true;
            }else{
                return false;
            }
        }

        return false;

        // if(cadenaComparar.charAt(0) == cadenaAComparar.charAt(0)){
        //     if(cadenaComparar.length()>= cadenaAComparar.length()){
        //         for(int i = 1; i < cadenaAComparar.length(); i++){
        //             if(cadenaComparar.charAt(i) > cadenaAComparar.charAt(i)){
        //                 return true;
        //             }
        //         }
        //     }else{
        //         for(int i = 1; i < cadenaComparar.length(); i++){
        //             if(cadenaComparar.charAt(i) > cadenaAComparar.charAt(i)){
        //                 return true;
        //             }
        //         }
        //     }
        // }else{
        //     return false;
        // }
        // return false;
    }

 /*
    public void insertarElementoFormaCreciente(T dd){
        Link<T> elemento = new Link<>(dd);
        Link<T> current;
        Link<T> previous = first;
        current = first;
        

        if(this.isEmpty()){
            this.insertFirst(dd);
        }else{
            while(current != null){
                if(esMayor(current.getdData().toString(), elemento.getdData().toString())){
                    if(current == first){
                        this.insertFirst(dd);
                        break;
                    }else{
                        previous.setNext(elemento);
                        elemento.setNext(current);
                        break;
                    }
                }else{
                    previous = current;
                    current = current.getNext();
                }
            }

            if(current == null){
                previous.setNext(elemento);
            }

        }

       
    }
    
*/


public void insertAscending(T dd) {
    Link<T> current = first;

    if (isEmpty()) {
        insertFirst(dd);
        // Debug
        // displayList();

        // System.out.println(first);
    } else {
        while (current != null) {
            if (current.getdData().compareTo(dd) >= 0 && current.getNext() == null) {
                insertFirst(dd);
                // Debug
                // displayList();
                return;
            } else if (current.getdData().compareTo(dd) <= 0 && current.getdData() != null
                    && current.getdData().compareTo(dd) > 0) {
                this.insertarAntesDeUnElemento(dd, current.getdData());
                // Debug
                // displayList();
                return;
            } else if (current.getdData().compareTo(dd) <= 0 && current.getNext() == null) {
                Link<T> temp;
                Link<T> nodoNuevo = new Link<>(dd);
                temp = this.recorreLista();
                temp.setNext(nodoNuevo);
                // Debug
                // displayList();
                return;
            }
            current = current.getNext();
        }
    }
}

    // Método 7: Eliminar un elemento proporcionando su dato
    public void eliminarElemento(T datoAEliminar) {
        Link<T> current;
        current = first;

        if (current.getdData() == datoAEliminar) {
            first = first.getNext();
            current.setNext(null);
        } else {
            Link<T> temp;
            while (current.getNext() != null) {
                if (current.getNext().getdData() == datoAEliminar) {
                    break;
                } else {
                    current = current.getNext();
                }

            }
            temp = current.getNext();
            current.setNext(temp.getNext());
            temp.setNext(null);

        }
    }

    // Método 8: Eliminar un elemento proporcionando su indice
    public void eliminarElemento(int index) {
        Link<T> current;
        Link<T> previous = first;
        current = first;

        if (index > this.size()) {
            System.out.println("El indice es más grande que el tamaño de la lista");
        } else {
            for (int i = 1; i < index; i++) {
                previous = current;
                current = current.getNext();
            }
            previous.setNext(current.getNext());
            current.setNext(null);
        }
    }

    // Método 9: Limpiar una lista
    public void limpiarLista() {
        first = null;
    }

    // Método 10: busqueda de un elemento
    public int buscarElemento(T elemento) {
        int i = 1;
        Link<T> current;
        current = first;

        while (current != null) {
            if (current.getdData() == elemento) {
                return i;
            }
            current = current.getNext();
            i++;
        }
        return -1;
    }

    //Método 11: reemplazar un nodo por otro nodo mediante una posición
    public void reemplazarElemento(Link<T> elemento, int index){
        Link<T> current;
        Link<T> previous = first;
        current = first;
        

        if(index > this.size()){
            System.out.println("El indice indicando para reemplazar el elemento es más grande que el tamaño de la lista");
        }else{
            if(index == 1){
                elemento.setNext(first.getNext());
                first = elemento;
            }else{
                for(int i = 1; i < index; i++){
                    previous = current;
                    current = current.getNext();
                }
                previous.setNext(elemento);
                elemento.setNext(current.getNext());
            }
        }
    }

}