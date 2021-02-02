package BooksManagementSystem.NormalUser;

import BooksManagementSystem.BookList.BookList;
import BooksManagementSystem.Operation.BorrowOperation;
import BooksManagementSystem.Operation.ExitOperation;
import BooksManagementSystem.Operation.FindOperation;
import BooksManagementSystem.Operation.IOperatable;
import BooksManagementSystem.Operation.ReturnOperation;
import BooksManagementSystem.User.User;

public class NormalUser extends User {
    public NormalUser() {
        super.iOperations = new IOperatable[] { new BorrowOperation(), new ReturnOperation(), new FindOperation(),
                new ExitOperation() };
    }

    public int menu() {
        System.out.println("+++++++++++++++++++++++++++++++++++");
        System.out.println("+                                 +");
        System.out.println("+      BooksManagementSystem      +");
        System.out.println("+++++    1. Borrow Books      +++++");
        System.out.println("+++++    2. Return Books      +++++");
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
