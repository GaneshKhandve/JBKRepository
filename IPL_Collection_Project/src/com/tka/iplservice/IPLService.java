package com.tka.iplservice;

import com.tka.entity.Player;
import com.tka.iplrepository.IPLRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class IPLService {
    IPLRepository iplRepository =null;

    public List<Player> getAllPlayers() {
        System.out.println("welcome to IPL service Module");
        iplRepository = new IPLRepository();
        List<Player> allPlayers = iplRepository.getAllPlayers();
        return allPlayers;
    }

    public List<Player> getAllPlayersByTeam(String name) {
        List<Player> allPlayers = this.getAllPlayers() ;
//        List<Player> byTeam = new ArrayList<>();
//        for(Player player : allPlayers){
//            if (player.gettName().equalsIgnoreCase(name)){
//                byTeam.add(player);
//            }
//        }
//        return byTeam;
        List<Player> byTeam = allPlayers.stream()
                .filter(p -> p.gettName().equalsIgnoreCase(name))
                .toList();
        return byTeam;
    }

    public List<Player> getPlayerByName(String name) {
        List<Player> allPlayer = this.getAllPlayers();
        List<Player> byName = allPlayer.stream()
                .filter(p -> p.getpName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
        return byName;
    }

    public List<Player> getAllRounders() {
        List<Player> allPlayers = this.getAllPlayers();
        List<Player> allRounders = allPlayers.stream()
                .filter(p -> p.getRuns()>=1000 && p.getWickets()>=50)
                .toList();
        return allRounders;
    }

    public List<Player> getAllBowelers() {
        List<Player> allPlayers = this.getAllPlayers();
        List<Player> allBowlers = allPlayers.stream()
                .filter(p -> p.getWickets() >= 50)
                .toList();
        return allBowlers;

    }
}
