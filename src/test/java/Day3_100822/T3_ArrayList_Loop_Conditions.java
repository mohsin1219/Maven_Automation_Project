package Day3_100822;

import java.util.ArrayList;

public class T3_ArrayList_Loop_Conditions {
    public static void main(String[] args) {
        //Refers to anchor
        ArrayList<String> countries = new ArrayList<>();
        countries.add("USA");
        countries.add("Canada");
        countries.add("Bangladesh");
        countries.add("India");
        countries.add("Australia");
        //Using for loop to iterate through countries and print out only if country is USA and Australia
        for (int i = 0; i < countries.size(); i++) {
            // two equal (==) will compare the values from right and left side
            //whereas one equal use to set a value to a variable
            if (countries.get(i) == "USA") {
                System.out.println("The country is USA and the Index i is " + i);
            } else if (countries.get(i) == "Australia") {
                System.out.println("The country is Australia and the Index i is " + i);
            } else
                System.out.println("Country is not listed ");

            if (countries.get(i) == "USA" || countries.get(i) == "Australia") {
                System.out.println("Country is " + countries.get(i) + " and Index i is " + i);
            }//End of statement
        }//End of loop
    }//End of main
}//End of class
