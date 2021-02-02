package BooksManagementSystem.Operation;

import BooksManagementSystem.BookList.BookList;

public class BorrowOperation implements IOperatable {
    @Override
    public void operation(BookList bookList) {
        System.out.println("Please input name of a book which you want to borrow.");
        System.out.print("Book Name: ");
        BookList.scanner.nextLine();
        String name = BookList.scanner.nextLine();
        if (bookList.borrowBook(name)) {
            System.out.println("Congratulations! Borrowing successful!");
        } else {
            System.out.println("Sorry! Failed " + name);
        }
    }
}
