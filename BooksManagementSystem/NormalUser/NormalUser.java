package NormalUser;

import BookList.BookList;
import Operation.BorrowOperation;
import Operation.ExitOperation;
import Operation.FindOperation;
import Operation.IOperatable;
import Operation.ReturnOperation;
import User.User;

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
