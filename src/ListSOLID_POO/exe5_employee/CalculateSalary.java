package ListSOLID_POO.exe5_employee;

public class CalculateSalary {

    public CalculateSalary() {
    }

    public double calculateSalary(Employee employee){
        double salaryLiquid = employee.getSalary();
        double calculate = salaryLiquid - salaryLiquid - calculateINSS(employee) - calculateFGTS(employee);
        return calculate;
    }

    public double calculateINSS(Employee employee) {
        double inss = employee.getSalary();
        if (employee.getSalary() <= 1320) {
            inss = employee.getSalary() * 0.075;
        } else if (employee.getSalary() <= 2571.29) {
            inss = employee.getSalary() * 0.09;
        } else if (employee.getSalary() <= 3856.94) {
            inss = employee.getSalary() * 0.12;
        } else if (employee.getSalary() <= 7507.49) {
            inss = employee.getSalary() * 0.14;
        } else {
            inss = 7507.49 * 0.14;
        }
        return inss;
    }

    public double calculateFGTS(Employee employee){
        double fgts;
        fgts = employee.getSalary() / 100 * 8 - employee.getSalary();
        return fgts;
    }
}
