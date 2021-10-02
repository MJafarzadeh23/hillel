package home.work8;

public class StudentMain {
    public static void main(String[] args) {

        Student stud1 = new Student("John", "Stewart", "Computer engineering", 4);
        Student aspr1 = new Aspirant("Helena", "Miller", "International affairs", "place of Ukraine", 5.0);
        Student aspr2 = new Aspirant("Bill", "Yang",null, "Turbines efficiency", 8);

        Student[] students = {stud1, aspr1, aspr2};

        for (Student each: students) {
            if (each instanceof Aspirant) {
                System.out.println("Aspirant " + each.getFirstName() + " " + each.getLastName() +
                         " has scholarship of " + each.getScholarship() + " hrn");
            } else {
                System.out.println("Student " + each.getFirstName() + " " + each.getLastName() +
                         " has scholarship of " + each.getScholarship() + " hrn");
            }
        }
    }
}
