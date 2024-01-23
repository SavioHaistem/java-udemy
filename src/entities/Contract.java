package entities;
import java.time.LocalDate;
import java.util.ArrayList;

public class Contract {
    private Integer number;
    private LocalDate date;
    private Double value;
    private ArrayList<Parcel> parcels = new ArrayList<>();

    public Contract() {}

    public Contract(Integer number, LocalDate date, Double value) {
        this.number = number;
        this.date = date;
        this.value = value;
    }

    public Integer getNumber() {
        return number;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public void addParcel(Parcel parcel) {
        parcels.add(parcel);
    }

    public ArrayList<Parcel> getParcels() {
        return parcels;
    }

    @Override
    public String toString() {
        StringBuilder contract = new StringBuilder();
        contract.append("===============================================").append("\n\n");
        contract.append("Contract: ").append(this.number).append("\n");
        contract.append("Value: ").append(this.value).append("\n");
        contract.append("Date: ").append(this.date).append("\n\n");
        contract.append("===============================================").append("\n");
        contract.append("Parcels: ").append("\n");
        for (Parcel parcel : parcels) {
            contract.append("\n");
            contract.append(parcel.toString());
        }
        return contract.toString();
    }
}