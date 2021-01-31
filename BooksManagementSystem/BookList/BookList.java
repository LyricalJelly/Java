package BookList;

import java.util.Scanner;

import Book.Book;

public class BookList {
    private Book[] books;
    private int capacity;
    private int size;

    class Pair {
        public boolean bool;
        public int index;

        public Pair(boolean bool, int index) {
            this.bool = bool;
            this.index = index;
        }
    }

    public boolean parseBoolean(Pair pair) {
        return pair.bool;
    }

    public static final Scanner scanner;
    static {
        scanner = new Scanner(System.in);
    }

    public BookList(int capacity) {
        this.capacity = capacity > 10 ? capacity : 10;
        this.books = new Book[capacity];
        this.size = 0;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getSize() {
        return this.size;
    }

    public Book getBook(int index) {
        if (index > size - 1) {
            return null;
        } else {
            return books[index];
        }
    }

    public void addBook(Book book) {
        books[size++] = book;
    }

    public boolean deleteBook(String name) {
        Pair pair = findBook(name);
        if (pair.bool) {
            books[pair.index] = books[size - 1];
            return true;
        }
        return false;
    }

    public boolean borrowBook(String name) {
        Pair pair = findBook(name);
        if (pair.bool && !getBook(pair.index).getBookStatus()) {
            return true;
        } else {
            return false;
        }
    }

    public Pair findBook(String name) {
        for (int i = 0; i < size; i++) {
            if (books[i].getBookName().equals(name)) {
                return new Pair(true, i);
            }
        }
        return new Pair(false, -1);
    }

    public boolean returnBook(String name) {
        Pair pair = findBook(name);
        if (pair.bool && getBook(pair.index).getBookStatus()) {
            books[pair.index].setBookStatus(true);
            return true;
        } else {
            return false;
        }
    }
}
