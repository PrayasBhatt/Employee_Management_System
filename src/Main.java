import models.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Salary> salary = new ArrayList<>();

        Building b1 = new Building(20, "Sifal", 10);
        Building b2 = new Building(10, "Sifal", 11);

        Salary s1 = new Salary("2023/11/12", 50000);

        Field f1 = new Field("Website Development");
        Field f2 = new Field("App Development");

        Workhour w1 = new Workhour(8, 0);
        Workhour w2 = new Workhour(8, 2);

        salary.add(s1);

        Employee e1 = new Employee(1, "Prayas Bhatt", "Mid-Baneshwor", 97464826, "bhattprayas40@gmail.com", salary, b1, f1, w1);
        Employee e2 = new Employee(2, "Yunish Shrestha", "Gothatar", 98989898, "yunishshrestha@gmail.com", salary, b2, f2, w2);

        print(e1);
        print(e2);
    }

    private static void print(Employee employee) {
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee ID: " + employee.getId());
        System.out.println("Address: " + employee.getAddress());
        System.out.println("Phone Number: " + employee.getNumber());
        System.out.println("Email: " + employee.getEmail());

        System.out.println("Building Details:");
        System.out.println(" Building ID: " + employee.getBuilding().getBuildingNo());
        System.out.println(" Location: " + employee.getBuilding().getLocation());

        System.out.println("Field: " + employee.getField().getFieldName());

        System.out.println("Work Hours:");
        System.out.println(" Normal Hours: " + employee.getWorkingHours().getNormalTime());
        System.out.println(" Overtime Hours: " + employee.getWorkingHours().getOverTime());

        System.out.println("Salaries:");
        printSalaries(employee.getSalary());

        System.out.println();
    }

    private static void printSalaries(ArrayList<Salary> salaries) {
        if (salaries.size() > 0) {
            System.out.println("Amount: " + salaries.get(0).getAmount() + " Date: " + salaries.get(0).getDate());
        }
    }
}
