package com.tka.Repository;

import com.tka.entity.Players;

import java.util.ArrayList;
import java.util.List;

public class Database {

    public static List<Players> allPlayers = new ArrayList<Players>();

    static{
        allPlayers.add(new Players(45,"Rohit Sharma",6565,30,"MI"));
        allPlayers.add(new Players(100,"MS Dhoni",5412,10,"CSK"));
        allPlayers.add(new Players(11,"Hardik Pandya",2000,100,"MI"));
        allPlayers.add(new Players(18,"Virat Kohli",7000,20,"RCB"));
        allPlayers.add(new Players(45,"Surykumar Yadav",2500,0,"MI"));
        allPlayers.add(new Players(45,"Shubman Gill",2000,00,"GT"));
//        allPlayers.add(new Players(45,"Rohit",6565,30,"MI"));
//        allPlayers.add(new Players(45,"Rohit",6565,30,"MI"));

    }

    public List<Players> getAllPlayers() {
        return allPlayers;
    }
}
