package com.tka.entity;

public class Player {
    private int jerseyNumber;
   private String name;
    private int runs;
    private int wickets;
   private String teamName;

    public Player(int jerseyNumber, String name, int runs, int wickets, String teamName) {
        this.jerseyNumber = jerseyNumber;
        this.name = name;
        this.runs = runs;
        this.wickets = wickets;
        this.teamName = teamName;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getWickets() {
        return wickets;
    }

    public void setWickets(short wickets) {
        this.wickets = wickets;
    }

    public String getTeamName() {
        return teamName;
    }

    @Override
    public String toString() {
        return "Player{" +
                "jerseyNumber=" + jerseyNumber +
                ", name='" + name + '\'' +
                ", runs=" + runs +
                ", wickets=" + wickets +
                ", teamName='" + teamName + '\'' +
                '}';
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }


}
