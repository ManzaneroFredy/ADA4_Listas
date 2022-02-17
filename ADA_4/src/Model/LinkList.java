package Model;

public class LinkList <T>{
    private Link<T> first;
    
    public LinkList() {
        first = null;
    }

    public boolean isEmpty() {
        return (first==null);
    }

    public void insertFirst(T dd) { 
        Link<T> newLink = new Link<T>(dd);
        newLink.next = first; 
        first = newLink;
    }

    public Link<T> deleteFirst() {
        Link<T> temp=null; 
        if(!isEmpty()){
            temp = first;
            first = first.next;
        }
        return temp; 
    }

    public void displayList() {
        System.out.print("List (first--> ");
        Link<T> current = first;
        while(current != null) {
            current.displayLink(); 
            current = current.next; 
        }
        System.out.println("<--last)");
    }

}