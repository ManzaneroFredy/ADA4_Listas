package Test;
import Model.DELinkList;

public class App {
    public static void main(String[] args) throws Exception {
        DELinkList<Double> list = new DELinkList<Double>(); 
        list.insertFirst(2.99);
        list.insertFirst(4.99);
        list.insertFirst(6.99);
        list.insertFirst(8.99);
        //list.displayList(); 
        
        //list.deleteFirst();
        //list.deleteFirst();    

        list.displayList(); 

        System.out.println("First");
        list.getFirts().displayLink();
        System.out.println("");

        System.out.println("Last");
        list.getLast().displayLink();
        System.out.println("");

        System.out.println("Size: " + list.getSize());
        System.out.println("");

        System.out.println("Insert Before");
        list.insertBefore(100.0,8.99);
        list.displayList();
        
    }
}
