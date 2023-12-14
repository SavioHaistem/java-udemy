package entities;

public class LegalPerson extends Person {
    private Integer employeesCount;


    public LegalPerson(String name, Double annualIncome, Integer employeesCount) {
        super(name, annualIncome);
        this.employeesCount = employeesCount;
    }

    public Integer getEmployeesCount() {
        return employeesCount;
    }

    public void setEmployeesCount(Integer employeesCount) {
        this.employeesCount = employeesCount;
    }

    @Override
    public Double calculateTax() {
        Double percent = 0.16;

        if (employeesCount > 10) {
            percent -= 0.02;
        }

        return this.getAnnualIncome() * percent;
    }
}
