package unit02.lesson17;

import java.util.Scanner;

public class HwTwoCont {
    public static void main(String[] args) {
        System.out.println("Enter two numbers: ");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        /*for (int num = num1; num1 <= num2; num++) {
            if ((num % 2 == 0)) {
                num = num + 2;
                System.out.print(num + " ");
            }
        }

         */
        if(num1 > num2){
            int x = num1;
            num1 = num2;
            num2 = x;
        }

        if (num1 == num2){
            if (num1 % 2 == 0){
                System.out.println(num1);
            }
        }

        while (num1 < num2) {
            if (num1 % 2 == 0) {
                System.out.print(num1 + " ");
                // num1 = num1 + 2;
            }
            else {
                num1 = num1 + 1;
                System.out.print(num1 + " ");
                // num1 = num1 + 2;
            }
            num1 = num1 + 2;
        }


    }
}