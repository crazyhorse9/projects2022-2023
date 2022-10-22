package unit02.lesson14;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        /*The Internet runs on web addresses.
        The addresses we type represent the IP address for each site and how the computer finds an individual web page.
        IP addresses are made up of four numbers, each between 0 and 255 separated by a period.
        For example, 128.253.21.58 is an IP address.
        Write a program to enter four numbers and test if they make up a valid IP address.
        In other words, test to see if the numbers entered are between 0 and 255 inclusive.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first octet: ");
        int firstOctet = scanner.nextInt();
        System.out.println("Please enter the second octet: ");
        int secondOctet = scanner.nextInt();
        System.out.println("Please enter the third octet: ");
        int thirdOctet = scanner.nextInt();
        System.out.println("Please enter the fourth octet: ");
        int fourthOctet = scanner.nextInt();
        if (firstOctet > 255) {
            System.out.println("Octet 1 is incorrect.");
        }
        if (secondOctet > 255) {
            System.out.println("Octet 2 is incorrect.");
        }
        if (thirdOctet > 255 || thirdOctet < 0) {
            System.out.println("Octet 3 is incorrect.");
        }
        if (fourthOctet > 255 || fourthOctet < 0){
            System.out.println("Octet 4 is incorrect.");
        }
        System.out.print("IP Address: ");
        System.out.print(firstOctet + "." + secondOctet + "." + thirdOctet + "." + fourthOctet);
    }
}


