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
        list.insertBefore(102.0,2.99);
        list.displayList();

        System.out.println("Insert Last");
        list.insertAfter(30.0,2.99);
        list.displayList();


        System.out.println("Delete Especific Element");
        list.deleteEspecificElement(102.0);
        list.displayList();

        System.out.println("Delete with Index");
        list.deleteWithIndex(5);
        list.displayList();

        System.out.println("Search Element and position");
        int searchValue = list.searchElement(4.99);
        if(searchValue == -1){
            System.out.println("Element not found: " + searchValue);
        }else{
            System.out.println("Element found in position: "+ searchValue);
        }
        list.displayList();


        System.out.println("Replace element in position");
        list.replaceWithIndex(8.99,3);
        list.displayList();


        // list.cleanList();

        // list.displayList();
        
        
    }
}
