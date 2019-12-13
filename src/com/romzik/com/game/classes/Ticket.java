package com.romzik.com.game.classes;

import java.util.Random;

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

    private void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getTicketCount() {
        return ticketCount;
    }

    public int getTicketId() {
        int ticketId;
        Random rand = new Random();
        ticketId = rand.nextInt(40000 - 10000 + 1) + 100000;
        return ticketId;
    }

}
