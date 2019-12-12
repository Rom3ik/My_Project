package com.romzik.com.game.classes;

public class BuyTicketException extends RuntimeException {

    BuyTicketException(){
        System.out.println("You don't have enough money");
    }


}
