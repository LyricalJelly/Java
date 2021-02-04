package SingleLinkedList.SingleLinkedList;

import java.util.Iterator;
import java.util.NoSuchElementException;

import MyArrayList.MyArrayList;

public class SingleLinkedList<T> implements Iterable<T> {

    private static class Node<T> {
        T item;
        Node<T> next;

        Node(Node<T> prev, T element, Node<T> next) {
            this.item = element;
            if (prev != null) {
                prev.next = this;
            }
            this.next = next;
        }
    }

    int size;

    Node<T> first;

    Node<T> last;

    public SingleLinkedList() {
    }

    public SingleLinkedList(MyArrayList<T> element) {
        SingleLinkedList<T> list = new SingleLinkedList<T>();
        for (T i : element) {
            list.add(i);
        }
    }

    private void linkFirst(T element) {
        Node<T> newNode = null;
        if (first == null) {
            newNode = new Node<T>(first, element, null);

        } else {
            newNode = new Node<T>(null, element, first);
        }
        first = newNode;
        if (last == null) {
            last = newNode;
        }
        size++;
    }

    private void linkLast(T element) {
        final Node<T> newNode = new Node<>(last, element, null);
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
        if (x == null) {
            final T element = first.item;
            first = first.next;
            size--;
            return element;
        } else {
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

    public boolean addAll(SingleLinkedList<T> element) {
        return addAll(size - 1, element);
    }

    public boolean addAll(int index, SingleLinkedList<T> element) {
        checkPositionIndex(index);
        this.size += element.size();
        Node<T> f = first;
        for (int i = 0; i < index; i++) {
            f = f.next;
        }
        f.next = element.node(0);
        this.last = element.node(element.size() - 1);
        return true;
    }

    private boolean isPositionIndex(int index) {
        return index >= 0 && index <= size;
    }

    private void checkPositionIndex(int index) {
        if (!isPositionIndex(index)) {
            throw new IndexOutOfBoundsException();
        }
    }

    private boolean isElementIndexIndex(int index) {
        return index >= 0 && index < size;
    }

    private void checkElementIndexIndex(int index) {
        if (!isElementIndexIndex(index)) {
            throw new IndexOutOfBoundsException();
        }
    }

    public T get(int index) {
        checkElementIndexIndex(index);
        return node(index).item;
    }

    public Node<T> node(int index) {
        Node<T> node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public T set(int index, T element) {
        checkElementIndexIndex(index);
        Node<T> node = node(index);
        T oldVal = node.item;
        node.item = element;
        return oldVal;
    }

    public T remove(int index) {
        checkElementIndexIndex(index);
        if (index == 0) {
            return unlinkAfterThis(null);
        }
        return unlinkAfterThis(node(index - 1));
    }

    @Override
    public Iterator<T> iterator() {
        return new Itr(0);
    }

    private class Itr implements Iterator<T> {
        private Node<T> next;
        private int nextIndex;

        Itr(int index) {
            next = (index == size) ? null : node(index);
            nextIndex = index;
        }

        public boolean hasNext() {
            return nextIndex < size;
        }

        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Node<T> node = next;
            next = next.next;
            nextIndex++;
            return node.item;
        }
    }

    public void traverse() {
        for (var i : this) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(node(i).item + " ");
        }
        System.out.println();
    }
}
