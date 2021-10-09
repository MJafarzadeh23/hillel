package home.work10.printable;

public class PrintableMain {
    public static void main(String[] args) {

        Printable magazine1 = new Magazine("Vogue");
        Printable magazine2 = new Magazine("Forbes", "The Forbes", 2021);
        Printable magazine3 = new Magazine("Wired", "Condé Nast", 2020);
        Printable book1 = new Book("Clean Code", "Pearson", 2008);
        Printable book2 = new Book("Hitchhiker's guide to the galaxy");
        Printable book3 = new Book("Object-Oriented Thought Process", "Addison-Wesley Professional", 2013);

        Printable[] printables = {magazine1, magazine2, magazine3, book1, book2, book3};

        for (Printable printable : printables) {
            printable.Print();
        }

        System.out.print("Magazines: ");
        for (Printable printable : printables) {
            Magazine.printMagazines(printable);
        }

        System.out.print("\nBooks: ");
        for (Printable printable : printables) {
            Book.printBooks(printable);
        }
    }
}
