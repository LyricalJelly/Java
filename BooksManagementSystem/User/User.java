package BooksManagementSystem.User;

import BooksManagementSystem.BookList.BookList;
import BooksManagementSystem.Operation.IOperatable;

public abstract class User {
    protected IOperatable[] iOperations;

    public abstract int menu();

    public abstract void operation(BookList bookList, int select);

    protected int select() {
        int select = -1;
        try {
            select = BookList.scanner.nextInt();
            return select;
        } catch (Exception exception) {
            return 4;
        }
    }
}