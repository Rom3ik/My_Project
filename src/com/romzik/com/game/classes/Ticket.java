package com.romzik.com.game.classes;

public class Ticket {
    private int ticketPrice;
    private String movieName;
    private int movieRating;

    protected Ticket(String movieName, int ticketPrice, int movieRating) {
        this.ticketPrice = ticketPrice;
        this.movieName = movieName;
        this.movieRating = movieRating;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public String getMovieName() {
        return movieName;
    }

    public int getMovieRating() {
        return movieRating;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
}
