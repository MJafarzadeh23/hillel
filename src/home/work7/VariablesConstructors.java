package home.work7;

public class VariablesConstructors {

    private String studentName;
    private String specialty;
    private int graduationYear;

    public VariablesConstructors(String name, int year, String specialty) {
        this.studentName = name;
        this.graduationYear = year;
        this.specialty = specialty;
    }

    public VariablesConstructors(String name, String specialty) {
        this.studentName = name;
        this.specialty = specialty;
    }

    public VariablesConstructors(String name, int year) {
        this.studentName = name;
        this.graduationYear = year;
    }

    @Override
    public String toString() {
        return "VariablesConstructors{" +
                "studentName='" + studentName + '\'' +
                ", specialty='" + specialty + '\'' +
                ", graduationYear=" + graduationYear +
                '}';
    }
}
