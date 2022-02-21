package Test;

import Model.DoublyLinkedList;

public class App {
    public static <E> void main(String[] args) throws Exception {
    DoublyLinkedList<Integer> theList = new DoublyLinkedList<Integer>();
    theList.insertFirst(22); 
    theList.insertFirst(44);
    theList.insertFirst(66);
    theList.insertLast(11); 
    theList.insertLast(33);
    theList.insertLast(55);
    theList.displayForward(); 
    theList.displayBackward(); 
    theList.deleteFirst(); 
    theList.deleteLast(); 
    theList.deleteKey(11); 
    theList.displayForward(); 
    theList.insertAfter(22, 77); 
    theList.insertAfter(33, 88); 
    theList.displayForward(); 
    theList.displayFirst();
    theList.displayLast();
    theList.displaySize();
    theList.deletePosition(2);
    theList.displayForward(); 
    theList.displaySize();
    theList.displaySize();
    theList.searchElement(88);
    theList.insertBefore(22, 11);
    theList.displayForward(); 
    theList.displaySize();
    theList.cleanList();
    theList.displaySize();
    theList.cleanList();
    theList.insertAscending(2);
    theList.insertAscending(100);
    theList.insertAscending(50);
    theList.insertAscending(23);
    theList.displayForward();
    theList.cleanList();
    theList.insertDescending(2);
    theList.insertDescending(100);
    theList.insertDescending(50);
    theList.insertDescending(23);
    theList.displayForward();
    }
}
