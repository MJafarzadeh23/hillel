package home.work10.printable;

public class Magazine implements Printable {

    public String magazineTitle;
    public String publishingHouse;
    private int publishingYear;

    public Magazine(String title) {
        magazineTitle = title;
    }

    public Magazine(String title, String publishingHouse, int publishingYear) {
        magazineTitle = title;
        this.publishingHouse = publishingHouse;
        this.publishingYear = publishingYear;
    }

    public void Print() {
        System.out.println("Magazine " + magazineTitle + " published by " + publishingHouse + " in " + publishingYear);
    }

    static void printMagazines(Printable printable) {
        if (printable instanceof Magazine) {
            System.out.print(((Magazine) printable).magazineTitle);
            System.out.print(", ");
        }
    }
}
