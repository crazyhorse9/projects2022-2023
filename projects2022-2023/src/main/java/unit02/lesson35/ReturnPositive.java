package unit02.lesson35;

import java.util.Scanner;

/*
6.Write a method that takes an array of ints and returns true if all of the values in the array are positive.
    If the array contains any negative integers, it should return false. This method must be named allPositive() and have an int[] parameter.
    This method must return a boolean.
 */
public class ReturnPositive {
    public static boolean allPositive (int[] numbers) {
        boolean positive = true;
        /*Scanner scanner = new Scanner(System.in);
        int count = 0;
        boolean quit = false;
        while (!quit) {
            int number = scanner.nextInt();
            if (number < 0) {
                quit = true;
            }
            numbers[count] = number;
            count++;
        }

         */

        for (int number: numbers){
            if (number < 0){
                return false;
            }
        }
        return true;
    }
}
