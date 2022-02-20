package Model;

public class DELinkList<E extends Comparable<E>> {
    private DELink<E> first;
    private DELink<E> last;

    public DELinkList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(E dd) {
        DELink<E> newLink = new DELink<E>(dd);
        if (isEmpty())
            last = newLink;
        newLink.setNext(first); 
        first = newLink;
    }

    public void insertLast(E dd) {
        DELink<E> newLink = new DELink<E>(dd);
        if (isEmpty())
            first = newLink;
        else
            last.setNext(newLink);
        last = newLink;
    }

    public E deleteFirst() {
        E temp = first.getdData();
        if (first.getNext() == null)
            last = null;
        first = first.getNext();
        return temp;
    }

    public void displayList() {
        System.out.print("List (first--> ");
        DELink<E> current = first;
        while (current != null) {
            current.displayLink();
            current = current.getNext();
        }
        System.out.println("<--last)");
    }

    public DELink<E> getFirts() {
        return first;
    }

    public DELink<E> getLast() {
        return last;
    }

    public int getSize() {
        int size = 0;
        DELink<E> current = first;
        while (current != null) {
            current = current.getNext();
            size++;
        }

        return size;
    }

    public void insertBefore(E dd, E referencedd) {
        DELink<E> newNode = new DELink<E>(dd);
        DELink<E> current = first;
        // Caso donde el primer elemento es la referencia
        if (first.getdData().compareTo(referencedd) == 0) {
            DELink<E> temp = first;
            newNode.setNext(temp);
            first = newNode;
            return;
        } else {
            while (current != null) {
                if (current.getNext().getdData().compareTo(referencedd) == 0) {
                    DELink<E> temp = current.getNext();
                    newNode.setNext(temp);
                    current.setNext(newNode);
                    return;
                }
                current = current.getNext();
            }
        }
    }

    public void insertAfter(E dd, E referencedd) {
        DELink<E> newNode = new DELink<E>(dd);
        DELink<E> current = first;
        while (current != null) {
            if (current.getdData().compareTo(referencedd) == 0) {
                DELink<E> temp = current.getNext();
                newNode.setNext(temp);;
                current.setNext(newNode); ;
                return;
            }
            current = current.getNext();
        }
    }

    public void insertAscending(E dd) {
        DELink<E> current = first;

        if (isEmpty()) {
            insertFirst(dd);
            // Debug
            // displayList();

            // System.out.println(first);
        } else {
            while (current != null) {
                //Se elimino el mayor o igual que.
                if (current.getdData().compareTo(dd) > 0 && current.getNext() == null) {
                    insertFirst(dd);
                    // Debug
                    // displayList();
                    return;
                } else if (current.getdData().compareTo(dd) <= 0 && current.getNext() != null
                        && current.getNext().getdData().compareTo(dd) > 0) {
                    insertAfter(dd, current.getdData());
                    // Debug
                    // displayList();
                    return;
                } else if (current.getdData().compareTo(dd) <= 0 && current.getNext()== null) {
                    insertLast(dd);
                    // Debug
                    // displayList();
                    return;
                }
                current = current.getNext();
            }
        }
    }

    public void insertDescending(E dd) {
        DELink<E> current = first;

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
                    insertAfter(dd, current.getdData());
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

    public void deleteEspecificElement(E dd) {
        DELink<E> current = first;
        if (first.getdData().compareTo(dd) == 0) {
            first = first.getNext();
        } else {
            while (current != null) {
                if (current.getNext().getdData().compareTo(dd) == 0) {
                    DELink<E> temp = current.getNext().getNext();
                    current.setNext(temp);;
                    return;
                }
                current = current.getNext();
            }
        }

    }

    public void deleteWithIndex(int position) {
        int i = 1;
        DELink<E> current = first;
        while (current != null) {
            if (position == i) {
                deleteEspecificElement(current.getdData());
            }
            i++;
            current = current.getNext();
        }
    }

    public void cleanList() {
        first = null;
        last = null;
    }

    public int searchElement(E dd) {
        int i = 1;
        DELink<E> current = first;
        while (current != null) {
            if (current.getdData().compareTo(dd) == 0) {
                return i;
            }
            i++;
            current = current.getNext();
        }
        return -1;
    }

    public void replaceWithIndex(E dd, int position) {
        int i = 1;
        DELink<E> current = first;
        while (current != null) {
            if (position == i) {
                current.setdData(dd) ;
                return;
            }
            i++;
            current = current.getNext();
        }
    }

}