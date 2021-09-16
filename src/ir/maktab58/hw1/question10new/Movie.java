package ir.maktab58.hw1.question10new;

import java.util.Date;

public class Movie {
    String movieName;
    Date dateOfRelease;
    double runTime; //or also we can use Duration
    String story;
    String Genre;
    String[] nameOfCast;
    double boxOfficeInDollars;
    double rate;
    int numOfVoters;

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Date getDateOfRelease() {
        return dateOfRelease;
    }

    public void setDateOfRelease(Date dateOfRelease) {
        this.dateOfRelease = dateOfRelease;
    }

    public double getRunTime() {
        return runTime;
    }

    public void setRunTime(double runTime) {
        this.runTime = runTime;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public String[] getNameOfCast() {
        return nameOfCast;
    }

    public void setNameOfCast(String[] nameOfCast) {
        this.nameOfCast = nameOfCast;
    }

    public double getBoxOfficeInDollars() {
        return boxOfficeInDollars;
    }

    public void setBoxOfficeInDollars(double boxOfficeInDollars) {
        this.boxOfficeInDollars = boxOfficeInDollars;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getNumOfVoters() {
        return numOfVoters;
    }

    public void setNumOfVoters(int numOfVoters) {
        this.numOfVoters = numOfVoters;
    }
}
