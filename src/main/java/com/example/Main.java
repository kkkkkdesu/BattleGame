package com.example;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello main");
        Player player = new Player();
        Game game = new Game(player);

        game.start();
    }
}
