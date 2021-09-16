package ir.maktab58.hw1.question9;

public class FlightTicket {
    private boolean validFlag;
    private String flightSource;
    private String flightDestination;
    private String[] listOfSources = new String[0];
    private String[] listOfDestinations = new String[0];
    private SalesPerson[] allowedSalesPerson = new SalesPerson[0];

    public boolean isValidFlag() {
        return validFlag;
    }

    public void setValidFlag(boolean validFlag) {
        this.validFlag = validFlag;
    }

    public String getFlightSource() {
        return flightSource;
    }

    public void setFlightSource(String flightSource) {
        this.flightSource = flightSource;
    }

    public String getFlightDestination() {
        return flightDestination;
    }

    public void setFlightDestination(String flightDestination) {
        this.flightDestination = flightDestination;
    }

    public String[] getListOfSources() {
        return listOfSources;
    }

    public void setListOfSources(String[] listOfSources) {
        this.listOfSources = listOfSources;
    }

    public String[] getListOfDestinations() {
        return listOfDestinations;
    }

    public void setListOfDestinations(String[] listOfDestinations) {
        this.listOfDestinations = listOfDestinations;
    }

    public SalesPerson[] getAllowedSalesPerson() {
        return allowedSalesPerson;
    }

    public void setAllowedSalesPerson(SalesPerson[] allowedSalesPerson) {
        this.allowedSalesPerson = allowedSalesPerson;
    }

    public void writeValidFlag(boolean validFlag, SalesPerson salesPerson) {
        //check whether salesperson is allowed or not
        //if is allowed, change valid flag
        //TODO
    }

    public void addListOfSources(String newSource) {
        //create new vector
        //copy old vector elements to new vector
        //add newSource to new vector
        //this.listOfSources = newListOfSources;
        //TODO
    }

    public void addListOfDestinations(String newDestination) {
        //create new vector
        //copy old vector elements to new vector
        //add newDestination to new vector
        //this.listOfDestinations = newListOfDestinations;
        //TODO
    }

    public void addAllowedSalesPerson(SalesPerson newAllowed) {
        //create new vector
        //copy old vector elements to new vector
        //add newAllowed to new vector
        //this.allowedSalesPerson = newAllowedSalesPerson;
        //TODO
    }
}
