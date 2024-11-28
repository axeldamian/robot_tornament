package com.torneo.robotounament.objects;

public class Piloto {

    private String name;

    private int age;

    private int agility;

    private int weight;

    private boolean defensive;

    private boolean attacker;

    private int creativity;

    private int brave;

    private int range;

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

        this.attacker = false;
        this.defensive = false;
        this.creativity = 0;
        this.brave = 0;
    }

    public void setName(String n) {
        this.name = n;
    }
    public String getName() {
        return this.name;
    }

    public void setAge(int a) {
        this.age = a;
    }

    public void incrementAge() {
        this.age = this.age + 1;
    }

    public int getAge() {
        return this.age;
    }

    public void setWeight(int w) {
        this.weight = w;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setDefensive(boolean d) {
        this.defensive = d;
    }

    public boolean getDefensive() {
        return this.defensive;
    }

    public void setAttacker(boolean a) {
        this.attacker = a;
    }

    public boolean getAttacker() {
        return this.attacker;
    }

    public void setCreativity(int c) {
        this.creativity = c;
    }

    public int getCreativity() {
        return this.creativity;
    }

    public void setBrave(int b) {
        this.brave = b;
    }

    public int getBrave() {
        return this.brave;
    }


    public void setRange(int r) {
        this.range = r;
    }

    public int getRange() {
        return this.range;
    }

    public void incrementExperience(int exp) {
        this.experience = this.experience + exp;
    }

    public int getExperience() {
        return this.experience;
    }

    public void toPenalize(int days) {
        this.datesPenalized = days;
    }

    public int getDatesPenalized() {
        return this.datesPenalized;
    }

    public void setBaseAgility(int base) {
        this.agility = base;
    }

    public int getAgility() {
        return this.agility - this.age + this.experience;
    }

    public boolean isPenalized() {
        return this.datesPenalized != 0;
    }

    public void penalizeWithDuelBeforeBattle() {
        this.duelBeforeTheBattle = true;
    }

    public boolean getDuelBeforeBattle() {
        return this.duelBeforeTheBattle;
    }

    public void incrementBattlesLose() {
        this.battlesLose = this.battlesLose + 1;
    }

    public int getBattlesLose() {
        return this.battlesLose;
    }

    public void incremenBattlesWon() {
        this.battlesWon = this.battlesWon + 1;
    }

    public int getBattlesWon() {
        return this.battlesWon;
    }

    public void incrementChampionshipsWon() {
        this.championshipsWon = this.championshipsWon + 1;
    }

    public int getChampionshipsWon() {
        return this.championshipsWon;
    }

    public void setBattles(int b) {
        this.battles = b;
    }

    public void incrementBattles() {
        this.battles = this.battles + 1;
    }

    public int getBattles() {
        return this.battles;
    }

}
