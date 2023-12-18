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
        try {
            if (checkIn.getTime() > checkOut.getTime()) {
                throw new Exception("A data de checkin deve ser menor que a data de checkout");
            } else if (checkIn.getTime() < this.checkIn.getTime() || checkOut.getTime() < this.checkOut.getTime()) {
                throw new Exception("Para atualizar a data de checkin e checkout voce deve adicionar uma data maior");
            } else {
                this.checkIn = checkIn;
                this.checkOut = checkOut;
            }
        } catch (Exception e) {
            System.err.println(e);
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