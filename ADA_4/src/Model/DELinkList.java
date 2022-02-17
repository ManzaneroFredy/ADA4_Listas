package Model;

public class DELinkList<E extends Comparable<E>> {
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


    public DELink<E> getFirts(){
        return first;
    }

    public DELink<E> getLast(){
        return last;
    }

    public int getSize(){
        int size = 0;
        DELink<E> current = first;
        while(current != null) {
            current = current.next; 
            size++;
        }

        return size;
    }

    public void insertBefore(E dd, E referencedd){
        DELink<E> newNode = new DELink<E>(dd);
        //DELink<E> referencedNodeTemp = new DELink<E>(referencedd);
        DELink<E> current = first;
        while(current != null){
            

            //Caso donde el primero elemento es la referencia
            if(first.dData.compareTo(referencedd)== 0){
                DELink<E> temp = first;
                newNode.next = temp;
                first = newNode;
                return;
            }
            
            
            if(current.next.dData.compareTo(referencedd) == 0){
                DELink<E> temp = current.next;
                newNode.next = temp;
                current.next = newNode;
               return;
            }
            current = current.next;
            
        }

    }



}