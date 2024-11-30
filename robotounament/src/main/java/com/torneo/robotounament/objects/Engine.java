package com.torneo.robotounament.objects;

//import com.torneo.robotounament.objects.*;

public enum Engine {
    NAPHTHA("naptha",10,100),
    ELECTRIC("electric",2,500),
    HYBRID("hybrid",6,300),
    GAS("gas",1,700),
    SUN("sun",3,Energy.SUN),
    WIND("wind",2,Energy.WIND),
    STEAM("steam",4,Energy.STEAM),
    ATOM("atom",5,10000);

    private String fuel;

    private int power;

    private int energy;

    private boolean works;

    private Energy type;

    Engine(String fuel, int energy, int power){
        this.energy = energy;
        this.fuel = fuel;
        this.power = power;
        this.works = true;
    }

    Engine(String fuel, int power, Energy energyWithWhichItWorks) {
        this.fuel = fuel;
        this.works = false;
        this.type = energyWithWhichItWorks;
        this.power = power;
    }


    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getFuel() {
        return this.fuel;
    }

    public void setPower(int power, Energy type) {
        this.type = type;
        this.power = power;
    }

    public int getPower(Energy current) {
        if ( this.type.equals(current) ) {
        return this.power;
        } else {
            return 0;
        }
    }

    // life
    public int getEnergy() {
        return this.energy;
    }

    // how to work
    public Energy getTypeEnergy() {
        return this.type;
    }

    public boolean works(){
        return this.works;
    }
    
}
