package com.tka.iplrepository;

import com.tka.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class IPLRepository {
    List<Player> allPlayers = null;
    public List<Player> getAllPlayers() {
        System.out.println("Welcome to IPL Repository");
        allPlayers = new ArrayList<>();
        allPlayers.add(new Player(1,18,"Virat Kohli",6767,4,"RCB"));
        allPlayers.add(new Player(2,45,"Rohit Sharma",6211,15,"MI"));
        allPlayers.add(new Player(3,7,"MS Dhoni",5082,2,"CSK"));
        allPlayers.add(new Player(4,33,"Hardik Pandya",3120,78,"MI"));
        allPlayers.add(new Player(5,93,"Jasprit Bumrah",420,145,"MI"));
        allPlayers.add(new Player(6,3,"Suresh Raina",5528,25,"CSK"));
        allPlayers.add(new Player(7,17,"Rishabh Pant",3840,3,"DC"));
        allPlayers.add(new Player(8,77,"Shubman Gill",4100,5,"GT"));
        allPlayers.add(new Player(9,63,"SKY Yadav",3920,1,"MI"));
        allPlayers.add(new Player(10,8,"Ravindra Jadeja",2890,132,"CSK"));

        allPlayers.add(new Player(11,12,"Yuvraj Singh",8701,111,"PBKS"));
        allPlayers.add(new Player(12,99,"KL Rahul",4600,2,"LSG"));
        allPlayers.add(new Player(13,19,"Ishan Kishan",3100,0,"MI"));
        allPlayers.add(new Player(14,25,"Shreyas Iyer",3800,1,"KKR"));
        allPlayers.add(new Player(15,41,"David Warner",6565,0,"DC"));
        allPlayers.add(new Player(16,10,"Sachin Tendulkar",18426,154,"MI"));
        allPlayers.add(new Player(17,23,"Mohammed Shami",220,185,"GT"));
        allPlayers.add(new Player(18,90,"Bhuvneshwar Kumar",800,170,"SRH"));
        allPlayers.add(new Player(19,55,"Kane Williamson",4200,6,"SRH"));
        allPlayers.add(new Player(20,13,"AB de Villiers",5162,0,"RCB"));

        allPlayers.add(new Player(21,5,"Steve Smith",2800,1,"RR"));
        allPlayers.add(new Player(22,44,"Jos Buttler",4200,0,"RR"));
        allPlayers.add(new Player(23,9,"Ben Stokes",3100,98,"RR"));
        allPlayers.add(new Player(24,31,"Glenn Maxwell",3500,36,"RCB"));
        allPlayers.add(new Player(25,16,"Marcus Stoinis",2800,45,"LSG"));
        allPlayers.add(new Player(26,6,"Andre Russell",3300,112,"KKR"));
        allPlayers.add(new Player(27,27,"Sunil Narine",1100,165,"KKR"));
        allPlayers.add(new Player(28,1,"KL Pandya",2200,65,"LSG"));
        allPlayers.add(new Player(29,14,"Faf du Plessis",4300,0,"RCB"));
        allPlayers.add(new Player(30,2,"Quinton de Kock",4500,0,"LSG"));

//        allPlayers.add(new Player(31,24,"Prithvi Shaw",2600,0,"DC"));
//        allPlayers.add(new Player(32,52,"Axar Patel",1900,120,"DC"));
//        allPlayers.add(new Player(33,11,"Deepak Chahar",400,95,"CSK"));
//        allPlayers.add(new Player(34,18,"Ruturaj Gaikwad",3600,0,"CSK"));
//        allPlayers.add(new Player(35,91,"Arshdeep Singh",300,98,"PBKS"));
//        allPlayers.add(new Player(36,29,"Shikhar Dhawan",6800,5,"PBKS"));
//        allPlayers.add(new Player(37,48,"Mayank Agarwal",2700,0,"SRH"));
//        allPlayers.add(new Player(38,66,"Rahul Tripathi",2400,0,"SRH"));
//        allPlayers.add(new Player(39,88,"Washington Sundar",1600,80,"SRH"));
//        allPlayers.add(new Player(40,73,"Umran Malik",150,65,"SRH"));
//
//        allPlayers.add(new Player(41,21,"Tilak Varma",1900,0,"MI"));
//        allPlayers.add(new Player(42,22,"Tim David",1600,12,"MI"));
//        allPlayers.add(new Player(43,15,"Dinesh Karthik",4400,1,"RCB"));
//        allPlayers.add(new Player(44,74,"Mohit Sharma",500,135,"GT"));
//        allPlayers.add(new Player(45,64,"Sai Sudharsan",2100,0,"GT"));
//        allPlayers.add(new Player(46,56,"Wriddhiman Saha",2800,0,"GT"));
//        allPlayers.add(new Player(47,30,"Yashasvi Jaiswal",3200,0,"RR"));
//        allPlayers.add(new Player(48,54,"Sanju Samson",3900,0,"RR"));
//        allPlayers.add(new Player(49,19,"Trent Boult",200,105,"RR"));
//        allPlayers.add(new Player(50,60,"R Ashwin",1800,160,"RR"));
//
//        allPlayers.add(new Player(51,26,"Nitish Rana",2700,8,"KKR"));
//        allPlayers.add(new Player(52,86,"Venkatesh Iyer",2200,32,"KKR"));
//        allPlayers.add(new Player(53,17,"Pat Cummins",1200,95,"SRH"));
//        allPlayers.add(new Player(54,28,"Mitchell Marsh",2600,45,"DC"));
//        allPlayers.add(new Player(55,39,"David Miller",3800,0,"GT"));
//        allPlayers.add(new Player(56,32,"Rinku Singh",2100,0,"KKR"));
//        allPlayers.add(new Player(57,70,"Shardul Thakur",1300,120,"CSK"));
//        allPlayers.add(new Player(58,81,"Irfan Pathan",2500,130,"DC"));
//        allPlayers.add(new Player(59,18,"Virender Sehwag",8586,96,"DC"));
//        allPlayers.add(new Player(60,99,"Zaheer Khan",1000,311,"MI"));
//
//        allPlayers.add(new Player(61,12,"Gautam Gambhir",5238,0,"KKR"));
//        allPlayers.add(new Player(62,42,"Robin Uthappa",4952,0,"CSK"));
//        allPlayers.add(new Player(63,77,"Harbhajan Singh",1200,150,"MI"));
//        allPlayers.add(new Player(64,9,"Yuzvendra Chahal",400,180,"RR"));
//        allPlayers.add(new Player(65,55,"Kuldeep Yadav",350,160,"DC"));
//        allPlayers.add(new Player(66,34,"Mohammed Siraj",300,110,"RCB"));
//        allPlayers.add(new Player(67,68,"Navdeep Saini",250,85,"RCB"));
//        allPlayers.add(new Player(68,7,"Rahul Tewatia",1800,45,"GT"));
//        allPlayers.add(new Player(69,95,"Avesh Khan",200,90,"LSG"));
//        allPlayers.add(new Player(70,16,"Krunal Pandya",2000,95,"LSG"));
//
//        allPlayers.add(new Player(71,27,"Manish Pandey",3900,5,"DC"));
//        allPlayers.add(new Player(72,20,"Ambati Rayudu",4300,0,"CSK"));
//        allPlayers.add(new Player(73,31,"Ajinkya Rahane",4600,1,"CSK"));
//        allPlayers.add(new Player(74,87,"Shivam Dube",2200,35,"CSK"));
//        allPlayers.add(new Player(75,59,"Liam Livingstone",2500,65,"PBKS"));
//        allPlayers.add(new Player(76,92,"Sam Curran",1800,110,"PBKS"));
//        allPlayers.add(new Player(77,10,"Jonny Bairstow",3900,0,"PBKS"));
//        allPlayers.add(new Player(78,4,"Jason Roy",2800,0,"GT"));
//        allPlayers.add(new Player(79,6,"Chris Gayle",4965,18,"RCB"));
//        allPlayers.add(new Player(80,12,"Brendon McCullum",2880,0,"KKR"));
//
//        allPlayers.add(new Player(81,41,"Shane Watson",3874,92,"CSK"));
//        allPlayers.add(new Player(82,72,"Lasith Malinga",500,170,"MI"));
//        allPlayers.add(new Player(83,19,"Adam Gilchrist",2800,0,"DC"));
//        allPlayers.add(new Player(84,90,"Alzarri Joseph",200,85,"GT"));
//        allPlayers.add(new Player(85,13,"Kieron Pollard",3412,69,"MI"));
//        allPlayers.add(new Player(86,24,"Nicholas Pooran",2600,5,"LSG"));
//        allPlayers.add(new Player(87,61,"Devdutt Padikkal",2900,0,"RR"));
//        allPlayers.add(new Player(88,48,"Shimron Hetmyer",2400,0,"RR"));
//        allPlayers.add(new Player(89,99,"Anrich Nortje",150,95,"DC"));
//        allPlayers.add(new Player(90,73,"Kagiso Rabada",400,130,"PBKS"));
//
//        allPlayers.add(new Player(91,28,"Mohammad Nabi",1700,85,"SRH"));
//        allPlayers.add(new Player(92,36,"Rashid Khan",1400,165,"GT"));
//        allPlayers.add(new Player(93,8,"Shahid Afridi",2200,395,"KKR"));
//        allPlayers.add(new Player(94,46,"Eoin Morgan",2450,0,"KKR"));
//        allPlayers.add(new Player(95,17,"Aaron Finch",3100,1,"RCB"));
//        allPlayers.add(new Player(96,23,"Paul Valthaty",1200,5,"PBKS"));
//        allPlayers.add(new Player(97,52,"Sandeep Sharma",300,120,"RR"));
//        allPlayers.add(new Player(98,67,"Prasidh Krishna",200,90,"RR"));
//        allPlayers.add(new Player(99,84,"Marco Jansen",900,85,"SRH"));
//        allPlayers.add(new Player(100,15,"Rilee Rossouw",2600,0,"DC"));
        return allPlayers;
    }
}
