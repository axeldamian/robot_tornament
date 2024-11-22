package com.torneo.robotounament.objects;

public enum Energy {
    SUN("sun"),
    WIND("wind"),
    STEAM("steam"),
    ATOM("atom"),
    NONE("none");

    private String type;

    Energy(String typeEnergy){
        this.type = typeEnergy;
    }

    public boolean hasEffect(String typeEnergy) {
        return typeEnergy.equals(type);
    }

    @Override
    public String toString(){
        return this.type;
    }

}
