package com.romzik.com.game.objects;

import com.romzik.com.game.classes.AgeException;
import com.romzik.com.game.classes.Ticket;
import com.romzik.com.game.classes.User;

public class CinemaPlusTicketWindow {
    private User user;
    private Ticket ticket;


    private boolean isAdult() {
        if (user.getAge() >= ticket.getMovieRating()) {
            return true;
        }
        return false;
    }

    public CinemaPlusTicketWindow(User user, Ticket ticket) {
        this.user = user;
        this.ticket = ticket;
    }


    public void sellTicket() {
        if (isAdult()) {
            user.buyTicket(ticket);
            System.out.println("You successfully buyed a ticket for " + ticket.getMovieName() + " movie");
            System.out.println("You have: " + user.getTicketCount() + " tickets");
            System.out.println("You have: " + user.getCash() + " money");
        } else {
            throw new AgeException();
        }

    }

}
