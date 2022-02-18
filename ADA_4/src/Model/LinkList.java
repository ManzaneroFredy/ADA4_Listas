package Model;

public class LinkList<T> {
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
    public void insertarAntesDeUnElemento(Link<T> elementoInsertar, T datoABuscar) {
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
    public void insertarDespuesDeUnElemento(Link<T> elementoInsertar, T datoABuscar) {
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
    /*
    public void insertarElementoFormaCreciente(Link<T> elemento){
        Link<T> current;
        Link<T> previous = first;
        current = first;

        while(current.getNext() != null){
            if(current.getdData().toString(). < elemento.getdData()){

            }
        }
    }
    */

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