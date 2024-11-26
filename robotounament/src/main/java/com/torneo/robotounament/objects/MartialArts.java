package com.torneo.robotounament.objects;

public class MartialArts {

    public static MartialArt TAEKWONDO = new MartialArt.Builder()
    .withStanding()
    .withKick()
    .withPunching()
    .withDamage(10)
    .withAccesory()
    .withAgilityConsumption(5)
    .withPowerConsumption(3)
    .build();

}
