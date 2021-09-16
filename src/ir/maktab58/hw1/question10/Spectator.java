package ir.maktab58.hw1.question10;

public class Spectator {
    String spectatorName;
    Ticket matchTicket = new Ticket();

    public String getSpectatorName() {
        return spectatorName;
    }

    public void setSpectatorName(String spectatorName) {
        this.spectatorName = spectatorName;
    }

    public Ticket getMatchTicket() {
        return matchTicket;
    }

    public void setMatchTicket(Ticket matchTicket) {
        this.matchTicket = matchTicket;
    }
}
