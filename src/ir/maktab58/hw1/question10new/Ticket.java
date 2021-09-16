package ir.maktab58.hw1.question10new;

import java.util.Date;

public class Ticket {
    private Movie movieName;
    private Date dateAndTimeOfShowing;
    private int seatNumber;
    private Date dateOfReservation;
    private int ticketId;
    private int salonId;
    private Date expirationDate;
    private boolean isValidTicket;

    public Movie getMovieName() {
        return movieName;
    }

    public void setMovieName(Movie movieName) {
        this.movieName = movieName;
    }

    public Date getDateAndTimeOfShowing() {
        return dateAndTimeOfShowing;
    }

    public void setDateAndTimeOfShowing(Date dateAndTimeOfShowing) {
        this.dateAndTimeOfShowing = dateAndTimeOfShowing;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Date getDateOfReservation() {
        return dateOfReservation;
    }

    public void setDateOfReservation(Date dateOfReservation) {
        this.dateOfReservation = dateOfReservation;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public int getSalonId() {
        return salonId;
    }

    public void setSalonId(int salonId) {
        this.salonId = salonId;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public boolean isValidTicket() {
        return isValidTicket;
    }

    public void setValidTicket(boolean validTicket) {
        isValidTicket = validTicket;
    }

    public void assignDateOfExpiration() {
        //find the salon
        //assign startTime and dateOfShowing as expirationDate
        //TODO
    }

    public void checkValidation() {
        //if currentDate was after expiration Date or if spectator requests for canceling the ticket
        //then this.isValidTicket = false;
        //TODO
    }

}
