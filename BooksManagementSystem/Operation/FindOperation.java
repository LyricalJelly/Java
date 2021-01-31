package Operation;

import BookList.BookList;

public class FindOperation implements Operation.IOperatable {
    @Override
    public void operation(BookList bookList) {
        System.out.println("Please input name of a book which you want to find.");
        System.out.print("Book Name: ");
        BookList.scanner.nextLine();
        String name = BookList.scanner.nextLine();
        if (bookList.parseBoolean(bookList.findBook(name))) {
            System.out.println("Congratulations! Finding successful!");
        } else {
            System.out.println("Sorry! We can't find a book named " + name);
        }
    }
}