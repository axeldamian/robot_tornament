package com.torneo.robotounament.dtos;

import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "robotsetup")
public class RobotJson {
    
    private String name;

    private String setup;

    public void setName(String n) {
        this.name = n;
    }

    public String getName() {
        return this.name;
    }

    public void setSetup(String s) {
        this.setup = s;
    }

    public String getSetup() {
        return this.setup;
    }

}
