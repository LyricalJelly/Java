package Administrator;

import BookList.BookList;
import Operation.AddOperation;
import Operation.DeleteOperation;
import Operation.ExitOperation;
import Operation.FindOperation;
import Operation.IOperatable;
import User.User;

public class Administrator extends User {
    public Administrator() {
        super.iOperations = new IOperatable[] { new AddOperation(), new DeleteOperation(), new FindOperation(),
                new ExitOperation() };
    }

    public int menu() {
        System.out.println("+++++++++++++++++++++++++++++++++++");
        System.out.println("+      BooksManagementSystem      +");
        System.out.println("+                                 +");
        System.out.println("+++++    1. Add    Books      +++++");
        System.out.println("+++++    2. Delete Books      +++++");
        System.out.println("+++++    3. Find   Books      +++++");
        System.out.println("++++++ otherwise.Exit  System +++++");
        System.out.println("+                                 +");
        System.out.println("+++++++++++++++++++++++++++++++++++");
        return super.select();
    }

    public void operation(BookList bookList, int select) {
        super.iOperations[select - 1].operation(bookList);
    }
}
