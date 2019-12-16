package com.romzik.com.game.objects;

import com.romzik.com.game.classes.Ticket;
import com.romzik.com.game.classes.TicketBuyException;
import com.romzik.com.game.classes.User;


public class CinemaPlusTicketWindow {
    private User user;
    private Ticket ticket;

    private void giveTicketReceipt(){
        System.out.println("You successfully buyed a ticket for " + ticket.getMovieName() + " movie \n");
        System.out.println("Your receipt: ");
        System.out.printf("Movie name: %s %nTicket id: %d %nTicket price: %d$", ticket.getMovieName(), ticket.getTicketId(), ticket.getTicketPrice());
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
        if (!isAdult()) {
            throw new TicketBuyException("Your age is under movie's rating");


        }
        else if(!ifTicketsExists()){
            throw new TicketBuyException("No tickets left: " + "Ticket's count: " + ticket.getTicketCount());
        }
        else {
            user.buyTicket(ticket);
            giveTicketReceipt();
        }

    }

}
