package flexbox;

import java.util.Scanner;
import java.util.InputMismatchException;

public class FlexBox {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int boxType = 0;
        int errorCount = 1; //Is 1 so when it prints how many tries the user has used, it is easier to understand.

        System.out.println("Please enter the box type: ");
        
        while(true){
            if(errorCount == 6){ //Is 6 because still gives a limit of 5, but makes it easier for the user to understand.
                break;
            }
            try{
                int userInput = input.nextInt();
                if(userInput >= 1 && userInput <= 5){
                    System.out.println("You entered box type "+ userInput);
                    boxType = userInput;
                    errorCount = 0;
                    break;
                } else {
                    System.out.println("Error! Please enter an integer between 1-5. You have used " + errorCount + "/5 tries.");
                    errorCount++;
                }
            } catch (InputMismatchException e){
                System.out.println("Error! Please enter an integer. You have used " + errorCount + "/5 tries.");
                errorCount++;
                input.next();
            }
        }
    }
}