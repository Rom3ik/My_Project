package com.romzik.com.game.classes;

public class TicketSoldException extends RuntimeException {
   public TicketSoldException(){
        System.out.println("All tickets sold");
    }
}
