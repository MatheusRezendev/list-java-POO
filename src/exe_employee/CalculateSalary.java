package exe_employee;

public class CalculateSalary {

    public CalculateSalary() {
    }

    public double calculateSalary(Employee employee){
        double salaryLiquid = employee.getSalary();
        double calculate = salaryLiquid - salaryLiquid - employee.calculateINSS() - employee.calculateFGTS();
        return calculate;
}
}
