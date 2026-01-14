package com.tka.entity;

public class Player {
    private int p_Id;
    private int jerseyNo;
    private String pName;
    private int runs;
    private int wickets;
    private String tName;

    public Player() {
        super();
    }

    public Player(int p_Id, int jerseyNo, String pName, int runs, int wickets, String tName) {
        this.p_Id = p_Id;
        this.jerseyNo = jerseyNo;
        this.pName = pName;
        this.runs = runs;
        this.wickets = wickets;
        this.tName = tName;
    }

    public int getP_Id() {
        return p_Id;
    }

    public void setP_Id(int p_Id) {
        this.p_Id = p_Id;
    }

    @Override
    public String toString() {
        return "Player{" +
                "p_Id=" + p_Id +
                ", pName='" + pName + '\'' +
                '}';
    }

    public int getJerseyNo() {
        return jerseyNo;
    }

    public void setJerseyNo(int jerseyNo) {
        this.jerseyNo = jerseyNo;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
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

    public void setWickets(int wickets) {
        this.wickets = wickets;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

}
