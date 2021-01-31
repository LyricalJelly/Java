package Operation;

import BookList.BookList;

public class DeleteOperation implements IOperatable {
    @Override
    public void operation(BookList bookList) {
        System.out.println("Please input name of a book which you want to delete.");
        System.out.print("Book Name: ");
        BookList.scanner.nextLine();
        String name = BookList.scanner.nextLine();
        if (bookList.deleteBook(name)) {
            System.out.println("Congratulations! Deleting successful!");
        } else {
            System.out.println("Sorry! We can't find a book named " + name);
        }
    }
}
