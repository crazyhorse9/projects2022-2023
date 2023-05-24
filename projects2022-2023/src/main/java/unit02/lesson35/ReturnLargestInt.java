package unit02.lesson35;
import java.util.Scanner;

public class ReturnLargestInt {
    /*Write a method that takes an array of ints and returns the largest value in the array.
    This method must be named findMax() and it must have an int[] parameter. This method must return an int.
     */
    public static int findMax(int[] numbers) {
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
        int greatest = 0;

         */
        int greatest = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > greatest) {
                greatest = number;
            }
        }
        return greatest;

    }
}





