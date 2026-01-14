package com.tka.ipluser;

import com.tka.entity.Player;
import com.tka.iplcontroller.IPLController;

import java.util.List;

public class IPLUser {
    public static void main(String[] args) {
        System.out.println("Welcome to IPL user Module");
        IPLController controller = new IPLController();
       // List<Player> allPlayers = controller.getAllPlayers();

        List<Player> allPlayers = controller.getAllPlayersByTeam("rcb");



        for (Player player : allPlayers){
            System.out.println(player.getpName());
        }

//        List<Player> playerList = controller.getPlayerByName("Virat");
//
//        for (Player player : playerList){
//            System.out.println(player);
//        }

        List<Player> allRounders = controller.getAllRounders();
        allRounders.forEach( m -> System.out.println("All Rounder Player : "+m.getpName()));

        List<Player> allBowlers = controller.getAllBowlers();
        allBowlers.forEach(m -> System.out.println("All Bowler Player : "+m.getpName()));


    }
}
