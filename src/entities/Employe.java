package entities;

public class Employe {
    private String name;
    private Integer hours;
    private Double valuePerHour;

    public Employe() {

    }
    public Employe(String name, Integer hours, Double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }
}