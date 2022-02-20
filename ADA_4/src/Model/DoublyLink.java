package model;

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

    public E getdData() {
        return dData;
    }

    public void setdData(E dData) {
        this.dData = dData;
    }

    public DoublyLink<E> getNext() {
        return next;
    }

    public void setNext(DoublyLink<E> next) {
        this.next = next;
    }

    public DoublyLink<E> getPrevious() {
        return previous;
    }

    public void setPrevious(DoublyLink<E> previous) {
        this.previous = previous;
    }

    
    
} 