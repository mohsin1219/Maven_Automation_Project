package Day3_100822;

public class T4_Reusable_Class {
    //create a void method that will add two numbers and execute the print statement
    public static void addTwoNumbers(int a, int b){
        int result = a+b;
        System.out.println("The result is " + result);
    }//end of addTwoNumbers

    //create a return method that will add two numbers and return the result from the print statement
    public static int returnTwoAddNumbers(int a, int b){
        int result = a+b;
        System.out.println("The return result is " + result);
        return result;
    }//end of returnTwoAddNumbers

}//End of class

