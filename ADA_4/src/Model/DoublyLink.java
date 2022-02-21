package Model;

public class DoublyLink<E> {
    public E dData; 
    public DoublyLink<E> next; 
    public DoublyLink<E> previous; 

    public DoublyLink(E d) { 
        dData = d; 
    }

    public void displayLink() { 
        System.out.print(dData + ","); 
    }

    
    /** 
     * Obtiene el dato del elemento
     * @return E
     */
    public E getdData() {
        return dData;
    }

    
    /** 
     * Asigna el dato del elemento a la variable dData
     * @param dData
     */
    public void setdData(E dData) {
        this.dData = dData;
    }

    
    /** 
     * Obtiene el siguiente elemento de la lista
     * @return DoublyLink<E>
     */
    public DoublyLink<E> getNext() {
        return next;
    }

    
    /** 
     * Asigna el dato del siguiente elemento de la lista
     * @param next
     */
    public void setNext(DoublyLink<E> next) {
        this.next = next;
    }

    
    /** 
     * Obtiene el elemento anterior de la lista
     * @return DoublyLink<E>
     */
    public DoublyLink<E> getPrevious() {
        return previous;
    }

    
    /** 
     * Asigna el elemento anterior de la lista
     * @param previous
     */
    public void setPrevious(DoublyLink<E> previous) {
        this.previous = previous;
    }

    
    
} 