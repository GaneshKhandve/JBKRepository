package com.tka.controller;

import com.tka.entity.Players;
import com.tka.service.IPLService;

import java.util.ArrayList;
import java.util.List;

public class IPLController {
    public static void main(String[] args) {
        IPLService iplService = new IPLService();

     List<Players> filterByRun = iplService.getPlayersByRuns(2000);
     for (Players p : filterByRun){
         System.out.println("Name of Players --> "+p.getName() +" Runs ----> "+ p.getRuns());
     }
        System.out.println("--------------------------------------------");

     List<Players> allRounder = iplService.getAllRounderPlayers();
     for (Players p : allRounder){
         System.out.println("Name of Players --> "+p.getName() +" Runs ----> "+ p.getRuns()+" Wickets --->"+p.getWickets());
     }

        System.out.println("--------------------------------------------");

     Players players = iplService.getPlayersByName("ms Dhoni");
       if(players==null){
          System.out.println("Player Record Not Found");
       }else
           System.out.println("Name of Players --> "+players.getName() +" Runs ----> "+ players.getRuns()+" Wickets --->"+players.getWickets()+" JersyNo -->" +players.getJerseyNumber()+ "Team --> "+players.getTeamName());

        System.out.println("--------------------------------------------");

       List<Players> byTeamName = iplService.getPlayersByTeam("Mi");
       for (Players p: byTeamName){
           System.out.println("Name of Players --> "+p.getName() +" Runs ----> "+ p.getRuns()+" Wickets --->"+p.getWickets()+" JersyNo -->" +p.getJerseyNumber()+ "Team --> "+p.getTeamName());
       }

        System.out.println("--------------------------------------");

       Players players1 = new Players(52,"Rishab Pant",3000,00,"DD");

       iplService.addPlayer(players1);

       List<Players> updatedList = iplService.getAllPlyers();
       for (Players p : updatedList){
           System.out.println("Name of Players --> "+p.getName() +" Runs ----> "+ p.getRuns()+" Wickets --->"+p.getWickets()+" JersyNo -->" +p.getJerseyNumber()+ "Team --> "+p.getTeamName());
       }

        System.out.println("------------------------------------------------------");
       boolean deletePlayer = iplService.deletePlayer(52);
       if (deletePlayer){
           System.out.println("After Deleting the List is");
           List<Players> newList = iplService.getAllPlyers();
           for (Players p : newList){
               System.out.println("Name of Players --> "+p.getName() +" Runs ----> "+ p.getRuns()+" Wickets --->"+p.getWickets()+" JersyNo -->" +p.getJerseyNumber()+ "Team --> "+p.getTeamName());
           }

       }



    }
}
