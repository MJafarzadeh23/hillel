package home.work8;

public class Aspirant extends Student {

    private String researchWork;

    public Aspirant (String name, String familyName, String group, String researchWork, double averageMark) {
        super(name, familyName, group, averageMark);
        this.researchWork = researchWork;
    }

    public double getScholarship() {
        if (getAverageMark() <= 0 || getAverageMark() > 5) {
            System.out.println("Input is invalid. Student rate should be in range of [1 - 5]. Scholarship cannot be calculated and set to 0hrn");
            return 0;
        } else if (getAverageMark() == 5) {
            return 200;
        } else {
            return 180;
        }
    }
}
