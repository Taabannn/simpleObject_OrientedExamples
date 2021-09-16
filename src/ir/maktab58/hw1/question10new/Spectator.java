package ir.maktab58.hw1.question10new;

public class Spectator {
    private String name; //optional also we can add history for this spectator
    private Ticket reservedTicket;
    private boolean cancelStatus;
    private int seatNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Ticket getReservedTicket() {
        return reservedTicket;
    }

    public void setReservedTicket(Ticket reservedTicket) {
        this.reservedTicket = reservedTicket;
    }

    public boolean isCancelStatus() {
        return cancelStatus;
    }

    public void setCancelStatus(boolean cancelStatus) {
        this.cancelStatus = cancelStatus;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void reserveATicket(Movie requestedMovie){
        //if requestedMovie is valid
        //create new ticket
        //send a request to admin
        //TODO
    }

    public void cancelReservation(){
        //if cancel Status was true
        //set isValidTicket in ReservedTicket object false
        //TODO
    }

    public void printTicket(){
        //if ticket is not expired
        //then print all reservedTicket information
        //else sout you haven't reserved any ticket yet
        //TODO
    }

    public void setSeatNumberIfTicketIsReserved(){
        //if validTicket flag is true
        //then this.seatNumber = reservedTicket.getSeatNumber()
        //TODO
    }
}
