package BooksManagementSystem.Administrator;

import BooksManagementSystem.BookList.BookList;
import BooksManagementSystem.Operation.AddOperation;
import BooksManagementSystem.Operation.DeleteOperation;
import BooksManagementSystem.Operation.ExitOperation;
import BooksManagementSystem.Operation.FindOperation;
import BooksManagementSystem.Operation.IOperatable;
import BooksManagementSystem.User.User;

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
