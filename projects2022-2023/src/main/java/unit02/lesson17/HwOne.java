package unit02.lesson17;

import java.util.Scanner;

public class HwOne {
    public static void main (String[] args) {
        System.out.println("Enter the scores: ");
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        boolean quit = false;
        do {
            int input = scanner.nextInt();
            if (input == -1) {
                quit = true;
            }
            sum = sum + input;
            count = count + 1;
        }
        while (!quit);
        double average = (double) sum / count;
        System.out.println("The average is: " + average);


    }
}
