package Model;

public class DELinkList<E> {
    private DELink<E> first;
    private DELink<E> last; 
    
    public DELinkList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return (first==null);
    }

    public void insertFirst(E dd) { 
        DELink<E> newLink = new DELink<E>(dd);
        if(isEmpty())
            last = newLink;
        newLink.next = first; 
        first = newLink;
    }

    public void insertLast(E dd) { 
        DELink<E> newLink = new DELink<E>(dd);
        if(isEmpty())
            first = newLink;
        else
            last.next = newLink;     
        last = newLink;
    }


    public E deleteFirst() {
        E temp = first.dData;
        if(first.next == null)
            last = null;
        first = first.next;
        return temp;    
    }

    public void displayList() {
        System.out.print("List (first--> ");
        DELink<E> current = first;
        while(current != null) {
            current.displayLink(); 
            current = current.next; 
        }
        System.out.println("<--last)");
    }

}