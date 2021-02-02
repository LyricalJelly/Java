package BooksManagementSystem.Operation;

import BooksManagementSystem.BookList.BookList;

public class ExitOperation implements BooksManagementSystem.Operation.IOperatable {
    @Override
    public void operation(BookList bookList) {
        System.out.println("System exited.");
        System.exit(0);
    }
}
