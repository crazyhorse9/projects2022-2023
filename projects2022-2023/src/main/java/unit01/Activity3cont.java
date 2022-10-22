package unit01;

import java.util.Scanner;

//Input four integer values and print the sum of all four values.
public class Activity3cont {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number.");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter the second number.");
        int secondNumber = scanner.nextInt();
        System.out.println("Please enter the third number.");
        int thirdNumber = scanner.nextInt();
        System.out.println("Please enter the fourth number.");
        int fourthNumber = scanner.nextInt();
        int sum = firstNumber + secondNumber + thirdNumber + fourthNumber;
        System.out.println("The sum is " + sum + ".");
    }
}
