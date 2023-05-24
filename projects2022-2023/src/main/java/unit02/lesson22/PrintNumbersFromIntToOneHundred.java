package unit02.lesson22;
import java.util.Scanner;
public class PrintNumbersFromIntToOneHundred {
    /*3. Input an int between 0 and 100 and print the numbers between it and 100, including the number itself and the number 100.
    If the number is not between 0 and 100 print "error". Print 20 numbers per line.
     */
        public static void main (String[] args){
            System.out.println("Enter a number between 0 and 100: ");
            Scanner scanner = new Scanner(System.in);
            int count = 0;
            int input = scanner.nextInt();

            boolean quit = false;
            while (input < 0 || input > 100){
                System.out.println("Error, re-enter number: ");
                input = scanner.nextInt();
                if (input >= 0 && input <= 100){
                    quit = true;
                }
            }
            for (int nextInput = input; nextInput <= 100; nextInput++){
                System.out.print(nextInput + " ");
                count = count + 1;
                if (count == 20){
                    System.out.println();
                    count = 0;
                }
            }

        }
}
