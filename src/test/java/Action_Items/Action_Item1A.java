package Action_Items;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Action_Item1A {
    public static void main(String[] args) {

  /* Using String Country and int countryCode with for loop and ArrayList
    create at least 4 data for each variable and iterate through each to print out the i for both variables....
    for instance, System.out.println("My Country is" + country.get(i) + "and my country code is" + countryCode.get(i));
  */
   ArrayList<String> nbaPlayers  = new ArrayList<>();
   nbaPlayers.add("LeBron James");
   nbaPlayers.add("Kobe Bryant");
   nbaPlayers.add("Dwayne Wade");
   nbaPlayers.add("Carmelo Anthony");

   ArrayList<Integer> jerseyNumber = new ArrayList<>();
   jerseyNumber.add(6);
   jerseyNumber.add(24);
   jerseyNumber.add(3);
   jerseyNumber.add(15);



   for(int i = 0; i < nbaPlayers.size() && i < jerseyNumber.size(); i++) {
        System.out.println("My favorite NBA player is " + nbaPlayers.get(i) + " and his jersey number is " + jerseyNumber.get(i));

   }// End of loop


    }// End of main


} // End of class
