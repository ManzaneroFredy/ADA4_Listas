package Model;
    /**
    *  Genera una lista ligada con doble final.
    * 
    * @param <E> the type of the elements of the DELinkList.
    */
public class DELinkList<E extends Comparable<E>> {
    private DELink<E> first;
    private DELink<E> last;

    public DELinkList() {
        first = null;
        last = null;
    }

    
    /** 
     * Verifica si la lista se encuentra vacia
     * @return boolean 
     */
    public boolean isEmpty() {
        return (first == null);
    }

    
    /** 
     * Inserta un elemento al principio de la lista
     * @param dd
     */
    public void insertFirst(E dd) {
        DELink<E> newLink = new DELink<E>(dd);
        if (isEmpty())
            last = newLink;
        newLink.setNext(first); 
        first = newLink;
    }

    
    /** 
     * Inserta un elemento al final de la lista
     * @param dd
     */
    public void insertLast(E dd) {
        DELink<E> newLink = new DELink<E>(dd);
        if (isEmpty())
            first = newLink;
        else
            last.setNext(newLink);
        last = newLink;
    }

    
    /** 
     * Borra un elemento al principio de la lista
     * @return E
     */
    public E deleteFirst() {
        E temp = first.getdData();
        if (first.getNext() == null)
            last = null;
        first = first.getNext();
        return temp;
    }

    /** 
     * Muestra la lista comenzando con el primer elemento
     */
    public void displayList() {
        System.out.print("List (first--> ");
        DELink<E> current = first;
        while (current != null) {
            current.displayLink();
            current = current.getNext();
        }
        System.out.println("<--last)");
    }

    
    /** 
     * Devuelve el primer elemento de la lista
     * @return DELink<E>
     */
    public DELink<E> getFirts() {
        return first;
    }

    
    /** 
     * Devuelve el ultimo elemento de la lista
     * @return DELink<E>
     */
    public DELink<E> getLast() {
        return last;
    }

    
    /** 
     * Devuelve el tamano actual de la lista
     * @return int
     */
    public int getSize() {
        int size = 0;
        DELink<E> current = first;
        while (current != null) {
            current = current.getNext();
            size++;
        }

        return size;
    }

    
    /** 
     * Inserta un elemento antes de un elemento de referencia
     * @param dd Elemento a insertar
     * @param referencedd Elemento de referencia
     */
    public void insertBefore(E dd, E referencedd) {
        DELink<E> newNode = new DELink<E>(dd);
        DELink<E> current = first;
        // Caso donde el primer elemento es la referencia
        if (first.getdData().compareTo(referencedd) == 0) {
            DELink<E> temp = first;
            newNode.setNext(temp);
            first = newNode;
            return;
        } else {
            while (current != null) {
                if (current.getNext().getdData().compareTo(referencedd) == 0) {
                    DELink<E> temp = current.getNext();
                    newNode.setNext(temp);
                    current.setNext(newNode);
                    return;
                }
                current = current.getNext();
            }
        }
    }

    
    /** 
     * Inserta un elemento despues de un elemento de referencia
     * @param dd Elemento a insertar
     * @param referencedd Elemento de referencia
     */
    public void insertAfter(E dd, E referencedd) {
        DELink<E> newNode = new DELink<E>(dd);
        DELink<E> current = first;
        while (current != null) {
            if (current.getdData().compareTo(referencedd) == 0) {
                DELink<E> temp = current.getNext();
                newNode.setNext(temp);;
                current.setNext(newNode); ;
                return;
            }
            current = current.getNext();
        }
    }

    
    /** 
     * Inserta un elemento de forma ascendente, comparando con los elementos actuales de la lista
     * @param dd Elemento a insertar
     */
    public void insertAscending(E dd) {
        DELink<E> current = first;

        if (isEmpty()) {
            insertFirst(dd);
            // Debug
            // displayList();

            // System.out.println(first);
        } else {
            while (current != null) {
                //Se elimino el mayor o igual que.
                if (current.getdData().compareTo(dd) > 0 && current.getNext() == null) {
                    insertFirst(dd);
                    // Debug
                    // displayList();
                    return;
                } else if (current.getdData().compareTo(dd) <= 0 && current.getNext() != null
                        && current.getNext().getdData().compareTo(dd) > 0) {
                    insertAfter(dd, current.getdData());
                    // Debug
                    // displayList();
                    return;
                } else if (current.getdData().compareTo(dd) <= 0 && current.getNext()== null) {
                    insertLast(dd);
                    // Debug
                    // displayList();
                    return;
                }
                current = current.getNext();
            }
        }
    }

    
    /** 
     * Inserta un elemento de forma Descendente, comparando con los elementos actuales de la lista
     * @param dd Elemento a insertar
     */
    public void insertDescending(E dd) {
        DELink<E> current = first;

        if (isEmpty()) {
            insertFirst(dd);
            // Debug
            // displayList();

            // System.out.println(first);
        } else {
            while (current != null) {
                if (current.getdData().compareTo(dd) > 0 && current.getNext() == null) {
                    insertLast(dd);

                    // Debug
                    // displayList();
                    return;
                } else if (current.getdData().compareTo(dd) >= 0 && current.getNext() != null
                        && current.getNext().getdData().compareTo(dd) < 0) {
                    insertAfter(dd, current.getdData());
                    // Debug
                    // displayList();
                    return;
                } else if (current.getdData().compareTo(dd) <= 0 && current.getNext() == null) {
                    insertFirst(dd);
                    // Debug
                    // displayList();
                    return;
                }
                current = current.getNext();
            }
        }
    }

    
    /** 
     * Elimina un elemento de acuerdo al dato enviado
     * @param dd Dato para buscar el elemento
     */
    public void deleteEspecificElement(E dd) {
        DELink<E> current = first;
        if (first.getdData().compareTo(dd) == 0) {
            first = first.getNext();
        } else {
            while (current != null) {
                if (current.getNext().getdData().compareTo(dd) == 0) {
                    DELink<E> temp = current.getNext().getNext();
                    current.setNext(temp);;
                    return;
                }
                current = current.getNext();
            }
        }

    }

    
    /** 
     * Elimina un elemento en la posicion indicada
     * @param position Posicion del elemento en la lista
     */
    public void deleteWithIndex(int position) {
        int i = 1;
        DELink<E> current = first;
        while (current != null) {
            if (position == i) {
                deleteEspecificElement(current.getdData());
            }
            i++;
            current = current.getNext();
        }
    }

    public void cleanList() {
        first = null;
        last = null;
    }

    
    /** 
     * Metodo para buscar elementos en la lista, mediante su dato. Si el elemento es encontrado se retorna la posicion del mismo, de lo contrario se retorna -1
     * @param dd Dato a buscar en la lista
     * @return int -1 Indica que el elemento no fue encontrado,  Cualquier otro numero indica la posicion del elemento
     */
    public int searchElement(E dd) {
        int i = 1;
        DELink<E> current = first;
        while (current != null) {
            if (current.getdData().compareTo(dd) == 0) {
                return i;
            }
            i++;
            current = current.getNext();
        }
        return -1;
    }

    
    /** 
     * Reeemplazar un elemento dependiendo de la posicion indicada
     * @param dd Elemento a insertar
     * @param position Posicion de elemento
     */
    public void replaceWithIndex(E dd, int position) {
        int i = 1;
        DELink<E> current = first;
        while (current != null) {
            if (position == i) {
                current.setdData(dd) ;
                return;
            }
            i++;
            current = current.getNext();
        }
    }

}