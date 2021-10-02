package home.work7;

public class Worker {
    // Create class Worker with next fields: String name, int age, String position, int salary.
    // Give some default values to these fields and add constructor which add new values to them. Add getters and setters.
    // Use all of methods in main in other class.

    private String name, position;
    private int age, salary;

    public Worker () {
        name = "Maria";
        age = 31;
        position = "AQA engineer";
        salary = 1990;
    }

    public Worker (String name, int age, String position, int money) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.salary = money;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Add method toString() to Worker class. Add usage of toString() to main in other class
    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
