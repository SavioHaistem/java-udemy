package employee;

public class Employee {
    public String name;
    public Double Salary;
    public Double tax;

    public double NetSalary() {
        return Salary - tax;
    }

    public void IncreaseSalary(double percent) {
        this.Salary += (Salary / 100) * percent;
    }

    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f",NetSalary());
    }
}
