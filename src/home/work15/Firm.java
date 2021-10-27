package home.work15;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Firm {
    //Написать класс фирма (class Firm), содержащий название, адрес, зарплатный счет (сумма), сотрудников.
    // Класс фирма должен выполнять следующие функции:
    //- Вывести всех сотрудников фирмы на экран (метод void printAllEmployees())
    //- Выдать всем сотрудникам зарплату (перевести на карточный счет каждого сотрудника, сумму равную зарплате сотрудника,
    //      с главного счета фирмы) (метод void giveSalaryForAll())
    //- Пересчитать всем сотрудникам дни отпуска (всем кто проработал больше 6 месяцев, по 2 дня за каждый отработанный месяц)
    //      (метод void calcVacations())

    private String firmName;
    private String firmAddress;
    private int firmCheck;
    private List<Employee> employeeList;

    public Firm() {
    }

    public Firm(String firmName, String firmAddress, int firmCheck, List<Employee> employees) {
        this.firmName = firmName;
        this.firmAddress = firmAddress;
        this.firmCheck = firmCheck;
        this.employeeList = employees;
    }

    public List<Employee> getEmployeeList() {
        employeeList = new ArrayList<>();

        employeeList.add(new Employee("William","Smith",2600,0,2018, 2,Employee.Gender.MALE,"Hydro Power"));
        employeeList.add(new Employee("Sophia","Johnson",2800,1000,2019,11, Employee.Gender.FEMALE,"Solar Energy"));
        employeeList.add(new Employee("James","Williams",1900,100,2021,8, Employee.Gender.MALE,"Hydro Power"));
        employeeList.add(new Employee("Amelia","Jones",2100,200,2020,6, Employee.Gender.FEMALE,"Wind Energy"));
        employeeList.add(new Employee("Lucas","Miller",3500,2600,2019,3, Employee.Gender.MALE,"Wind Energy"));
        employeeList.add(new Employee("Peter","Brown",1200,500,2019,16, Employee.Gender.MALE,"Wind Energy"));
        employeeList.add(new Employee("Mia","Wilson",3300,1630,2020,7, Employee.Gender.FEMALE,"Wind Energy"));

        return employeeList;
    }

    public void printAllEmployees(List<Employee> employees) {
        IntStream.range(0, employees.size()).forEach(i -> {
            System.out.println(employees.get(i).getEmployeeName() +
                    " " + employees.get(i).getEmployeeSurname() +
                    ". Salary: " + employees.get(i).getEmployeeSalary() +
                    ". Check: " + employees.get(i).getEmployeeCheck() +
                    ". Work Commencement Date: " + employees.get(i).getStartYear() +
                    " (year), " + employees.get(i).getStartMonth() +
                    " (month). Gender: " + employees.get(i).getGenderEnum() +
                    ". Department: " + employees.get(i).getDepartment());
        });
    }

    public void giveSalaryForAll(List<Employee> employees) {
        int people = employees.size();
        for (int i = 0; i < people; i++) {
            employees.get(i).setEmployeeCheck(employees.get(i).getEmployeeCheck() + employees.get(i).getEmployeeSalary());
        }
    }

    public void calcVacations(List<Employee> employees) {
        int daysOfVacation = 0;
        int monthsBetween = 0;
        final int END_YEAR = 2021;
        final int END_MONTH = 10;
        int people = employees.size();
        for (int i = 0; i < people; i++) {
            //(endYear - startYear) * 12 + (endMonth - startMonth) + 1
            monthsBetween = (END_YEAR - employees.get(i).getStartYear()) * 12 + (END_MONTH - employees.get(i).getStartMonth()) + 1;
            if (monthsBetween > 6 && employees.get(i).getStartMonth() != 0) {
                daysOfVacation = monthsBetween * 2;
            } else {
                daysOfVacation = 0;
            }
            System.out.println(employees.get(i).getEmployeeName() + " " + employees.get(i).getEmployeeSurname() +
                    " has " + daysOfVacation + " days of vacation");
        }
    }

    public void getUpdatedFirmCheck(List<Employee> employees, int firmCheck) {
        int people = employees.size();
        int updatedFirmCheck;
        int salarySum = 0;
        for (int i = 0; i < people; i++) {
            salarySum += employees.get(i).getEmployeeCheck();
        }
        if (firmCheck >= salarySum) {
            updatedFirmCheck = firmCheck - salarySum;
            System.out.println("After giving salary firm has " + updatedFirmCheck + " UAH");
        } else {
            updatedFirmCheck = Math.abs((firmCheck - salarySum));
            System.out.println("Firm is in debt now of " + updatedFirmCheck + " UAH");
        }
    }

    public void setFirmName(String firmName) {
        this.firmName = firmName;
    }

    public void setFirmAddress(String firmAddress) {
        this.firmAddress = firmAddress;
    }

    public void setFirmCheck(int firmCheck) {
        this.firmCheck = firmCheck;
    }

    public int getFirmCheck() {
        return firmCheck;
    }

    @Override
    public String toString() {
        return "Firm{" +
                "firmName='" + firmName + '\'' +
                ", firmAddress='" + firmAddress + '\'' +
                ", firmCheck=" + firmCheck +
                '}';
    }
}
