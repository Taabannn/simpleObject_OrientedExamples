package ir.maktab58.hw1.question10;

import java.util.Date;

public class Stadium {
    private Date dateOfFoundation;
    private String address;
    private String country;
    private int numOfSpectatorsAtMost;

    public Date getDateOfFoundation() {
        return dateOfFoundation;
    }

    public void setDateOfFoundation(Date dateOfFoundation) {
        this.dateOfFoundation = dateOfFoundation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getNumOfSpectatorsAtMost() {
        return numOfSpectatorsAtMost;
    }

    public void setNumOfSpectatorsAtMost(int numOfSpectatorsAtMost) {
        this.numOfSpectatorsAtMost = numOfSpectatorsAtMost;
    }
}
