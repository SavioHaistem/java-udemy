package entities;

public class PhysicalPerson extends Person {

    private Double healthSpending;

    public PhysicalPerson(String name, Double annualIncome, Double healthSpending) {
        super(name, annualIncome);
        this.healthSpending = healthSpending;
    }

    public Double getHealthSpending() {
        return healthSpending;
    }

    public void setHealthSpending(Double healthSpending) {
        this.healthSpending = healthSpending;
    }

    @Override
    public Double calculateTax() {
        Double percent;
        Double healthDiscount = 0.0;

        if (this.getAnnualIncome() < 20000.0) {
            percent = 0.15;
        } else {
            percent = 0.25;
        }

        if (this.healthSpending > 0.0) {
            healthDiscount = healthSpending / 2;
        }

        return this.getAnnualIncome() * percent - healthDiscount;
    }
}
