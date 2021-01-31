package Operation;

import BookList.BookList;

public class ExitOperation implements Operation.IOperatable {
    @Override
    public void operation(BookList bookList) {
        System.out.println("System exited.");
        System.exit(0);
    }
}
