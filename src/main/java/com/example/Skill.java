package com.example;

public enum Skill {
    PUNCH(20),
    KICK(20),
    BIGPUNCH(40),
    BIGKICK(40);

    private final int damagePower;

    Skill(int damagePower){
        this.damagePower = damagePower;
    }

}
