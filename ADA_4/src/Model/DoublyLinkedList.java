package model;

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
            first.previous = newLink;
        newLink.next = first;
        first = newLink;
    }

    public void insertLast(E dd) {
        DoublyLink<E> newLink = new DoublyLink<E>(dd);
        if (isEmpty())
            first = newLink;
        else {
            last.next = newLink;
            newLink.previous = last;
        }
        last = newLink;
    }

    public DoublyLink<E> deleteFirst() {
        DoublyLink<E> temp = first;
        if (first.next == null)
            last = null;
        else
            first.next.previous = null;
        first = first.next;
        return temp;
    }

    public DoublyLink<E> deleteLast() {
        DoublyLink<E> temp = last;
        if (first.next == null)
            first = null;
        else
            last.previous.next = null;
        last = last.previous;
        return temp;
    }

    public boolean insertAfter(E key, E dd) {
        DoublyLink<E> current = first;
        while (current.getdData() != key) {
            current = current.next;
            if (current == null)
                return false;
        }
        DoublyLink<E> newLink = new DoublyLink<E>(dd);
        if (current == last) {
            newLink.next = null;
            last = newLink;
        } else {
            newLink.next = current.next;
            current.next.previous = newLink;
        }
        newLink.previous = current;
        current.next = newLink;
        return true;
    }

    public boolean insertBefore(E key, E dd) {
        DoublyLink<E> current = first;
        while (current.getdData() != key) {
            current = current.next;
            if (current == null)
                return false;
        }
        DoublyLink<E> newLink = new DoublyLink<E>(dd);
        if (current == first) {
            newLink.previous = null;
            first = newLink;
        } else {
            newLink.previous = current.previous;
            current.previous.next = newLink;
        }
        newLink.next = current;
        current.previous = newLink;
        return true;

    }

    public DoublyLink<E> deleteKey(E key) {
        DoublyLink<E> current = first;
        while ((current.getdData()) != key) {
            current = current.next;
            if (current == null)
                return null;
        }
        if (current == first)
            first = current.next;
        else
            current.previous.next = current.next;
        if (current == last)
            last = current.previous;
        else
            current.next.previous = current.previous;
        return current;
    }

    public void displayForward() {
        System.out.print("List (first-->last): ");
        DoublyLink<E> current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }

    public void displayBackward() {
        System.out.print("List (last-->first): ");
        DoublyLink<E> current = last;
        while (current != null) {
            current.displayLink();
            current = current.previous;
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
            current = current.next;
            count++;
        }
        System.out.println("tamaño de la lista: " + count);
    }

    public void deletePosition(int position) {
        DoublyLink<E> current = first;
        int listPosition = 1;
        while (listPosition != position) {
            current = current.next;
            listPosition++;

        }
        if (current == first) {

            first = current.next;
        } else {

            current.previous.next = current.next;
        }
        if (current == last) {

            last = current.previous;
        } else {

            current.next.previous = current.previous;
        }

    }

    public void cleanList() {
        DoublyLink<E> current = first;

        while (current != null) {
            if (current == first) {
                first = current.next;

            } else {
                current.previous.next = current.next;

            }
            if (current == last) {
                last = current.previous;

            } else {

                current.next.previous = current.previous;
            }
            current = current.next;

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

                current = current.next;
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

                if (current.getdData().compareTo(dd) > 0 && current.next == null) {

                    insertFirst(dd);
                    // Debug
                    // displayForward();
                    return;
                } else if (current.getdData().compareTo(dd) <= 0 && current.next != null
                        && current.next.getdData().compareTo(dd) > 0) {
                    ;
                    insertAfter(current.getdData(), dd);
                    // Debug
                    // displayForward();
                    return;
                } else if (current.getdData().compareTo(dd) <= 0 && current.next == null) {
                    insertLast(dd);
                    // Debug
                    // displayForward();
                    return;
                }
                current = current.next;
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
                if (current.getdData().compareTo(dd) >= 0 && current.next == null) {
                    insertLast(dd);

                    // Debug
                    // displayList();
                    return;
                } else if (current.getdData().compareTo(dd) >= 0 && current.next != null
                        && current.next.getdData().compareTo(dd) < 0) {
                    insertAfter(current.getdData(), dd);
                    // Debug
                    // displayList();
                    return;
                } else if (current.getdData().compareTo(dd) <= 0 && current.next == null) {
                    insertFirst(dd);
                    // Debug
                    // displayList();
                    return;
                }
                current = current.next;
            }
        }
    }

}