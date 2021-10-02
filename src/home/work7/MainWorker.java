package home.work7;

public class MainWorker {
    public static void main(String[] args) {

        Worker worker1 = new Worker();      // default values
        Worker worker2 = new Worker("Anna", 25, "manual QA", 1300);
        Worker worker3 = new Worker();

        System.out.println(worker1.getName() + ", " + worker1.getAge() + " years old employee, holds position of "
                + worker1.getPosition() + " with salary of " + worker1.getSalary() + "$");
        System.out.println(worker2.getName() + ", " + worker2.getAge() + " years old employee, holds position of "
                + worker2.getPosition() + " with salary of " + worker2.getSalary() + "$");

        worker3.setName("John");
        worker3.setAge(23);
        worker3.setPosition("Java developer");
        /*worker3.setSalary(3000);*/        //if not to set worker3.setSalary, it will use default value

        System.out.println(worker3.getName() + ", " + worker3.getAge() + " years old employee, holds position of "
                + worker3.getPosition() + " with salary of " + worker3.getSalary() + "$");

        // usage of toString()
        System.out.println("Employees: " + '\n' + worker2.toString() + '\n' + worker1.toString() + '\n' + worker3.toString());
    }
}
