package entities;

public final class OutSourcedEmployee extends Employe {

    public OutSourcedEmployee(String name) {
        super(name);
    }

    public OutSourcedEmployee(String name, Integer hours, Double valuePerHour) {
        super(name, hours, valuePerHour);
    }
}
