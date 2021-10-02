package home.work7;

public class EqualsSecond {

    private int pointsNumber;
    private String shape;

    public EqualsSecond(int points, String shape) {
        this.pointsNumber = points;
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "EqualsSecond{" +
                "pointsNumber=" + pointsNumber +
                ", shape='" + shape + '\'' +
                '}';
    }

    public int getPointsNumber() {
        return pointsNumber;
    }

    public String getShape() {
        return shape;
    }
}
