package model.entities;

import model.exceptions.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Resevation {
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");


    public Resevation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException {
        if (checkOut.before(checkIn)) {
            throw new DomainException("A data de entrada precisa ser menor que a data de saida para realizar o cadastro");
        } else {
            this.checkIn = checkIn;
            this.checkOut = checkOut;
        }
        this.roomNumber = roomNumber;
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

    public void updateDates(Date checkIn, Date checkOut) throws DomainException {
        if (checkOut.before(checkIn)) {
            throw new DomainException("A data de checkin deve ser menor que a data de checkout para atualizar a data");
        } else if (checkIn.before(this.checkIn) || checkOut.before(this.checkOut)) {
            throw new DomainException("Para atualizar a data de checkin e checkout voce deve adicionar uma data depois da atual");
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