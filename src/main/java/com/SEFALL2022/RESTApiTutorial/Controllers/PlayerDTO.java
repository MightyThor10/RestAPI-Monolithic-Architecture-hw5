package com.SEFALL2022.RESTApiTutorial.Controllers;

import java.util.List;

public class PlayerDTO {

    private String id;
    private String name;
    private int points;

    public PlayerDTO() {
    }

    public PlayerDTO(String id, String name, int points) {
        this.id = id;
        this.name = name;
        this.points = points;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints(){
        return points;
    }

    public void setPoints(int points){
        this.points = points;
    }
}
