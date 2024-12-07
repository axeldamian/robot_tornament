package com.torneo.robotounament.objects;

public class Pilots {

    private Pilot pilot1;

    private Pilot pilot2;

    private Pilot pilot3;

    private Pilot pilot4;

    private Pilot pilot5;

    private Pilot pilot6;

    public Pilots() {}

    public void setVanguard(Pilot vanguard) {
        this.pilot1 = vanguard;
    }

    public void setRear(Pilot rear) {
        this.pilot2 = rear;
    }

    public void setLeftFlank(Pilot leftFlank) {
        this.pilot3 = leftFlank;
    }

    public void setRightFlank(Pilot rightFlank) {
        this.pilot4 = rightFlank;
    }


    
}
