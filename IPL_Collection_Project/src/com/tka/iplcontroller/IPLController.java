package com.tka.iplcontroller;

import com.tka.entity.Player;
import com.tka.iplservice.IPLService;

import java.util.List;

public class IPLController {

     IPLService iplService = null;

    public List<Player> getAllPlayers() {
        System.out.println("Welcome to IPL Controller");
        iplService = new IPLService();
        List<Player> allPlayer = iplService.getAllPlayers();

        return allPlayer;
    }

    public List<Player> getAllPlayersByTeam(String name) {
        iplService = new IPLService();
        List<Player> allPlayer = iplService.getAllPlayersByTeam(name);
        return allPlayer;
    }

    public List<Player> getPlayerByName(String name) {
        System.out.println("Welcome to IPL Controller");
        iplService= new IPLService();
        List<Player> players = iplService.getPlayerByName(name);
        return players;
    }

    public List<Player> getAllRounders() {
        System.out.println("Welocme To IPL Controller");
        iplService= new IPLService();
        List<Player> allRounders = iplService.getAllRounders();
        return allRounders;
    }

    public List<Player> getAllBowlers() {
        System.out.println("Welcome To IPL Controller");
        iplService= new IPLService();
        List<Player> allBowlers = iplService.getAllBowelers();
        return allBowlers;
    }
}
