package April25;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;



public class PlayerStats {
    public static void main(String[] args) throws IOException {

        File file = new File(ReadDataFromFile.class.getResource("/PlayerSt.csv").getFile());
        List<String> lines = Files.readAllLines(file.toPath());

        Player[] players = new Player[lines.size() - 1];
        int c = 0;

        for (int i = 1; i < lines.size(); i++) {
            //System.out.println(lines.get(i));
            Player papa1 = convertRowToPlayer(lines.get(i));
            players[c++] = papa1;
        }

        for(Player pappu:players){
            pappu.showDetails();
        }

        Double Maxamount = maxAmount(players);
        System.out.println("MaxAmount=" + Maxamount);

        Double TeamAmount = getTotalTeamAmount(players,"CSK");
        System.out.println("Get Team Total Amount = " + TeamAmount);

       // Player[] finalBetweenPlayers = getTeamPlayersBetweenTheAmount(players, 10000,80001);
        
        String[] finalBetweenPlayers = getTeamPlayersBetweenTheAmount(players, 10000,80001);
        System.out.println(Arrays.toString(finalBetweenPlayers));


    }

    private static double maxAmount(Player[] players) {
        double max = 0;
        for (Player pappu : players) {
            if (pappu.getAmount() > max) {
                max = pappu.getAmount();
            }

        }
        return max;
    }


    private static Player convertRowToPlayer(String s) {
        String[] arr = s.split(",");
        String name = arr[0];
        String role = arr[1];
        double amount = Double.parseDouble(arr[2]);
        String country = arr[3];
        String team = arr[4];
        Player plucker = new Player(name, role, amount, country, team);
        //System.out.println("plucker=" + plucker);
        //plucker.showDetails();
        return plucker;
    }

    private static double getTotalTeamAmount(Player[] arr, String team){
        double TeamAmount = 0;
        for (Player pappu : arr) {
            //System.out.println("------------>"+ team + " "+pappu.getTeam() + " " + pappu.getAmount());
            if (pappu.getTeam().equals(team)) {
                //System.out.println("T");  Here == operator wont work
                TeamAmount += pappu.getAmount();
            }
        }
        return TeamAmount;
    }

    /*private static Player[] getTeamPlayersBetweenTheAmount(Player[] arr, double low, double high){

        int c = 0;
        Player[] BetweenPlayers = new Player[arr.length];
        for(Player papu:arr){
            if(papu.getAmount() > low && papu.getAmount() < high){
                BetweenPlayers[c++] = papu;
            }
        }
        Player[] finalBetweenPlayers = new Player[c];
        System.arraycopy(BetweenPlayers,0, finalBetweenPlayers,0,c);
        return finalBetweenPlayers;
    }*/

    private static String[] getTeamPlayersBetweenTheAmount(Player[] arr, double low, double high){

        int c = 0;
        String[] BetweenPlayers = new String[arr.length];
        for(Player papu:arr){
            if(papu.getAmount() > low && papu.getAmount() < high){
                BetweenPlayers[c++] = papu.getName();
            }
        }
        String[] finalBetweenPlayers = new String[c];
        System.arraycopy(BetweenPlayers,0, finalBetweenPlayers,0,c);
        return finalBetweenPlayers;
    }



}

/*
    public static void main(String[] args) {
        //Player player1 = new Player("Dhoni","AllRounder",15000,"IND", "CSK");
        //player1.showDetails();


        String line = "John,AllRounder,15000,India,CSK";
        Player papa1 = convertRowToPlayer(line);
        System.out.println("papa1 "+ papa1);
        papa1.showDetails();
    }*/