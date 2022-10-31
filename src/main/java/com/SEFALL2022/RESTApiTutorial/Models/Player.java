package com.SEFALL2022.RESTApiTutorial.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Athletes")
public class Player {
    @Id
    private String id;
    private String playerName;
    private int points;

    public Player() {
    }

    public Player(String name, int points) {
        this.playerName = name;
        this.points = points;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return playerName;
    }

    public void setName(String name) {
        this.playerName = name;
    }

    public int getPoints(){
        return points;
    }

    public void setPoints(int points){
        this.points = points;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + playerName + '\'' +
                ", points=" + points +
                '}';
    }
}
