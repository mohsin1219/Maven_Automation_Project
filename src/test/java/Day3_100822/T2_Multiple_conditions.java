package Day3_100822;

public interface T2_Multiple_conditions {
    static void main(String[] args) {
        //Declare three integers variables
        int a, b, c;
        a = 2;
        b = 3;
        c = 4;

        if (a+b < c){
            System.out.println("a + b is less than c");
        } else if (a+b > c){
            System.out.println("a + b is greater than c");
        } else {
            System.out.println("a + b is equal to c");
        }// end of conditions
    }//End of main
}// End of class
