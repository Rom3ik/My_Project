package com.romzik.com.game.objects;

import com.romzik.com.game.classes.AgeException;
import com.romzik.com.game.classes.Ticket;
import com.romzik.com.game.classes.TicketSoldException;
import com.romzik.com.game.classes.User;

public class CinemaPlusTicketWindow {
    private User user;
    private Ticket ticket;

    private void getPaymentResult(){
        System.out.println("You successfully buyed a ticket for " + ticket.getMovieName() + " movie");
        System.out.println("Money left: " + user.getCash() + " $");
        System.out.println("Ticket's have: " + user.getTicketCount() + " tickets");
    }

    private boolean ifTicketsExists() {
        if (ticket.getTicketCount() > 0) {
            return true;
        }
        return false;
    }

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
        if (isAdult() && ifTicketsExists()) {
            user.buyTicket(ticket);
            getPaymentResult();
        } else {
            throw new AgeException();
        }

    }

}
