package com.romzik.com.game.classes;

 class BuyTicketException extends RuntimeException {

    BuyTicketException(){
        System.out.println("You don't have enough money");
    }


}
