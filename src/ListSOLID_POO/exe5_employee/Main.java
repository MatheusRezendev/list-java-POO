package ListSOLID_POO.exe5_employee;

public class Main {
    public static void main(String[] args) {

        Employee emp = new Employee();
        CalculateSalary cal = new CalculateSalary();
        InputEmployee i = new InputEmployee();

        i.inputEmployee(emp);

    }
}