package com.example;

public enum Hero {
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
    }

}