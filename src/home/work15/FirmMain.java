package home.work15;

import java.util.List;

public class FirmMain {

    public static void main(String[] args) {

        Firm firm = new Firm();

        firm.setFirmName("Renewable Energy");
        firm.setFirmAddress("12 Victory Avenue");
        firm.setFirmCheck(50000);
        /*firm.setFirmCheck(20000);*/
        System.out.println(firm.toString());
        List employees = firm.getEmployeeList();
        System.out.println("    Employees:");
        firm.printAllEmployees(employees);
        firm.giveSalaryForAll(employees);
        System.out.println("    Salary is received:");
        firm.printAllEmployees(employees);
        System.out.println("    Days of vacation:");
        firm.calcVacations(employees);
        System.out.println("____________________________________");
        firm.getUpdatedFirmCheck(employees, firm.getFirmCheck());
    }
}
