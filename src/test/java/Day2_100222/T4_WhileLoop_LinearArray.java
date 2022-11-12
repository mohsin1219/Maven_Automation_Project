package Day2_100222;

public class T4_WhileLoop_LinearArray {
    public static void main(String[] args) {
        // you can also use arraylist for while loop as well
        // declare and define linear array for street number
        int[] streetNumber = new int[]{111,777,333,444,555,666};

        //iterate through all street numbers by while loop
        //set the initializer
        int i = 0;

        // now set the new condition for while loop
        // linear array get the count by using .lenght command
        while(i < streetNumber.length){
            System.out.println("Street Number " + streetNumber[i]);
            //incrementation goes at the end of the while loop
            i++;
        }// end of loop
    }// end of main



}// end of class
