package com.torneo.robotounament.dtos;

public class TeamJson {

    private String name;

    private int money;

    public void setName(String n) {
        this.name = n;
    }

    public String getName() {
        return this.name;
    }

    public void setMoney(int m) {
        this.money = m;
    }

    public int getMoney() {
        return this.money;
    }
    
}
