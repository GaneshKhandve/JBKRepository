package com.tka.entity;
// i have taken 10 min to complete this POJO class. 
public class Player {
	private int jersey_No;
	private String name;
	private int runs;
	private int wicket;
	private String team_Name;
	
	public Player(int j,String n,int r,int w,String t) {
		jersey_No=j;
		name=n;
		runs=r;
		wicket=w;
		team_Name=t;
		
	}
	
	public int getJersey_No() {
		
		return jersey_No;
	}
	
	public void setJersey_No(int n) {
		jersey_No=n;
	}
	
	public int getRuns() {
		return runs;
	}
	
	public void setRuns(int r) {
		runs=r;
	
	}
	
	public String getPlayerName() {
		return name;
	}
	
	public void setPlayerName(String n) {
		name=n;
		
	}
	
	public int getWicket() {
		return wicket;
	}
	
	public void setWickete(int w) {
		wicket=w;
		
	}
	
	
	public String getTeamName() {
		return team_Name;
	}
	
	public void setTeamName(String n) {
		team_Name=n;
		
	}
	
	


}
