package Day2_100222;

import java.util.ArrayList;

public class T2_ArrayList {
    public static void main(String[] args) {
        //Declare and define an arraylist of countries
        ArrayList<String> countries = new ArrayList<>();
        //Adding values to countries array
        countries.add("USA");
        countries.add("Canada");
        countries.add("Pakistan");
        countries.add("Bangladesh");

        //Print USA from Arraylist
        System.out.println("Countries value: " + countries.get(0));

        //Get count of countries list
        System.out.println("Countries Count: " + countries.size());


        //Call integer data type for street number
        ArrayList<Integer> streetNumber = new ArrayList<>();
        streetNumber.add(1650);
        streetNumber.add(183);
        streetNumber.add(1345);

        System.out.println("First street number: " + streetNumber.get(0));

    } //End of main






} //End of class
