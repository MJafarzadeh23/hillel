package home.work8;

public class Student {

    private String firstName, lastName, group;
    private double averageMark;

    public Student (String name, String familyName, String group, double averageMark) {
        this.firstName = name;
        this.lastName = familyName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public double getScholarship() {
        if (averageMark <= 0 || averageMark > 5) {
            System.out.println("Input is invalid. Student rate should be in range of [1 - 5]. Scholarship cannot be calculated and set to 0hrn");
            return 0;
        } else if (averageMark == 5) {
            return 100;
        } else {
            return 80;
        }
    }

    public double getAverageMark() {
        return averageMark;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
