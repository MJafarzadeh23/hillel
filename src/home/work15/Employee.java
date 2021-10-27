package home.work15;

public class Employee {

    private String employeeName, employeeSurname;
    private int employeeSalary;
    private int employeeCheck;
    private int startYear, startMonth;
    private Gender genderEnum;
    private String department;

    enum Gender {FEMALE, MALE}

    public Employee(String name, String surname, int salary, int check, int startYear, int startMonth, Gender gender, String department) {
        this.employeeName = name;
        this.employeeSurname = surname;
        this.employeeSalary = salary;
        this.employeeCheck = check;
        this.startYear = startYear;
        try {
            if (startMonth >= 1 && startMonth <= 12) {
                this.startMonth = startMonth;
            } else {
                throw new Exception("Invalid input!");
            }
        } catch (Exception e) {
            System.out.println("Invalid input!");
        }
        this.genderEnum = gender;
        this.department = department;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeSurname() {
        return employeeSurname;
    }

    public int getEmployeeSalary() {
        return employeeSalary;
    }

    public int getEmployeeCheck() {
        return employeeCheck;
    }

    public int getStartYear() {
        return startYear;
    }

    public int getStartMonth() {
        return startMonth;
    }

    public Gender getGenderEnum() {
        return genderEnum;
    }

    public String getDepartment() {
        return department;
    }

    public void setEmployeeCheck(int employeeCheck) {
        this.employeeCheck = employeeCheck;
    }
}