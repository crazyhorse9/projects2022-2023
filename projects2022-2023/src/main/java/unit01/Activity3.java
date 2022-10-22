package unit01;

import java.util.Scanner;

/**
 Coding Activity
 Input two double values and print the difference between them. (The difference can be found by subtracting the second value from the first).
 Input four integer values and print the sum of all four values.
 Input the radius of a circle and print the circumference and area. The answer should be a decimal value.

 Remember the formula for circumference is 2 * pi * r and the formula for area is pi * r * r. You can use 3.14 for the value of pi in this activity.

 Sample Run:

 Enter a radius:
 4
 Circumference: 25.12
 Area: 50.24
 */
public class Activity3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number.");
        double firstNumber = scanner.nextDouble();
        System.out.println("Please enter the second number.");
        double secondNumber = scanner.nextDouble();
        double difference = firstNumber - secondNumber;
        System.out.print("The difference is ");
        System.out.print(difference);

    }
}
