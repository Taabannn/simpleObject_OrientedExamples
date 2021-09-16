package ir.maktab58.hw1.question10;

import java.util.Date;

public class Ticket {
    private Date dateOfMatch;
    Match currentMatch;
    int numOfSoldTickets;
    int totalNumOfTickets;
    Spectator spectator;
    int seatNumber;

    public Date getDateOfMatch() {
        return dateOfMatch;
    }

    public void setDateOfMatch(Date dateOfMatch) {
        this.dateOfMatch = dateOfMatch;
    }

    public Match getCurrentMatch() {
        return currentMatch;
    }

    public void setCurrentMatch(Match currentMatch) {
        this.currentMatch = currentMatch;
    }

    public int getNumOfSoldTickets() {
        return numOfSoldTickets;
    }

    public void setNumOfSoldTickets(int numOfSoldTickets) {
        this.numOfSoldTickets = numOfSoldTickets;
    }

    public int getTotalNumOfTickets() {
        return totalNumOfTickets;
    }

    public void setTotalNumOfTickets(int totalNumOfTickets) {
        this.totalNumOfTickets = totalNumOfTickets;
    }

    public Spectator getSpectator() {
        return spectator;
    }

    public void setSpectator(Spectator spectator) {
        this.spectator = spectator;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void announceSoldOut(){
        //if Num of sold tickets reach to total num of tickets, announce sold out
        //Don't sell more tickets
        //TODO
    }
}
