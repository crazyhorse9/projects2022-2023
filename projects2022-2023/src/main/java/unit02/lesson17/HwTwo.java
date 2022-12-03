package unit02.lesson17;

import java.util.Scanner;

/**
 * Ask the user for two numbers.
 * Print only the even numbers between them, you should also print the two numbers if they are even.
 */
public class HwTwo {
    public static void main(String[] args) {
        System.out.println("Enter two numbers: ");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        for(int num=num1; num <= num2; num++){
            boolean isEven = (num % 2) == 0;
            if(isEven){
                System.out.print(num + " ");
            }
        }
    }
}
