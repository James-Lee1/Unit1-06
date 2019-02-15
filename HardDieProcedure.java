/****************************************************************************
 *
 * Created by: James Lee
 * Created on: Feb 2019
 * Created for: ICS4U
 * This program chooses a random number from min range to a specified max 
 * range from user
 *
 ****************************************************************************/

import java.util.Scanner;
import java.util.Random;

public class HardDieProcedure {

    public static void main(String[] arg) {
	
        int minValue;	
        int maxValue;
        int randNum;
        int counter;

        Scanner userInput = new Scanner(System.in);
	
        minValue = 0;
        maxValue = 0;
        counter = 0;

        // Obtain min and max bounds from user
        // If min is greater than or equal to max, asks user to pick new number
        while (minValue >= maxValue) {

            if (counter != 0) {
                 System.out.print("That is an invalid input! ");
            }

            System.out.print("Input a valid integer for the min value: ");
            minValue = userInput.nextInt();
        
            System.out.print("Input a valid integer for the max value: ");
            maxValue = userInput.nextInt();

            counter += 1;
        }
		
        randNum = RollDie(minValue, maxValue);
        System.out.print("Your number is " + randNum + ".");

	}

        public static int RollDie(int minValue, int maxValue) {
            //returns random integer
            Random randGen = new Random();
			
            int randNum;
	    // Random number generator from min to max range		
            randNum = randGen.nextInt((maxValue - minValue) + 1) + minValue;
            //System.out.print(maxValue + minValue);
            return randNum;
        }

}
