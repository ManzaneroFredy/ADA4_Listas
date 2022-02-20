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
        newLink.next = first;
        first = newLink;
    }

    public void insertLast(E dd) {
        DELink<E> newLink = new DELink<E>(dd);
        if (isEmpty())
            first = newLink;
        else
            last.next = newLink;
        last = newLink;
    }

    public E deleteFirst() {
        E temp = first.dData;
        if (first.next == null)
            last = null;
        first = first.next;
        return temp;
    }

    public void displayList() {
        System.out.print("List (first--> ");
        DELink<E> current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
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
            current = current.next;
            size++;
        }

        return size;
    }

    public void insertBefore(E dd, E referencedd) {
        DELink<E> newNode = new DELink<E>(dd);
        DELink<E> current = first;
        // Caso donde el primer elemento es la referencia
        if (first.dData.compareTo(referencedd) == 0) {
            DELink<E> temp = first;
            newNode.next = temp;
            first = newNode;
            return;
        } else {
            while (current != null) {
                if (current.next.dData.compareTo(referencedd) == 0) {
                    DELink<E> temp = current.next;
                    newNode.next = temp;
                    current.next = newNode;
                    return;
                }
                current = current.next;
            }
        }
    }

    public void insertAfter(E dd, E referencedd) {
        DELink<E> newNode = new DELink<E>(dd);
        DELink<E> current = first;
        while (current != null) {
            if (current.dData.compareTo(referencedd) == 0) {
                DELink<E> temp = current.next;
                newNode.next = temp;
                current.next = newNode;
                return;
            }
            current = current.next;
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
                if (current.dData.compareTo(dd) >= 0 && current.next == null) {
                    insertFirst(dd);
                    // Debug
                    // displayList();
                    return;
                } else if (current.dData.compareTo(dd) <= 0 && current.next != null
                        && current.next.dData.compareTo(dd) > 0) {
                    insertAfter(dd, current.dData);
                    // Debug
                    // displayList();
                    return;
                } else if (current.dData.compareTo(dd) <= 0 && current.next == null) {
                    insertLast(dd);
                    // Debug
                    // displayList();
                    return;
                }
                current = current.next;
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
                if (current.dData.compareTo(dd) >= 0 && current.next == null) {
                    insertLast(dd);

                    // Debug
                    // displayList();
                    return;
                } else if (current.dData.compareTo(dd) >= 0 && current.next != null
                        && current.next.dData.compareTo(dd) < 0) {
                    insertAfter(dd, current.dData);
                    // Debug
                    // displayList();
                    return;
                } else if (current.dData.compareTo(dd) <= 0 && current.next == null) {
                    insertFirst(dd);
                    // Debug
                    // displayList();
                    return;
                }
                current = current.next;
            }
        }
    }

    public void deleteEspecificElement(E dd) {
        DELink<E> current = first;
        if (first.dData.compareTo(dd) == 0) {
            first = first.next;
        } else {
            while (current != null) {
                if (current.next.dData.compareTo(dd) == 0) {
                    DELink<E> temp = current.next.next;
                    current.next = temp;
                    return;
                }
                current = current.next;
            }
        }

    }

    public void deleteWithIndex(int position) {
        int i = 1;
        DELink<E> current = first;
        while (current != null) {
            if (position == i) {
                deleteEspecificElement(current.dData);
            }
            i++;
            current = current.next;
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
            if (current.dData.compareTo(dd) == 0) {
                return i;
            }
            i++;
            current = current.next;
        }
        return -1;
    }

    public void replaceWithIndex(E dd, int position) {
        int i = 1;
        DELink<E> current = first;
        while (current != null) {
            if (position == i) {
                current.dData = dd;
                return;
            }
            i++;
            current = current.next;
        }
    }

}