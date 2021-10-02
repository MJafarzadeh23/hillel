package home.work7;

import java.util.Objects;

public class EqualsFirst {

    private int pointsNumber;
    private String shape;

    public EqualsFirst(int points, String shape) {
        this.pointsNumber = points;
        this.shape = shape;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EqualsFirst)) return false;
        EqualsFirst that = (EqualsFirst) o;
        return pointsNumber == that.pointsNumber && shape.equals(that.shape);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pointsNumber, shape);
    }

    public int getPointsNumber() {
        return pointsNumber;
    }

    public String getShape() {
        return shape;
    }
}
