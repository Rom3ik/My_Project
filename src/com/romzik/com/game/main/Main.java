package com.romzik.com.game.main;

import com.romzik.com.game.classes.*;
import com.romzik.com.game.objects.*;

public class Main {
    public static void main(String[] args) {
        User user1 = new User1("John", 18, 55);
        User user2 = new User2("Bill", 14, 15);
        Ticket ticket1 = new Ticket_1("Joker 2019", 25, 18,2000);
        Ticket ticket2 = new Ticket_2("Ace age 3", 10, 13,1000);
        CinemaPlusTicketWindow cinemaplus = new CinemaPlusTicketWindow(user1, ticket2);
        cinemaplus.sellTicket();

    }
}
