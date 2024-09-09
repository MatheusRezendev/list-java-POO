package exe_employee;

public class Main {
    public static void main(String[] args) {

        Employee emp = new Employee("Matheus",1412, "slave");
        CalculateSalary cal = new CalculateSalary();

        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());
        System.out.println("Position: " + emp.getPosition());
        System.out.println("Salary liquid : " + cal.calculateSalary(emp));

    }
}