package BooksManagementSystem.Main;

import BooksManagementSystem.Administrator.Administrator;
import BooksManagementSystem.BookList.BookList;
import BooksManagementSystem.NormalUser.NormalUser;
import BooksManagementSystem.User.User;

public class Main {
    public static void main(String[] args) {
        BookList bookList = new BookList(15);
        User user = login();
        while (true) {
            user.operation(bookList, user.menu());
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println("Error!");
            }

            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }

    public static User login() {
        System.out.println("Please select mod");
        System.out.println("1. Adminstrator");
        System.out.println("otherwise. NormalUser");
        try {
            int select = BookList.scanner.nextInt();
            if (select == 1) {
                return new Administrator();
            } else {
                return new NormalUser();
            }
        } catch (Exception exception) {
            return new NormalUser();
        }
    }
}
