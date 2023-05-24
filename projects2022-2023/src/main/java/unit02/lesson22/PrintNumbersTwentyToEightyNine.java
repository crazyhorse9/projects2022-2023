package unit02.lesson22;

public class PrintNumbersTwentyToEightyNine {
    public static void main(String[] args) {
    /*
    1. Use a for loop to print all of the numbers from 23 to 89, with 10 numbers on each line.
    Print one space between each number.
     */
        int count = 0;
        for (int i = 23; i <= 89; i++){
            System.out.print(i + " ");
            count = count + 1;
            if (count == 10){
                System.out.println();
                count = 0;
            }
        }
    }
}

