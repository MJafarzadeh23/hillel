package home.work7;

public class EqualsMain {
    // Create 2 classes, each contains 2 variables. In first class override equals and hashcode.
    // Create few instances of both classes and compare them using ‘==’ and equals()

    public static void main(String[] args) {
        EqualsFirst shape = new EqualsFirst(2, "line");
        EqualsFirst shape1 = new EqualsFirst(4, "square");
        EqualsFirst shape2 = new EqualsFirst(4, "square");

        EqualsSecond shape3 = new EqualsSecond(3, "triangle");
        EqualsSecond shape4 = new EqualsSecond(4, "square");
        EqualsSecond shape5 = new EqualsSecond(shape2.getPointsNumber(), shape2.getShape());
        EqualsSecond shape6 = shape5;

        /*System.out.println(shape5.toString());*/

        System.out.println("shape == shape1: [2, line]=[4, square], same class: " + (shape == shape1) + " false"); // false
        System.out.println("shape1 == shape2: [4, square]=[4, square], same class: " + (shape1 == shape2) + " false"); // false
        System.out.println("shape1.equals(shape2): " + shape1.equals(shape2) + " true"); // true (comparing values)
        System.out.println("shape5.equals(shape2), different classes: " + shape5.equals(shape2) + " false"); // false (different classes)
        System.out.println("shape5 == shape6, same memory: " + (shape5 == shape6) + " true"); // true
        System.out.println("HashCodes - shape5: " + shape5.hashCode() + ", shape6: " + shape6.hashCode());
        if (shape5.hashCode() == shape6.hashCode()) {
            System.out.println("HashCodes of 2 instances pointing to the same memory location are the same");
        }
        // comparing fields of 2 instances from different classes that are not connected with inheritance
        if (shape2.getPointsNumber() == shape5.getPointsNumber() && shape2.getShape().equals(shape5.getShape())) {
            System.out.println("Field values of instances from different classes, shape2 and shape5, are the same");
        }
    }
}
