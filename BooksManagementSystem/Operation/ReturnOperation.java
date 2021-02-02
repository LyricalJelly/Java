package BooksManagementSystem.Operation;

import BooksManagementSystem.BookList.BookList;

public class ReturnOperation implements IOperatable {
    @Override
    public void operation(BookList bookList) {
        System.out.println("Please input name of a book which you want to return.");
        System.out.print("Book Name: ");
        BookList.scanner.nextLine();
        String name = BookList.scanner.nextLine();
        if (bookList.returnBook(name)) {
            System.out.println("Congratulations! Returning successful!");
        } else {
            System.out.println("Sorry! Failed " + name);
        }
    }
}
