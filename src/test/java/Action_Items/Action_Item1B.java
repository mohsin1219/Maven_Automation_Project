package Action_Items;

public class Action_Item1B {
    public static void main(String[] args) {
        /* Using String[] region & int[] area code with while loop and linear array
        create at least 4 data for each variable and iterate through each to print out thr i for both variables...
        For instance, System.out.Println("My region id " + region(i) + and my area code is " + area code(i))
         */
        // Assigning region IDs to my variable regionId
        String[] regionId;
        regionId = new String[]{"LA", "NY", "CHI", "MIA"};

        //Assigning area codes to my area code int data type
        int[] areaCode;
        areaCode = new int[]{ 213, 718, 312, 303 };

        //Setting the initializer
        int i = 0;

        //Setting condition for while loop
        while(i < regionId.length && i < areaCode.length){
            System.out.println("My region ID is " + regionId[i] + " and my area code is " + areaCode[i]);
            i++;
        }// End of loop

    }// End of main

}//End of class
