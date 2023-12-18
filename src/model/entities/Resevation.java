package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Resevation {
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");


    public Resevation(Integer roomNumber, Date checkIn, Date checkOut) {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public Long duration() {
        long difference = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(difference,TimeUnit.MILLISECONDS);
    }

    public void updateDates(Date checkIn, Date checkOut) {
        if (checkOut.before(checkIn)) {
            throw new IllegalArgumentException("A data de checkin deve ser menor que a data de checkout");
        } else if (checkIn.before(this.checkIn) || checkOut.before(this.checkOut)) {
            throw new IllegalArgumentException("Para atualizar a data de checkin e checkout voce deve adicionar uma data maior");
        } else {
            this.checkIn = checkIn;
            this.checkOut = checkOut;
        }
    }

    @Override
    public String toString() {
        return "Room "
                + roomNumber
                + ", check-in: "
                + dateFormat.format(checkIn)
                + ", check-out: "
                + dateFormat.format(checkOut)
                + ","
                + duration()
                + "nights";
    }
}