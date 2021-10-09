package home.work10.printable;

public class Book implements Printable {

    public String bookTitle;
    public String publishingHouse;
    private int publishingYear;

    public Book(String title) {
        bookTitle = title;
    }

    public Book(String title, String publishingHouse, int publishingYear) {
        bookTitle = title;
        this.publishingHouse = publishingHouse;
        this.publishingYear = publishingYear;
    }

    public void Print() {
        System.out.println("Book " + bookTitle + " published by " + publishingHouse + " in " + publishingYear);
    }

    static void printBooks(Printable printable) {
        if (printable instanceof Book) {
            System.out.print(((Book) printable).bookTitle);
            System.out.print(", ");
        }
    }
}
