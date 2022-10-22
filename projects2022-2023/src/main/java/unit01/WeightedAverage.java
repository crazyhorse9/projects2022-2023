package unit01;

import java.util.Scanner;

public class WeightedAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First test score: ");
        int test1 = scanner.nextInt();
        System.out.print("Second test score: ");
        int test2 = scanner.nextInt();

        System.out.print("First quiz score: ");
        int quiz1 = scanner.nextInt();
        System.out.print("Second quiz score: ");
        int quiz2 = scanner.nextInt();
        System.out.print("Third quiz score: ");
        int quiz3 = scanner.nextInt();

        System.out.print("Homework score: ");
        double hw1 = scanner.nextDouble();

        double testAvg = (test1 + test2) / 2.0; //  want to 15.0 --> Joji's recommendation
        //double testAvg = ((double)test1 + (double)test2) / 2; //  want to 15.0
        System.out.println("Test average: " + testAvg);

        double quizAve =
                (quiz1 + quiz2 + quiz3) / 3.0;
        System.out.println("Quiz average: " + quizAve);
        double finalGrade = quizAve*0.3 + testAvg*0.5+ hw1*0.2 ;
        System.out.println("Final grade: " + finalGrade);
    }
}
