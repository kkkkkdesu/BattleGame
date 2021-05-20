package com.example;

import java.util.Scanner;

public class Player {

    private final int playerHP;
    private final int skillDamagePower;
    //private final Hero hero;

    public Player(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.BOB, 2.JHON, 3.TOMからキャラクタを選んでください");
        int heroid = scanner.nextInt();
        Hero hero = Hero.getByNumber(heroid);
        System.out.println("キャラクターは"+ hero +"です");
        System.out.println("HP：" + hero.getHp());
        System.out.println("Power：" + hero.getDamagepower());

        this.playerHP = hero.getHp();
        this.skillDamagePower = hero.getDamagepower();
    }

    public int attack(){
        return skillDamagePower;
    }

    public int getPlayerHP(){
        return playerHP;
    }

    public int checkRemainHP(int remainHP, int damage){
        return remainHP - damage;
    }


}
