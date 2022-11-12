package Day2_100222;

import java.util.ArrayList;

public class T3_ForLoop_ArrayList {
    public static void main(String[] args) {
     //Declare and define arraylist for zipcode
        ArrayList<String> zipCode = new ArrayList<>();
        zipCode.add("11218");
        zipCode.add("11217");
        zipCode.add("11216");
        zipCode.add("11215");
        zipCode.add("11214");
        zipCode.add("11213");

        //call for loop to print out all zip code value from arraylist
        for(int i=0; i < zipCode.size(); i++){
           //print out each zip code automatically
            System.out.println("Zip Code: " + zipCode.get(i));


        }//end of loop


    } //End of main

} // End of class
