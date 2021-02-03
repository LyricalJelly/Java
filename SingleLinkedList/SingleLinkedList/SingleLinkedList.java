package SingleLinkedList.SingleLinkedList;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SingleLinkedList<T> implements Iterable<T> {

    int size;

    Node<T> first;

    Node<T> last;

    public SingleLinkedList() {
    }

    private void linkFirst(T element) {
        final Node<T> f = first;
        final Node<T> newNode = new Node<>(f, element);
        if (last == null) {
            last = newNode;
        }
        size++;
    }

    private void linkLast(T element) {
        final Node<T> l = last;
        final Node<T> newNode = new Node<>(last, element);
        last = newNode;
        if (first == null) {
            first = newNode;
        }
        size++;
    }

    private T unlinkFirst(Node<T> f) {
        final T element = f.item;
        final Node<T> next = f.next;
        first = next;
        if (next == null) {
            last = null;
        }
        size--;
        return element;
    }

    private T unlinkLast(Node<T> l) {
        Node<T> interim = first;
        if (interim == l) {
            T element = interim.item;
            first = null;
            last = null;
            size--;
            return element;
        }
        while (interim.next.next != null) {
            interim = interim.next;
        }
        T element = interim.next.item;
        size--;
        interim.next = null;
        last = interim;
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

        Node(Node<T> prev, T element) {
            this.item = element;
            if (prev == null) {
                prev = this;
            } else {
                prev.next = this;
            }
            this.next = null;
        }
    }

    public T getFirst() {
        final Node<T> f = first;
        if (f == null) {
            throw new NoSuchElementException();
        }
        return f.item;
    }

    public T getLast() {
        final Node<T> l = last;
        if (l == null) {
            throw new NoSuchElementException();
        }
        return l.item;
    }

    public T removeFirst() {
        final Node<T> f = first;
        if (f == null) {
            throw new NoSuchElementException();
        }
        return unlinkFirst(f);
    }

    public T removeLast() {
        final Node<T> l = last;
        if (l == null) {
            throw new NoSuchElementException();
        }
        return unlinkLast(l);
    }

    public void addFirst(T element) {
        linkFirst(element);
    }

    public void addLast(T element) {
        linkLast(element);
    }

    public int size() {
        return size;
    }

    public boolean add(T element) {
        linkLast(element);
        return true;
    }

    private boolean isPositionIndex(int index) {
        return index >= 0 && index <= size;
    }

    public boolean addAll(int index, SingleLinkedList<T> list) {

    }

    public boolean addAll(SingleLinkedList<T> list) {
        return addAll(size, list);
    }

    @Override
    public Iterator iterator() {
        // TODO Auto-generated method stub
        return null;
    }

}
