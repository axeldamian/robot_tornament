package com.torneo.robotounament.objects;

//import com.torneo.robotounament.objects.*;

public enum Engine {
    NAPHTHA(10,100),
    ELECTRIC(2,500),
    HYBRID(6,300),
    GAS(1,700),
    SUN(3,Energy.SUN),
    WIND(2,Energy.WIND),
    STEAM(4,Energy.STEAM),
    ATOM(5,10000);

    private int power;

    private int energy;

    private boolean works;

    private Energy type;

    Engine(int energy, int power){
        this.energy = energy;
        this.power = power;
        this.works = true;
    }

    Engine(int power, Energy energyWithWhichItWorks){
        this.works = false;
        this.type = energyWithWhichItWorks;
        this.power = power;
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
