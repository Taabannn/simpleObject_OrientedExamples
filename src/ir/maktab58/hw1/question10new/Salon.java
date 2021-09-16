package ir.maktab58.hw1.question10new;

public class Salon {
    private static int totalNumOfSeats;
    private Spectator[] spectators = new Spectator[totalNumOfSeats];
    private boolean[] reservedSeats = new boolean[totalNumOfSeats];
    private Movie currentMovie;
    private boolean isMovieFinished;
    private double startTime;
    private int salonId;

    public static int getTotalNumOfSeats() {
        return totalNumOfSeats;
    }

    public static void setTotalNumOfSeats(int totalNumOfSeats) {
        Salon.totalNumOfSeats = totalNumOfSeats;
    }

    public Spectator[] getSpectators() {
        return spectators;
    }

    public void setSpectators(Spectator[] spectators) {
        this.spectators = spectators;
    }

    public boolean[] getReservedSeats() {
        return reservedSeats;
    }

    public void setReservedSeats(boolean[] reservedSeats) {
        this.reservedSeats = reservedSeats;
    }

    public Movie getCurrentMovie() {
        return currentMovie;
    }

    public void setCurrentMovie(Movie currentMovie) {
        this.currentMovie = currentMovie;
    }

    public boolean isMovieFinished() {
        return isMovieFinished;
    }

    public void setMovieFinished(boolean movieFinished) {
        isMovieFinished = movieFinished;
    }

    public double getStartTime() {
        return startTime;
    }

    public void setStartTime(double startTime) {
        this.startTime = startTime;
    }

    public int getSalonId() {
        return salonId;
    }

    public void setSalonId(int salonId) {
        this.salonId = salonId;
    }

    public void assignNewCurrentMovie(Movie newMovie, double startTime){
        //if isMovieFinished was true
        //then this.currentMovie = newMovie also assign new start time
        //call changeSpectatorsReference
        //else sout proper message
        //TODO
    }

    public void printMovieIsFinished(){
        //compare current time with startTime + currentMovie.getRunTime()
        //if time >= startTime + currentMovie.getRunTime()
        //then this.isMovieFinished = 1
        //sout proper message to admin
        //else sout sth else
        //TODO
    }

    public static void changeSpectatorsReference(){
        //if is movie finished create newSpectators vector
        //then this.spectators = newSpectators
        //change value of elements in boolean array
        //else return
        //TODO
    }
}
