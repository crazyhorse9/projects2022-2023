package unit01;

import java.util.Scanner;

/**Input the radius of a circle and print the circumference and area. The answer should be a decimal value.

        Remember the formula for circumference is 2 * pi * r and the formula for area is pi * r * r. You can use 3.14 for the value of pi in this activity.

        Sample Run:

        Enter a radius:
        4
        Circumference: 25.12
        Area: 50.24
 */
public class Activity3Cont2 {
    public static void main(String[] args) {
        double pi = Math.PI;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a radius:");
        int radius = scanner.nextInt();
        double circumference = 2*pi*radius;
        double area = pi*pi*radius;
        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);

    }
}
