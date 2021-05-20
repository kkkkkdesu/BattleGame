package com.example;

public enum Hero {
    /*
    BOB(100, Skill.PUNCH, Skill.BIGPUNCH),
    JOHN(100, Skill.KICK, Skill.BIGKICK),
    TOM(200, Skill.BIGPUNCH, Skill.BIGKICK);
    private final int hp;
    private final Skill skill1;
    private final Skill skill2;
    Hero(int hp, Skill skill1, Skill skill2){
        this.hp = hp;
        this.skill1 = skill1;
        this.skill2 = skill2;
    }*/

    BOB(1,50, 10,20),
    JOHN(2,100, 20,40),
    TOM(3,200, 40,80);
    private final int heroID;
    private final int hp;
    private final int damagepower1;
    private final int damagepower2;

    Hero(int heroID,int hp, int damagepower1, int damagepower2){
        this.heroID = heroID;
        this.hp = hp;
        this.damagepower1 = damagepower1;
        this.damagepower2 = damagepower2;
    }

    public int getHeroID(){
        return heroID;
    }
    public int getHp(){
        return hp;
    }
    public int getDamagepower1(){
        return damagepower1;
    }
    public int getDamagepower2(){
        return damagepower2;
    }

    /**
     * 値に合致する enum 定数を返す。
     */
    public static Hero getByNumber(int number) {
        for (Hero value : Hero.values()) {
            if (value.getHeroID() == number) {
                return value;
            }
        }
        return null; // 特定できない場合
    }
}