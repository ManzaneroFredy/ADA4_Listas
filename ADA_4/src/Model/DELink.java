package Model;

public class DELink<E> {
    private E dData;
    private DELink<E> next; 

    public DELink(E dd) {
        dData = dd;
    }

    public void displayLink() {
        System.out.print("{" + dData + "} ");
    }

    public E getdData() {
        return dData;
    }

    public void setdData(E dData) {
        this.dData = dData;
    }

    public DELink<E> getNext() {
        return next;
    }

    public void setNext(DELink<E> next) {
        this.next = next;
    }


    
}