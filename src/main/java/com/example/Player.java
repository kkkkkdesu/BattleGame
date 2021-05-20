package com.example;

import java.util.Scanner;

public class Player {

    private final int playerHP;
    private final int skillDamagePower1;
    private final int skillDamagePower2;
    //private final Hero hero;

    public Player(){
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("----------------------------------------------------------------------");
            System.out.println("1.BOB, 2.JHON, 3.TOMからキャラクタを選んでください");
            int heroid = scanner.nextInt();
            Hero hero = Hero.getByNumber(heroid);
            System.out.println("キャラクターは" + hero + "です");
            System.out.println("HP：" + hero.getHp());
            System.out.println("Skill1：" + hero.getDamagepower1());
            System.out.println("Skill2：" + hero.getDamagepower2());
            System.out.println("このキャラクターで戦いますか？ (y/n)");
            String ready = scanner.next();
            if(ready.equals("y")){
                this.playerHP = hero.getHp();
                this.skillDamagePower1 = hero.getDamagepower1();
                this.skillDamagePower2 = hero.getDamagepower2();
                break;
            }
        }
    }

    public int attack1(){
        return skillDamagePower1;
    }
    public int attack2(){
        return skillDamagePower2;
    }

    public int getPlayerHP(){
        return playerHP;
    }

    public int checkRemainHP(int remainHP, int damage){
        return remainHP - damage;
    }


}
