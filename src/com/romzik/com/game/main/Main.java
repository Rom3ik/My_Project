package com.romzik.com.game.main;

import com.romzik.com.game.classes.*;
import com.romzik.com.game.objects.*;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("John", 18, 30);
        User user2 = new User("Bill", 14, 20);
        Ticket ticket1 = new Ticket("Joker 2019", 25, 18,1000);
        Ticket ticket2 = new Ticket("Ace Age 3", 15, 13,1000);
        CinemaPlusTicketWindow cinemaplus = new CinemaPlusTicketWindow(user1, ticket2);
        cinemaplus.sellTicket();
    }
}
