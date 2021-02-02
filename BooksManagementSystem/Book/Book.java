package BooksManagementSystem.Book;

public class Book {
    private String name;
    private double price;
    private boolean status;
    // false : not borrow
    // true : borrow

    public Book(String name, double price, boolean status) {
        this.name = name;
        this.price = price;
        this.status = status;
    }

    public String getBookName() {
        return name;
    }

    public double getBookPrice() {
        return price;
    }

    public boolean getBookStatus() {
        return status;
    }

    public void setBookName(String name) {
        this.name = name;
    }

    public void setBookPrice(double price) {
        this.price = price;
    }

    public void setBookStatus(boolean status) {
        this.status = status;
    }

}
