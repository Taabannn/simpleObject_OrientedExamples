package ir.maktab58.hw1.question9;

public class Customer {
    private FlightTicket[] tickets = new FlightTicket[0];
    private String customerName;
    private int customerId;

    public FlightTicket[] getTickets() {
        return tickets;
    }

    public void setTickets(FlightTicket[] tickets) {
        this.tickets = tickets;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void addTickets(FlightTicket newTicket) {
        //create new vector
        //copy old vector elements to new vector
        //add newTicket to new vector
        //this.tickets = newTickets;
        //TODO
    }
}
