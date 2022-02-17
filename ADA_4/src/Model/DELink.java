package Model;

public class DELink<E> {
    public E dData;
    public DELink<E> next; 

    public DELink(E dd) {
        dData = dd;
    }

    public void displayLink() {
        System.out.print("{" + dData + "} ");
    }
}