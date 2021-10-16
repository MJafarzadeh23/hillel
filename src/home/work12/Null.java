package home.work12;

public class Null {

    private String str;
    private Integer intNull;

    public Null(String s, Integer i) {
        this.str = s;
        this.intNull = i;
    }

    public static void main(String[] args) {

        Null n = new Null("Created object: ", null);

        try {
            System.out.println(n.toString());
        }
        catch (NullPointerException e) {
            System.out.println("Null Pointer Exception occurs!");
            e.printStackTrace();
        }
        System.out.println("Running the code...");
        System.out.print("Hash Code of created object: ");
        System.out.println(n.hashCode());
    }

    @Override
    public String toString() {
        return "Null{" +
                "str='" + str + '\'' +
                ", intNull=" + (int) intNull +
                '}';
    }
}
