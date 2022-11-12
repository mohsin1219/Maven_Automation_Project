package Practice;

import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {
        ArrayList<String> nbaPlayers = new ArrayList<>();
        nbaPlayers.add("LeBron");
        nbaPlayers.add("Kobe");
        nbaPlayers.add("Carmelo");

        for(int i = 0; i<nbaPlayers.size(); i++){
            System.out.println("My favorite NBA player is "+ nbaPlayers.get(i));

     }//End of loop




    }//End of main
}//End of class
