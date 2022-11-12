package Day4_100922;

public class T1_SplitCommand {
    public static void main(String[] args) {
        //Declare a string variable
        String message = "My name is John";
        //Extract out John from the string and print it
        //Call split message by using String Array
        //Space between double quotes will split the string by words
        String[] splitMessage = message.split(" ");
        System.out.println("result:" + splitMessage[3]);

        //Extracting each character from a string
        String message2 = "abc";
        //Splitting the variable by each letter
        //leaving no space between the double quotes will split each letter
       String[] splitMessage2 = message2.split("");
        System.out.println("Index 2 is: " + splitMessage2[2]);

    }// End of main
}//End of class
