package ListSOLID_POO.exe5_employee;

import java.util.Scanner;

public class InputEmployee {

    Scanner sc = new Scanner(System.in);
    CalculateSalary cal = new CalculateSalary();

    public void inputEmployee(Employee e) {

        System.out.print("Enter employee name: ");
        e.setName(sc.next());

        System.out.print("Enter employee salary: ");
        e.setSalary(sc.nextDouble());

        System.out.print("Enter employee department: ");
        e.setPosition(sc.next());

        System.out.println("Name: " + e.getName());
        System.out.println("Salary: " + e.getSalary());
        System.out.println("Position: " + e.getPosition());
        System.out.println("Salary liquid : " + cal.calculateSalary(e));

    }
}
