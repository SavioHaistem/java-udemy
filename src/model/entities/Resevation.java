package model.entities;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Resevation {
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

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

    
}