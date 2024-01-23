package entities;

import java.time.LocalDate;
import java.util.Date;

public class Parcel {
    private Double price;
    private LocalDate date;

    public Parcel(Double price, LocalDate date) {
        this.price = price;
        this.date = date;
    }

    @Override
    public String toString() {
        StringBuilder parcel = new StringBuilder();
        parcel.append("-------------------------------").append("\n\n");
        parcel.append("date: ").append(date).append("\n");
        parcel.append("price: ").append(price).append("\n\n");
        parcel.append("-------------------------------").append("\n");
        return parcel.toString();
    }
}
