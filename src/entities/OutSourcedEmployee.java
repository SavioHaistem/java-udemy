package entities;

public final class OutSourcedEmployee extends Employe {

    private Double additional;

    public OutSourcedEmployee(String name) {
        super(name);
    }

    public OutSourcedEmployee(String name, Integer hours, Double valuePerHour, Double additional) {
        super(name, hours, valuePerHour);
        this.additional = additional;
    }

    public Double getAdditional() {
        return additional;
    }

    public void setAdditional(Double additional) {
        this.additional = additional;
    }

    @Override
    public Double payment() {
        return (super.payment() + additional);
    }
}