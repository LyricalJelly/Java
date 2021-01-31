package Operation;

import Book.Book;
import BookList.BookList;

public class AddOperation implements IOperatable {
    @Override
    public void operation(BookList bookList) {
        double price = 0;
        System.out.println("Please input the information of a book which you want to add ");
        System.out.print("Book Name: ");
        BookList.scanner.nextLine();
        String name = BookList.scanner.nextLine();
        System.out.print("Book Price: ");
        price = BookList.scanner.nextInt();
        bookList.addBook(new Book(name, price, false));
    }
}
