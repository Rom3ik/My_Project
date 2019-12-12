package com.romzik.com.game.classes;

public class User {

    private String name;
    private int age;
    private int cash;
    private int ticketCount;

    public User(String name, int age, int cash) {
        this.name = name;
        this.age = age;
        this.cash = cash;
    }

    public void buyTicket(Ticket ticket) {
        if (cash >= ticket.getTicketPrice()) {
            ticketCount++;
            cash -= ticket.getTicketPrice();
        } else {
            throw new BuyTicketException();
        }

    }

    public int getTicketCount() {
        return ticketCount;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getCash() {
        return cash;
    }
}
