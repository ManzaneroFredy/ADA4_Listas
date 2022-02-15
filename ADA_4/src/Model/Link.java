package Model;

public class Link <T> {
    public T dData;
    public Link<T> next; 

    public Link(T dd) {
        dData = dd;
    }

    public void displayLink() {
        System.out.print("{" + dData + "} ");
    }
}