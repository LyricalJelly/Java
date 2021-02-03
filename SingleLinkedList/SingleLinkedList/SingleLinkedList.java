package SingleLinkedList.SingleLinkedList;

import java.util.Iterator;

public class SingleLinkedList<T> implements Iterable<T> {

    int size;

    Node<T> first;

    Node<T> last;

    public SingleLinkedList() {
    }

    private void linkFirst(T element) {
        final Node<T> f = first;
        final Node<T> newNode = new Node<>(element, f);
        if (f == null) {
            last = newNode;
        }
        size++;
    }

    private void linkLast(T element) {
        final Node<T> l = last;
        final Node<T> newNode = new Node<>(element, null);
        last = newNode;
        if (l == null) {
            first = newNode;
        } else {
            l.next = newNode;
        }
        size++;
    }

    private T unlinkFirst(Node<T> f) {
        final T element = f.item;
        final Node<T> next = f.next;
        f.item = null;
        f.next = null;
        first = next;
        if (next == null) {
            last = null;
        }
        size--;
        return element;
    }

    T unlinkAfterThis(Node<T> x) {
        final T element = x.next.item;
        final Node<T> next = x.next;
        if (next == null) {
            last = x;
        } else {
            x.next = next.next;
            size--;
        }
        return element;
    }

    private static class Node<T> {
        T item;
        Node<T> next;

        Node(T element, Node<T> next) {
            this.item = element;
            this.next = next;
        }
    }

    @Override
    public Iterator iterator() {
        // TODO Auto-generated method stub
        return null;
    }

}
