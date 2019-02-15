/****************************************************************************
 *
 * Created by: James Lee
 * Created on: Feb 2019
 * Created for: ICS4U
 * This program chooses a random number from 1 to a specified max range from
 * user
 *
 ****************************************************************************/

import java.util.Scanner;
import java.util.Random;

public class HardDieProcedure {

    public static void main(String[] arg) {
	
        int minValue;	
        int maxValue;
        int randNum;

        Scanner userInput = new Scanner(System.in);
		
        System.out.print("Input a positive integer for the min value: ");
        minValue = userInput.nextInt();
        
        System.out.print("Input a positive integer for the max value: ");
        maxValue = userInput.nextInt();
		
        randNum = RollDie(minValue, maxValue);
        System.out.print("Your number is " + randNum + ".");

	}

        public static int RollDie(int minValue, int maxValue) {
            //returns random integer
            Random randGen = new Random();
			
            int randNum;
			
            randNum = randGen.nextInt((maxValue - minValue) + 1) + minValue;
            //System.out.print(maxValue + minValue);
            return randNum;
        }

}
