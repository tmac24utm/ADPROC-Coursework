/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flexbox;

/**
 *
 * @author tom_m
 * @author danni
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class FlexBox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int boxType = 0;
        
        try{
            System.out.println("Please enter the type of box you need: ");
            boxType = input.nextInt();
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
    
}
