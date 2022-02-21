package Model;



public class DELinkList {
    private DELink first;
    private DELink last; 
    
    public DELinkList() {
        first = null;
        last = null;
    }

    
    /** 
     * @return boolean
     */
    public boolean isEmpty() {
        return (first==null);
    }

    
    /** 
     * @param dd
     */
    public void insertFirst(double dd) { 
        DELink newLink = new DELink(dd);
        if(isEmpty())
            last = newLink;
        newLink.next = first; 
        first = newLink;
    }

    
    /** 
     * @param dd
     */
    public void insertLast(double dd) { 
        DELink newLink = new DELink(dd);
        if(isEmpty())
            first = newLink;
        else
            last.next = newLink;     
        last = newLink;
    }


    
    /** 
     * @return double
     */
    public double deleteFirst() {
        double temp = first.dData;
        if(first.next == null)
            last = null;
        first = first.next;
        return temp;    
    }

    public void displayList() {
        System.out.print("List (first--> ");
        DELink current = first;
        while(current != null) {
            current.displayLink(); 
            current = current.next; 
        }
        System.out.println("<--last)");
    }

}