package com.example;

import java.util.Scanner;

public class Game {

    //private final Enemy enemy;
    private final Player player;
    //private final

    public Game (Player player){
        //this.enemy = enemy;
        this.player = player;
    }

    class twoReturnInt{
        public int e;
        public int p;
    }

    public void start(){
        int enemyHP = 100;
        int enemyDamagePower = 30;
        int playerHP = player.getPlayerHP();
        twoReturnInt twoInt = new twoReturnInt();
        twoInt.e =enemyHP;
        twoInt.p = playerHP;

        while(true) {
            enemyHP = playerTurn(enemyHP, player);
            playerHP = enemyTurn(playerHP, enemyDamagePower);
            System.out.println("プレイヤー残りHP" + playerHP);
            System.out.println("エネミー残りHP" + enemyHP);
            System.out.println("----------------------------------------------------------------------");
            int i = 0;
            if(playerHP <= 0 || enemyHP <= 0){
                break;
            }
        }

        showResult(playerHP, enemyHP);

    }

    public static int playerTurn(int enemyHP, Player player){
        Scanner scan = new Scanner(System.in);
        System.out.println("----------------------------------------------------------------------");
        System.out.println("プレイヤーのターン！");
        System.out.println("(1.Skill1 : " + player.attack1() +  ") or (2.Skill2 : " + player.attack2() + ")"
                + " or (3.Heal : 50)");
        int choiceSkill = scan.nextInt();
        int skillDamage = 0;
        Boolean battleOrNot = true;
        if(choiceSkill == 1) {
            skillDamage = player.attack1();
        }else if(choiceSkill == 2){
            skillDamage = player.attack2();
        }else{
            System.out.println("hello");
        }
        System.out.println("プレイヤーの攻撃！");
        System.out.println(skillDamage + "のダメージ");
        enemyHP -= skillDamage;
        System.out.println("----------------------------------------------------------------------");
        if(enemyHP >= 0) {
            return enemyHP;
        }else{
            return 0;
        }
    }
    public static int enemyTurn(int playerHP, int enemyAttack){
        System.out.println("----------------------------------------------------------------------");
        System.out.println("エネミーのターン！");
        System.out.println("エネミーの攻撃！");
        System.out.println(enemyAttack + "のダメージ");
        playerHP -= enemyAttack;
        System.out.println("----------------------------------------------------------------------");
        if(playerHP >= 0){
            return playerHP;
        }else{
            return 0;
        }
    }

    public void showResult(int playerHP, int enemyHP){
        if(playerHP > enemyHP){
            System.out.println("おめでとう！敵を倒したよ！");
        }else if(enemyHP > playerHP){
            System.out.println("残念...次は頑張ろう...");
        }else{
            System.out.println("むっむ...");
        }
    }

}
