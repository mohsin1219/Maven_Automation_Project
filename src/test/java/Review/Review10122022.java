package Review;

public class Review10122022 {
    public static void main(String[] args) {
    //Define automation string variable
        String subjectLine = "Automation_AI05";

        //split the string
        String[] splitMessageArray = subjectLine.split("_");
        //take the second string from the array then grab the number only
        String actionItemNumber = splitMessageArray[1].substring(2);
        //print out John to the console
        System.out.println("The action item number is " + actionItemNumber);




        
    }
}
