package ir.maktab58.hw1.question9;

import java.util.Date;

public class SalesPerson {
    String salesPersonName;
    Date firstAccess;
    int salesPersonId;
    FlightTicket[] validatedTicketsByThis = new FlightTicket[0];
    FlightTicket[] invalidatedTicketsByThis = new FlightTicket[0];
    String[] reasonsOfInvalidTickets = new String[0];
    FlightTicket[] assignedFlightTickets = new FlightTicket[0];

    public String getSalesPersonName() {
        return salesPersonName;
    }

    public void setSalesPersonName(String salesPersonName) {
        this.salesPersonName = salesPersonName;
    }

    public Date getFirstAccess() {
        return firstAccess;
    }

    public void setFirstAccess(Date firstAccess) {
        this.firstAccess = firstAccess;
    }

    public int getSalesPersonId() {
        return salesPersonId;
    }

    public void setSalesPersonId(int salesPersonId) {
        this.salesPersonId = salesPersonId;
    }

    public FlightTicket[] getValidatedTicketsByThis() {
        return validatedTicketsByThis;
    }

    public void setValidatedTicketsByThis(FlightTicket[] validatedTicketsByThis) {
        this.validatedTicketsByThis = validatedTicketsByThis;
    }

    public FlightTicket[] getInvalidatedTicketsByThis() {
        return invalidatedTicketsByThis;
    }

    public void setInvalidatedTicketsByThis(FlightTicket[] invalidatedTicketsByThis) {
        this.invalidatedTicketsByThis = invalidatedTicketsByThis;
    }

    public String[] getReasonsOfInvalidTickets() {
        return reasonsOfInvalidTickets;
    }

    public void setReasonsOfInvalidTickets(String[] reasonsOfInvalidTickets) {
        this.reasonsOfInvalidTickets = reasonsOfInvalidTickets;
    }

    public FlightTicket[] getAssignedFlightTickets() {
        return assignedFlightTickets;
    }

    public void setAssignedFlightTickets(FlightTicket[] assignedFlightTickets) {
        this.assignedFlightTickets = assignedFlightTickets;
    }

    public void validateTickets(){
        //create a new vector of validatedTicketsByThis
        //copy elements of old vector to new vector
        //add this assigned element as valid ticket to validatedTicketsByThis
        //remove from assigned work
        //add this element to new vector
        //this.validatedTicketsByThis = newValidatedTicketsByThis;
        //TODO
    }

    public void invalidateTickets(){
        //create a new vector of invalidatedTicketsByThis
        //copy elements of old vector to new vector
        //add this assigned element as invalid ticket to invalidatedTicketsByThis
        //remove from assigned work
        //add this element to new vector
        //this.invalidatedTicketsByThis = newInvalidatedTicketsByThis;
        //TODO
    }

    public void addReasonsOfInvalidTickets(String reasonOfInvalid){
        //create a new vector of reasonsOfInvalidTickets
        //copy elements of old vector to new vector
        //add this element to new vector
        //this.reasonsOfInvalidTickets = newReasonsOfInvalidTickets;
        //TODO
    }

    public void addNewAssignedWork(FlightTicket newAssignedTicket) {
        //create a new vector of assignedFlightTickets
        //copy elements of old vector to new vector
        //add this element to new vector
        //this.assignedFlightTickets = newAssignedFlightTickets;
        //TODO
    }
}
