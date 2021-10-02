package home.work7;

public class VariablesConstructorsMain {
    // Create class with 3 variables and 3 constructors. Add usage of all constructor and variables in main method in other class
    public static void main(String[] args) {

        VariablesConstructors me = new VariablesConstructors("Maria", 2013, "Renewable Energy");
        VariablesConstructors student2 = new VariablesConstructors("Mark", "Java developer");
        VariablesConstructors student3 = new VariablesConstructors("Helena", 2018);

        System.out.println(me.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
    }
}
