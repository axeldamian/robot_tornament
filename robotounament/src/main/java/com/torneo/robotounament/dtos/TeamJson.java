package com.torneo.robotounament.dtos;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "teams")
public class TeamJson {

    private String name;

    private String[] robots;

    private String[] pilots;

    private int budget;

    public void setName(String n) {
        this.name = n;
    }

    public String getName() {
        return this.name;
    }

    public void setBudget(int b) {
        this.budget = b;
    }

    public int getBudget() {
        return this.budget;
    }
    
}
