package Model;

public class Link <T> {
    private T dData;
    private Link<T> next; 

    public Link(T dd) {
        dData = dd;
    }

    public void displayLink() {
        System.out.print("{" + dData + "} ");
    }

    
    /** 
     * @return T
     */
    public T getdData() {
        return dData;
    }

    
    /** 
     * @param dData
     */
    public void setdData(T dData) {
        this.dData = dData;
    }

    
    /** 
     * @return Link<T>
     */
    public Link<T> getNext() {
        return next;
    }

    
    /** 
     * @param next
     */
    public void setNext(Link<T> next) {
        this.next = next;
    }

    

}