package com.example;

public class Game {

    //private final Enemy enemy;
    private final Player player;
    //private final

    public Game (Player player){
        //this.enemy = enemy;
        this.player = player;
    }

    public void start(){
        int enemyHP = 100;
        int enemyDamagePower = 30;
        int playerHP = player.getPlayerHP();
        int playerDamagePower = player.attack();

        while(true) {
            enemyHP = playerTurn(enemyHP, playerDamagePower);
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

    public static int playerTurn(int enemyHP, int playerAttack){
        System.out.println("----------------------------------------------------------------------");
        System.out.println("プレイヤーのターン！");
        System.out.println("プレイヤーの攻撃！");
        System.out.println(playerAttack + "のダメージ");
        enemyHP -= playerAttack;
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
