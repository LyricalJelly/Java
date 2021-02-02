package MyArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class MyArrayList<T> implements Iterable<T> {

    private static final Object[] emptyArray = {};

    private Object[] Array;

    private int size;

    private int capacity = 10;

    public MyArrayList(int initialCapacity) {
        if (initialCapacity == 0) {
            this.Array = emptyArray;
        } else if (initialCapacity > 0) {
            this.Array = new Object[initialCapacity];
        } else {
            throw new IllegalArgumentException("initial capacity:" + initialCapacity);
        }
    }

    public MyArrayList() {
        this.Array = emptyArray;
    }

    public MyArrayList(List<? extends T> c) {
        Object[] a = c.toArray();
        if ((this.size = a.length) != 0) {
            this.Array = Arrays.copyOf(a, size, Object[].class);
        } else {
            this.Array = emptyArray;
        }
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

    public int indexOf(Object o) {
        return indexOfRange(o, 0, this.size);
    }

    public int indexOfRange(Object o, int start, int end) {
        Object[] es = this.Array;
        if (o == null) {
            for (int i = start; i < end; i++) {
                if (es[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = start; i < end; i++) {
                if (o.equals(es[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    public int lastindexOf(Object o) {
        return lastIndexOfRange(o, 0, this.size);
    }

    public int lastIndexOfRange(Object o, int start, int end) {
        Object[] es = this.Array;
        if (o == null) {
            for (int i = end - 1; i >= start; i--) {
                if (es[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = end - 1; i >= start; i--) {
                if (o.equals(es[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public Iterator<T> iterator() {
        // TODO Auto-generated method stub
        return null;
    }

    public Object[] toArray() {
        return Arrays.copyOf(this.Array, size);
    }

    @SuppressWarnings("unchecked")
    private T array(int index) {
        return (T) this.Array[index];
    }

    public T get(int index) {
        Objects.checkIndex(index, size);
        return array(index);
    }

    public T set(int index, T element) {
        Objects.checkIndex(index, size);
        T oldObject = array(index);
        this.Array[index] = element;
        return oldObject;
    }

    private void add(T element, int index) {
        if (this.size == capacity) {
            grow(capacity << 1);
        } else if (this.size == 0) {
            this.Array = new Object[capacity];
        }
        for (int i = index; i < size; i++) {
            this.Array[i + 1] = this.Array[i];
        }
        this.Array[index] = element;
        this.size++;
    }

    public void add(int index, T element) {
        add(element, index);
    }

    public boolean add(T element) {
        add(element, size);
        return true;
    }

    private Object[] grow(int newCapacity) {
        Object[] array = new Object[this.capacity = newCapacity];
        System.arraycopy(this.Array, 0, array, 0, this.size);
        return this.Array = array;
    }

}