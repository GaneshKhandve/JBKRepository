package com.tka.service;

import com.tka.Repository.Database;
import com.tka.entity.Players;

import java.util.ArrayList;
import java.util.List;

public class IPLService {
    Database database = new Database();

  public List<Players> getPlayersByRuns( int runs){
      List<Players> result = new ArrayList<>();
      for (Players p : database.getAllPlayers()){
          if (p.getRuns() > 2000){
              result.add(p);
          }
      }
       return result;
  }

  public List<Players> getAllRounderPlayers(){
      List<Players> result = new ArrayList<>();
      for (Players p : database.getAllPlayers()){
          if(p.getRuns()>1000 && p.getWickets()>20){
              result.add(p);
          }
      }
      return result;
  }

  public Players getPlayersByName(String name ){
      List<Players> allPlayers = database.getAllPlayers();
      for(Players p : allPlayers){
          if(p.getName().toLowerCase().contains(name.toLowerCase())){
              return p;
          }
      }
      return null;
  }

  public List<Players> getPlayersByTeam (String teamName){
      List<Players> result = new ArrayList<>();

      for (Players p : database.getAllPlayers()){
          if (p.getTeamName().toLowerCase().equals(teamName.toLowerCase())||p.getTeamName().toLowerCase().contains(teamName.toLowerCase()) ){
              result.add(p);
          }
      }
      return result;
  }

  public void addPlayer(Players players){
      database.getAllPlayers().add(players);
      System.out.println("Player Added Succesfully");

  }

  public List<Players> getAllPlyers(){
      return database.getAllPlayers();
  }

  public boolean deletePlayer(int jersyNumber){
      for (Players p : database.getAllPlayers()){
          if (p.getJerseyNumber()==jersyNumber){
              database.getAllPlayers().remove(p);
              System.out.println(p.getJerseyNumber() +" Jersey Number Record has been deleted Successfully");
              return true;

          }
      }
      return false;
  }

}
