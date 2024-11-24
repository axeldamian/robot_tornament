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

    private boolean penalized;

    private int datesPenalized;

    private boolean duelBeforeTheBattle;

    public Piloto() {
        this.experience = 0;
        this.penalized = false;
        this.datesPenalized = 0;
        this.duelBeforeTheBattle = false;
        this.battlesLose = 0;
        this.battlesWon = 0;
        this.championshipsWon = 0;
    }

    public void toPenalize(int days){
        this.penalized = true;
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
