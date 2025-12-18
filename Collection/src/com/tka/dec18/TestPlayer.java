package com.tka.dec18;

import java.util.ArrayList;
import java.util.List;

public class TestPlayer {
    public static void main(String[] args) {
        List<Player> MI = new ArrayList<Player>();

        MI.add(new Player(45,"Rohit",6565,30,"MI"));
        MI.add(new Player(18,"Surykumar",1225,30,"MI"));
        MI.add(new Player(21,"Bumrah",1000,250,"MI"));
        MI.add(new Player(14,"Ishan",2222,30,"MI"));
        MI.add(new Player(89,"Deckok",4114,30,"MI"));
        MI.add(new Player(99,"Hardik",2555,30,"MI"));
        MI.add(new Player(16,"Krunal",1212,30,"MI"));
        MI.add(new Player(8,"Pollard",50000,30,"MI"));
        MI.add(new Player(1,"Sachin",6000,30,"MI"));
        MI.add(new Player(12,"Bravo",6565,30,"MI"));
        MI.add(new Player(71,"Boult",411,200,"MI"));
       int count =0;
        for(Player player : MI){
            if(player.getRuns()>1500 && player.getWickets()>10){
                System.out.println("Name of Players is -----> "+player.getName());
                count++;
            }
        }

        System.out.println("The Count Of Player is "+ count);



    }
}
