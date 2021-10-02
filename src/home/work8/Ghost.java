package home.work8;

public class Ghost {
    public static void main(String[] args) {
        Ghost ghost1 = new Ghost();
        Ghost ghost2 = new Ghost();
        Ghost ghost3 = new Ghost();
       /* ghost1.setColor((int) (Math.random() * 4) + 1);
        ghost2.setColor((int) (Math.random() * 4) + 1);
        ghost3.setColor((int) (Math.random() * 4) + 1);*/

        System.out.println("Ghost object is given a random color attribute of " + ghost1.getColor());
        System.out.println("    Ghost object is given a random color attribute of " + ghost1.getColor());
        System.out.println("Ghost object is given a random color attribute of " + ghost2.getColor());
        System.out.println("    Ghost object is given a random color attribute of " + ghost2.getColor());
        System.out.println("Ghost object is given a random color attribute of " + ghost3.getColor());
        System.out.println("    Ghost object is given a random color attribute of " + ghost3.getColor());
        System.out.println("        Ghost object is given a random color attribute of " + ghost3.getColor());
    }

    private String color;
    int colorNum;

    public Ghost() {
        colorNum = (int) (Math.random() * 4) + 1;
        if (colorNum == 1) {
            this.color = "white";
        } else if (colorNum == 2) {
            this.color = "yellow";
        } else if (colorNum == 3) {
            this.color = "purple";
        } else {
            this.color = "red";
        }
    }

    public String getColor() {
        return color;
    }

    /*public void setColor (int colorNum) {
        if (colorNum == 1) {
            this.color = "white";
        } else if (colorNum == 2) {
            this.color = "yellow";
        } else if (colorNum == 3) {
            this.color = "purple";
        } else {
            this.color = "red";
        }
    }*/


}
