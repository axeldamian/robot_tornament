package com.torneo.robotounament.objects;

public class MartialArt {

    private boolean standing;

    private boolean floor;

    private boolean kick;

    private boolean punching;

    private int agilityConsumption;

    private int powerConsumption;

    private int damage;

    private boolean accesory;

    MartialArt(){
        this.standing = false;
        this.floor = false;
        this.kick = false;
        this.punching = false;
        this.agilityConsumption = 0;
        this.powerConsumption = 0;
        this.damage = 0;
        this.accesory = false;
    }

    private MartialArt(Builder builder) {
        this.standing = builder.standing;
        this.floor = builder.floor;
        this.kick = builder.kick;
        this.punching = builder.punching;
        this.agilityConsumption = builder.agilityConsumption;
        this.powerConsumption = builder.powerConsumption;
        this.damage = builder.damage;
        this.accesory = builder.accesory;
    }

    public boolean getStanding() {
        return this.standing;
    }

    public boolean getFloor() {
        return this.floor;
    }

    public boolean getKick() {
        return this.kick;
    }

    public boolean getPunching() {
        return this.punching;
    }

    public int getAgilityConsumption() {
        return this.agilityConsumption;
    }

    public int getPowerConsumption() {
        return this.powerConsumption;
    }

    public int getDamage() {
        return this.damage;
    }

    public boolean getAccesory() {
        return this.accesory;
    }
public static class Builder {

    private boolean standing;

    private boolean floor;

    private boolean kick;

    private boolean punching;

    private int damage;

    private boolean accesory;

    private int agilityConsumption;

    private int powerConsumption;

    Builder(){
        this.standing = false;
        this.floor = false;
        this.kick = false;
        this.punching = false;

        this.damage = 0;
        this.accesory= false;

        this.agilityConsumption = 0;
        this.powerConsumption = 0;
    }

    public Builder withStanding(){
        this.standing = true;
        return this;
    }

    public Builder withoutStanding(){
        this.standing = false;
        return this;
    }

    public Builder withFloor(){
        this.floor = true;
        return this;
    }

    public Builder withoutFloor(){
        this.floor = false;
        return this;
    }

    public Builder withKick(){
        this.kick = true;
        return this;
    }

    public Builder withoutKick(){
        this.kick = false;
        return this;
    }

    public Builder withPunching(){
        this.punching = true;
        return this;
    }

    public Builder withoutPunching(){
        this.punching = false;
        return this;
    }

////

    public Builder withDamage(int d){
        this.damage = d;
        return this;
    }

    public Builder withAccesory(){
        this.accesory = true;
        return this;
    }

    public Builder withoutAccesory(){
        this.accesory = false;
        return this;
    }
////

    public Builder withAgilityConsumption(int a){
        this.agilityConsumption = a;
        return this;
    }

    public Builder withPowerConsumption(int p){
        this.powerConsumption = p;
        return this;
    }

/////
    public MartialArt build(){
        return new MartialArt(this);
    }
    
}
    
}
