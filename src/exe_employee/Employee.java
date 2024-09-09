package exe_employee;

public class Employee {

    private String name;
    private double salary;
    private String position;

    public Employee(String name, double salary, String position) {
        this.name = name;
        this.salary = salary;
        this.position = position;
    }
    public Employee(){

    }

    public double calculateINSS() {
        double inss;
        if (this.salary <= 1320) {
            inss = this.salary * 0.075;
        } else if (this.salary <= 2571.29) {
            inss = this.salary * 0.09;
        } else if (this.salary <= 3856.94) {
            inss = this.salary * 0.12;
        } else if (this.salary <= 7507.49) {
            inss = this.salary * 0.14;
        } else {
            inss = 7507.49 * 0.14;
        }
        return inss;
    }

    public double calculateFGTS(){
        double fgts;
        fgts = this.salary / 100 * 8 - this.salary;
        return fgts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
