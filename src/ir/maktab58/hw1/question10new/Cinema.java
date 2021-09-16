package ir.maktab58.hw1.question10new;

public class Cinema {
    private static int numOfSalons = 4; //for example
    private Movie[] movies = new Movie[0];
    private Salon[] salons = new Salon[numOfSalons];
    private Ticket[] validTickets = new Ticket[0];

    {
        for (int i = 0; i < numOfSalons; i++) {
            salons[i] = new Salon();
        }
    }

    public static int getNumOfSalons() {
        return numOfSalons;
    }

    public static void setNumOfSalons(int numOfSalons) {
        Cinema.numOfSalons = numOfSalons;
    }

    public Movie[] getMovies() {
        return movies;
    }

    public void setMovies(Movie[] movies) {
        this.movies = movies;
    }

    public Salon[] getSalons() {
        return salons;
    }

    public void setSalons(Salon[] salons) {
        this.salons = salons;
    }

    public Ticket[] getValidTickets() {
        return validTickets;
    }

    public void setValidTickets(Ticket[] validTickets) {
        this.validTickets = validTickets;
    }

    public void addNewMovie(Movie newMovie) {
        //for adding the new movie create newMoviesArray
        //copy current moviesArray elements to newMoviesArray
        //add new item to newMoviesArray
        //change the reference of currentArray
        //TODO
    }

    public void removeMovie(Movie thisMovie) {
        //find thisMovie in movies array
        //then create a new movies array
        //copy all of current array elements except thisMovie to new array
        //change the reference of current array
        //TODO
    }

    public void playNewMovieInSalon(Movie thisMovie, Salon salon) {
        //if this movie exists in movies
        //then assign thisMovie to salon
        //by calling salon.assignNewCurrentMovie()
        //TODO
    }

    public void addValidTickets(Ticket addedTicket) {
        //whenever a ticket was reserved create newTicketArray
        //copy current TicketArray to ValidTickets
        //add new item to newTicketArray
        //set properties of ticket
        //change the reference of currentArray
        //TODO
    }

    public void addSpectator(Spectator newSpectator) {
        //if Spectator reserved a ticket
        //then find the salon from salonId in reservedTicket
        // and add spectator based on seatNumber to spectators in salon object
        //TODO
    }

    public void setReservedSeat(Ticket addedTicket) {
        //if new ticket is added
        //find the salon object in salons
        //change value of reservedSeats[currentTicket.getSeatNumber] to true
        //TODO
    }

    public void validateTickets() {
        //if isValidFlag in ticket object is false
        //then delete that element from validTickets
        //TODO
    }
}
