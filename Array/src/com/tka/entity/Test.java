package com.tka.entity;

public class Test {
    public static void main(String[] args) {
        Player [] mumbaiIndians = new Player[11];
        mumbaiIndians[0]= new Player(45,"Rohit",6565,30,"MI");
        mumbaiIndians[1]= new Player(18,"Surykumar",1225,30,"MI");
        mumbaiIndians[2]= new Player(21,"Bumrah",1000,250,"MI");
        mumbaiIndians[3]= new Player(14,"Ishan",2222,30,"MI");
        mumbaiIndians[4]= new Player(89,"Deckok",4114,30,"MI");
        mumbaiIndians[5]= new Player(99,"Hardik",2555,30,"MI");
        mumbaiIndians[6]= new Player(16,"Krunal",1212,30,"MI");
        mumbaiIndians[7]= new Player(8,"Pollard",50000,30,"MI");
        mumbaiIndians[8]= new Player(1,"Sachin",6000,30,"MI");
        mumbaiIndians[9]= new Player(12,"Bravo",6565,30,"MI");
        mumbaiIndians[10]= new Player(71,"Boult",411,200,"MI");

        int count = 0;
         //HomeWorkStart
        for (Player player : mumbaiIndians){
            if (player.getName().toLowerCase().contains("r") && player.getRuns()>2000){
                count++;
                System.out.println(player.getName() );
            }

        }
        System.out.println("Count "+ count);

        //homeWorkEnd


//        for (Player player : mumbaiIndians){
//
//            if(player.getWickets()>=30 && player.getRuns()>3000 ) {
//                System.out.println(player.getName());
//            }
//        }


    }
}
