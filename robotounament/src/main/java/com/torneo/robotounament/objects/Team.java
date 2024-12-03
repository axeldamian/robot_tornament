package com.torneo.robotounament.objects;

public class Team {

    private String name;

    private int budget;

    private Robot[] robots;

    private Pilot[] pilots;

    public void setName(String n) {
        this.name = n;
    }

    public String getName(){
        return this.name;
    }
    
}
