package Model;

public class DoublyLinkedList<E extends Comparable<E>> {
    private DoublyLink<E> first;
    private DoublyLink<E> last;

    public DoublyLinkedList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(E dd) {
        DoublyLink<E> newLink = new DoublyLink<E>(dd);
        if (isEmpty())
            last = newLink;
        else
            first.setPrevious(newLink);
        newLink.setNext(first);
        first = newLink;
    }

    public void insertLast(E dd) {
        DoublyLink<E> newLink = new DoublyLink<E>(dd);
        if (isEmpty())
            first = newLink;
        else {
            last.setNext(newLink);
            newLink.setPrevious(last);
        }
        last = newLink;
    }

    public DoublyLink<E> deleteFirst() {
        DoublyLink<E> temp = first;
        if (first.getNext() == null)
            last = null;
        else
            first.getNext().setPrevious(null);
        first = first.getNext();
        return temp;
    }

    public DoublyLink<E> deleteLast() {
        DoublyLink<E> temp = last;
        if (first.getNext() == null)
            first = null;
        else
            last.getPrevious().setNext(null);
        last = last.getPrevious();
        return temp;
    }

    public boolean insertAfter(E key, E dd) {
        DoublyLink<E> current = first;
        while (current.getdData() != key) {
            current = current.getNext();
            if (current == null)
                return false;
        }
        DoublyLink<E> newLink = new DoublyLink<E>(dd);
        if (current == last) {
            newLink.setNext(null);
            last = newLink;
        } else {
            newLink.setNext(current.getNext());
            current.getNext().setPrevious(newLink);
        }
        newLink.setPrevious(current);
        current.setNext(newLink);
        return true;
    }

    public boolean insertBefore(E key, E dd) {
        DoublyLink<E> current = first;
        while (current.getdData() != key) {
            current = current.getNext();
            if (current == null)
                return false;
        }
        DoublyLink<E> newLink = new DoublyLink<E>(dd);
        if (current == first) {
            newLink.setPrevious(null);
            first = newLink;
        } else {
            newLink.setPrevious(current.getPrevious());
            current.getPrevious().setNext(newLink);
        }
        newLink.setNext(current);
        current.setPrevious(newLink);
        return true;

    }

    public DoublyLink<E> deleteKey(E key) {
        DoublyLink<E> current = first;
        while ((current.getdData()) != key) {
            current = current.getNext();
            if (current == null)
                return null;
        }
        if (current == first)
            first = current.getNext();
        else
            current.getPrevious().setNext(current.getNext());
        if (current == last)
            last = current.getPrevious();
        else
            current.getNext().setPrevious(current.getPrevious());
        return current;
    }

    public void displayForward() {
        System.out.print("List (first-->last): ");
        DoublyLink<E> current = first;
        while (current != null) {
            current.displayLink();
            current = current.getNext();
        }
        System.out.println("");
    }

    public void displayBackward() {
        System.out.print("List (last-->first): ");
        DoublyLink<E> current = last;
        while (current != null) {
            current.displayLink();
            current = current.getPrevious();
        }
        System.out.println("");
    }

    public void displayFirst() {
        DoublyLink<E> current = first;
        System.out.print("El primer elemento de la lista es: ");
        current.displayLink();
        System.out.println("");
    }

    public void displayLast() {
        DoublyLink<E> current = last;
        System.out.print("El último elemento de la lista es: ");
        current.displayLink();
        System.out.println("");
    }

    public void displaySize() {
        DoublyLink<E> current = first;
        int count = 0;
        while (current != null) {
            current = current.getNext();
            count++;
        }
        System.out.println("tamaño de la lista: " + count);
    }

    public void deletePosition(int position) {
        DoublyLink<E> current = first;
        int listPosition = 1;
        while (listPosition != position) {
            current = current.getNext();
            listPosition++;

        }
        if (current == first) {

            first = current.getNext();
        } else {

            current.getPrevious().setNext(current.getNext());
        }
        if (current == last) {

            last = current.getPrevious();
        } else {

            current.getNext().setPrevious(current.getPrevious());
        }

    }

    public void cleanList() {
        DoublyLink<E> current = first;

        while (current != null) {
            if (current == first) {
                first = current.getNext();

            } else {
                current.getPrevious().setNext(current.getNext());

            }
            if (current == last) {
                last = current.getPrevious();

            } else {

                current.getNext().setPrevious(current.getPrevious());
            }
            current = current.getNext();

        }
        System.out.println("Lista limpiada correctamente");

    }

    public void searchElement(E element) {
        DoublyLink<E> current = first;
        E elementList;
        int count = 1;
        Boolean comprobador = false;
        while (current != null) {
            elementList = current.getdData();

            if (elementList == element) {
                comprobador = true;
                break;
            } else {

                current = current.getNext();
                count++;

            }

        }
        if (comprobador) {
            System.out.println("Elemento encontrado en la posición: " + count);
        } else {
            System.out.println("Elemento no encontrado: -1");
        }

    }

    public void insertAscending(E dd) {
        DoublyLink<E> current = first;

        if (isEmpty()) {
            insertFirst(dd);
            // Debug
            // displayList();

            // System.out.println(first);
        } else {
            while (current != null) {

                if (current.getdData().compareTo(dd) > 0 && current.getNext() == null) {

                    insertFirst(dd);
                    // Debug
                    // displayForward();
                    return;
                } else if (current.getdData().compareTo(dd) <= 0 && current.getNext() != null
                        && current.getNext().getdData().compareTo(dd) > 0) {
                    ;
                    insertAfter(current.getdData(), dd);
                    // Debug
                    // displayForward();
                    return;
                } else if (current.getdData().compareTo(dd) <= 0 && current.getNext() == null) {
                    insertLast(dd);
                    // Debug
                    // displayForward();
                    return;
                }
                current = current.getNext();
            }
        }
    }

    public void insertDescending(E dd) {
        DoublyLink<E> current = first;

        if (isEmpty()) {
            insertFirst(dd);
            // Debug
            // displayList();

            // System.out.println(first);
        } else {
            while (current != null) {
                if (current.getdData().compareTo(dd) >= 0 && current.getNext() == null) {
                    insertLast(dd);

                    // Debug
                    // displayList();
                    return;
                } else if (current.getdData().compareTo(dd) >= 0 && current.getNext() != null
                        && current.getNext().getdData().compareTo(dd) < 0) {
                    insertAfter(current.getdData(), dd);
                    // Debug
                    // displayList();
                    return;
                } else if (current.getdData().compareTo(dd) <= 0 && current.getNext() == null) {
                    insertFirst(dd);
                    // Debug
                    // displayList();
                    return;
                }
                current = current.getNext();
            }
        }
    }

}