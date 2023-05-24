package unit02.lesson35;

import java.util.Scanner;

/* 4. Write a method that takes an array of ints and returns the smallest value in the array.
This method must be named findMin() and it must have an int[] parameter. This method must return an int.
 */
public class ReturnSmallestInt {
    public static int findMin(int[] numbers) {
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
        int smallest = 0;

         */
        int smallest = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number < smallest) {
                smallest = number;
            }
        }
        return smallest;
    }
}

