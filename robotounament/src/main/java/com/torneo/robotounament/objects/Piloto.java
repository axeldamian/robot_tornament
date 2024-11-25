package com.torneo.robotounament.objects;

public class Piloto {

    private int agility;

    private boolean defensive;

    private boolean attacker;

    private int age;

    private int weight;

    private String name;

    private int creativity;

    private int brave;

    private int experience;

    private int battlesWon;

    private int battlesLose;

    private int championshipsWon;

    private int datesPenalized;

    private int battles;

    private boolean duelBeforeTheBattle;

    public Piloto(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;

        this.experience = 0;
        this.datesPenalized = 0;
        this.duelBeforeTheBattle = false;
        this.battlesLose = 0;
        this.battlesWon = 0;
        this.championshipsWon = 0;
        this.battles = 0;
    }

    public void incrementBattles(){
        this.battles = this.battles + 1;
    }

    public int getBattles(){
        return this.battles;
    }

    public boolean getDuelBeforeBattle(){
        return this.duelBeforeTheBattle;
    }

    public void penalizeWithDuelBeforeBattle(){
        this.duelBeforeTheBattle = true;
    }

    public boolean isPenalized(){
        return this.datesPenalized != 0;
    }

    public void toPenalize(int days){
        this.datesPenalized = days;
    }

    public int getAgility() {
        return this.agility - this.age + this.experience;
    }

    public void incremenBattlesWon(){
        this.battlesWon = this.battlesWon + 1;
    }

    public int getBattlesWon() {
        return this.battlesWon;
    }

    public int getBattlesLose(){
        return this.battlesLose;
    }

    public void incrementBattlesLose(){
        this.battlesLose = this.battlesLose + 1;
    }

    public void incrementChampionshipsWon(){
        this.championshipsWon = this.championshipsWon + 1;
    }

    public int getChampionshipsWon(){
        return this.championshipsWon;
    }


    
}
