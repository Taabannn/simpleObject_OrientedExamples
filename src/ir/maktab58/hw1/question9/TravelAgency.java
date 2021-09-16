package ir.maktab58.hw1.question9;

public class TravelAgency {
    Customer[] customers = new Customer[0];
    SalesPerson[] salesPeople = new SalesPerson[0];
    FlightTicket[] flightTickets = new FlightTicket[0];

    public Customer[] getCustomers() {
        return customers;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }

    public SalesPerson[] getSalesPeople() {
        return salesPeople;
    }

    public void setSalesPeople(SalesPerson[] salesPeople) {
        this.salesPeople = salesPeople;
    }

    public FlightTicket[] getFlightTickets() {
        return flightTickets;
    }

    public void setFlightTickets(FlightTicket[] flightTickets) {
        this.flightTickets = flightTickets;
    }

    public void addNewCustomer(Customer customer){
        //create new vector of customers
        //then copy elements of previous vector to new vector
        //then add new customer to new vector
        //this.customers = newCustomers
        //TODO
    }

    public void addNewSalesPerson(SalesPerson salesPerson){
        //create new vector of salesPeople
        //then copy elements of previous vector to new vector
        //then add new salesperson to new vector
        //this.salesPeople = newSalesPeople
        //TODO
    }

    public void addNewFlightTickets(FlightTicket flightTicket){
        //create new vector of flight tickets
        //then copy elements of previous vector to new vector
        //then add new flight ticket to new vector
        //this.flightTickets = newFlightTickets
        //TODO
    }
}
