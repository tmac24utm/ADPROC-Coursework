package flexbox;

import java.util.Scanner;
import java.util.InputMismatchException;
import javax.swing.*;

public class FlexBox {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cardGrade = 0;
        int colourPrint = 0;
        int errorCount = 1; //Is 1 so when it prints how many tries the user has used, it is easier to understand.

        while (errorCount != 6) { //Is 6 because still gives a limit of 5, but makes it easier for the user to understand.
            try {
                while (true) {
                    System.out.println("Please enter the card grade: ");
                    int userInput = input.nextInt();
                    if (userInput >= 1 && userInput <= 5) {
                        System.out.println("You requested card grade " + userInput);
                        cardGrade = userInput;
                        break;
                    } else {
                        System.out.println("Error! Please enter an integer between 1-5(Inclusive). You have used " + errorCount + "/5 tries.");
                        errorCount++;
                        if (errorCount > 5) {
                            break;
                        }
                    }
                }

                while (true) {
                    System.out.println("Would you like colour print? (Please enter, 0, 1 or 2): ");
                    int userInput2 = input.nextInt();
                    if (userInput2 >= 0 && userInput2 <= 2) {
                        switch (userInput2) {
                            case 0:
                                System.out.println("You requested no colour.");
                                colourPrint = userInput2;
                                break;
                            case 1:
                                System.out.println("You requested 1 colour");
                                colourPrint = userInput2;
                                break;
                            case 2:
                                System.out.println("You requested 2 colours");
                                colourPrint = userInput2;
                                break;
                        }
                    } else {
                        System.out.println("Error! Please enter an integer between 0-2(Inclusive). You have used " + errorCount + "/5 tries.");
                        errorCount++;
                        if (errorCount > 5) {
                            break;
                        }
                    }
                }

            } catch (InputMismatchException e) {
                System.out.println("Error! Please enter an integer. You have used " + errorCount + "/5 tries.");
                errorCount++;
                input.next();
            }
        }
    }
}
