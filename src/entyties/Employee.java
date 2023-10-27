package entyties;

public class Employee {
    public String name;
    private final Integer id;
    private Double salary;

    public Employee(String name, Integer id, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

    public void increaseSalary(Double increasedValue) {
        setSalary(getSalary() + increasedValue);
    }

    @Override
    public String toString() {
        return String.format("User: %d, Name: %s, Salary: %.2f R$",id,name,salary);
    }
}