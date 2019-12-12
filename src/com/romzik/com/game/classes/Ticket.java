package com.romzik.com.game.classes;

public class Ticket {
    private int ticketPrice;
    private String movieName;
    private int movieRating;
    private int ticketCount;

    protected Ticket(String movieName, int ticketPrice, int movieRating, int ticketCount) {
        this.ticketPrice = ticketPrice;
        this.movieName = movieName;
        this.movieRating = movieRating;
        this.ticketCount = ticketCount;
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

    public int getTicketCount() {
        return ticketCount;
    }
}
