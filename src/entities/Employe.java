package entities;

public class Employe {
    private final String name;
    private Integer hours;
    private Double valuePerHour;

    public Employe(String name) {
        this.name = name;
    }

    public Employe(String name, Integer hours, Double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public String getName() {
        return name;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Double payment() {
        return hours * valuePerHour;
    }
}
